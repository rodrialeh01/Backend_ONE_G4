/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodri
 */
public class Categoria {
    private Integer Id;
    private String nombre;

    private List<Producto> productos;
    
    public Categoria(Integer Id, String nombre) {
        this.Id = Id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregar(Producto producto){
        if (this.productos == null){
            this.productos = new ArrayList<>();
        }
        this.productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
}
