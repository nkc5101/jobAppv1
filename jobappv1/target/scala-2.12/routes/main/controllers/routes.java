// @GENERATOR:play-routes-compiler
<<<<<<< Updated upstream
// @SOURCE:C:/Users/KEN/Desktop/Penn State/Fall 18/IST 411/Project/jobAppv1/jobappv1/conf/routes
// @DATE:Thu Oct 25 13:50:33 EDT 2018
=======
// @SOURCE:C:/sbt/jobAppv1/jobappv1/conf/routes
// @DATE:Thu Oct 25 14:27:52 EDT 2018
>>>>>>> Stashed changes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseProfileController ProfileController = new controllers.ReverseProfileController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseProfileController ProfileController = new controllers.javascript.ReverseProfileController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
