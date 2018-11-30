
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
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Company</th><th>Application</th><th>Delete Job</th>
        </thead>
        <tbody>
        """),_display_(/*84.10*/for((j, i) <- jobs.zipWithIndex) yield /*84.42*/ {_display_(Seq[Any](format.raw/*84.44*/("""
          """),format.raw/*85.11*/("""<tr><td><a href=""""),_display_(/*85.29*/routes/*85.35*/.JobController.getJob(i)),format.raw/*85.59*/("""">"""),_display_(/*85.62*/j/*85.63*/.getTitle()),format.raw/*85.74*/("""</a></td><td>"""),_display_(/*85.88*/j/*85.89*/.getDescription),format.raw/*85.104*/("""</td><td>"""),_display_(/*85.114*/j/*85.115*/.getSalary()),format.raw/*85.127*/("""</td><td>"""),_display_(/*85.137*/j/*85.138*/.getCompany()),format.raw/*85.151*/("""</td>
            <td><a href=""""),_display_(/*86.27*/routes/*86.33*/.JobController.getApply(i)),format.raw/*86.59*/("""">Apply</a></td>
            <td>"""),_display_(/*87.18*/helper/*87.24*/.form(routes.JobController.deleteJob(i))/*87.64*/ {_display_(Seq[Any](format.raw/*87.66*/("""

              """),format.raw/*89.15*/("""<button class="delete" href=""""),_display_(/*89.45*/routes/*89.51*/.JobController.deleteJob(i)),format.raw/*89.78*/("""">Delete</button>


            """)))}),format.raw/*92.14*/("""

            """),format.raw/*94.13*/("""</td></tr>

        """)))}),format.raw/*96.10*/("""

        """),format.raw/*98.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*103.66*/("""
    """),_display_(/*104.6*/if(form.hasGlobalErrors)/*104.30*/ {_display_(Seq[Any](format.raw/*104.32*/("""
        """),_display_(/*105.10*/form/*105.14*/.globalErrors.asScala.map/*105.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*105.88*/("""
            """),format.raw/*106.13*/("""<div>
                """),_display_(/*107.18*/error/*107.23*/.key),format.raw/*107.27*/(""": """),_display_(/*107.30*/error/*107.35*/.message),format.raw/*107.43*/("""
            """),format.raw/*108.13*/("""</div>
        """)))}),format.raw/*109.10*/("""
    """)))}),format.raw/*110.6*/("""

    """),_display_(/*112.6*/helper/*112.12*/.form(routes.JobController.createJob())/*112.51*/ {_display_(Seq[Any](format.raw/*112.53*/("""
        """),_display_(/*113.10*/helper/*113.16*/.CSRF.formField),format.raw/*113.31*/("""

        """),_display_(/*115.10*/helper/*115.16*/.inputText(form("title"))),format.raw/*115.41*/("""

        """),_display_(/*117.10*/helper/*117.16*/.textarea(form("description"))),format.raw/*117.46*/("""

        """),_display_(/*119.10*/helper/*119.16*/.inputText(form("salary"))),format.raw/*119.42*/("""

        """),_display_(/*121.10*/helper/*121.16*/.inputText(form("company"))),format.raw/*121.43*/("""

        """),format.raw/*123.9*/("""<button type="submit">Create Job</button>
    """)))}),format.raw/*124.6*/("""
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
                  DATE: Fri Nov 30 17:30:20 EST 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/jobList.scala.html
                  HASH: f94d25bf5c4388f08899a1b6018ce7300be87038
                  MATRIX: 983->1|1145->68|1175->72|1214->85|1241->86|1291->109|1319->110|1351->116|1382->121|1409->122|1441->128|1529->190|1556->191|1589->197|1625->205|1654->206|1687->212|1767->265|1795->266|1828->272|1866->282|1895->283|1928->289|2111->445|2139->446|2172->452|2216->468|2245->469|2278->475|2351->521|2379->522|2412->528|2457->545|2486->546|2519->552|2595->601|2623->602|2656->608|2709->633|2738->634|2771->640|2922->764|2950->765|2983->771|3042->802|3071->803|3104->809|3168->845|3197->846|3232->854|3385->980|3413->981|3446->987|3499->1012|3528->1013|3563->1021|3619->1050|3647->1051|3678->1055|3706->1056|3737->1060|3850->1146|3865->1152|3908->1174|3961->1200|3976->1206|4022->1231|4075->1257|4090->1263|4189->1341|4235->1361|4250->1367|4295->1403|4335->1405|4370->1414|4385->1420|4421->1435|4456->1444|4471->1450|4529->1487|4566->1497|4640->1541|4673->1547|4710->1557|4725->1563|4773->1590|5050->1840|5098->1872|5138->1874|5178->1886|5223->1904|5238->1910|5283->1934|5313->1937|5323->1938|5355->1949|5396->1963|5406->1964|5443->1979|5481->1989|5492->1990|5526->2002|5564->2012|5575->2013|5610->2026|5670->2059|5685->2065|5732->2091|5794->2126|5809->2132|5858->2172|5898->2174|5944->2192|6001->2222|6016->2228|6064->2255|6131->2291|6175->2307|6229->2330|6268->2342|6340->2446|6374->2453|6408->2477|6449->2479|6488->2490|6502->2494|6537->2519|6625->2568|6668->2582|6720->2606|6735->2611|6761->2615|6792->2618|6807->2623|6837->2631|6880->2645|6929->2662|6967->2669|7003->2678|7019->2684|7068->2723|7109->2725|7148->2736|7164->2742|7201->2757|7242->2770|7258->2776|7305->2801|7346->2814|7362->2820|7414->2850|7455->2863|7471->2869|7519->2895|7560->2908|7576->2914|7625->2941|7665->2953|7744->3001
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|74->42|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|89->57|94->62|94->62|94->62|95->63|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|97->65|98->66|98->66|98->66|99->67|99->67|99->67|101->69|102->70|103->71|103->71|103->71|103->71|116->84|116->84|116->84|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|119->87|121->89|121->89|121->89|121->89|124->92|126->94|128->96|130->98|135->103|136->104|136->104|136->104|137->105|137->105|137->105|137->105|138->106|139->107|139->107|139->107|139->107|139->107|139->107|140->108|141->109|142->110|144->112|144->112|144->112|144->112|145->113|145->113|145->113|147->115|147->115|147->115|149->117|149->117|149->117|151->119|151->119|151->119|153->121|153->121|153->121|155->123|156->124
                  -- GENERATED --
              */
          