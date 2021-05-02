/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import DAO.DaoJson;
import DAO.DaoXML;
import Interfaces.IntAbstractFactory;
import Interfaces.IntDaoJson;
import Interfaces.IntDaoXML;
import java.util.ArrayList;
import modelo.Computador;

/**
 *
 * @author ARMY
 */
public class AbstractFactory implements IntAbstractFactory {

    @Override
    public ArrayList<Computador>getJson(String nomArcivo) {

        DaoJson json = new DaoJson();
        ArrayList<Computador> listCompJson = new ArrayList<Computador>();
        listCompJson = json.conectar(nomArcivo);
        return listCompJson;
    }

    @Override
    public ArrayList<Computador> getXML(String nomArcivo) {

        DaoXML xml = new DaoXML();
        ArrayList<Computador> listCompXml = new ArrayList<Computador>();
        listCompXml = xml.conectar(nomArcivo);
        return listCompXml;
    }

}
