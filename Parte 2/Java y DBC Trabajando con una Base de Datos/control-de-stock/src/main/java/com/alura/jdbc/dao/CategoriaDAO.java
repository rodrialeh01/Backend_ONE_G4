/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.jdbc.dao;

import com.alura.jdbc.modelo.Categoria;
import com.alura.jdbc.modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodri
 */
public class CategoriaDAO {
    
    private Connection con;
    
    public CategoriaDAO(Connection recuperaConexion) {
        this.con = recuperaConexion;
    }
    
    public List<Categoria> listar(){
        List<Categoria> resultado = new ArrayList<>();
        
        try {
            final PreparedStatement statement = con.prepareStatement("SELECT ID, NOMBRE FROM CATEGORIA");
            try(statement){
                final ResultSet resultSet = statement.executeQuery();
                try (resultSet){
                    while(resultSet.next()){
                        var categoria = new Categoria(resultSet.getInt("ID"), resultSet.getString("NOMBRE"));
                        
                        resultado.add(categoria);
                    }
                };
            }
            
        } catch (SQLException ex) {
            System.out.println("FFFFFFFF");
            throw new RuntimeException(ex);
        }
        return resultado;
    }
    
    public List<Categoria> listarConProductos(){
        List<Categoria> resultado = new ArrayList<>();

        try {
            String sql = "SELECT C.ID, C.NOMBRE, P.ID, P.NOMBRE, P.CANTIDAD "
                    + " FROM CATEGORIA C INNER JOIN PRODUCTO P "
                    + " ON C.ID = P.CATEGORIA_ID";
            
            System.out.println(sql);
            
            final PreparedStatement statement = con
                    .prepareStatement(sql);

            try (statement) {
                final ResultSet resultSet = statement.executeQuery();

                try (resultSet) {
                    while (resultSet.next()) {
                        int categoriaId = resultSet.getInt("C.ID");
                        String categoriaNombre = resultSet.getString("C.NOMBRE");
                        
                        Categoria categoria = resultado
                            .stream()
                            .filter(cat -> cat.getId().equals(categoriaId))
                            .findAny().orElseGet(() -> {
                                Categoria cat = new Categoria(
                                        categoriaId, categoriaNombre);
                                resultado.add(cat);
                                
                                return cat;
                            });
                        
                        Producto producto = new Producto(
                                resultSet.getInt("P.ID"),
                                resultSet.getString("P.NOMBRE"),
                                resultSet.getInt("P.CANTIDAD"));
                        
                        categoria.agregar(producto);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return resultado;
    }
}
