/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class Clase2 {
    public static void main(String[] args) {
        String variable1 = "Clase 1";
        String variable2 = "Clase 2";
        String variable3 = "Clase 3";
        String variable4 = "Clase 4";
        
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add(variable1);
        listaString.add(variable2);
        listaString.add(variable3);
        listaString.add(variable4);
        
        System.out.println(listaString);
        //RECORRER POR POSICION
        //for (int i = 0; i < listaString.size(); i++) {
        //    System.out.println(listaString.get(i));
        //}
        
        //RECORRER POR ELEMENTO
        //for (String clase : listaString) {
        //    System.out.println(clase);
        //}
       
        //RECORRER POR FOR EACH
        listaString.forEach(clase ->{
            System.out.println(clase);
        });
    }
}
