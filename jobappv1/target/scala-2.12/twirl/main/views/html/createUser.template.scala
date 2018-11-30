
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

object createUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[ProfileData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profileForm : Form[ProfileData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.35*/("""
"""),_display_(/*3.2*/form(CSRF(routes.ProfileController.createProfile))/*3.52*/{_display_(Seq[Any](format.raw/*3.53*/("""
"""),_display_(/*4.2*/helper/*4.8*/.CSRF.formField),format.raw/*4.23*/("""

"""),format.raw/*6.1*/("""<html>

  <style>
    #bioForm"""),format.raw/*9.13*/("""{"""),format.raw/*9.14*/("""
      """),format.raw/*10.7*/("""width: 300px;
      height: 200px;
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
  """),format.raw/*13.3*/("""</style>
  <h1>Create New User</h1>
   <p>
       """),_display_(/*16.9*/helper/*16.15*/.inputText(profileForm("firstName"), '_label -> "First Name :")),format.raw/*16.78*/("""
   """),format.raw/*17.4*/("""</p>
   <p>
       """),_display_(/*19.9*/helper/*19.15*/.inputText(profileForm("lastName"), '_label -> "Last Name :")),format.raw/*19.76*/("""
   """),format.raw/*20.4*/("""</p>
   <p>
       """),_display_(/*22.9*/helper/*22.15*/.inputText(profileForm("username"), '_label -> "Username :")),format.raw/*22.75*/("""
   """),format.raw/*23.4*/("""</p>
   <p>
       """),_display_(/*25.9*/helper/*25.15*/.inputPassword(profileForm("password"), '_label -> "Password :")),format.raw/*25.79*/("""
   """),format.raw/*26.4*/("""</p>
   <p>
       """),_display_(/*28.9*/helper/*28.15*/.inputText(profileForm("age"), '_label -> "Age :")),format.raw/*28.65*/("""
   """),format.raw/*29.4*/("""</p>
   <p>
       """),_display_(/*31.9*/helper/*31.15*/.textarea(profileForm("biography"), '_label -> "Biography :")),format.raw/*31.76*/("""
   """),format.raw/*32.4*/("""</p>
   <p>
     <button type="submit" action=""""),_display_(/*34.37*/routes/*34.43*/.ProfileController.login()),format.raw/*34.69*/("""">Create User</button>
   </p>
   </html>
""")))}),format.raw/*37.2*/("""
"""))
      }
    }
  }

  def render(profileForm:Form[ProfileData]): play.twirl.api.HtmlFormat.Appendable = apply(profileForm)

  def f:((Form[ProfileData]) => play.twirl.api.HtmlFormat.Appendable) = (profileForm) => apply(profileForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 18:02:09 EST 2018
                  SOURCE: /Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/app/views/createUser.scala.html
                  HASH: c3d5da52ff07417a1d955966080b04049e4cb0d9
                  MATRIX: 964->1|1070->37|1115->34|1143->55|1201->105|1239->106|1267->109|1280->115|1315->130|1345->134|1405->167|1433->168|1468->176|1536->217|1564->218|1595->222|1675->276|1690->282|1774->345|1806->350|1854->372|1869->378|1951->439|1983->444|2031->466|2046->472|2127->532|2159->537|2207->559|2222->565|2307->629|2339->634|2387->656|2402->662|2473->712|2505->717|2553->739|2568->745|2650->806|2682->811|2759->861|2774->867|2821->893|2897->939
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|36->4|36->4|38->6|41->9|41->9|42->10|44->12|44->12|45->13|48->16|48->16|48->16|49->17|51->19|51->19|51->19|52->20|54->22|54->22|54->22|55->23|57->25|57->25|57->25|58->26|60->28|60->28|60->28|61->29|63->31|63->31|63->31|64->32|66->34|66->34|66->34|69->37
                  -- GENERATED --
              */
          