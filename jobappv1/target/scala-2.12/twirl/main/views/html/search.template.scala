
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
      """),format.raw/*59.7*/("""text-align: center;
      height: 90px;
      width: 100%;
      background-color: darkgray;
      display: inline-block;
  """),format.raw/*64.3*/("""}"""),format.raw/*64.4*/("""
  
  """),format.raw/*66.3*/("""#search-bar """),format.raw/*66.15*/("""{"""),format.raw/*66.16*/("""
      """),format.raw/*67.7*/("""width: 600px;
      height: 35px;
      border: 2px solid black;
      border-radius: 16px;
      text-decoration-color: black;
      font-size: 18px;
      font-family: "HelveticaNeue-Light", "Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial, "Lucida Grande", sans-serif;
  """),format.raw/*74.3*/("""}"""),format.raw/*74.4*/("""
  
  """),format.raw/*76.3*/("""#search-button """),format.raw/*76.18*/("""{"""),format.raw/*76.19*/("""
      """),format.raw/*77.7*/("""width: 90px;
      height: 41px;
      text-decoration-color: black;
      font-size: 18px;
      font-family: "HelveticaNeue-Bold", "Helvetica Neue Bold", "Helvetica Neue", Helvetica, Arial, "Lucida Grande", sans-serif;
      background-color: white;
      border: 3px solid black;
      border-radius: 20px;
  """),format.raw/*85.3*/("""}"""),format.raw/*85.4*/("""
  
  """),format.raw/*87.3*/("""</style>
  </head>
  <body>

  <div class="topnav">
    <a class="active" href=""""),_display_(/*92.30*/routes/*92.36*/.MainController.main()),format.raw/*92.58*/("""">Home</a>
    <a href=""""),_display_(/*93.15*/routes/*93.21*/.JobController.listJobs()),format.raw/*93.46*/("""">Jobs</a>
    <a href=""""),_display_(/*94.15*/routes/*94.21*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*94.99*/("""">Profile</a>
    """),_display_(/*95.6*/helper/*95.12*/.form(routes.JobController.search(), 'id -> "search-form")/*95.70*/ {_display_(Seq[Any](format.raw/*95.72*/("""
      """),_display_(/*96.8*/helper/*96.14*/.CSRF.formField),format.raw/*96.29*/("""
      
      """),format.raw/*98.7*/("""<table>
          <tr>
              <td>"""),_display_(/*100.20*/helper/*100.26*/.inputText(form("searchTerms"), 'id -> "search-bar")),format.raw/*100.78*/("""</td>
              <td><button type="submit" id="search-button">Search</button></td>
          </tr>
      </table>
      
    """)))}),format.raw/*105.6*/("""
    """),format.raw/*106.5*/("""<a href=""""),_display_(/*106.15*/routes/*106.21*/.ProfileController.logOut()),format.raw/*106.48*/("""">Log Out</a>
  </div>
    <h1>Search Results</h1>





    <table>
        <thead>
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Company</th>
        </thead>
        <tbody>
        """),_display_(/*119.10*/for((j, i) <- jobs.zipWithIndex) yield /*119.42*/ {_display_(Seq[Any](format.raw/*119.44*/("""
          """),format.raw/*120.11*/("""<tr><td><a href=""""),_display_(/*120.29*/routes/*120.35*/.JobController.getJob(i)),format.raw/*120.59*/("""">"""),_display_(/*120.62*/j/*120.63*/.getTitle()),format.raw/*120.74*/("""</a></td><td>"""),_display_(/*120.88*/j/*120.89*/.getDescription),format.raw/*120.104*/("""</td><td>"""),_display_(/*120.114*/j/*120.115*/.getSalary()),format.raw/*120.127*/("""</td><td>"""),_display_(/*120.137*/j/*120.138*/.getCompany()),format.raw/*120.151*/("""</td>
          </tr>

        """)))}),format.raw/*123.10*/("""

        """),format.raw/*125.9*/("""</tbody>
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
                  DATE: Fri Nov 30 18:02:09 EST 2018
                  SOURCE: /Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/app/views/search.scala.html
                  HASH: aa3a0520c09d7a300af37ef751528000aa1b712e
                  MATRIX: 968->1|1102->42|1130->44|1168->56|1195->57|1245->80|1273->81|1303->85|1334->90|1361->91|1392->96|1478->156|1505->157|1536->161|1572->169|1601->170|1633->175|1711->226|1739->227|1770->231|1808->241|1837->242|1869->247|2045->396|2073->397|2104->401|2148->417|2177->418|2209->423|2280->467|2308->468|2339->472|2384->489|2413->490|2445->495|2519->542|2547->543|2578->547|2631->572|2660->573|2692->578|2837->696|2865->697|2898->703|2957->734|2986->735|3018->740|3082->776|3111->777|3145->784|3292->904|3320->905|3352->910|3405->935|3434->936|3468->943|3523->971|3551->972|3581->975|3609->976|3642->982|3683->995|3712->996|3746->1003|3897->1127|3925->1128|3958->1134|3998->1146|4027->1147|4061->1154|4372->1438|4400->1439|4433->1445|4476->1460|4505->1461|4539->1468|4878->1780|4906->1781|4939->1787|5047->1868|5062->1874|5105->1896|5157->1921|5172->1927|5218->1952|5270->1977|5285->1983|5384->2061|5429->2080|5444->2086|5511->2144|5551->2146|5585->2154|5600->2160|5636->2175|5677->2189|5747->2231|5763->2237|5837->2289|5997->2418|6030->2423|6068->2433|6084->2439|6133->2466|6369->2674|6418->2706|6459->2708|6499->2719|6545->2737|6561->2743|6607->2767|6638->2770|6649->2771|6682->2782|6724->2796|6735->2797|6773->2812|6812->2822|6824->2823|6859->2835|6898->2845|6910->2846|6946->2859|7010->2891|7048->2901
                  LINES: 28->1|33->2|33->2|34->3|34->3|34->3|34->3|36->5|36->5|36->5|37->6|39->8|39->8|41->10|41->10|41->10|42->11|44->13|44->13|46->15|46->15|46->15|47->16|54->23|54->23|56->25|56->25|56->25|57->26|59->28|59->28|61->30|61->30|61->30|62->31|64->33|64->33|66->35|66->35|66->35|67->36|73->42|73->42|75->44|75->44|75->44|76->45|76->45|76->45|77->46|83->52|83->52|84->53|84->53|84->53|85->54|86->55|86->55|87->56|87->56|89->58|89->58|89->58|90->59|95->64|95->64|97->66|97->66|97->66|98->67|105->74|105->74|107->76|107->76|107->76|108->77|116->85|116->85|118->87|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95|126->95|127->96|127->96|127->96|129->98|131->100|131->100|131->100|136->105|137->106|137->106|137->106|137->106|150->119|150->119|150->119|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|154->123|156->125
                  -- GENERATED --
              */
          