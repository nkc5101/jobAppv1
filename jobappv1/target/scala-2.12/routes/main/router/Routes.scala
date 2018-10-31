// @GENERATOR:play-routes-compiler
// @SOURCE:C:/sbt/jobappv1/conf/routes
// @DATE:Wed Oct 31 13:07:42 EDT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProfileController_2: controllers.ProfileController,
  // @LINE:14
  MainController_0: controllers.MainController,
  // @LINE:18
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProfileController_2: controllers.ProfileController,
    // @LINE:14
    MainController_0: controllers.MainController,
    // @LINE:18
    Assets_1: controllers.Assets
  ) = this(errorHandler, ProfileController_2, MainController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProfileController_2, MainController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProfileController.login()"""),
    ("""POST""", this.prefix, """controllers.ProfileController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles/create""", """controllers.ProfileController.viewCreateProfile()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles/createUser""", """controllers.ProfileController.createProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles/""" + "$" + """id<[^/]+>""", """controllers.ProfileController.getProfile(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles""", """controllers.ProfileController.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main""", """controllers.MainController.main()"""),
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
    ProfileController_2.login(),
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
    ProfileController_2.login(),
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
  private[this] lazy val controllers_ProfileController_viewCreateProfile2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles/create")))
  )
  private[this] lazy val controllers_ProfileController_viewCreateProfile2_invoker = createInvoker(
    ProfileController_2.viewCreateProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "viewCreateProfile",
      Nil,
      "GET",
      this.prefix + """profiles/create""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProfileController_createProfile3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles/createUser")))
  )
  private[this] lazy val controllers_ProfileController_createProfile3_invoker = createInvoker(
    ProfileController_2.createProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "createProfile",
      Nil,
      "POST",
      this.prefix + """profiles/createUser""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ProfileController_getProfile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_getProfile4_invoker = createInvoker(
    ProfileController_2.getProfile(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "getProfile",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """profiles/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProfileController_authenticate5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles")))
  )
  private[this] lazy val controllers_ProfileController_authenticate5_invoker = createInvoker(
    ProfileController_2.authenticate(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "authenticate",
      Nil,
      "POST",
      this.prefix + """profiles""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_MainController_main6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main")))
  )
  private[this] lazy val controllers_MainController_main6_invoker = createInvoker(
    MainController_0.main(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MainController",
      "main",
      Nil,
      "GET",
      this.prefix + """main""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_ProfileController_login0_invoker.call(ProfileController_2.login())
      }
  
    // @LINE:9
    case controllers_ProfileController_login1_route(params@_) =>
      call { 
        controllers_ProfileController_login1_invoker.call(ProfileController_2.login())
      }
  
    // @LINE:10
    case controllers_ProfileController_viewCreateProfile2_route(params@_) =>
      call { 
        controllers_ProfileController_viewCreateProfile2_invoker.call(ProfileController_2.viewCreateProfile())
      }
  
    // @LINE:11
    case controllers_ProfileController_createProfile3_route(params@_) =>
      call { 
        controllers_ProfileController_createProfile3_invoker.call(ProfileController_2.createProfile())
      }
  
    // @LINE:12
    case controllers_ProfileController_getProfile4_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProfileController_getProfile4_invoker.call(ProfileController_2.getProfile(id))
      }
  
    // @LINE:13
    case controllers_ProfileController_authenticate5_route(params@_) =>
      call { 
        controllers_ProfileController_authenticate5_invoker.call(ProfileController_2.authenticate())
      }
  
    // @LINE:14
    case controllers_MainController_main6_route(params@_) =>
      call { 
        controllers_MainController_main6_invoker.call(MainController_0.main())
      }
  
    // @LINE:18
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
