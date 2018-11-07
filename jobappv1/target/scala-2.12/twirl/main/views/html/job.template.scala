
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

object job extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Job,Form[JobData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(job: Job, form: Form[JobData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <style type="text/css">
      #person-stats """),format.raw/*7.21*/("""{"""),format.raw/*7.22*/("""background-color:lightgray; color: black;"""),format.raw/*7.63*/("""}"""),format.raw/*7.64*/("""
      """),format.raw/*8.7*/("""#person-bio """),format.raw/*8.19*/("""{"""),format.raw/*8.20*/("""background-color: gray; color: white;"""),format.raw/*8.57*/("""}"""),format.raw/*8.58*/("""
    """),format.raw/*9.5*/("""</style>
  </head>
  <body>
    
  </body>
<html>
"""))
      }
    }
  }

  def render(job:Job,form:Form[JobData]): play.twirl.api.HtmlFormat.Appendable = apply(job,form)

  def f:((Job,Form[JobData]) => play.twirl.api.HtmlFormat.Appendable) = (job,form) => apply(job,form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Nov 06 18:42:15 EST 2018
                  SOURCE: C:/sbt/jobAppv1/jobappv1/app/views/job.scala.html
                  HASH: 081a9945120c011a1fd2a6986b740cdd23debc7a
                  MATRIX: 957->1|1083->32|1113->36|1234->130|1262->131|1330->172|1358->173|1392->181|1431->193|1459->194|1523->231|1551->232|1583->238
                  LINES: 28->1|33->1|35->3|39->7|39->7|39->7|39->7|40->8|40->8|40->8|40->8|40->8|41->9
                  -- GENERATED --
              */
          