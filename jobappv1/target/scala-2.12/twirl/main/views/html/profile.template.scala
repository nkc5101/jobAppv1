
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

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Profile,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(profile: Profile):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""



"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
<style>
* """),format.raw/*8.3*/("""{"""),format.raw/*8.4*/("""box-sizing: border-box;"""),format.raw/*8.27*/("""}"""),format.raw/*8.28*/("""

"""),format.raw/*10.1*/("""body """),format.raw/*10.6*/("""{"""),format.raw/*10.7*/("""
  """),format.raw/*11.3*/("""margin: 0;
  font-family: Arial, Helvetica, sans-serif;
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/("""

"""),format.raw/*15.1*/(""".topnav """),format.raw/*15.9*/("""{"""),format.raw/*15.10*/("""
  """),format.raw/*16.3*/("""overflow: hidden;
  background-color: #e9e9e9;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""

"""),format.raw/*20.1*/(""".topnav a """),format.raw/*20.11*/("""{"""),format.raw/*20.12*/("""
  """),format.raw/*21.3*/("""float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""

"""),format.raw/*30.1*/(""".topnav a:hover """),format.raw/*30.17*/("""{"""),format.raw/*30.18*/("""
  """),format.raw/*31.3*/("""background-color: #ddd;
  color: black;
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""

"""),format.raw/*35.1*/(""".topnav a.active """),format.raw/*35.18*/("""{"""),format.raw/*35.19*/("""
  """),format.raw/*36.3*/("""background-color: #2196F3;
  color: white;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""

"""),format.raw/*40.1*/(""".topnav input[type=text] """),format.raw/*40.26*/("""{"""),format.raw/*40.27*/("""
  """),format.raw/*41.3*/("""float: right;
  padding: 6px;
  margin-top: 8px;
  margin-right: 16px;
  border: none;
  font-size: 17px;
"""),format.raw/*47.1*/("""}"""),format.raw/*47.2*/("""

"""),format.raw/*49.1*/("""screen and (max-width: 1920px) """),format.raw/*49.32*/("""{"""),format.raw/*49.33*/("""
  """),format.raw/*50.3*/(""".topnav a, .topnav input[type=text] """),format.raw/*50.39*/("""{"""),format.raw/*50.40*/("""
    """),format.raw/*51.5*/("""float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  """),format.raw/*57.3*/("""}"""),format.raw/*57.4*/("""
  """),format.raw/*58.3*/(""".topnav input[type=text] """),format.raw/*58.28*/("""{"""),format.raw/*58.29*/("""
    """),format.raw/*59.5*/("""border: 1px solid #ccc;
  """),format.raw/*60.3*/("""}"""),format.raw/*60.4*/("""
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""
"""),format.raw/*62.1*/("""</style>

<body>

<div class="topnav">
  <a class="active" href="#home">Home</a>
  <a href=""""),_display_(/*68.13*/routes/*68.19*/.JobController.listJobs()),format.raw/*68.44*/("""">Jobs</a>
  <a href=""""),_display_(/*69.13*/routes/*69.19*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*69.97*/("""">Profile</a>
  <input type="text" placeholder="Search..">
</div>
  <body>
    <div id="person-stats">

      <h4>Name: </h4>
      <p>"""),_display_(/*76.11*/(profile.getFirstName() + " " + profile.getLastName())),format.raw/*76.65*/("""</p>

      <h4>Age: </h4><p>"""),_display_(/*78.25*/(profile.getAge())),format.raw/*78.43*/("""</p>
      <h4>Password: </h4><p>"""),_display_(/*79.30*/(profile.getPassword())),format.raw/*79.53*/("""</<p>
    </div>
    <div id="person-bio">
      <h4>Biography:</h4>
      <p>"""),_display_(/*83.11*/(profile.getBiography())),format.raw/*83.35*/("""</p>
    </div>
  </body>
<html>
"""))
      }
    }
  }

  def render(profile:Profile): play.twirl.api.HtmlFormat.Appendable = apply(profile)

  def f:((Profile) => play.twirl.api.HtmlFormat.Appendable) = (profile) => apply(profile)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 08 14:07:11 EST 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/profile.scala.html
                  HASH: 738018f1910a84196906ec48b2d37aa48ef56fdb
                  MATRIX: 951->1|1064->19|1098->27|1170->73|1197->74|1247->97|1275->98|1306->102|1338->107|1366->108|1397->112|1482->170|1510->171|1541->175|1576->183|1605->184|1636->188|1712->237|1740->238|1771->242|1809->252|1838->253|1869->257|2038->399|2066->400|2097->404|2141->420|2170->421|2201->425|2270->467|2298->468|2329->472|2374->489|2403->490|2434->494|2506->539|2534->540|2565->544|2618->569|2647->570|2678->574|2817->686|2845->687|2876->691|2935->722|2964->723|2995->727|3059->763|3088->764|3121->770|3262->884|3290->885|3321->889|3374->914|3403->915|3436->921|3490->948|3518->949|3547->951|3575->952|3604->954|3730->1053|3745->1059|3791->1084|3842->1108|3857->1114|3956->1192|4126->1335|4201->1389|4260->1421|4299->1439|4361->1474|4405->1497|4515->1580|4560->1604
                  LINES: 28->1|33->1|37->5|40->8|40->8|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|50->18|50->18|52->20|52->20|52->20|53->21|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|70->38|70->38|72->40|72->40|72->40|73->41|79->47|79->47|81->49|81->49|81->49|82->50|82->50|82->50|83->51|89->57|89->57|90->58|90->58|90->58|91->59|92->60|92->60|93->61|93->61|94->62|100->68|100->68|100->68|101->69|101->69|101->69|108->76|108->76|110->78|110->78|111->79|111->79|115->83|115->83
                  -- GENERATED --
              */
          