/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4.sofiarubie;
import com.progra.ws.tipoCambio.Wsindicadoreseconomicos;
import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
/**
 *
 * @author sofia
 */
public class Lab4SofiaRubie {

    /**
     * @param args the command line arguments
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws org.xml.sax.SAXException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        Wsindicadoreseconomicos cliente;
            cliente = new Wsindicadoreseconomicos();
            String tipoCambioCompra= cliente.getWsindicadoreseconomicosSoap().obtenerIndicadoresEconomicosXML("317", "27/10/2021", "27/10/2021", "Sofia Rubie", "N", "sofia.rubie.garcia@est.una.ac.cr", "CA12R27B4A");
            cliente = new Wsindicadoreseconomicos();
            String tipoCambioVenta= cliente.getWsindicadoreseconomicosSoap().obtenerIndicadoresEconomicosXML("318", "27/10/2021", "27/10/2021", "Sofia Rubie", "N", "sofia.rubie.garcia@est.una.ac.cr", "CA12R27B4A");
            System.out.println("Compra" +tipoCambioCompra);
            System.out.println("Venta" +tipoCambioVenta);
        InputSource input = new InputSource();
        DocumentBuilder document = DocumentBuilderFactory.newInstance().newDocumentBuilder();     
        input.setCharacterStream(new StringReader(tipoCambioCompra));
        Document documento;
        documento = document.parse(input);
        NodeList nodo; 
        nodo = documento.getElementsByTagName("Datos_de_INGC011_CAT_INDICADORECONOMIC");
        for (int i = 0; i < nodo.getLength(); i++) {
            Element elemento = (Element) nodo.item(i);
            NodeList num = elemento.getElementsByTagName("NUM_VALOR");
            Element linea = (Element) num.item(0);
            NodeList fecha;
            fecha = elemento.getElementsByTagName("DES_FECHA");
            Element lineaB = (Element) fecha.item(0);
            System.out.println("Tipo de compra: " +  "("+ getData(lineaB) +  "): " + getData(linea));
        }
        
        InputSource inputS = new InputSource();
        DocumentBuilder documento2 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        inputS.setCharacterStream(new StringReader(tipoCambioVenta));
        Document doc2;
        doc2 = documento2.parse(inputS);
        NodeList nodoL;
        nodoL = doc2.getElementsByTagName("Datos_de_INGC011_CAT_INDICADORECONOMIC");
        for (int i = 0; i < nodoL.getLength(); i++) {
            Element elemento2 = (Element) nodoL.item(i);
            NodeList num2 = elemento2.getElementsByTagName("NUM_VALOR");
            Element lineaA = (Element) num2.item(0);
            NodeList fecha;
            fecha = elemento2.getElementsByTagName("DES_FECHA");
            Element lineaF = (Element) fecha.item(0);        
            System.out.println("Tipo de venta: " + "("+ getData(lineaF) + "): " + getData(lineaA));
         }
  }
  public static String getData(Element elem) {
    Node hijo2 = elem.getLastChild();
    Node hijo = elem.getFirstChild();
    if (hijo instanceof CharacterData) {
      CharacterData info = (CharacterData) hijo;
      return info.getData();
    }
    return "";
    }  
}



