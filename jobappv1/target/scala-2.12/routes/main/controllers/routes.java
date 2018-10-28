// @GENERATOR:play-routes-compiler
// @SOURCE:C:/sbt/jobappv1/conf/routes
// @DATE:Sun Oct 28 15:36:40 EDT 2018

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
