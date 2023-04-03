/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author rodri
 */
public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo = 200;
        
        Cuenta segundaCuenta = primeraCuenta;
        segundaCuenta.saldo = 100;
        
        System.out.println("Saldo Primera cuenta: " + primeraCuenta.saldo);
        
        System.out.println("Saldo Segunda cuenta: " + segundaCuenta.saldo);
        
        segundaCuenta.saldo += 400;
        
        System.out.println("Saldo Primera cuenta: " + primeraCuenta.saldo);
    }
}
