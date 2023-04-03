/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author rodri
 */
public class Clase3 {
    public static void main(String[] args) {
        String curso1 = "Geometria";
        String curso2 = "Fisica";
        String curso3 = "Quimica";
        String curso4 = "Historia";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        
        System.out.println(cursos);
        
        //ORDENAMIENTO POR MEDIO DE LA CLASE COLLECTIONS
        
        //ORDENAR DE MENOR A MAYOR
        //Collections.sort(cursos);
        
        //System.out.println(cursos);
        
        //ORDENAR DE MAYOR A MENOR        
        //Collections.sort(cursos, Collections.reverseOrder());
        
        //System.out.println(cursos);
        
        //ORDENAR CON COMPARATOR
        //cursos.sort(Comparator.naturalOrder());
        
        //System.out.println(cursos);
        
        //ORDENAR CON STREAM : crear una nueva Lista
        
        List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
        
        System.out.println(cursosList);
    }
    
}
