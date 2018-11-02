
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



"""),format.raw/*7.1*/("""<html>

  <h1>Sign in</h1>
   <p>
       """),_display_(/*11.9*/helper/*11.15*/.inputText(loginForm("username"), '_label -> "Username :")),format.raw/*11.73*/("""
   """),format.raw/*12.4*/("""</p>
   <p>
       """),_display_(/*14.9*/helper/*14.15*/.inputPassword(loginForm("password"), '_label -> "Password :")),format.raw/*14.77*/("""
   """),format.raw/*15.4*/("""</p>
   <p>
       <button type="submit">Login</button>
   </p>

""")))}),format.raw/*20.2*/("""
"""),format.raw/*21.1*/("""<p>
  <a href=""""),_display_(/*22.13*/routes/*22.19*/.ProfileController.viewCreateProfile),format.raw/*22.55*/("""">Create User</a>
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
                  DATE: Fri Nov 02 18:41:05 EDT 2018
                  SOURCE: C:/sbt/jobappv1/app/views/login.scala.html
                  HASH: 666b53c9ad61fc5b6acb0fbfcb95962a7b6e99b0
                  MATRIX: 960->1|1065->36|1110->33|1138->54|1195->103|1233->104|1267->112|1339->158|1354->164|1433->222|1465->227|1513->249|1528->255|1611->317|1643->322|1744->393|1773->395|1817->412|1832->418|1889->454
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|39->7|43->11|43->11|43->11|44->12|46->14|46->14|46->14|47->15|52->20|53->21|54->22|54->22|54->22
                  -- GENERATED --
              */
          