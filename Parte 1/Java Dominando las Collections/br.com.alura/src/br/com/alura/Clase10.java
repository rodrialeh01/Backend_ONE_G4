/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import model.Curso;

/**
 *
 * @author rodri
 */
public class Clase10 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Historia", 30);
        Curso curso2 = new Curso("Algebra", 10);
        Curso curso3 = new Curso("Aritmetica", 20);
        Curso curso4 = new Curso("Geometria", 50);
        Curso curso5 = new Curso("Fisica", 60);
        Curso curso6 = new Curso("Quimica", 80);
        Curso curso7 = new Curso("Quimica", 70);
        Curso curso8 = new Curso("Fisica", 30);
        
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);

        List<Curso> cursolist = cursos.stream().sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        
        System.out.println(cursos.stream().filter(curso-> !curso.getNombre().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());
        
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
        
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
        
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());
        
        //MOSTRAR TODOS LOS CURSOS SIN REPETIRSE
        Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
        //NOMBRE DEL CURSO - CANTIDAD DE VECES REPETIDA
        groupCurso.forEach((key, value) -> System.out.println(key + " - " + value.size()));
        
        System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());
        
    }
}
