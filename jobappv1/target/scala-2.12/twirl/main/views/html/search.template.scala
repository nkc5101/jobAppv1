
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[Job],Form[SearchForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jobs: Seq[Job], form: Form[SearchForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""  """),format.raw/*2.3*/("""<style>
  * """),format.raw/*3.5*/("""{"""),format.raw/*3.6*/("""box-sizing: border-box;"""),format.raw/*3.29*/("""}"""),format.raw/*3.30*/("""

  """),format.raw/*5.3*/("""body """),format.raw/*5.8*/("""{"""),format.raw/*5.9*/("""
    """),format.raw/*6.5*/("""margin: 0;
    font-family: Arial, Helvetica, sans-serif;
  """),format.raw/*8.3*/("""}"""),format.raw/*8.4*/("""

  """),format.raw/*10.3*/(""".topnav """),format.raw/*10.11*/("""{"""),format.raw/*10.12*/("""
    """),format.raw/*11.5*/("""overflow: hidden;
    background-color: #e9e9e9;
  """),format.raw/*13.3*/("""}"""),format.raw/*13.4*/("""

  """),format.raw/*15.3*/(""".topnav a """),format.raw/*15.13*/("""{"""),format.raw/*15.14*/("""
    """),format.raw/*16.5*/("""float: left;
    display: block;
    color: black;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 17px;
  """),format.raw/*23.3*/("""}"""),format.raw/*23.4*/("""

  """),format.raw/*25.3*/(""".topnav a:hover """),format.raw/*25.19*/("""{"""),format.raw/*25.20*/("""
    """),format.raw/*26.5*/("""background-color: #ddd;
    color: black;
  """),format.raw/*28.3*/("""}"""),format.raw/*28.4*/("""

  """),format.raw/*30.3*/(""".topnav a.active """),format.raw/*30.20*/("""{"""),format.raw/*30.21*/("""
    """),format.raw/*31.5*/("""background-color: #2196F3;
    color: white;
  """),format.raw/*33.3*/("""}"""),format.raw/*33.4*/("""

  """),format.raw/*35.3*/(""".topnav input[type=text] """),format.raw/*35.28*/("""{"""),format.raw/*35.29*/("""
    """),format.raw/*36.5*/("""float: right;
    padding: 6px;
    margin-top: 8px;
    margin-right: 16px;
    border: none;
    font-size: 17px;
  """),format.raw/*42.3*/("""}"""),format.raw/*42.4*/("""
  
  """),format.raw/*44.3*/("""screen and (max-width: 1920px) """),format.raw/*44.34*/("""{"""),format.raw/*44.35*/("""
    """),format.raw/*45.5*/(""".topnav a, .topnav input[type=text] """),format.raw/*45.41*/("""{"""),format.raw/*45.42*/("""
      """),format.raw/*46.7*/("""float: none;
      display: block;
      text-align: left;
      width: 100%;
      margin: 0;
      padding: 14px;
    """),format.raw/*52.5*/("""}"""),format.raw/*52.6*/("""
    """),format.raw/*53.5*/(""".topnav input[type=text] """),format.raw/*53.30*/("""{"""),format.raw/*53.31*/("""
      """),format.raw/*54.7*/("""border: 1px solid #ccc;
    """),format.raw/*55.5*/("""}"""),format.raw/*55.6*/("""
  """),format.raw/*56.3*/("""}"""),format.raw/*56.4*/("""
  
  """),format.raw/*58.3*/("""#search-form """),format.raw/*58.16*/("""{"""),format.raw/*58.17*/("""
     """),format.raw/*59.6*/("""width: 80%;
     border: 4px solid black;
  """),format.raw/*61.3*/("""}"""),format.raw/*61.4*/("""
  
  
  """),format.raw/*64.3*/("""</style>
  </head>
  <body>

  <div class="topnav">
    <a class="active" href=""""),_display_(/*69.30*/routes/*69.36*/.MainController.main()),format.raw/*69.58*/("""">Home</a>
    <a href=""""),_display_(/*70.15*/routes/*70.21*/.JobController.listJobs()),format.raw/*70.46*/("""">Jobs</a>
    <a href=""""),_display_(/*71.15*/routes/*71.21*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*71.99*/("""">Profile</a>
    """),_display_(/*72.6*/helper/*72.12*/.form(routes.JobController.search(), 'id -> "search-form")/*72.70*/ {_display_(Seq[Any](format.raw/*72.72*/("""
      """),_display_(/*73.8*/helper/*73.14*/.CSRF.formField),format.raw/*73.29*/("""
      """),_display_(/*74.8*/helper/*74.14*/.inputText(form("searchTerms"))),format.raw/*74.45*/("""

      """),format.raw/*76.7*/("""<button type="submit">Search</button>
    """)))}),format.raw/*77.6*/("""
    """),format.raw/*78.5*/("""<a href=""""),_display_(/*78.15*/routes/*78.21*/.ProfileController.logOut()),format.raw/*78.48*/("""">Log Out</a>
  </div>
    <h1>Search Results</h1>





    <table>
        <thead>
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Company</th>
        </thead>
        <tbody>
        """),_display_(/*91.10*/for((j, i) <- jobs.zipWithIndex) yield /*91.42*/ {_display_(Seq[Any](format.raw/*91.44*/("""
          """),format.raw/*92.11*/("""<tr><td><a href=""""),_display_(/*92.29*/routes/*92.35*/.JobController.getJob(i)),format.raw/*92.59*/("""">"""),_display_(/*92.62*/j/*92.63*/.getTitle()),format.raw/*92.74*/("""</a></td><td>"""),_display_(/*92.88*/j/*92.89*/.getDescription),format.raw/*92.104*/("""</td><td>"""),_display_(/*92.114*/j/*92.115*/.getSalary()),format.raw/*92.127*/("""</td><td>"""),_display_(/*92.137*/j/*92.138*/.getCompany()),format.raw/*92.151*/("""</td>
          </tr>

        """)))}),format.raw/*95.10*/("""

        """),format.raw/*97.9*/("""</tbody>
    </table>

    <hr/>
"""))
      }
    }
  }

  def render(jobs:Seq[Job],form:Form[SearchForm]): play.twirl.api.HtmlFormat.Appendable = apply(jobs,form)

  def f:((Seq[Job],Form[SearchForm]) => play.twirl.api.HtmlFormat.Appendable) = (jobs,form) => apply(jobs,form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 10:26:15 EST 2018
                  SOURCE: /Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/app/views/search.scala.html
                  HASH: eeedb16b8fe572d47d70f813e7127452e7a8c0a4
                  MATRIX: 968->1|1102->42|1130->44|1168->56|1195->57|1245->80|1273->81|1303->85|1334->90|1361->91|1392->96|1478->156|1505->157|1536->161|1572->169|1601->170|1633->175|1711->226|1739->227|1770->231|1808->241|1837->242|1869->247|2045->396|2073->397|2104->401|2148->417|2177->418|2209->423|2280->467|2308->468|2339->472|2384->489|2413->490|2445->495|2519->542|2547->543|2578->547|2631->572|2660->573|2692->578|2837->696|2865->697|2898->703|2957->734|2986->735|3018->740|3082->776|3111->777|3145->784|3292->904|3320->905|3352->910|3405->935|3434->936|3468->943|3523->971|3551->972|3581->975|3609->976|3642->982|3683->995|3712->996|3745->1002|3816->1046|3844->1047|3880->1056|3988->1137|4003->1143|4046->1165|4098->1190|4113->1196|4159->1221|4211->1246|4226->1252|4325->1330|4370->1349|4385->1355|4452->1413|4492->1415|4526->1423|4541->1429|4577->1444|4611->1452|4626->1458|4678->1489|4713->1497|4786->1540|4818->1545|4855->1555|4870->1561|4918->1588|5153->1796|5201->1828|5241->1830|5280->1841|5325->1859|5340->1865|5385->1889|5415->1892|5425->1893|5457->1904|5498->1918|5508->1919|5545->1934|5583->1944|5594->1945|5628->1957|5666->1967|5677->1968|5712->1981|5775->2013|5812->2023
                  LINES: 28->1|33->2|33->2|34->3|34->3|34->3|34->3|36->5|36->5|36->5|37->6|39->8|39->8|41->10|41->10|41->10|42->11|44->13|44->13|46->15|46->15|46->15|47->16|54->23|54->23|56->25|56->25|56->25|57->26|59->28|59->28|61->30|61->30|61->30|62->31|64->33|64->33|66->35|66->35|66->35|67->36|73->42|73->42|75->44|75->44|75->44|76->45|76->45|76->45|77->46|83->52|83->52|84->53|84->53|84->53|85->54|86->55|86->55|87->56|87->56|89->58|89->58|89->58|90->59|92->61|92->61|95->64|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|107->76|108->77|109->78|109->78|109->78|109->78|122->91|122->91|122->91|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|123->92|126->95|128->97
                  -- GENERATED --
              */
          