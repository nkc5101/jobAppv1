
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
  def apply/*1.2*/(loginForm : Form[ProfileLogin]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*3.2*/form(CSRF(routes.ProfileController.authenticate))/*3.51*/{_display_(Seq[Any](format.raw/*3.52*/("""
  """),_display_(/*4.4*/helper/*4.10*/.CSRF.formField),format.raw/*4.25*/("""
  """),_display_(/*5.4*/helper/*5.10*/.inputText(loginForm("username"))),format.raw/*5.43*/("""
  """),_display_(/*6.4*/helper/*6.10*/.inputText(loginForm("password"))),format.raw/*6.43*/("""


"""),format.raw/*9.1*/("""<html>

  <h1>Sign in</h1>
   <p>
       <input type="text" name="username" placeholder="Username" value=""""),_display_(/*13.74*/loginForm("username")/*13.95*/.value),format.raw/*13.101*/("""">
   </p>
   <p>
       <input type="password" name="password" placeholder="Password" value = """"),_display_(/*16.80*/loginForm("password")/*16.101*/.value),format.raw/*16.107*/("""">
   </p>
   <p>
       <button type="submit">Login</button>
   </p>

""")))}),format.raw/*22.2*/("""
"""),format.raw/*23.1*/("""<p>
  <a href=""""),_display_(/*24.13*/routes/*24.19*/.ProfileController.viewCreateProfile),format.raw/*24.55*/("""">Create User</a>
</p>
</html>
"""))
      }
    }
  }

  def render(loginForm:Form[ProfileLogin]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[ProfileLogin]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 30 18:43:06 EDT 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/login.scala.html
                  HASH: e6bf25b8d483b99ac4580b502be79007108374e4
                  MATRIX: 960->1|1065->36|1110->33|1138->54|1195->103|1233->104|1263->109|1277->115|1312->130|1342->135|1356->141|1409->174|1439->179|1453->185|1506->218|1538->224|1676->335|1706->356|1734->362|1861->462|1892->483|1920->489|2028->567|2057->569|2101->586|2116->592|2173->628
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|41->9|45->13|45->13|45->13|48->16|48->16|48->16|54->22|55->23|56->24|56->24|56->24
                  -- GENERATED --
              */
          