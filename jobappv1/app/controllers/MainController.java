package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.data.*;
import play.mvc.*;



import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

import static play.libs.Scala.asScala;

public class MainController extends Controller{

  public Result main(){
    if(controllers.ProfileController.getLoggedInUser() >= 0){
    return ok(views.html.main.render());
  } else {
    return redirect(routes.ProfileController.login());
  }

  }
}
