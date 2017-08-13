package Parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Parser {
    private File input;
    private Document doc;
    final String charset = "UTF-8";

    public Parser(String fileRoot) {
        input = new File(fileRoot);
        try {
            doc = Jsoup.parse(input, charset, "");
        } catch (IOException e) {
            System.out.println("Problem with input file" + "\n");
            e.printStackTrace();
        }
    }

    public String parseShipName() {
        Element element = doc.getElementById("_ctl0_VesselName");
        return element.ownText();
    }

    public String parseShipType() {
        Element element = doc.getElementById("_ctl0_ShipType");
        return element.ownText();
    }

    public String parseShipManager() {
        Element element = doc.getElementById("_ctl0_lkbTopOperator");
        return element.ownText();
    }

    public String parseShipOwner() {
        Element element = doc.getElementById("_ctl0_lkbTopRegisteredOwner");
        return element.ownText();
    }

    public String parseShipFlag() {
        Element element = doc.getElementById("_ctl0_Flag");
        return element.ownText();
    }

    public String parseEngineType() {
        Element element = doc.getElementById("_ctl3_dgdDetail");
        Elements elements = element.getAllElements();
        return elements.get(15).ownText();
    }

    public String parseEngineModel() {
        Element element = doc.getElementById("_ctl3_dgdDetail");
        Elements elements = element.getAllElements();
        return elements.get(16).ownText();
    }

    public String parseEnginePower() {
        Element element = doc.getElementById("_ctl3_dgdDetail");
        Elements elements = element.getAllElements();
        return elements.get(17).ownText();
    }

    public String parseShipDWT() {
        Element element = doc.getElementById("_ctl4_Dwt");
        return element.ownText();
    }

    public String parseShipGross() {
        Element element = doc.getElementById("_ctl4_Gross");
        return element.ownText();
    }

    public String parseShipLength() {
        Element element = doc.getElementById("_ctl4_LOA");
        return element.ownText();
    }

    public String parseShipBuildYear() {
        String result,day, month, year;
        day = "01";
        Element element = doc.getElementById("_ctl2_built");
        StringBuilder str = new StringBuilder(element.ownText());
        year = str.substring(0,4);
        month = str.substring(5);
        result = day + "-" + month + "-" + year;
        return result;
    }

    public String parseShipIMO() {
        Element element = doc.getElementById("_ctl0_LRNumber");
        return element.ownText();
    }

    public String parseShipCallSign() {
        Element element = doc.getElementById("_ctl0_CallSign");
        return element.ownText();
    }

}
