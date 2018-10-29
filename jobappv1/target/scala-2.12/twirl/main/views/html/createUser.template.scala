
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
  def apply/*1.2*/(form : Form[ProfileData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*3.1*/("""<html>
"""),_display_(/*4.2*/helper/*4.8*/.form(action = helper.CSRF(routes.ProfileController.login))/*4.67*/{_display_(Seq[Any](format.raw/*4.68*/("""
  """),format.raw/*5.3*/("""<style>
    #bioForm"""),format.raw/*6.13*/("""{"""),format.raw/*6.14*/("""
      """),format.raw/*7.7*/("""width: 300px;
      height: 200px;
    """),format.raw/*9.5*/("""}"""),format.raw/*9.6*/("""
  """),format.raw/*10.3*/("""</style>
  <h1>Create New User</h1>
   <p>
       First Name :<input type="text" name="firstname" placeholder="First Name" value=""""),_display_(/*13.89*/form("firstname")/*13.106*/.value),format.raw/*13.112*/("""">
   </p>
   <p>
       Last Name :<input type="text" name="lastname" placeholder="Last Name" value = """"),_display_(/*16.88*/form("lastname")/*16.104*/.value),format.raw/*16.110*/("""">
   </p>
   <p>
       Username :<input type="text" name="username" placeholder="Username" value = """"),_display_(/*19.86*/form("username")/*19.102*/.value),format.raw/*19.108*/("""">
   </p>
   <p>
       Password :<input type="password" name="password" placeholder="" value = """"),_display_(/*22.82*/form("password")/*22.98*/.value),format.raw/*22.104*/("""">
   </p>
   <p>
       Age :<input type="number" name="age"  value = """"),_display_(/*25.56*/form("age")/*25.67*/.value),format.raw/*25.73*/("""">
   </p>
   <p>
       Biography :<input id="bioForm" type="text" name="biography" placeholder="Describe yourself." value = """"),_display_(/*28.111*/form("biography")/*28.128*/.value),format.raw/*28.134*/("""">
   </p>
   <p>
     <button type="submit" action=""""),_display_(/*31.37*/routes/*31.43*/.ProfileController.viewCreateProfile()),format.raw/*31.81*/("""">Create User</button>
   </p>
   </html>
""")))}),format.raw/*34.2*/("""
"""))
      }
    }
  }

  def render(form:Form[ProfileData]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[ProfileData]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 28 22:54:43 EDT 2018
                  SOURCE: C:/sbt/jobappv1/app/views/createUser.scala.html
                  HASH: 290337374edec6d77b7cf94e2330e8a3b0c402c8
                  MATRIX: 964->1|1085->27|1115->31|1149->40|1162->46|1229->105|1267->106|1297->110|1345->131|1373->132|1407->140|1474->181|1501->182|1532->186|1693->320|1720->337|1748->343|1883->451|1909->467|1937->473|2070->579|2096->595|2124->601|2253->703|2278->719|2306->725|2409->801|2429->812|2456->818|2615->949|2642->966|2670->972|2754->1029|2769->1035|2828->1073|2904->1119
                  LINES: 28->1|33->1|35->3|36->4|36->4|36->4|36->4|37->5|38->6|38->6|39->7|41->9|41->9|42->10|45->13|45->13|45->13|48->16|48->16|48->16|51->19|51->19|51->19|54->22|54->22|54->22|57->25|57->25|57->25|60->28|60->28|60->28|63->31|63->31|63->31|66->34
                  -- GENERATED --
              */
          