
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
            <tr><th>Title</th><th>Description</th><th>Salary</th><th>Delete Job</th>
        </thead>
        <tbody>
        """),_display_(/*14.10*/for((j, i) <- jobs.zipWithIndex) yield /*14.42*/ {_display_(Seq[Any](format.raw/*14.44*/("""
          """),format.raw/*15.11*/("""<tr><td>"""),_display_(/*15.20*/j/*15.21*/.getTitle()),format.raw/*15.32*/("""</td><td>"""),_display_(/*15.42*/j/*15.43*/.getDescription),format.raw/*15.58*/("""</td><td>"""),_display_(/*15.68*/j/*15.69*/.getSalary()),format.raw/*15.81*/("""</td><td><button type="submit" onclick="sendPostRequest('"""),_display_(/*15.139*/routes/*15.145*/.JobController.deleteJob(i)),format.raw/*15.172*/("""')">Remove</button></td></tr>
        """)))}),format.raw/*16.10*/("""


        """),format.raw/*19.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*24.66*/("""
    """),_display_(/*25.6*/if(form.hasGlobalErrors)/*25.30*/ {_display_(Seq[Any](format.raw/*25.32*/("""
        """),_display_(/*26.10*/form/*26.14*/.globalErrors.asScala.map/*26.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*26.88*/("""
            """),format.raw/*27.13*/("""<div>
                """),_display_(/*28.18*/error/*28.23*/.key),format.raw/*28.27*/(""": """),_display_(/*28.30*/error/*28.35*/.message),format.raw/*28.43*/("""
            """),format.raw/*29.13*/("""</div>
        """)))}),format.raw/*30.10*/("""
    """)))}),format.raw/*31.6*/("""

    """),_display_(/*33.6*/helper/*33.12*/.form(routes.JobController.createJob())/*33.51*/ {_display_(Seq[Any](format.raw/*33.53*/("""
        """),_display_(/*34.10*/helper/*34.16*/.CSRF.formField),format.raw/*34.31*/("""

        """),_display_(/*36.10*/helper/*36.16*/.inputText(form("title"))),format.raw/*36.41*/("""

        """),_display_(/*38.10*/helper/*38.16*/.textarea(form("description"))),format.raw/*38.46*/("""

        """),_display_(/*40.10*/helper/*40.16*/.inputText(form("salary"))),format.raw/*40.42*/("""

        """),format.raw/*42.9*/("""<button type="submit">Create Job</button>
    """)))}),format.raw/*43.6*/("""

"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/("""
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
                  DATE: Mon Nov 05 12:29:20 EST 2018
                  SOURCE: C:/sbt/jobappv1/app/views/jobList.scala.html
                  HASH: e2bee6dba0b34071d3465a2655a2bdc3f7247594
                  MATRIX: 966->1|1098->38|1126->39|1160->47|1372->232|1420->264|1460->266|1500->278|1536->287|1546->288|1578->299|1615->309|1625->310|1661->325|1698->335|1708->336|1741->348|1827->406|1843->412|1892->439|1963->479|2004->493|2075->597|2108->604|2141->628|2181->630|2219->641|2232->645|2266->670|2353->719|2395->733|2446->757|2460->762|2485->766|2515->769|2529->774|2558->782|2600->796|2648->813|2685->820|2720->829|2735->835|2783->874|2823->876|2861->887|2876->893|2912->908|2952->921|2967->927|3013->952|3053->965|3068->971|3119->1001|3159->1014|3174->1020|3221->1046|3260->1058|3338->1106|3369->1110|3397->1111
                  LINES: 28->1|33->1|33->1|35->3|46->14|46->14|46->14|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|47->15|48->16|51->19|56->24|57->25|57->25|57->25|58->26|58->26|58->26|58->26|59->27|60->28|60->28|60->28|60->28|60->28|60->28|61->29|62->30|63->31|65->33|65->33|65->33|65->33|66->34|66->34|66->34|68->36|68->36|68->36|70->38|70->38|70->38|72->40|72->40|72->40|74->42|75->43|77->45|77->45
                  -- GENERATED --
              */
          