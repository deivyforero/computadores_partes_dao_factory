/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;
import modelo.Computador;

/**
 *
 * @author ARMY
 */
public interface IntDaoJson {
    public ArrayList<Computador> conectar(String nomArchivo);
}
