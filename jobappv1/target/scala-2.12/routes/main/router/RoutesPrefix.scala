// @GENERATOR:play-routes-compiler
// @SOURCE:C:/sbt/jobAppv1/jobappv1/conf/routes
// @DATE:Tue Nov 06 18:43:23 EST 2018


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
