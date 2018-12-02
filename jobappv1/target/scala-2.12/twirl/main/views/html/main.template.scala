
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


Seq[Any](format.raw/*1.26*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
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
                  DATE: Sun Dec 02 15:32:38 EST 2018
                  SOURCE: C:/sbt/jobappv1/app/views/main.scala.html
                  HASH: afaa0f685851f9d3fcc6b4ff233382ba3fb06f42
                  MATRIX: 957->1|1076->25|1104->27|1244->141|1271->142|1321->165|1349->166|1379->170|1410->175|1437->176|1468->180|1553->238|1581->239|1612->243|1647->251|1676->252|1707->256|1783->305|1811->306|1842->310|1880->320|1909->321|1940->325|2109->467|2137->468|2168->472|2212->488|2241->489|2272->493|2341->535|2369->536|2400->540|2445->557|2474->558|2505->562|2577->607|2605->608|2636->612|2689->637|2718->638|2749->642|2888->754|2916->755|2947->759|3006->790|3035->791|3066->795|3130->831|3159->832|3192->838|3333->952|3361->953|3392->957|3445->982|3474->983|3507->989|3561->1016|3589->1017|3618->1019|3646->1020|3677->1024|3718->1037|3747->1038|3780->1044|3926->1163|3954->1164|3985->1168|4025->1180|4054->1181|4087->1187|4391->1464|4419->1465|4450->1469|4493->1484|4522->1485|4555->1491|4886->1795|4914->1796|4943->1798|5076->1904|5091->1910|5137->1935|5188->1959|5203->1965|5302->2043|5346->2061|5361->2067|5428->2125|5468->2127|5499->2132|5514->2138|5550->2153|5586->2161|5650->2197|5666->2203|5740->2255|5887->2371|5921->2377|5959->2387|5975->2393|6024->2420
                  LINES: 28->1|33->1|34->2|39->7|39->7|39->7|39->7|41->9|41->9|41->9|42->10|44->12|44->12|46->14|46->14|46->14|47->15|49->17|49->17|51->19|51->19|51->19|52->20|59->27|59->27|61->29|61->29|61->29|62->30|64->32|64->32|66->34|66->34|66->34|67->35|69->37|69->37|71->39|71->39|71->39|72->40|78->46|78->46|80->48|80->48|80->48|81->49|81->49|81->49|82->50|88->56|88->56|89->57|89->57|89->57|90->58|91->59|91->59|92->60|92->60|94->62|94->62|94->62|95->63|100->68|100->68|102->70|102->70|102->70|103->71|110->78|110->78|112->80|112->80|112->80|113->81|121->89|121->89|122->90|128->96|128->96|128->96|129->97|129->97|129->97|130->98|130->98|130->98|130->98|131->99|131->99|131->99|133->101|135->103|135->103|135->103|140->108|142->110|142->110|142->110|142->110
                  -- GENERATED --
              */
          