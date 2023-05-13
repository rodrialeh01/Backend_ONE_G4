package com.latam.alura.tienda.vo;

import java.time.LocalDate;

public class RelatorioDeVenta {
    
    private String nombreDelProducto;
    private Long CantidadDeProducto;
    private LocalDate fechaDeUltimaVenta;

    public RelatorioDeVenta(String nombreDelProducto, Long cantidadDeProducto, LocalDate fechaDeUltimaVenta) {
        this.nombreDelProducto = nombreDelProducto;
        CantidadDeProducto = cantidadDeProducto;
        this.fechaDeUltimaVenta = fechaDeUltimaVenta;
    }

    public String getNombreDelProducto() {
        return nombreDelProducto;
    }

    public void setNombreDelProducto(String nombreDelProducto) {
        this.nombreDelProducto = nombreDelProducto;
    }

    public Long getCantidadDeProducto() {
        return CantidadDeProducto;
    }

    public void setCantidadDeProducto(Long cantidadDeProducto) {
        CantidadDeProducto = cantidadDeProducto;
    }

    public LocalDate getFechaDeUltimaVenta() {
        return fechaDeUltimaVenta;
    }

    public void setFechaDeUltimaVenta(LocalDate fechaDeUltimaVenta) {
        this.fechaDeUltimaVenta = fechaDeUltimaVenta;
    }

    @Override
    public String toString() {
        return "RelatorioDeVenta [CantidadDeProducto=" + CantidadDeProducto + ", fechaDeUltimaVenta="
                + fechaDeUltimaVenta + ", nombreDelProducto=" + nombreDelProducto + "]";
    }
}
