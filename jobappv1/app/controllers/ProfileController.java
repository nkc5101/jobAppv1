package controllers;

import models.Profile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.*;
import play.mvc.*;


import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

import static play.libs.Scala.asScala;

@Singleton
public class ProfileController extends Controller{
  private final Form<ProfileData> form;
  private final List<Profile> profiles;
  private Form<ProfileLogin> loginForm;

  @Inject
  public ProfileController(FormFactory formFactory){
    this.form = formFactory.form(ProfileData.class);
    this.loginForm = formFactory.form(ProfileLogin.class);
    this.profiles = com.google.common.collect.Lists.newArrayList(new Profile("Joe", "Shmoe", "username", "password", 22, "I am an application developer" ));
  }

  public Result login(){
    return ok(views.html.login.render(loginForm));
  }

  public Result viewCreateProfile(){
    return ok(views.html.createUser.render(form));
  }

  public Result createProfile(){
    final Form<ProfileData> boundForm = form.bindFromRequest();

    if(boundForm.hasErrors()){
      return badRequest(views.html.profile.render(profiles.get(profiles.size()-1)));
    } else {
      ProfileData data = boundForm.get();
      profiles.add(new Profile(data.getFirstName(), data.getLastName(), data.getUsername(), data.getPassword(), data.getAge(), data.getBio()));
      flash("info", "Profile added!");
      return redirect(routes.ProfileController.login());
    }
  }

  public Result home(){
    return ok(views.html.login.render(loginForm));
  }

  public Result getProfile(int id){
    Profile returnedProfile = profiles.get(id);
    if(returnedProfile == null){
      return notFound(views.html.login.render(loginForm));
    } else {
      return ok(views.html.profile.render(returnedProfile));
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
          return ok(views.html.profile.render(profiles.get(i)));
        }
      }
      return notFound(views.html.login.render(loginForm));
    }
  }
}
