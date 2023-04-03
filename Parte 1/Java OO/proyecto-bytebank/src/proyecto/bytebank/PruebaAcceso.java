/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author rodri
 */
public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.setAgencia(22);
        cuenta.depositar(400);
        cuenta.retirar(300);
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getAgencia());
    }
}
