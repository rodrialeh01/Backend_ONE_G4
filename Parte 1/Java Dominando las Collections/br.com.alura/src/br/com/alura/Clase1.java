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
public class Clase1 {
    public static void main(String[] args) {
        String variable1 = "Ejemplo 1";
        String variable2 = "Ejemplo 2";
        String variable3 = "Ejemplo 3";
        String variable4 = "Ejemplo 4";
        
        ArrayList<String> lista = new ArrayList<>();
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);
        
        System.out.println(lista);
        
        //ELIMINAR UN ELEMENTO
        //lista.remove(2);
        
        //MODIFICAR EL VALOR DE UN ELEMENTO DE LA LISTA
        
        //lista.set(2, "Ejemplo alterado");
        
        System.out.println(lista.size());
    }
}
