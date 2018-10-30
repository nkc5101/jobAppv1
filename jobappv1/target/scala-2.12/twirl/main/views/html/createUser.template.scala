
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


"""),format.raw/*6.1*/("""<html>

  <style>
    #bioForm"""),format.raw/*9.13*/("""{"""),format.raw/*9.14*/("""
      """),format.raw/*10.7*/("""width: 300px;
      height: 200px;
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
  """),format.raw/*13.3*/("""</style>
  <h1>Create New User</h1>
   <p>
       First Name :<input type="text" name="firstname" placeholder="First Name" value=""""),_display_(/*16.89*/profileForm("firstname")/*16.113*/.getValue()),format.raw/*16.124*/("""">
   </p>
   <p>
       Last Name :<input type="text" name="lastname" placeholder="Last Name" value = """"),_display_(/*19.88*/profileForm("lastname")/*19.111*/.getValue()),format.raw/*19.122*/("""">
   </p>
   <p>
       Username :<input type="text" name="username" placeholder="Username" value = """"),_display_(/*22.86*/profileForm("username")/*22.109*/.getValue()),format.raw/*22.120*/("""">
   </p>
   <p>
       Password :<input type="password" name="password" placeholder="" value = """"),_display_(/*25.82*/profileForm("password")/*25.105*/.getValue()),format.raw/*25.116*/("""">
   </p>
   <p>
       Age :<input type="text" name="age"  value = """"),_display_(/*28.54*/profileForm("age")/*28.72*/.getValue()),format.raw/*28.83*/("""">
   </p>
   <p>
       Biography :<input id="bioForm" type="text" name="biography" placeholder="Describe yourself." value = """"),_display_(/*31.111*/profileForm("biography")/*31.135*/.getValue()),format.raw/*31.146*/("""">
   </p>
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
                  DATE: Tue Oct 30 19:15:07 EDT 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/createUser.scala.html
                  HASH: 5dc682c9417d51b48afc7add7eeeb0b528b80ffc
                  MATRIX: 964->1|1070->37|1115->34|1143->55|1201->105|1239->106|1271->112|1331->145|1359->146|1394->154|1462->195|1490->196|1521->200|1682->334|1716->358|1749->369|1884->477|1917->500|1950->511|2083->617|2116->640|2149->651|2278->753|2311->776|2344->787|2445->861|2472->879|2504->890|2663->1021|2697->1045|2730->1056|2814->1113|2829->1119|2876->1145|2952->1191
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|38->6|41->9|41->9|42->10|44->12|44->12|45->13|48->16|48->16|48->16|51->19|51->19|51->19|54->22|54->22|54->22|57->25|57->25|57->25|60->28|60->28|60->28|63->31|63->31|63->31|66->34|66->34|66->34|69->37
                  -- GENERATED --
              */
          