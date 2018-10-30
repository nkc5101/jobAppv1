
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
       <input type="text" name="username" placeholder="Username" value=""""),_display_(/*11.74*/loginForm("username")/*11.95*/.getValue()),format.raw/*11.106*/("""">
   </p>
   <p>
       <input type="password" name="password" placeholder="Password" value = """"),_display_(/*14.80*/loginForm("password")/*14.101*/.getValue()),format.raw/*14.112*/("""">
   </p>
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
                  DATE: Tue Oct 30 19:08:33 EDT 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/login.scala.html
                  HASH: 8bb0238853a0b680d9e98e88c3aa39b7631b6026
                  MATRIX: 960->1|1065->36|1110->33|1138->54|1195->103|1233->104|1267->112|1405->223|1435->244|1468->255|1595->355|1626->376|1659->387|1767->465|1796->467|1840->484|1855->490|1912->526
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|39->7|43->11|43->11|43->11|46->14|46->14|46->14|52->20|53->21|54->22|54->22|54->22
                  -- GENERATED --
              */
          