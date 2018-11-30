// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/conf/routes
// @DATE:Tue Nov 27 18:03:44 EST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
