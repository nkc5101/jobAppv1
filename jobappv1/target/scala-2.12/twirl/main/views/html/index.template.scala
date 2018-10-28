
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Job Search")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""

"""),format.raw/*5.1*/("""<html>
  <head>
    <HTA:application
      APPLICATIONNAME="Job Search"
      SYSMENU="yes">
    <title>Job Search</title>
    <style type="text/css">
      body """),format.raw/*12.12*/("""{"""),format.raw/*12.13*/("""background-color:lightsteelblue;"""),format.raw/*12.45*/("""}"""),format.raw/*12.46*/("""
      """),format.raw/*13.7*/("""p """),format.raw/*13.9*/("""{"""),format.raw/*13.10*/("""font:bold 18px arial;"""),format.raw/*13.31*/("""}"""),format.raw/*13.32*/("""
    """),format.raw/*14.5*/("""</style>
    <script language="javascript" type="text/javascript">
      window.resizeTo(640,480);
    </script>
  </head>
  <body>
    <p>Welcome to Job Search!!!<br   /><br   />Group 10 </p>
    <form>
      Username:<br /> <input name="Username" type="text" /><br />
      Password:<br /> <input name="Password" type="text" /><br />
      Comfirm Password:<br /> <input name="Comfirm Password" type="text"/><br />
      Email Address:<br /> <input name="Email Address" type="text" />
    </form>
    <p style="text-align: left;"><button type="button">Submit</button> <button type="button">Back</button></p>
  <body>
</html>
""")))}),format.raw/*30.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 28 14:40:21 EDT 2018
                  SOURCE: C:/sbt/jobappv1/app/views/index.scala.html
                  HASH: 127ab10a8358fe1cd54b32bb896f48bcdc071884
                  MATRIX: 941->1|1037->3|1067->8|1093->26|1132->28|1162->32|1359->201|1388->202|1448->234|1477->235|1512->243|1541->245|1570->246|1619->267|1648->268|1681->274|2355->918
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|45->13|46->14|62->30
                  -- GENERATED --
              */
          