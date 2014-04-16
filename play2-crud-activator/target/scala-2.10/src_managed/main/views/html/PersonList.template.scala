
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object PersonList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[com.avaje.ebean.Page[Person],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: com.avaje.ebean.Page[Person]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.38*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("list")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""

    <h3>"""),_display_(Seq[Any](/*7.10*/page/*7.14*/.getTotalRowCount())),format.raw/*7.33*/(""" objects</h3>

    """),_display_(Seq[Any](/*9.6*/if(page.getTotalRowCount() == 0)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*15.7*/else/*15.12*/{_display_(Seq[Any](format.raw/*15.13*/("""

    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th class="header">key</th>
                <th class="header">name</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(Seq[Any](/*25.10*/for(simple <- page.getList()) yield /*25.39*/ {_display_(Seq[Any](format.raw/*25.41*/("""
            <tr>
                <td>
                	"""),_display_(Seq[Any](/*28.19*/simple/*28.25*/.getKey())),format.raw/*28.34*/("""
               	</td>
                <td>
                	"""),_display_(Seq[Any](/*31.19*/simple/*31.25*/.getName())),format.raw/*31.35*/("""
               	</td>
            </tr>
        """)))})),format.raw/*34.10*/("""
        </tbody>
    </table>
    
    """)))})),format.raw/*38.6*/("""
""")))})))}
    }
    
    def render(page:com.avaje.ebean.Page[Person]): play.api.templates.HtmlFormat.Appendable = apply(page)
    
    def f:((com.avaje.ebean.Page[Person]) => play.api.templates.HtmlFormat.Appendable) = (page) => apply(page)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Apr 14 21:47:32 BRT 2014
                    SOURCE: C:/Desenv/Play/play2-crud-activator/play2-crud-activator/app/views/PersonList.scala.html
                    HASH: 5d8c4b1ad1435138f255fb4fba264c55e432df34
                    MATRIX: 801->1|984->37|1012->93|1049->96|1069->108|1108->110|1156->123|1168->127|1208->146|1264->168|1304->200|1343->202|1473->315|1486->320|1525->321|1810->570|1855->599|1895->601|1991->661|2006->667|2037->676|2138->741|2153->747|2185->757|2270->810|2346->855
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|38->9|38->9|38->9|44->15|44->15|44->15|54->25|54->25|54->25|57->28|57->28|57->28|60->31|60->31|60->31|63->34|67->38
                    -- GENERATED --
                */
            