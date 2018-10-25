// @GENERATOR:play-routes-compiler
<<<<<<< Updated upstream
// @SOURCE:C:/Users/KEN/Desktop/Penn State/Fall 18/IST 411/Project/jobAppv1/jobappv1/conf/routes
// @DATE:Thu Oct 25 13:50:33 EDT 2018
=======
// @SOURCE:C:/sbt/jobAppv1/jobappv1/conf/routes
// @DATE:Thu Oct 25 14:27:52 EDT 2018
>>>>>>> Stashed changes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProfileController_1: controllers.ProfileController,
  // @LINE:14
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProfileController_1: controllers.ProfileController,
    // @LINE:14
    Assets_0: controllers.Assets
  ) = this(errorHandler, ProfileController_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProfileController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProfileController.login()"""),
    ("""POST""", this.prefix, """controllers.ProfileController.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Profiles""", """controllers.ProfileController.createProfile()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles/""" + "$" + """id<[^/]+>""", """controllers.ProfileController.getProfile(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ProfileController_login0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProfileController_login0_invoker = createInvoker(
    ProfileController_1.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "login",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ProfileController_login1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProfileController_login1_invoker = createInvoker(
    ProfileController_1.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "login",
      Nil,
      "POST",
      this.prefix + """""",
      """Profiles""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProfileController_createProfile2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Profiles")))
  )
  private[this] lazy val controllers_ProfileController_createProfile2_invoker = createInvoker(
    ProfileController_1.createProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "createProfile",
      Nil,
      "POST",
      this.prefix + """Profiles""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProfileController_getProfile3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_getProfile3_invoker = createInvoker(
    ProfileController_1.getProfile(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "getProfile",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """profiles/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ProfileController_login0_route(params@_) =>
      call { 
        controllers_ProfileController_login0_invoker.call(ProfileController_1.login())
      }
  
    // @LINE:9
    case controllers_ProfileController_login1_route(params@_) =>
      call { 
        controllers_ProfileController_login1_invoker.call(ProfileController_1.login())
      }
  
    // @LINE:10
    case controllers_ProfileController_createProfile2_route(params@_) =>
      call { 
        controllers_ProfileController_createProfile2_invoker.call(ProfileController_1.createProfile())
      }
  
    // @LINE:11
    case controllers_ProfileController_getProfile3_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProfileController_getProfile3_invoker.call(ProfileController_1.getProfile(id))
      }
  
    // @LINE:14
    case controllers_Assets_versioned4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
