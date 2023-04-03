/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author rodri
 */
public class Clase11 {
    
    
    public static void main(String[] args) {
        String alumno1 = "Luis Miguel";
        String alumno2 = "Pepito los palotes";
        String alumno3 = "Juan Carlos";
        String alumno4 = "Pedro Pedrito";
        String alumno5 = "Gustavo Sanchez";
        String alumno6 = "Marcia Maria";
        
        Set<String> listaAlumnos = new HashSet<>();
        
        //UN SET NO TIENE UN ORDEN ESPECIFICO AL GUARDAR
        
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        
        for (String alumno: listaAlumnos) {
            System.out.println(alumno);
        }
    }
}
