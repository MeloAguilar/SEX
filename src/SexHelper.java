import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class SexHelper extends DefaultHandler {

    boolean esDescuento = false;
    boolean esFecha = false;
    boolean esDescripcion = false;
    boolean esPrecioUnidad = false;
    boolean esUnidades = false;




    public void startElement(String uri, String localName, String elementos, Attributes atributos) {
        System.out.println("Inicio del elemento :" + elementos);
        switch (elementos) {
            case "fecha":
                esFecha = true;
                break;
            case "descripcion":
                esDescripcion = true;
                break;
            case "precio_unidad":
                esPrecioUnidad = true;
                break;
            case "descuento":
                esDescuento = true;
                break;
            case "unidades":
                esUnidades = true;
                break;

            default:
                break;
        }
    }

    public void characters(char[] ch, int inicio, int length) {
        String elemento = new String(ch, inicio, length);
        if (esFecha) {

            System.out.println("Fecha: " + elemento);
            esFecha = false;
            return;
        }
        if (esDescripcion) {
            System.out.println("Descripción: " + elemento);
            esDescripcion = false;
            return;
        }
        if (esPrecioUnidad) {
            float precioTotal = 0;
            System.out.println("Precio por unidad: " + elemento);
            esPrecioUnidad = false;
            return;
        }
        if (esDescuento) {
            System.out.println("Descuento: " + elemento);
            esDescuento = false;
            return;
        }
        if(esUnidades){
            System.out.println("Unidades: " + elemento);
            esUnidades = false;
            return;
        }
    }

    public void endElement(String uri, String localName, String elementos){
        System.out.println("Fin del elemento: " + elementos);
    }
}