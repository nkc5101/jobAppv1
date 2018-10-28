package controllers;

import models.Profile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

import static play.libs.Scala.asScala;

@Singleton
public class ProfileController extends Controller{
  private final Form<ProfileData> form;
  private final List<Profile> profiles;

  @Inject
  public ProfileController(FormFactory formFactory){
    this.form = formFactory.form(ProfileData.class);
    this.profiles = com.google.common.collect.Lists.newArrayList(new Profile("Joe", "Shmoe", "username", "password", 22 ));
  }

  public Result login(){
    return ok(views.html.index.render());
  }

  public Result createProfile(){
    final Form<ProfileData> boundForm = form.bindFromRequest();

    if(boundForm.hasErrors()){
      return badRequest(views.html.listProfiles.render(form, profiles));
    } else {
      ProfileData data = boundForm.get();
      profiles.add(new Profile(data.getFirstName(), data.getLastName(), data.getUsername(), data.getPassword(), data.getAge()));
      flash("info", "Profile added!");
      return redirect(routes.ProfileController.login());
    }
  }

  public Result home(){
    return ok(views.html.index.render());
  }

  public Result getProfile(int id){
    Profile returnedProfile = profiles.get(id);
    if(returnedProfile == null){
      return notFound(views.html.login.render());
    } else {
      return ok(views.html.profile.render(returnedProfile));
    }
  }
}
