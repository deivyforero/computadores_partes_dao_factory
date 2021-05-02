/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interfaces.IntDaoXML;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import modelo.Computador;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author ARMY
 */
public class DaoXML implements IntDaoXML {

    @Override
    public ArrayList<Computador> conectar(String nomArchivo) {
        ArrayList<Computador> ListaComputadorsXml = new ArrayList<Computador>();
        try {
            Computador computador = null;
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder;
            builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("archivos/" + nomArchivo + ".xml"));
            document.getDocumentElement().normalize();
            NodeList nList = document.getElementsByTagName("computador");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node node = nList.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    //Create new Employee Object
                    computador = new Computador();
                    computador.setId(eElement.getElementsByTagName("id").item(0).getTextContent());
                    computador.setTipo(eElement.getElementsByTagName("tipo").item(0).getTextContent());
                    computador.setMemoria(eElement.getElementsByTagName("memoria").item(0).getTextContent());
                    computador.setProcesador(eElement.getElementsByTagName("procesador").item(0).getTextContent());
                    computador.setBoard(eElement.getElementsByTagName("board").item(0).getTextContent());
                    computador.setDescripcion(eElement.getElementsByTagName("descripcion").item(0).getTextContent());
                    ListaComputadorsXml.add(computador);

                }

            }
            //Computadors = ListaComputadorsXml;
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DaoXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (org.xml.sax.SAXException ex) {
            Logger.getLogger(DaoXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DaoXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ListaComputadorsXml;
    }

}
