/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rodri
 */
public class Alumno {
    private String nombre;
    private String codigo;

    public Alumno(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
    @Override
    public boolean equals(Object obj){
        Alumno alumno = (Alumno) obj;
        return this.nombre.equals(alumno.getNombre());
    }
    
    @Override
    public int hashCode(){
        return this.nombre.hashCode();
    }
}
