
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

"""),format.raw/*62.1*/("""#search-form """),format.raw/*62.14*/("""{"""),format.raw/*62.15*/("""
    """),format.raw/*63.5*/("""text-align: center;
    height: 90px;
    width: 100%;
    background-color: darkgray;
    display: inline-block;
"""),format.raw/*68.1*/("""}"""),format.raw/*68.2*/("""

"""),format.raw/*70.1*/("""#search-bar """),format.raw/*70.13*/("""{"""),format.raw/*70.14*/("""
    """),format.raw/*71.5*/("""width: 600px;
    height: 35px;
    border: 2px solid black;
    border-radius: 16px;
    text-decoration-color: black;
    font-size: 18px;
    font-family: "HelveticaNeue-Light", "Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial, "Lucida Grande", sans-serif;
"""),format.raw/*78.1*/("""}"""),format.raw/*78.2*/("""

"""),format.raw/*80.1*/("""#search-button """),format.raw/*80.16*/("""{"""),format.raw/*80.17*/("""
    """),format.raw/*81.5*/("""width: 90px;
    height: 41px;
    text-decoration-color: black;
    font-size: 18px;
    font-family: "HelveticaNeue-Bold", "Helvetica Neue Bold", "Helvetica Neue", Helvetica, Arial, "Lucida Grande", sans-serif;
    background-color: white;
    border: 3px solid black;
    border-radius: 20px;
"""),format.raw/*89.1*/("""}"""),format.raw/*89.2*/("""
"""),format.raw/*90.1*/("""</style>
</head>
<body>

<div class="topnav">
  <a class="active" href="#home">Home</a>
  <a href=""""),_display_(/*96.13*/routes/*96.19*/.JobController.listJobs()),format.raw/*96.44*/("""">Jobs</a>
  <a href=""""),_display_(/*97.13*/routes/*97.19*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*97.97*/("""">Profile</a>
  """),_display_(/*98.4*/helper/*98.10*/.form(routes.JobController.search(), 'id -> "search-form")/*98.68*/ {_display_(Seq[Any](format.raw/*98.70*/("""
  """),_display_(/*99.4*/helper/*99.10*/.CSRF.formField),format.raw/*99.25*/("""
  
  """),format.raw/*101.3*/("""<table>
      <tr>
          <td>"""),_display_(/*103.16*/helper/*103.22*/.inputText(form("searchTerms"), 'id -> "search-bar")),format.raw/*103.74*/("""</td>
          <td><button type="submit" id="search-button">Search</button></td>
      </tr>
  </table>
  
  """)))}),format.raw/*108.4*/("""

  """),format.raw/*110.3*/("""<a href=""""),_display_(/*110.13*/routes/*110.19*/.ProfileController.logOut()),format.raw/*110.46*/("""">Log Out</a>
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
                  DATE: Fri Nov 30 18:02:09 EST 2018
                  SOURCE: /Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/app/views/main.scala.html
                  HASH: 86a699410657fa8ebe259167d2a8889c18d71057
                  MATRIX: 957->1|1075->26|1210->135|1237->136|1287->159|1315->160|1343->162|1374->167|1401->168|1431->171|1514->227|1542->228|1571->230|1606->238|1635->239|1665->242|1739->289|1767->290|1796->292|1834->302|1863->303|1893->306|2055->441|2083->442|2112->444|2156->460|2185->461|2215->464|2282->504|2310->505|2339->507|2384->524|2413->525|2443->528|2513->571|2541->572|2570->574|2623->599|2652->600|2682->603|2815->709|2843->710|2872->712|2931->743|2960->744|2990->747|3054->783|3083->784|3115->789|3250->897|3278->898|3308->901|3361->926|3390->927|3422->932|3475->958|3503->959|3531->960|3559->961|3588->963|3629->976|3658->977|3690->982|3831->1096|3859->1097|3888->1099|3928->1111|3957->1112|3989->1117|4286->1387|4314->1388|4343->1390|4386->1405|4415->1406|4447->1411|4770->1707|4798->1708|4826->1709|4953->1809|4968->1815|5014->1840|5064->1863|5079->1869|5178->1947|5221->1964|5236->1970|5303->2028|5343->2030|5373->2034|5388->2040|5424->2055|5458->2061|5520->2095|5536->2101|5610->2153|5752->2264|5784->2268|5822->2278|5838->2284|5887->2311
                  LINES: 28->1|33->2|38->7|38->7|38->7|38->7|40->9|40->9|40->9|41->10|43->12|43->12|45->14|45->14|45->14|46->15|48->17|48->17|50->19|50->19|50->19|51->20|58->27|58->27|60->29|60->29|60->29|61->30|63->32|63->32|65->34|65->34|65->34|66->35|68->37|68->37|70->39|70->39|70->39|71->40|77->46|77->46|79->48|79->48|79->48|80->49|80->49|80->49|81->50|87->56|87->56|88->57|88->57|88->57|89->58|90->59|90->59|91->60|91->60|93->62|93->62|93->62|94->63|99->68|99->68|101->70|101->70|101->70|102->71|109->78|109->78|111->80|111->80|111->80|112->81|120->89|120->89|121->90|127->96|127->96|127->96|128->97|128->97|128->97|129->98|129->98|129->98|129->98|130->99|130->99|130->99|132->101|134->103|134->103|134->103|139->108|141->110|141->110|141->110|141->110
                  -- GENERATED --
              */
          