
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


Seq[Any](format.raw/*1.39*/("""{"""),format.raw/*1.40*/("""

    """),format.raw/*3.5*/("""<h1>Jobs</h1>





    <table>
        <thead>
            <tr><th>Title</th><th>Description</th><th>Salary</th>
        </thead>
        <tbody>
        """),_display_(/*14.10*/for(j <- jobs) yield /*14.24*/ {_display_(Seq[Any](format.raw/*14.26*/("""
            """),format.raw/*15.13*/("""<tr><td>"""),_display_(/*15.22*/j/*15.23*/.getTitle()),format.raw/*15.34*/("""</td><td>"""),_display_(/*15.44*/j/*15.45*/.getDescription),format.raw/*15.60*/("""</td><td>"""),_display_(/*15.70*/j/*15.71*/.getSalary()),format.raw/*15.83*/("""</td></tr>
        """)))}),format.raw/*16.10*/("""
        """),format.raw/*17.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*22.66*/("""
    """),_display_(/*23.6*/if(form.hasGlobalErrors)/*23.30*/ {_display_(Seq[Any](format.raw/*23.32*/("""
        """),_display_(/*24.10*/form/*24.14*/.globalErrors.asScala.map/*24.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*24.88*/("""
            """),format.raw/*25.13*/("""<div>
                """),_display_(/*26.18*/error/*26.23*/.key),format.raw/*26.27*/(""": """),_display_(/*26.30*/error/*26.35*/.message),format.raw/*26.43*/("""
            """),format.raw/*27.13*/("""</div>
        """)))}),format.raw/*28.10*/("""
    """)))}),format.raw/*29.6*/("""

    """),_display_(/*31.6*/helper/*31.12*/.form(routes.JobController.createJob())/*31.51*/ {_display_(Seq[Any](format.raw/*31.53*/("""
        """),_display_(/*32.10*/helper/*32.16*/.CSRF.formField),format.raw/*32.31*/("""

        """),_display_(/*34.10*/helper/*34.16*/.inputText(form("title"))),format.raw/*34.41*/("""

        """),_display_(/*36.10*/helper/*36.16*/.textarea(form("description"))),format.raw/*36.46*/("""

        """),_display_(/*38.10*/helper/*38.16*/.inputText(form("salary"))),format.raw/*38.42*/("""

        """),format.raw/*40.9*/("""<button type="submit">Create Job</button>
    """)))}),format.raw/*41.6*/("""

"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""
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
                  DATE: Fri Nov 02 18:45:31 EDT 2018
                  SOURCE: C:/sbt/jobappv1/app/views/jobList.scala.html
                  HASH: 0df56871be77c2fd755093e126260731783e0a48
                  MATRIX: 966->1|1098->38|1126->39|1160->47|1353->213|1383->227|1423->229|1465->243|1501->252|1511->253|1543->264|1580->274|1590->275|1626->290|1663->300|1673->301|1706->313|1758->334|1795->344|1866->448|1899->455|1932->479|1972->481|2010->492|2023->496|2057->521|2144->570|2186->584|2237->608|2251->613|2276->617|2306->620|2320->625|2349->633|2391->647|2439->664|2476->671|2511->680|2526->686|2574->725|2614->727|2652->738|2667->744|2703->759|2743->772|2758->778|2804->803|2844->816|2859->822|2910->852|2950->865|2965->871|3012->897|3051->909|3129->957|3160->961|3188->962
                  LINES: 28->1|33->1|33->1|35->3|46->14|46->14|46->14|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|48->16|49->17|54->22|55->23|55->23|55->23|56->24|56->24|56->24|56->24|57->25|58->26|58->26|58->26|58->26|58->26|58->26|59->27|60->28|61->29|63->31|63->31|63->31|63->31|64->32|64->32|64->32|66->34|66->34|66->34|68->36|68->36|68->36|70->38|70->38|70->38|72->40|73->41|75->43|75->43
                  -- GENERATED --
              */
          