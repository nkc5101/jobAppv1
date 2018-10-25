package controllers;


@Singleton
public class ProfileController extends Controller{
  private final Form<ProfileData> form;
  private final List<Profile> profiles;

  @Inject
  public ProfileController(FormFactory formFactory){
    this.form = formFactory.form(ProfileData.class);
    
  }
}
