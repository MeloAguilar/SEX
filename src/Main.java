import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
    leerXmlSex();

        }
    public static void leerXmlSex () {

        SAXParserFactory factory = SAXParserFactory.newInstance();

        try {

            SAXParser saxParser = factory.newSAXParser();
            SexHelper handler = new SexHelper();
            saxParser.parse("src/compras.xml", handler);

        } catch (ParserConfigurationException e) {
            System.out.println("Error al parsear el fichero xml");
        } catch (SAXException e) {
            System.out.println("Error de SAX");
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura");
        }
    }
}