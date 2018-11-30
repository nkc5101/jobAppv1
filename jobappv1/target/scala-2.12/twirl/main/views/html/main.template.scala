
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
                  DATE: Fri Nov 30 12:55:01 EST 2018
                  SOURCE: C:/sbt/jobappv1/app/views/main.scala.html
                  HASH: b562eb3f814519b5b231ac8279d22c087d31c12b
                  MATRIX: 957->1|1076->25|1104->27|1244->141|1271->142|1321->165|1349->166|1379->170|1410->175|1437->176|1468->180|1553->238|1581->239|1612->243|1647->251|1676->252|1707->256|1783->305|1811->306|1842->310|1880->320|1909->321|1940->325|2109->467|2137->468|2168->472|2212->488|2241->489|2272->493|2341->535|2369->536|2400->540|2445->557|2474->558|2505->562|2577->607|2605->608|2636->612|2689->637|2718->638|2749->642|2888->754|2916->755|2947->759|3006->790|3035->791|3066->795|3130->831|3159->832|3192->838|3333->952|3361->953|3392->957|3445->982|3474->983|3507->989|3561->1016|3589->1017|3618->1019|3646->1020|3675->1022|3808->1128|3823->1134|3869->1159|3920->1183|3935->1189|4034->1267|4078->1285|4093->1291|4138->1327|4178->1329|4211->1336|4226->1342|4262->1357|4295->1364|4310->1370|4362->1401|4397->1409|4469->1451|4502->1457|4539->1467|4554->1473|4602->1500
                  LINES: 28->1|33->1|34->2|39->7|39->7|39->7|39->7|41->9|41->9|41->9|42->10|44->12|44->12|46->14|46->14|46->14|47->15|49->17|49->17|51->19|51->19|51->19|52->20|59->27|59->27|61->29|61->29|61->29|62->30|64->32|64->32|66->34|66->34|66->34|67->35|69->37|69->37|71->39|71->39|71->39|72->40|78->46|78->46|80->48|80->48|80->48|81->49|81->49|81->49|82->50|88->56|88->56|89->57|89->57|89->57|90->58|91->59|91->59|92->60|92->60|93->61|99->67|99->67|99->67|100->68|100->68|100->68|101->69|101->69|101->69|101->69|102->70|102->70|102->70|103->71|103->71|103->71|105->73|106->74|108->76|108->76|108->76|108->76
                  -- GENERATED --
              */
          