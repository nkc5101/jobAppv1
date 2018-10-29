
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[ProfileLogin],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form : Form[ProfileLogin]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<html>
"""),_display_(/*4.2*/helper/*4.8*/.form(action = helper.CSRF(routes.ProfileController.authenticate))/*4.74*/{_display_(Seq[Any](format.raw/*4.75*/("""
  """),format.raw/*5.3*/("""<h1>Sign in</h1>
   <p>
       <input type="text" name="username" placeholder="Username" value=""""),_display_(/*7.74*/form("username")/*7.90*/.value),format.raw/*7.96*/("""">
   </p>
   <p>
       <input type="password" name="password" placeholder="Password" value = """"),_display_(/*10.80*/form("password")/*10.96*/.value),format.raw/*10.102*/("""">
   </p>
   <p>
       <button type="submit">Login</button>
   </p>

""")))}),format.raw/*16.2*/("""
"""),format.raw/*17.1*/("""<p>
  <a href=""""),_display_(/*18.13*/routes/*18.19*/.ProfileController.viewCreateProfile),format.raw/*18.55*/("""">Create User</a>
</p>
</html>
"""))
      }
    }
  }

  def render(form:Form[ProfileLogin]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[ProfileLogin]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 28 22:54:43 EDT 2018
                  SOURCE: C:/sbt/jobappv1/app/views/login.scala.html
                  HASH: f8e3cd199ee8d70a16ef5d1300d0af25bc6a91ed
                  MATRIX: 960->1|1082->28|1112->32|1146->41|1159->47|1233->113|1271->114|1301->118|1426->217|1450->233|1476->239|1603->339|1628->355|1656->361|1764->439|1793->441|1837->458|1852->464|1909->500
                  LINES: 28->1|33->1|35->3|36->4|36->4|36->4|36->4|37->5|39->7|39->7|39->7|42->10|42->10|42->10|48->16|49->17|50->18|50->18|50->18
                  -- GENERATED --
              */
          