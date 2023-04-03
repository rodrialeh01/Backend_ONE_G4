/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author rodri
 */
public class CrearCuenta {
    public static void main(String[] args) {
        //Variable           = Valor
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 1000;
        //primeraCuenta.pais = "Peru"; NO COMPILA
        System.out.println(primeraCuenta.saldo);
        
        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 500;
        
        System.out.println(segundaCuenta.saldo);
    }
}
