/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import model.Alumno;
import model.Curso;

/**
 *
 * @author rodri
 */
public class Clase18 {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Historia", 30);
        Alumno alumno1 = new Alumno("Luis Miguel", "001");
        Alumno alumno2 = new Alumno("Pepito los palotes", "002");
        Alumno alumno3 = new Alumno("Juan Carlos", "003");
        Alumno alumno4 = new Alumno("Pedro Pedrito", "004");
        Alumno alumno5 = new Alumno("Gustavo Sanchez","005");
        Alumno alumno6 = new Alumno("Marcia Maria","006");
        Alumno alumno7 = new Alumno("Claudia Patricia", "007");
        
        Collection<Alumno> listaAlumnos = new HashSet<>();
        
        //UN SET NO TIENE UN ORDEN ESPECIFICO AL GUARDAR
        //NO PUEDE GUARDAR DUPLICADOS
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        
        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);
        
        //curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));
        
        Optional<Alumno> alumno = curso1.getAlumnos().stream().filter(a->"003".equalsIgnoreCase((a.getCodigo()))).findFirst();
        
        if(alumno.isPresent()){
            System.out.println(alumno.get());
        }
        
        Alumno alumnoMap = curso1.getAlumnoMap().get("003");
        
        System.out.println(alumnoMap);
    }
}
