
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

object jobList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[Job],Form[JobData],Form[SearchForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jobs: Seq[Job], form: Form[JobData], searchForm: Form[SearchForm]):play.twirl.api.HtmlFormat.Appendable = {
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
    """),_display_(/*96.6*/helper/*96.12*/.CSRF.formField),format.raw/*96.27*/("""
    
    """),format.raw/*98.5*/("""<table>
        <tr>
            <td>"""),_display_(/*100.18*/helper/*100.24*/.inputText(form("searchTerms"), 'id -> "search-bar")),format.raw/*100.76*/("""</td>
            <td><button type="submit" id="search-button">Search</button></td>
        </tr>
    </table>
    
    """)))}),format.raw/*105.6*/("""
    """),format.raw/*106.5*/("""<a href=""""),_display_(/*106.15*/routes/*106.21*/.ProfileController.logOut()),format.raw/*106.48*/("""">Log Out</a>
  </div>
    <h1>Jobs</h1>





    <table>
        <thead>
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Company</th><th>Application</th><th>Delete Job</th>
        </thead>
        <tbody>
        """),_display_(/*119.10*/for((j, i) <- jobs.zipWithIndex) yield /*119.42*/ {_display_(Seq[Any](format.raw/*119.44*/("""
          """),format.raw/*120.11*/("""<tr><td><a href=""""),_display_(/*120.29*/routes/*120.35*/.JobController.getJob(i)),format.raw/*120.59*/("""">"""),_display_(/*120.62*/j/*120.63*/.getTitle()),format.raw/*120.74*/("""</a></td><td>"""),_display_(/*120.88*/j/*120.89*/.getDescription),format.raw/*120.104*/("""</td><td>"""),_display_(/*120.114*/j/*120.115*/.getSalary()),format.raw/*120.127*/("""</td><td>"""),_display_(/*120.137*/j/*120.138*/.getCompany()),format.raw/*120.151*/("""</td>
            <td><a href=""""),_display_(/*121.27*/routes/*121.33*/.JobController.getApply(i)),format.raw/*121.59*/("""">Apply</a></td>
            <td>"""),_display_(/*122.18*/helper/*122.24*/.form(routes.JobController.deleteJob(i))/*122.64*/ {_display_(Seq[Any](format.raw/*122.66*/("""

              """),format.raw/*124.15*/("""<button class="delete" href=""""),_display_(/*124.45*/routes/*124.51*/.JobController.deleteJob(i)),format.raw/*124.78*/("""">Delete</button>


            """)))}),format.raw/*127.14*/("""

            """),format.raw/*129.13*/("""</td></tr>

        """)))}),format.raw/*131.10*/("""

        """),format.raw/*133.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*138.66*/("""
    """),_display_(/*139.6*/if(form.hasGlobalErrors)/*139.30*/ {_display_(Seq[Any](format.raw/*139.32*/("""
        """),_display_(/*140.10*/form/*140.14*/.globalErrors.asScala.map/*140.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*140.88*/("""
            """),format.raw/*141.13*/("""<div>
                """),_display_(/*142.18*/error/*142.23*/.key),format.raw/*142.27*/(""": """),_display_(/*142.30*/error/*142.35*/.message),format.raw/*142.43*/("""
            """),format.raw/*143.13*/("""</div>
        """)))}),format.raw/*144.10*/("""
    """)))}),format.raw/*145.6*/("""

    """),_display_(/*147.6*/helper/*147.12*/.form(routes.JobController.createJob())/*147.51*/ {_display_(Seq[Any](format.raw/*147.53*/("""
        """),_display_(/*148.10*/helper/*148.16*/.CSRF.formField),format.raw/*148.31*/("""

        """),_display_(/*150.10*/helper/*150.16*/.inputText(form("title"))),format.raw/*150.41*/("""

        """),_display_(/*152.10*/helper/*152.16*/.textarea(form("description"))),format.raw/*152.46*/("""

        """),_display_(/*154.10*/helper/*154.16*/.inputText(form("salary"))),format.raw/*154.42*/("""

        """),_display_(/*156.10*/helper/*156.16*/.inputText(form("company"))),format.raw/*156.43*/("""

        """),format.raw/*158.9*/("""<button type="submit">Create Job</button>
    """)))}),format.raw/*159.6*/("""
"""))
      }
    }
  }

  def render(jobs:Seq[Job],form:Form[JobData],searchForm:Form[SearchForm]): play.twirl.api.HtmlFormat.Appendable = apply(jobs,form,searchForm)

  def f:((Seq[Job],Form[JobData],Form[SearchForm]) => play.twirl.api.HtmlFormat.Appendable) = (jobs,form,searchForm) => apply(jobs,form,searchForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 30 18:02:09 EST 2018
                  SOURCE: /Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/app/views/jobList.scala.html
                  HASH: 2963f441dd6c124a00ae192b6d24de54732a2a7e
                  MATRIX: 983->1|1144->69|1172->71|1210->83|1237->84|1287->107|1315->108|1345->112|1376->117|1403->118|1434->123|1520->183|1547->184|1578->188|1614->196|1643->197|1675->202|1753->253|1781->254|1812->258|1850->268|1879->269|1911->274|2087->423|2115->424|2146->428|2190->444|2219->445|2251->450|2322->494|2350->495|2381->499|2426->516|2455->517|2487->522|2561->569|2589->570|2620->574|2673->599|2702->600|2734->605|2879->723|2907->724|2938->728|2997->759|3026->760|3058->765|3122->801|3151->802|3185->809|3332->929|3360->930|3392->935|3445->960|3474->961|3508->968|3563->996|3591->997|3621->1000|3649->1001|3682->1007|3723->1020|3752->1021|3786->1028|3937->1152|3965->1153|3998->1159|4038->1171|4067->1172|4101->1179|4412->1463|4440->1464|4473->1470|4516->1485|4545->1486|4579->1493|4918->1805|4946->1806|4979->1812|5087->1893|5102->1899|5145->1921|5197->1946|5212->1952|5258->1977|5310->2002|5325->2008|5424->2086|5469->2105|5484->2111|5551->2169|5591->2171|5623->2177|5638->2183|5674->2198|5711->2208|5777->2246|5793->2252|5867->2304|6019->2425|6052->2430|6090->2440|6106->2446|6155->2473|6420->2710|6469->2742|6510->2744|6550->2755|6596->2773|6612->2779|6658->2803|6689->2806|6700->2807|6733->2818|6775->2832|6786->2833|6824->2848|6863->2858|6875->2859|6910->2871|6949->2881|6961->2882|6997->2895|7057->2927|7073->2933|7121->2959|7183->2993|7199->2999|7249->3039|7290->3041|7335->3057|7393->3087|7409->3093|7458->3120|7523->3153|7566->3167|7619->3188|7657->3198|7724->3297|7757->3303|7791->3327|7832->3329|7870->3339|7884->3343|7919->3368|8007->3417|8049->3430|8100->3453|8115->3458|8141->3462|8172->3465|8187->3470|8217->3478|8259->3491|8307->3507|8344->3513|8378->3520|8394->3526|8443->3565|8484->3567|8522->3577|8538->3583|8575->3598|8614->3609|8630->3615|8677->3640|8716->3651|8732->3657|8784->3687|8823->3698|8839->3704|8887->3730|8926->3741|8942->3747|8991->3774|9029->3784|9107->3831
                  LINES: 28->1|33->2|33->2|34->3|34->3|34->3|34->3|36->5|36->5|36->5|37->6|39->8|39->8|41->10|41->10|41->10|42->11|44->13|44->13|46->15|46->15|46->15|47->16|54->23|54->23|56->25|56->25|56->25|57->26|59->28|59->28|61->30|61->30|61->30|62->31|64->33|64->33|66->35|66->35|66->35|67->36|73->42|73->42|75->44|75->44|75->44|76->45|76->45|76->45|77->46|83->52|83->52|84->53|84->53|84->53|85->54|86->55|86->55|87->56|87->56|89->58|89->58|89->58|90->59|95->64|95->64|97->66|97->66|97->66|98->67|105->74|105->74|107->76|107->76|107->76|108->77|116->85|116->85|118->87|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|126->95|126->95|127->96|127->96|127->96|129->98|131->100|131->100|131->100|136->105|137->106|137->106|137->106|137->106|150->119|150->119|150->119|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|151->120|152->121|152->121|152->121|153->122|153->122|153->122|153->122|155->124|155->124|155->124|155->124|158->127|160->129|162->131|164->133|169->138|170->139|170->139|170->139|171->140|171->140|171->140|171->140|172->141|173->142|173->142|173->142|173->142|173->142|173->142|174->143|175->144|176->145|178->147|178->147|178->147|178->147|179->148|179->148|179->148|181->150|181->150|181->150|183->152|183->152|183->152|185->154|185->154|185->154|187->156|187->156|187->156|189->158|190->159
                  -- GENERATED --
              */
          