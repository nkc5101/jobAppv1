
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[SearchForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[SearchForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* """),format.raw/*7.3*/("""{"""),format.raw/*7.4*/("""box-sizing: border-box;"""),format.raw/*7.27*/("""}"""),format.raw/*7.28*/("""

"""),format.raw/*9.1*/("""body """),format.raw/*9.6*/("""{"""),format.raw/*9.7*/("""
  """),format.raw/*10.3*/("""margin: 0;
  font-family: Arial, Helvetica, sans-serif;
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""

"""),format.raw/*14.1*/(""".topnav """),format.raw/*14.9*/("""{"""),format.raw/*14.10*/("""
  """),format.raw/*15.3*/("""overflow: hidden;
  background-color: #e9e9e9;
"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/("""

"""),format.raw/*19.1*/(""".topnav a """),format.raw/*19.11*/("""{"""),format.raw/*19.12*/("""
  """),format.raw/*20.3*/("""float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""

"""),format.raw/*29.1*/(""".topnav a:hover """),format.raw/*29.17*/("""{"""),format.raw/*29.18*/("""
  """),format.raw/*30.3*/("""background-color: #ddd;
  color: black;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""

"""),format.raw/*34.1*/(""".topnav a.active """),format.raw/*34.18*/("""{"""),format.raw/*34.19*/("""
  """),format.raw/*35.3*/("""background-color: #2196F3;
  color: white;
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""

"""),format.raw/*39.1*/(""".topnav input[type=text] """),format.raw/*39.26*/("""{"""),format.raw/*39.27*/("""
  """),format.raw/*40.3*/("""float: right;
  padding: 6px;
  margin-top: 8px;
  margin-right: 16px;
  border: none;
  font-size: 17px;
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/("""

"""),format.raw/*48.1*/("""screen and (max-width: 1920px) """),format.raw/*48.32*/("""{"""),format.raw/*48.33*/("""
  """),format.raw/*49.3*/(""".topnav a, .topnav input[type=text] """),format.raw/*49.39*/("""{"""),format.raw/*49.40*/("""
    """),format.raw/*50.5*/("""float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  """),format.raw/*56.3*/("""}"""),format.raw/*56.4*/("""
  """),format.raw/*57.3*/(""".topnav input[type=text] """),format.raw/*57.28*/("""{"""),format.raw/*57.29*/("""
    """),format.raw/*58.5*/("""border: 1px solid #ccc;
  """),format.raw/*59.3*/("""}"""),format.raw/*59.4*/("""
"""),format.raw/*60.1*/("""}"""),format.raw/*60.2*/("""
"""),format.raw/*61.1*/("""</style>
</head>
<body>

<div class="topnav">
  <a class="active" href="#home">Home</a>
  <a href=""""),_display_(/*67.13*/routes/*67.19*/.JobController.listJobs()),format.raw/*67.44*/("""">Jobs</a>
  <a href=""""),_display_(/*68.13*/routes/*68.19*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*68.97*/("""">Profile</a>
  """),_display_(/*69.4*/helper/*69.10*/.form(routes.JobController.search())/*69.46*/ {_display_(Seq[Any](format.raw/*69.48*/("""
    """),_display_(/*70.6*/helper/*70.12*/.CSRF.formField),format.raw/*70.27*/("""
    """),_display_(/*71.6*/helper/*71.12*/.inputText(form("searchTerms"))),format.raw/*71.43*/("""

    """),format.raw/*73.5*/("""<button type="submit">Search</button>
  """)))}),format.raw/*74.4*/("""

  """),format.raw/*76.3*/("""<a href=""""),_display_(/*76.13*/routes/*76.19*/.ProfileController.logOut()),format.raw/*76.46*/("""">Log Out</a>
</div>

<div style="padding-left:16px">
  <h2>Welcome to Job Search!</h2>
  <p>To search jobs, type your job title into the search bar.</p>
  <p>To view your account information, click the profile link.</p>
  <p>To add a job, click the jobs link.</p>
</div>

</body>
</html>
"""))
      }
    }
  }

  def render(form:Form[SearchForm]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[SearchForm]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 16:47:45 EST 2018
                  SOURCE: /Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/app/views/main.scala.html
                  HASH: 15b6f6fdb597559fdca86ce821c6dd7e475b2559
                  MATRIX: 957->1|1075->26|1210->135|1237->136|1287->159|1315->160|1343->162|1374->167|1401->168|1431->171|1514->227|1542->228|1571->230|1606->238|1635->239|1665->242|1739->289|1767->290|1796->292|1834->302|1863->303|1893->306|2055->441|2083->442|2112->444|2156->460|2185->461|2215->464|2282->504|2310->505|2339->507|2384->524|2413->525|2443->528|2513->571|2541->572|2570->574|2623->599|2652->600|2682->603|2815->709|2843->710|2872->712|2931->743|2960->744|2990->747|3054->783|3083->784|3115->789|3250->897|3278->898|3308->901|3361->926|3390->927|3422->932|3475->958|3503->959|3531->960|3559->961|3587->962|3714->1062|3729->1068|3775->1093|3825->1116|3840->1122|3939->1200|3982->1217|3997->1223|4042->1259|4082->1261|4114->1267|4129->1273|4165->1288|4197->1294|4212->1300|4264->1331|4297->1337|4368->1378|4399->1382|4436->1392|4451->1398|4499->1425
                  LINES: 28->1|33->2|38->7|38->7|38->7|38->7|40->9|40->9|40->9|41->10|43->12|43->12|45->14|45->14|45->14|46->15|48->17|48->17|50->19|50->19|50->19|51->20|58->27|58->27|60->29|60->29|60->29|61->30|63->32|63->32|65->34|65->34|65->34|66->35|68->37|68->37|70->39|70->39|70->39|71->40|77->46|77->46|79->48|79->48|79->48|80->49|80->49|80->49|81->50|87->56|87->56|88->57|88->57|88->57|89->58|90->59|90->59|91->60|91->60|92->61|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|104->73|105->74|107->76|107->76|107->76|107->76
                  -- GENERATED --
              */
          