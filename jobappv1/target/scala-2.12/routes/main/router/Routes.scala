// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/conf/routes
// @DATE:Fri Nov 30 18:02:09 EST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ProfileController_3: controllers.ProfileController,
  // @LINE:14
  MainController_0: controllers.MainController,
  // @LINE:15
  JobController_2: controllers.JobController,
  // @LINE:27
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ProfileController_3: controllers.ProfileController,
    // @LINE:14
    MainController_0: controllers.MainController,
    // @LINE:15
    JobController_2: controllers.JobController,
    // @LINE:27
    Assets_1: controllers.Assets
  ) = this(errorHandler, ProfileController_3, MainController_0, JobController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProfileController_3, MainController_0, JobController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProfileController.login()"""),
    ("""POST""", this.prefix, """controllers.ProfileController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles/create""", """controllers.ProfileController.viewCreateProfile()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles/create""", """controllers.ProfileController.createProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles/""" + "$" + """id<[^/]+>""", """controllers.ProfileController.getProfile(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles""", """controllers.ProfileController.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main""", """controllers.MainController.main()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs""", """controllers.JobController.listJobs()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/create""", """controllers.JobController.createJob()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/""" + "$" + """id<[^/]+>/delete""", """controllers.JobController.deleteJob(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/""" + "$" + """id<[^/]+>""", """controllers.JobController.getJob(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/""" + "$" + """id<[^/]+>""", """controllers.JobController.updateJob(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.ProfileController.logOut()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profiles/""" + "$" + """id<[^/]+>""", """controllers.ProfileController.updateProfile(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.JobController.search()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/""" + "$" + """id<[^/]+>/apply""", """controllers.JobController.getApply(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jobs/""" + "$" + """id<[^/]+>/apply""", """controllers.JobController.applyToJob(id:Int)"""),
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
    ProfileController_3.login(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "login",
      Nil,
      "GET",
      this.prefix + """""",
      """ Login page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ProfileController_login1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProfileController_login1_invoker = createInvoker(
    ProfileController_3.login(),
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
    ProfileController_3.viewCreateProfile(),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles/create")))
  )
  private[this] lazy val controllers_ProfileController_createProfile3_invoker = createInvoker(
    ProfileController_3.createProfile(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "createProfile",
      Nil,
      "POST",
      this.prefix + """profiles/create""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ProfileController_getProfile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_getProfile4_invoker = createInvoker(
    ProfileController_3.getProfile(fakeValue[Int]),
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
    ProfileController_3.authenticate(),
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

  // @LINE:15
  private[this] lazy val controllers_JobController_listJobs7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs")))
  )
  private[this] lazy val controllers_JobController_listJobs7_invoker = createInvoker(
    JobController_2.listJobs(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "listJobs",
      Nil,
      "GET",
      this.prefix + """jobs""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_JobController_createJob8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/create")))
  )
  private[this] lazy val controllers_JobController_createJob8_invoker = createInvoker(
    JobController_2.createJob(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "createJob",
      Nil,
      "POST",
      this.prefix + """jobs/create""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_JobController_deleteJob9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_JobController_deleteJob9_invoker = createInvoker(
    JobController_2.deleteJob(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "deleteJob",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """jobs/""" + "$" + """id<[^/]+>/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_JobController_getJob10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_getJob10_invoker = createInvoker(
    JobController_2.getJob(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "getJob",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """jobs/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_JobController_updateJob11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JobController_updateJob11_invoker = createInvoker(
    JobController_2.updateJob(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "updateJob",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """jobs/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ProfileController_logOut12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_ProfileController_logOut12_invoker = createInvoker(
    ProfileController_3.logOut(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "logOut",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ProfileController_updateProfile13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profiles/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProfileController_updateProfile13_invoker = createInvoker(
    ProfileController_3.updateProfile(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "updateProfile",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """profiles/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_JobController_search14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_JobController_search14_invoker = createInvoker(
    JobController_2.search(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "search",
      Nil,
      "POST",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_JobController_getApply15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/"), DynamicPart("id", """[^/]+""",true), StaticPart("/apply")))
  )
  private[this] lazy val controllers_JobController_getApply15_invoker = createInvoker(
    JobController_2.getApply(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "getApply",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """jobs/""" + "$" + """id<[^/]+>/apply""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_JobController_applyToJob16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jobs/"), DynamicPart("id", """[^/]+""",true), StaticPart("/apply")))
  )
  private[this] lazy val controllers_JobController_applyToJob16_invoker = createInvoker(
    JobController_2.applyToJob(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JobController",
      "applyToJob",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """jobs/""" + "$" + """id<[^/]+>/apply""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_versioned17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned17_invoker = createInvoker(
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
        controllers_ProfileController_login0_invoker.call(ProfileController_3.login())
      }
  
    // @LINE:9
    case controllers_ProfileController_login1_route(params@_) =>
      call { 
        controllers_ProfileController_login1_invoker.call(ProfileController_3.login())
      }
  
    // @LINE:10
    case controllers_ProfileController_viewCreateProfile2_route(params@_) =>
      call { 
        controllers_ProfileController_viewCreateProfile2_invoker.call(ProfileController_3.viewCreateProfile())
      }
  
    // @LINE:11
    case controllers_ProfileController_createProfile3_route(params@_) =>
      call { 
        controllers_ProfileController_createProfile3_invoker.call(ProfileController_3.createProfile())
      }
  
    // @LINE:12
    case controllers_ProfileController_getProfile4_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProfileController_getProfile4_invoker.call(ProfileController_3.getProfile(id))
      }
  
    // @LINE:13
    case controllers_ProfileController_authenticate5_route(params@_) =>
      call { 
        controllers_ProfileController_authenticate5_invoker.call(ProfileController_3.authenticate())
      }
  
    // @LINE:14
    case controllers_MainController_main6_route(params@_) =>
      call { 
        controllers_MainController_main6_invoker.call(MainController_0.main())
      }
  
    // @LINE:15
    case controllers_JobController_listJobs7_route(params@_) =>
      call { 
        controllers_JobController_listJobs7_invoker.call(JobController_2.listJobs())
      }
  
    // @LINE:16
    case controllers_JobController_createJob8_route(params@_) =>
      call { 
        controllers_JobController_createJob8_invoker.call(JobController_2.createJob())
      }
  
    // @LINE:17
    case controllers_JobController_deleteJob9_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_JobController_deleteJob9_invoker.call(JobController_2.deleteJob(id))
      }
  
    // @LINE:18
    case controllers_JobController_getJob10_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_JobController_getJob10_invoker.call(JobController_2.getJob(id))
      }
  
    // @LINE:19
    case controllers_JobController_updateJob11_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_JobController_updateJob11_invoker.call(JobController_2.updateJob(id))
      }
  
    // @LINE:20
    case controllers_ProfileController_logOut12_route(params@_) =>
      call { 
        controllers_ProfileController_logOut12_invoker.call(ProfileController_3.logOut())
      }
  
    // @LINE:21
    case controllers_ProfileController_updateProfile13_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ProfileController_updateProfile13_invoker.call(ProfileController_3.updateProfile(id))
      }
  
    // @LINE:22
    case controllers_JobController_search14_route(params@_) =>
      call { 
        controllers_JobController_search14_invoker.call(JobController_2.search())
      }
  
    // @LINE:23
    case controllers_JobController_getApply15_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_JobController_getApply15_invoker.call(JobController_2.getApply(id))
      }
  
    // @LINE:24
    case controllers_JobController_applyToJob16_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_JobController_applyToJob16_invoker.call(JobController_2.applyToJob(id))
      }
  
    // @LINE:27
    case controllers_Assets_versioned17_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned17_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
