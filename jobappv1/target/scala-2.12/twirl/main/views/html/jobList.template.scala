
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


Seq[Any](format.raw/*1.69*/("""
  """),format.raw/*2.3*/("""<style>
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
                  DATE: Fri Nov 30 16:28:13 EST 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/jobList.scala.html
                  HASH: 8a402409007be431da794779dfa5a1505609f09b
                  MATRIX: 983->1|1145->68|1175->72|1214->85|1241->86|1291->109|1319->110|1351->116|1382->121|1409->122|1441->128|1529->190|1556->191|1589->197|1625->205|1654->206|1687->212|1767->265|1795->266|1828->272|1866->282|1895->283|1928->289|2111->445|2139->446|2172->452|2216->468|2245->469|2278->475|2351->521|2379->522|2412->528|2457->545|2486->546|2519->552|2595->601|2623->602|2656->608|2709->633|2738->634|2771->640|2922->764|2950->765|2983->771|3042->802|3071->803|3104->809|3168->845|3197->846|3232->854|3385->980|3413->981|3446->987|3499->1012|3528->1013|3563->1021|3619->1050|3647->1051|3678->1055|3706->1056|3737->1060|3850->1146|3865->1152|3908->1174|3961->1200|3976->1206|4022->1231|4075->1257|4090->1263|4189->1341|4235->1361|4250->1367|4295->1403|4335->1405|4370->1414|4385->1420|4421->1435|4456->1444|4471->1450|4529->1487|4566->1497|4640->1541|4673->1547|4710->1557|4725->1563|4773->1590|5014->1804|5062->1836|5102->1838|5142->1850|5187->1868|5202->1874|5247->1898|5277->1901|5287->1902|5319->1913|5360->1927|5370->1928|5407->1943|5445->1953|5456->1954|5490->1966|5528->1976|5539->1977|5574->1990|5625->2014|5640->2020|5689->2060|5729->2062|5775->2080|5832->2110|5847->2116|5895->2143|5962->2179|6006->2195|6060->2218|6099->2230|6171->2334|6205->2341|6239->2365|6280->2367|6319->2378|6333->2382|6368->2407|6456->2456|6499->2470|6551->2494|6566->2499|6592->2503|6623->2506|6638->2511|6668->2519|6711->2533|6760->2550|6798->2557|6834->2566|6850->2572|6899->2611|6940->2613|6979->2624|6995->2630|7032->2645|7073->2658|7089->2664|7136->2689|7177->2702|7193->2708|7245->2738|7286->2751|7302->2757|7350->2783|7391->2796|7407->2802|7456->2829|7496->2841|7575->2889
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|74->42|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|89->57|94->62|94->62|94->62|95->63|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|101->69|102->70|103->71|103->71|103->71|103->71|116->84|116->84|116->84|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|118->86|118->86|118->86|118->86|120->88|120->88|120->88|120->88|123->91|125->93|127->95|129->97|134->102|135->103|135->103|135->103|136->104|136->104|136->104|136->104|137->105|138->106|138->106|138->106|138->106|138->106|138->106|139->107|140->108|141->109|143->111|143->111|143->111|143->111|144->112|144->112|144->112|146->114|146->114|146->114|148->116|148->116|148->116|150->118|150->118|150->118|152->120|152->120|152->120|154->122|155->123
                  -- GENERATED --
              */
          