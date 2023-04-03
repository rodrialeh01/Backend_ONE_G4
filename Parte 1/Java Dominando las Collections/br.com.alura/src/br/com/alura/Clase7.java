/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura;

import java.util.ArrayList;
import java.util.List;
import model.Aula;
import model.Curso;

/**
 *
 * @author rodri
 */
public class Clase7 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java",30);
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));
        curso1.addAula(new Aula("Inmutable"));
        
        List<Aula> aulaList = curso1.getAulaList();
        
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        
        System.out.println(aulaList);
    }
}
