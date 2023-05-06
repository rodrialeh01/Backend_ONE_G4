/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.modelo;

/**
 *
 * @author rodri
 */
public class Producto {
    
    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer cantidad;
    private Integer categoriaId;

    public Producto(String nombre, String descripcion, Integer cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public Producto(Integer id, String nombre, String descripcion, Integer cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public Producto(Integer id, String nombre, Integer cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setCategoriaId(Integer categoriaId){
        this.categoriaId = categoriaId;
    }
    
    public int getCategoriaId(){
        return this.categoriaId;
    }
    
    @Override
    public String toString() {
        return String.format(
                "{id:%d, nombre: %s, descripcion:%s, cantidad:%d}",
                this.id,
                this.nombre,
                this.descripcion,
                this.cantidad
                );
    }
}
