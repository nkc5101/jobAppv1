
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
  """),format.raw/*57.3*/("""</style>
  </head>
  <body>

  <div class="topnav">
    <a class="active" href=""""),_display_(/*62.30*/routes/*62.36*/.MainController.main()),format.raw/*62.58*/("""">Home</a>
    <a href=""""),_display_(/*63.15*/routes/*63.21*/.JobController.listJobs()),format.raw/*63.46*/("""">Jobs</a>
    <a href=""""),_display_(/*64.15*/routes/*64.21*/.ProfileController.getProfile(controllers.ProfileController.getLoggedInUser())),format.raw/*64.99*/("""">Profile</a>
    """),_display_(/*65.6*/helper/*65.12*/.form(routes.JobController.search())/*65.48*/ {_display_(Seq[Any](format.raw/*65.50*/("""
      """),_display_(/*66.8*/helper/*66.14*/.CSRF.formField),format.raw/*66.29*/("""
      """),_display_(/*67.8*/helper/*67.14*/.inputText(searchForm("searchTerms"))),format.raw/*67.51*/("""

      """),format.raw/*69.7*/("""<button type="submit">Search</button>
    """)))}),format.raw/*70.6*/("""
    """),format.raw/*71.5*/("""<a href=""""),_display_(/*71.15*/routes/*71.21*/.ProfileController.logOut()),format.raw/*71.48*/("""">Log Out</a>
  </div>
    <h1>Jobs</h1>





    <table>
        <thead>
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Delete Job</th>
        </thead>
        <tbody>
        """),_display_(/*84.10*/for((j, i) <- jobs.zipWithIndex) yield /*84.42*/ {_display_(Seq[Any](format.raw/*84.44*/("""
          """),format.raw/*85.11*/("""<tr><td><a href=""""),_display_(/*85.29*/routes/*85.35*/.JobController.getJob(i)),format.raw/*85.59*/("""">"""),_display_(/*85.62*/j/*85.63*/.getTitle()),format.raw/*85.74*/("""</a></td><td>"""),_display_(/*85.88*/j/*85.89*/.getDescription),format.raw/*85.104*/("""</td><td>"""),_display_(/*85.114*/j/*85.115*/.getSalary()),format.raw/*85.127*/("""</td><td>"""),_display_(/*85.137*/j/*85.138*/.getCompany()),format.raw/*85.151*/("""</td>
            <td>"""),_display_(/*86.18*/helper/*86.24*/.form(routes.JobController.deleteJob(i))/*86.64*/ {_display_(Seq[Any](format.raw/*86.66*/("""

              """),format.raw/*88.15*/("""<button class="delete" href=""""),_display_(/*88.45*/routes/*88.51*/.JobController.deleteJob(i)),format.raw/*88.78*/("""">Delete</button>


            """)))}),format.raw/*91.14*/("""

            """),format.raw/*93.13*/("""</td></tr>

        """)))}),format.raw/*95.10*/("""

        """),format.raw/*97.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*102.66*/("""
    """),_display_(/*103.6*/if(form.hasGlobalErrors)/*103.30*/ {_display_(Seq[Any](format.raw/*103.32*/("""
        """),_display_(/*104.10*/form/*104.14*/.globalErrors.asScala.map/*104.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*104.88*/("""
            """),format.raw/*105.13*/("""<div>
                """),_display_(/*106.18*/error/*106.23*/.key),format.raw/*106.27*/(""": """),_display_(/*106.30*/error/*106.35*/.message),format.raw/*106.43*/("""
            """),format.raw/*107.13*/("""</div>
        """)))}),format.raw/*108.10*/("""
    """)))}),format.raw/*109.6*/("""

    """),_display_(/*111.6*/helper/*111.12*/.form(routes.JobController.createJob())/*111.51*/ {_display_(Seq[Any](format.raw/*111.53*/("""
        """),_display_(/*112.10*/helper/*112.16*/.CSRF.formField),format.raw/*112.31*/("""

        """),_display_(/*114.10*/helper/*114.16*/.inputText(form("title"))),format.raw/*114.41*/("""

        """),_display_(/*116.10*/helper/*116.16*/.textarea(form("description"))),format.raw/*116.46*/("""

        """),_display_(/*118.10*/helper/*118.16*/.inputText(form("salary"))),format.raw/*118.42*/("""

        """),_display_(/*120.10*/helper/*120.16*/.inputText(form("company"))),format.raw/*120.43*/("""

        """),format.raw/*122.9*/("""<button type="submit">Create Job</button>
    """)))}),format.raw/*123.6*/("""
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
                  DATE: Tue Nov 27 18:03:44 EST 2018
                  SOURCE: /Users/wyattnaftulin/Documents/IST411/jobAppv1/jobappv1/app/views/jobList.scala.html
                  HASH: 16284cca616d5cfde145baff991e64f459ef8d51
                  MATRIX: 983->1|1144->69|1172->71|1210->83|1237->84|1287->107|1315->108|1345->112|1376->117|1403->118|1434->123|1520->183|1547->184|1578->188|1614->196|1643->197|1675->202|1753->253|1781->254|1812->258|1850->268|1879->269|1911->274|2087->423|2115->424|2146->428|2190->444|2219->445|2251->450|2322->494|2350->495|2381->499|2426->516|2455->517|2487->522|2561->569|2589->570|2620->574|2673->599|2702->600|2734->605|2879->723|2907->724|2938->728|2997->759|3026->760|3058->765|3122->801|3151->802|3185->809|3332->929|3360->930|3392->935|3445->960|3474->961|3508->968|3563->996|3591->997|3621->1000|3649->1001|3679->1004|3787->1085|3802->1091|3845->1113|3897->1138|3912->1144|3958->1169|4010->1194|4025->1200|4124->1278|4169->1297|4184->1303|4229->1339|4269->1341|4303->1349|4318->1355|4354->1370|4388->1378|4403->1384|4461->1421|4496->1429|4569->1472|4601->1477|4638->1487|4653->1493|4701->1520|4929->1721|4977->1753|5017->1755|5056->1766|5101->1784|5116->1790|5161->1814|5191->1817|5201->1818|5233->1829|5274->1843|5284->1844|5321->1859|5359->1869|5370->1870|5404->1882|5442->1892|5453->1893|5488->1906|5538->1929|5553->1935|5602->1975|5642->1977|5686->1993|5743->2023|5758->2029|5806->2056|5870->2089|5912->2103|5964->2124|6001->2134|6068->2233|6101->2239|6135->2263|6176->2265|6214->2275|6228->2279|6263->2304|6351->2353|6393->2366|6444->2389|6459->2394|6485->2398|6516->2401|6531->2406|6561->2414|6603->2427|6651->2443|6688->2449|6722->2456|6738->2462|6787->2501|6828->2503|6866->2513|6882->2519|6919->2534|6958->2545|6974->2551|7021->2576|7060->2587|7076->2593|7128->2623|7167->2634|7183->2640|7231->2666|7270->2677|7286->2683|7335->2710|7373->2720|7451->2767
                  LINES: 28->1|33->2|33->2|34->3|34->3|34->3|34->3|36->5|36->5|36->5|37->6|39->8|39->8|41->10|41->10|41->10|42->11|44->13|44->13|46->15|46->15|46->15|47->16|54->23|54->23|56->25|56->25|56->25|57->26|59->28|59->28|61->30|61->30|61->30|62->31|64->33|64->33|66->35|66->35|66->35|67->36|73->42|73->42|75->44|75->44|75->44|76->45|76->45|76->45|77->46|83->52|83->52|84->53|84->53|84->53|85->54|86->55|86->55|87->56|87->56|88->57|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|96->65|97->66|97->66|97->66|98->67|98->67|98->67|100->69|101->70|102->71|102->71|102->71|102->71|115->84|115->84|115->84|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|119->88|119->88|119->88|119->88|122->91|124->93|126->95|128->97|133->102|134->103|134->103|134->103|135->104|135->104|135->104|135->104|136->105|137->106|137->106|137->106|137->106|137->106|137->106|138->107|139->108|140->109|142->111|142->111|142->111|142->111|143->112|143->112|143->112|145->114|145->114|145->114|147->116|147->116|147->116|149->118|149->118|149->118|151->120|151->120|151->120|153->122|154->123
                  -- GENERATED --
              */
          