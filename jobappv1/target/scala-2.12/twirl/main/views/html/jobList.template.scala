
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

object jobList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[Job],Form[JobData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(jobs: Seq[Job], form: Form[JobData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/("""
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
    <input type="text" placeholder="Search..">
    <a href=""""),_display_(/*66.15*/routes/*66.21*/.ProfileController.logOut()),format.raw/*66.48*/("""">Log Out</a>
  </div>
    <h1>Jobs</h1>





    <table>
        <thead>
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Delete Job</th>
        </thead>
        <tbody>
        """),_display_(/*79.10*/for((j, i) <- jobs.zipWithIndex) yield /*79.42*/ {_display_(Seq[Any](format.raw/*79.44*/("""
          """),format.raw/*80.11*/("""<tr><td><a href=""""),_display_(/*80.29*/routes/*80.35*/.JobController.getJob(i)),format.raw/*80.59*/("""">"""),_display_(/*80.62*/j/*80.63*/.getTitle()),format.raw/*80.74*/("""</a></td><td>"""),_display_(/*80.88*/j/*80.89*/.getDescription),format.raw/*80.104*/("""</td><td>"""),_display_(/*80.114*/j/*80.115*/.getSalary()),format.raw/*80.127*/("""</td>
            <td>"""),_display_(/*81.18*/helper/*81.24*/.form(routes.JobController.deleteJob(i))/*81.64*/ {_display_(Seq[Any](format.raw/*81.66*/("""

              """),format.raw/*83.15*/("""<button class="delete" href=""""),_display_(/*83.45*/routes/*83.51*/.JobController.deleteJob(i)),format.raw/*83.78*/("""">Delete</button>


            """)))}),format.raw/*86.14*/("""

            """),format.raw/*88.13*/("""</td></tr>

        """)))}),format.raw/*90.10*/("""

        """),format.raw/*92.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*97.66*/("""
    """),_display_(/*98.6*/if(form.hasGlobalErrors)/*98.30*/ {_display_(Seq[Any](format.raw/*98.32*/("""
        """),_display_(/*99.10*/form/*99.14*/.globalErrors.asScala.map/*99.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*99.88*/("""
            """),format.raw/*100.13*/("""<div>
                """),_display_(/*101.18*/error/*101.23*/.key),format.raw/*101.27*/(""": """),_display_(/*101.30*/error/*101.35*/.message),format.raw/*101.43*/("""
            """),format.raw/*102.13*/("""</div>
        """)))}),format.raw/*103.10*/("""
    """)))}),format.raw/*104.6*/("""

    """),_display_(/*106.6*/helper/*106.12*/.form(routes.JobController.createJob())/*106.51*/ {_display_(Seq[Any](format.raw/*106.53*/("""
        """),_display_(/*107.10*/helper/*107.16*/.CSRF.formField),format.raw/*107.31*/("""

        """),_display_(/*109.10*/helper/*109.16*/.inputText(form("title"))),format.raw/*109.41*/("""

        """),_display_(/*111.10*/helper/*111.16*/.textarea(form("description"))),format.raw/*111.46*/("""

        """),_display_(/*113.10*/helper/*113.16*/.inputText(form("salary"))),format.raw/*113.42*/("""

        """),format.raw/*115.9*/("""<button type="submit">Create Job</button>
    """)))}),format.raw/*116.6*/("""
"""))
      }
    }
  }

  def render(jobs:Seq[Job],form:Form[JobData]): play.twirl.api.HtmlFormat.Appendable = apply(jobs,form)

  def f:((Seq[Job],Form[JobData]) => play.twirl.api.HtmlFormat.Appendable) = (jobs,form) => apply(jobs,form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Nov 11 15:41:17 EST 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/jobList.scala.html
                  HASH: 72934f83583e06bb8dbca3d07ba5ee4e154e1d41
                  MATRIX: 966->1|1098->38|1128->42|1167->55|1194->56|1244->79|1272->80|1304->86|1335->91|1362->92|1394->98|1482->160|1509->161|1542->167|1578->175|1607->176|1640->182|1720->235|1748->236|1781->242|1819->252|1848->253|1881->259|2064->415|2092->416|2125->422|2169->438|2198->439|2231->445|2304->491|2332->492|2365->498|2410->515|2439->516|2472->522|2548->571|2576->572|2609->578|2662->603|2691->604|2724->610|2875->734|2903->735|2936->741|2995->772|3024->773|3057->779|3121->815|3150->816|3185->824|3338->950|3366->951|3399->957|3452->982|3481->983|3516->991|3572->1020|3600->1021|3631->1025|3659->1026|3690->1030|3803->1116|3818->1122|3861->1144|3914->1170|3929->1176|3975->1201|4028->1227|4043->1233|4142->1311|4246->1388|4261->1394|4309->1421|4550->1635|4598->1667|4638->1669|4678->1681|4723->1699|4738->1705|4783->1729|4813->1732|4823->1733|4855->1744|4896->1758|4906->1759|4943->1774|4981->1784|4992->1785|5026->1797|5077->1821|5092->1827|5141->1867|5181->1869|5227->1887|5284->1917|5299->1923|5347->1950|5414->1986|5458->2002|5512->2025|5551->2037|5622->2141|5655->2148|5688->2172|5728->2174|5766->2185|5779->2189|5813->2214|5900->2263|5943->2277|5995->2301|6010->2306|6036->2310|6067->2313|6082->2318|6112->2326|6155->2340|6204->2357|6242->2364|6278->2373|6294->2379|6343->2418|6384->2420|6423->2431|6439->2437|6476->2452|6517->2465|6533->2471|6580->2496|6621->2509|6637->2515|6689->2545|6730->2558|6746->2564|6794->2590|6834->2602|6913->2650
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|74->42|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|89->57|94->62|94->62|94->62|95->63|95->63|95->63|96->64|96->64|96->64|98->66|98->66|98->66|111->79|111->79|111->79|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|112->80|113->81|113->81|113->81|113->81|115->83|115->83|115->83|115->83|118->86|120->88|122->90|124->92|129->97|130->98|130->98|130->98|131->99|131->99|131->99|131->99|132->100|133->101|133->101|133->101|133->101|133->101|133->101|134->102|135->103|136->104|138->106|138->106|138->106|138->106|139->107|139->107|139->107|141->109|141->109|141->109|143->111|143->111|143->111|145->113|145->113|145->113|147->115|148->116
                  -- GENERATED --
              */
          