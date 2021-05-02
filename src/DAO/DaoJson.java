/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Interfaces.IntDaoJson;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import modelo.Computador;


/**
 *
 * @author ARMY
 */
public class DaoJson implements IntDaoJson {

    @Override
    public ArrayList<Computador> conectar(String nomArchivo) {
        ArrayList<Computador> ListaComputadorsJson = null;
        String jsonAll = "";
        Gson gson = new Gson();
        //Staff obj = new Staff();
        try (BufferedReader br = new BufferedReader(new FileReader("archivos/" + nomArchivo + ".json"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                jsonAll += linea;
            }
            br.close();

            //System.out.println(json);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Computador[] personas = gson.fromJson(jsonAll,Computador[].class);
        ArrayList<Computador> arrayList = new ArrayList<Computador>(Arrays.asList(personas));

        return arrayList;
    }

}
