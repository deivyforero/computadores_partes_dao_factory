/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.AbstractFactory;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Computador;

/**
 *
 * @author ARMY
 */
public class App {

    public static void main(String[] args) {

        AbstractFactory absFact = new AbstractFactory();

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println(" 1. Mostrar Archivo Json");
            System.out.println(" 2. Mostrar Archivo XML");
            System.out.println("99. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    ArrayList<Computador> listCompJson = new ArrayList<Computador>();
                    listCompJson = absFact.getJson("ArcJson");
                    System.out.println("Mostrando Archivos Json");
                    System.out.println("");
                    for (Computador recJson : listCompJson) {
                        System.out.println(recJson);
                    }
                    System.out.println("");
                    break;
                case 2:
                    ArrayList<Computador> listCompXml = new ArrayList<Computador>();
                    listCompXml = absFact.getXML("ArcXML");
                    System.out.println("Mostrando Archivos XML");
                    System.out.println("");
                    for (Computador recXml : listCompXml) {
                        System.out.println(recXml);
                    }
                    System.out.println("");
                    break;
                case 99:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }

    }

}
