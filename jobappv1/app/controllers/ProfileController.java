package controllers;

import models.*;
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

  private  Form<ProfileData> form;
  private  static List<Profile> profiles;
  private Form<SearchForm> searchForm;
  private Form<ProfileLogin> loginForm;
  private static int loggedInUser = -1;

  @Inject
  public ProfileController(FormFactory formFactory){

    this.form = formFactory.form(ProfileData.class);
    this.loginForm = formFactory.form(ProfileLogin.class);
    this.searchForm = formFactory.form(SearchForm.class);
    this.profiles = com.google.common.collect.Lists.newArrayList(new Profile("Joe", "Shmoe", "username", "password", 22, "I am an application developer" ));

  }

  public Result login(){
    ProfileLogin data = new ProfileLogin();
    data.setUsername("");
    data.setPassword("");
    loginForm = loginForm.fill(data);
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
      ProfileData data = new ProfileData();
      data.setFirstName(returnedProfile.getFirstName());
      data.setLastName(returnedProfile.getLastName());
      data.setUsername(returnedProfile.getUsername());
      data.setAge(returnedProfile.getAge());
      data.setPassword(returnedProfile.getPassword());
      data.setBiography(returnedProfile.getBiography());
      form = form.fill(data);
      return ok(views.html.profile.render(form, searchForm, loggedInUser));

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


  public Result updateProfile(int id){
    if(loggedInUser >= 0){
      final Form<ProfileData> boundForm = form.bindFromRequest();

      if(boundForm.hasErrors()){

        return redirect(routes.ProfileController.getProfile(loggedInUser));

      } else {

        ProfileData data = boundForm.get();
        profiles.get(loggedInUser).setFirstName(data.getFirstName());
        profiles.get(loggedInUser).setLastName(data.getLastName());
        profiles.get(loggedInUser).setUsername(data.getUsername());
        profiles.get(loggedInUser).setPassword(data.getPassword());
        profiles.get(loggedInUser).setAge(data.getAge());
        profiles.get(loggedInUser).setBiography(data.getBiography());
        flash("info", "Job updated!");
        return redirect(routes.ProfileController.getProfile(loggedInUser));

      }

    } else {

      return redirect(routes.ProfileController.login());

    }

}

public static Profile getLoggedInUserProfile(){
  return profiles.get(loggedInUser);
}
}
