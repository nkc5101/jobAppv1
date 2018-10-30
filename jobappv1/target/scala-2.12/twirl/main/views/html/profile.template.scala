
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Profile,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profile: Profile):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""



"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <style type="text/css">
      #person-stats """),format.raw/*9.21*/("""{"""),format.raw/*9.22*/("""background-color:lightgray; color: black;"""),format.raw/*9.63*/("""}"""),format.raw/*9.64*/("""
      """),format.raw/*10.7*/("""#person-bio """),format.raw/*10.19*/("""{"""),format.raw/*10.20*/("""background-color: gray; color: white;"""),format.raw/*10.57*/("""}"""),format.raw/*10.58*/("""
    """),format.raw/*11.5*/("""</style>
  </head>
  <body>
    <div id="person-stats">

      <h4>Name: </h4>
      <p>"""),_display_(/*17.11*/(profile.firstName + " " + profile.lastName)),format.raw/*17.55*/("""</p>

      <h4>Age: </h4><p>"""),_display_(/*19.25*/(profile.age)),format.raw/*19.38*/("""</p>
      <h4>Password: </h4><p>"""),_display_(/*20.30*/(profile.password)),format.raw/*20.48*/("""</<p>
    </div>
    <div id="person-bio">
      <h4>Biography:</h4>
      <p>"""),_display_(/*24.11*/(profile.biography)),format.raw/*24.30*/("""</p>
    </div>
  </body>
<html>
"""))
      }
    }
  }

  def render(profile:Profile): play.twirl.api.HtmlFormat.Appendable = apply(profile)

  def f:((Profile) => play.twirl.api.HtmlFormat.Appendable) = (profile) => apply(profile)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 30 18:31:08 EDT 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/profile.scala.html
                  HASH: bb9deed278aa279d8385a0c7459fdb234bd7ec4b
                  MATRIX: 951->1|1064->19|1098->27|1219->121|1247->122|1315->163|1343->164|1378->172|1418->184|1447->185|1512->222|1541->223|1574->229|1696->324|1761->368|1820->400|1854->413|1916->448|1955->466|2065->549|2105->568
                  LINES: 28->1|33->1|37->5|41->9|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|43->11|49->17|49->17|51->19|51->19|52->20|52->20|56->24|56->24
                  -- GENERATED --
              */
          