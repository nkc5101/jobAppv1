// @GENERATOR:play-routes-compiler
// @SOURCE:C:/sbt/jobAppv1/jobappv1/conf/routes
// @DATE:Tue Nov 06 18:43:23 EST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseProfileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def viewCreateProfile(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profiles/create")
    }
  
    // @LINE:11
    def createProfile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "profiles/create")
    }
  
    // @LINE:12
    def getProfile(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profiles/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:13
    def authenticate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "profiles")
    }
  
    // @LINE:6
    def login(): Call = {
    
      () match {
      
        // @LINE:6
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
  }

  // @LINE:14
  class ReverseMainController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def main(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "main")
    }
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:15
  class ReverseJobController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def getJob(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "jobs/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:15
    def listJobs(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "jobs")
    }
  
    // @LINE:17
    def deleteJob(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "jobs/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:16
    def createJob(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "jobs/create")
    }
  
  }


}
