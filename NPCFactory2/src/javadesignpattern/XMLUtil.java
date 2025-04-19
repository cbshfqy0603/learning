package javadesignpattern;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLUtil {
    public static String getNPCType() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("C:\\code\\NPCFactory2\\src\\javadesignpattern\\npc_config.xml");
            NodeList nodeList = document.getElementsByTagName("type");
            return nodeList.item(0).getTextContent();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
