package controllers;

import models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.*;
import play.mvc.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

import static play.libs.Scala.asScala;

@Singleton
public class ProfileController extends Controller{

  private final Form<ProfileData> form;
  private  List<Profile> profiles;
  private Form<ProfileLogin> loginForm;
  private static int loggedInUser = -1;
  private List<Document> docs;

  @Inject
  public ProfileController(FormFactory formFactory){

    this.form = formFactory.form(ProfileData.class);
    this.loginForm = formFactory.form(ProfileLogin.class);
    this.profiles = com.google.common.collect.Lists.newArrayList(new Profile("Joe", "Shmoe", "username", "password", 22, "I am an application developer" ));
    this.docs = com.google.common.collect.Lists.newArrayList();
  }

  public Result login(){
    ProfileLogin data = new ProfileLogin();
    data.setUsername("");
    data.setPassword("");
    return ok(views.html.login.render(loginForm));

  }

  public Result viewCreateProfile(){

    return ok(views.html.createUser.render(form));

  }


  public Result createProfile(){

    final Form<ProfileData> boundForm = form.bindFromRequest();

    if(boundForm.hasErrors()){

      return badRequest(views.html.createUser.render(form));

    } else {

      ProfileData data = boundForm.get();
      profiles.add(new Profile(data.getFirstName(), data.getLastName(), data.getUsername(), data.getPassword(), data.getAge(), data.getBiography()));
      flash("info", "Profile added!");
      return redirect(routes.ProfileController.login());

    }

  }

  public Result home(){

    session().clear();
    return ok(views.html.login.render(loginForm));

  }

  public Result getProfile(int id){

    Profile returnedProfile = profiles.get(id);

    if(returnedProfile == profiles.get(loggedInUser)){

      return ok(views.html.profile.render(returnedProfile));

    } else {

      return notFound(views.html.login.render(loginForm));

    }

  }

  public Result authenticate(){

    loginForm = loginForm.bindFromRequest();

    if(loginForm.hasErrors()){

      return badRequest(views.html.login.render(loginForm));

    } else{

      ProfileLogin data = loginForm.get();
      String username = data.getUsername();
      String password = data.getPassword();

      for(int i = 0; i < profiles.size(); i++){

        if(profiles.get(i).authenticate(username, password)){

          loggedInUser = i;
          return redirect(routes.MainController.main());

        }

      }

      return notFound(views.html.login.render(loginForm));

    }

  }

  public static int getLoggedInUser(){

    return loggedInUser;

  }

  public Result logOut(){
    loggedInUser = -1;
    return redirect(routes.ProfileController.login());
  }

  public Result uploadDoc(){
    Http.MultipartFormData<File> body = request().body().asMultipartFormData();
    Http.MultipartFormData.FilePart<File> document = body.getFile("document");
    if(document != null){
      String fileName = document.getFilename();
      File file = document.getFile();
      docs.add(new Document(fileName, file));
      return ok(views.html.main.render());
    } else {
      return badRequest();
    }
  }

  public Result deleteDoc(int id){
    if(loggedInUser >= 0){
      if(id < docs.size() && id >= 0){
        docs.remove(id);
        return redirect(routes.MainController.main());
      } else {
        return badRequest();
      }
    } else {
      return redirect(routes.ProfileController.login());
    }
  }

}
