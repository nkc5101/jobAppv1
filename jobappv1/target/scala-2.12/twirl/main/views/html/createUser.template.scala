
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
       First Name : """),_display_(/*16.22*/helper/*16.28*/.inputText(field = profileForm("firstName"))),format.raw/*16.72*/("""
   """),format.raw/*17.4*/("""</p>
   <p>
       Last Name :"""),_display_(/*19.20*/helper/*19.26*/.inputText(field = profileForm("lastName"))),format.raw/*19.69*/("""
   """),format.raw/*20.4*/("""</p>
   <p>
       Username :"""),_display_(/*22.19*/helper/*22.25*/.inputText(field = profileForm("username"))),format.raw/*22.68*/("""
   """),format.raw/*23.4*/("""</p>
   <p>
       Password :"""),_display_(/*25.19*/helper/*25.25*/.inputPassword(field = profileForm("password"))),format.raw/*25.72*/("""
   """),format.raw/*26.4*/("""</p>
   <p>
       Age :"""),_display_(/*28.14*/helper/*28.20*/.inputText(field = profileForm("age"))),format.raw/*28.58*/("""
   """),format.raw/*29.4*/("""</p>
   <p>
       Biography :"""),_display_(/*31.20*/helper/*31.26*/.inputText(field = profileForm("biography"))),format.raw/*31.70*/("""
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
                  DATE: Tue Oct 30 19:42:18 EDT 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/createUser.scala.html
                  HASH: ebe949aac0ba351f67aa68c10733d6c4a275d68e
                  MATRIX: 964->1|1070->37|1115->34|1143->55|1201->105|1239->106|1267->109|1280->115|1315->130|1345->134|1405->167|1433->168|1468->176|1536->217|1564->218|1595->222|1689->289|1704->295|1769->339|1801->344|1861->377|1876->383|1940->426|1972->431|2031->463|2046->469|2110->512|2142->517|2201->549|2216->555|2284->602|2316->607|2370->634|2385->640|2444->678|2476->683|2536->716|2551->722|2616->766|2648->771|2725->821|2740->827|2787->853|2863->899
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|36->4|36->4|38->6|41->9|41->9|42->10|44->12|44->12|45->13|48->16|48->16|48->16|49->17|51->19|51->19|51->19|52->20|54->22|54->22|54->22|55->23|57->25|57->25|57->25|58->26|60->28|60->28|60->28|61->29|63->31|63->31|63->31|64->32|66->34|66->34|66->34|69->37
                  -- GENERATED --
              */
          