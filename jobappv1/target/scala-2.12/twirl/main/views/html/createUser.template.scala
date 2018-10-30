
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


Seq[Any](format.raw/*1.35*/("""
"""),_display_(/*2.2*/helper/*2.8*/.form(routes.ProfileController.createProfile)/*2.53*/{_display_(Seq[Any](format.raw/*2.54*/("""
"""),_display_(/*3.2*/helper/*3.8*/.CSRF.formField),format.raw/*3.23*/("""
"""),_display_(/*4.2*/helper/*4.8*/.inputText(profileForm("firstName"))),format.raw/*4.44*/("""
"""),_display_(/*5.2*/helper/*5.8*/.inputText(profileForm("lastName"))),format.raw/*5.43*/("""
"""),_display_(/*6.2*/helper/*6.8*/.inputText(profileForm("username"))),format.raw/*6.43*/("""
"""),_display_(/*7.2*/helper/*7.8*/.inputText(profileForm("password"))),format.raw/*7.43*/("""

"""),_display_(/*9.2*/helper/*9.8*/.inputText(profileForm("biography"))),format.raw/*9.44*/("""

"""),format.raw/*11.1*/("""<html>

  <style>
    #bioForm"""),format.raw/*14.13*/("""{"""),format.raw/*14.14*/("""
      """),format.raw/*15.7*/("""width: 300px;
      height: 200px;
    """),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""
  """),format.raw/*18.3*/("""</style>
  <h1>Create New User</h1>
   <p>
       First Name :<input type="text" name="firstname" placeholder="First Name" value=""""),_display_(/*21.89*/profileForm("firstname")/*21.113*/.value),format.raw/*21.119*/("""">
   </p>
   <p>
       Last Name :<input type="text" name="lastname" placeholder="Last Name" value = """"),_display_(/*24.88*/profileForm("lastname")/*24.111*/.value),format.raw/*24.117*/("""">
   </p>
   <p>
       Username :<input type="text" name="username" placeholder="Username" value = """"),_display_(/*27.86*/profileForm("username")/*27.109*/.value),format.raw/*27.115*/("""">
   </p>
   <p>
       Password :<input type="password" name="password" placeholder="" value = """"),_display_(/*30.82*/profileForm("password")/*30.105*/.value),format.raw/*30.111*/("""">
   </p>
   <p>
       Age :<input type="number" name="age"  value = """"),_display_(/*33.56*/profileForm("age")/*33.74*/.value),format.raw/*33.80*/("""">
   </p>
   <p>
       Biography :<input id="bioForm" type="text" name="biography" placeholder="Describe yourself." value = """"),_display_(/*36.111*/profileForm("biography")/*36.135*/.value),format.raw/*36.141*/("""">
   </p>
   <p>
     <button type="submit" action=""""),_display_(/*39.37*/routes/*39.43*/.ProfileController.login()),format.raw/*39.69*/("""">Create User</button>
   </p>
   </html>
""")))}),format.raw/*42.2*/("""
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
                  DATE: Tue Oct 30 18:49:28 EDT 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/createUser.scala.html
                  HASH: c71885c23e3c0d05c8a78efd10ffbe06ff0db739
                  MATRIX: 964->1|1092->34|1120->37|1133->43|1186->88|1224->89|1252->92|1265->98|1300->113|1328->116|1341->122|1397->158|1425->161|1438->167|1493->202|1521->205|1534->211|1589->246|1617->249|1630->255|1685->290|1715->295|1728->301|1784->337|1815->341|1876->374|1905->375|1940->383|2008->424|2036->425|2067->429|2228->563|2262->587|2290->593|2425->701|2458->724|2486->730|2619->836|2652->859|2680->865|2809->967|2842->990|2870->996|2973->1072|3000->1090|3027->1096|3186->1227|3220->1251|3248->1257|3332->1314|3347->1320|3394->1346|3470->1392
                  LINES: 28->1|33->1|34->2|34->2|34->2|34->2|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|41->9|41->9|41->9|43->11|46->14|46->14|47->15|49->17|49->17|50->18|53->21|53->21|53->21|56->24|56->24|56->24|59->27|59->27|59->27|62->30|62->30|62->30|65->33|65->33|65->33|68->36|68->36|68->36|71->39|71->39|71->39|74->42
                  -- GENERATED --
              */
          