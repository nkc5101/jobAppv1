// @GENERATOR:play-routes-compiler
// @SOURCE:C:/sbt/jobappv1/conf/routes
// @DATE:Sun Dec 02 15:32:38 EST 2018


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
