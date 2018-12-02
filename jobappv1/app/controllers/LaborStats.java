import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class LaborStatisticsParser {
    
    public void parse() throws IOException {
        
        Document document;
        document = Jsoup.connect("https://www.bls.gov/oes/current/oes_nat.htm").get();
        
        Element table = document.select("tbody").get(2);
        
        Elements oddRows = table.select("tr.odd");
        Elements evenRows = table.select("tr.even")

        Elements oddRowCells = oddRows.children();
        Elements evenRowCells = evenRows.children();

        ArrayList occupations = new ArrayList();
        ArrayList annualMeanWages = new ArrayList();

        for (int i = 0; i < oddRowCells.size(); i++) {
            Element oddRowCell = oddRowCells.get(i);
            String cellClass = oddRowCell.attr("class");
            if (cellClass.equals("align-left")) {
                Elements cellChildren = oddRowCell.children();
                for (int j = 0; j < cellChildren.size(); j++) {
                    Element cellChild = cellChildren.get(j);
                    if (cellChild.tagName("a")) {
                        String occupation = cellChild.text();
                        occupations.add(occupation);
                    }
                }
            }
        }

        for (int i = 0; i < evenRowCells.size(); i++) {
            Element evenRowCell = evenRowCells.get(i);
            String cellClass = evenRowCell.attr("class");
            if (cellClass.equals("align-right")) {
                String potentialWage = evenRowCell.text();
                if (potentialWage.contains(",")) {
                    annualMeanWages.add(potentialWage);
                }
            }
        }
    }
}
        
        