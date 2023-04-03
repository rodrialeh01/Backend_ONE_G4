/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import model.Curso;

/**
 *
 * @author rodri
 */
public class Clase9 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Historia", 30);
        Curso curso2 = new Curso("Algebra", 10);
        Curso curso3 = new Curso("Aritmetica", 20);
        Curso curso4 = new Curso("Geometria", 50);
        
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        
        //System.out.println(cursos);
        
        //Collections.sort(cursos);
        //ORDENAR
        cursos.sort(Comparator.comparing(Curso::getNombre));
        int tiempo = 0;
        for (Curso curso : cursos) {
            tiempo += curso.getTiempo();
        }
        
        int mayor = 0;
        for (Curso curso : cursos) {
            if(curso.getTiempo()> mayor){
                mayor = curso.getTiempo();
            }
        }
        
        System.out.println(tiempo);
        System.out.println(mayor);
        
        List<Curso> cursolist = cursos.stream().sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        //OBTIENE EL NUMERO MAYOR
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
        
        //SUMAR TODA LA LISTA
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
        
    }
}
