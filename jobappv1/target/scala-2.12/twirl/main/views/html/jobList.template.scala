
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
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Company</th><th>Application</th><th>Applicants</th><th>Delete Job</th>
        </thead>
        <tbody>
        """),_display_(/*119.10*/for((j, i) <- jobs.zipWithIndex) yield /*119.42*/ {_display_(Seq[Any](format.raw/*119.44*/("""
          """),format.raw/*120.11*/("""<tr><td><a href=""""),_display_(/*120.29*/routes/*120.35*/.JobController.getJob(i)),format.raw/*120.59*/("""">"""),_display_(/*120.62*/j/*120.63*/.getTitle()),format.raw/*120.74*/("""</a></td><td>"""),_display_(/*120.88*/j/*120.89*/.getDescription),format.raw/*120.104*/("""</td><td>"""),_display_(/*120.114*/j/*120.115*/.getSalary()),format.raw/*120.127*/("""</td><td>"""),_display_(/*120.137*/j/*120.138*/.getCompany()),format.raw/*120.151*/("""</td>
            <td><a href=""""),_display_(/*121.27*/routes/*121.33*/.JobController.getApply(i)),format.raw/*121.59*/("""">Apply</a></td><td><a href=""""),_display_(/*121.89*/routes/*121.95*/.JobController.getApplications(i)),format.raw/*121.128*/("""">View Applications</a></td>
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
                  DATE: Sun Dec 02 14:19:13 EST 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/jobList.scala.html
                  HASH: e7a4c5759d577c9a38e03268c8ca9cd5174af3ae
                  MATRIX: 983->1|1145->68|1175->72|1214->85|1241->86|1291->109|1319->110|1351->116|1382->121|1409->122|1441->128|1529->190|1556->191|1589->197|1625->205|1654->206|1687->212|1767->265|1795->266|1828->272|1866->282|1895->283|1928->289|2111->445|2139->446|2172->452|2216->468|2245->469|2278->475|2351->521|2379->522|2412->528|2457->545|2486->546|2519->552|2595->601|2623->602|2656->608|2709->633|2738->634|2771->640|2922->764|2950->765|2983->771|3042->802|3071->803|3104->809|3168->845|3197->846|3232->854|3385->980|3413->981|3446->987|3499->1012|3528->1013|3563->1021|3619->1050|3647->1051|3678->1055|3706->1056|3739->1062|3780->1075|3809->1076|3844->1084|4000->1213|4028->1214|4061->1220|4101->1232|4130->1233|4165->1241|4483->1532|4511->1533|4544->1539|4587->1554|4616->1555|4651->1563|4998->1883|5026->1884|5059->1890|5172->1976|5187->1982|5230->2004|5283->2030|5298->2036|5344->2061|5397->2087|5412->2093|5511->2171|5557->2191|5572->2197|5639->2255|5679->2257|5712->2264|5727->2270|5763->2285|5798->2293|5866->2333|5882->2339|5956->2391|6109->2513|6143->2519|6181->2529|6197->2535|6246->2562|6543->2831|6592->2863|6633->2865|6674->2877|6720->2895|6736->2901|6782->2925|6813->2928|6824->2929|6857->2940|6899->2954|6910->2955|6948->2970|6987->2980|6999->2981|7034->2993|7073->3003|7085->3004|7121->3017|7182->3050|7198->3056|7246->3082|7304->3112|7320->3118|7376->3151|7451->3198|7467->3204|7517->3244|7558->3246|7605->3264|7663->3294|7679->3300|7728->3327|7796->3363|7841->3379|7896->3402|7936->3414|8008->3518|8042->3525|8076->3549|8117->3551|8156->3562|8170->3566|8205->3591|8293->3640|8336->3654|8388->3678|8403->3683|8429->3687|8460->3690|8475->3695|8505->3703|8548->3717|8597->3734|8635->3741|8671->3750|8687->3756|8736->3795|8777->3797|8816->3808|8832->3814|8869->3829|8910->3842|8926->3848|8973->3873|9014->3886|9030->3892|9082->3922|9123->3935|9139->3941|9187->3967|9228->3980|9244->3986|9293->4013|9333->4025|9412->4073
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|35->3|37->5|37->5|37->5|38->6|40->8|40->8|42->10|42->10|42->10|43->11|45->13|45->13|47->15|47->15|47->15|48->16|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|62->30|62->30|62->30|63->31|65->33|65->33|67->35|67->35|67->35|68->36|74->42|74->42|76->44|76->44|76->44|77->45|77->45|77->45|78->46|84->52|84->52|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|90->58|90->58|90->58|91->59|96->64|96->64|98->66|98->66|98->66|99->67|106->74|106->74|108->76|108->76|108->76|109->77|117->85|117->85|119->87|124->92|124->92|124->92|125->93|125->93|125->93|126->94|126->94|126->94|127->95|127->95|127->95|127->95|128->96|128->96|128->96|130->98|132->100|132->100|132->100|137->105|138->106|138->106|138->106|138->106|151->119|151->119|151->119|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|152->120|153->121|153->121|153->121|153->121|153->121|153->121|154->122|154->122|154->122|154->122|156->124|156->124|156->124|156->124|159->127|161->129|163->131|165->133|170->138|171->139|171->139|171->139|172->140|172->140|172->140|172->140|173->141|174->142|174->142|174->142|174->142|174->142|174->142|175->143|176->144|177->145|179->147|179->147|179->147|179->147|180->148|180->148|180->148|182->150|182->150|182->150|184->152|184->152|184->152|186->154|186->154|186->154|188->156|188->156|188->156|190->158|191->159
                  -- GENERATED --
              */
          