// @GENERATOR:play-routes-compiler
// @SOURCE:C:/sbt/jobappv1/conf/routes
// @DATE:Mon Nov 05 12:26:45 EST 2018


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
