package config;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * Created by cjx on 2017/6/12.
 */
public class ConfigReader {

    public static void readConfig() throws DocumentException {
        SAXReader reader = new SAXReader();
        Document doc = reader.read("config/cfg.xml");
        Element game = doc.getRootElement();
        Element frame = game.element("frame");
        String str = frame.attributeValue("width");
        List<Element> layers = frame.elements("layer");
        System.out.print(str);
    }

    public static void main(String[] args) throws DocumentException {
        readConfig();
    }
}
