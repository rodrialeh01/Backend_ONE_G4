/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebank.heredado;

/**
 *
 * @author rodri
 */
public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1,1);
        CuentaAhorros ca = new CuentaAhorros(2,3);
        cc.depositar(2000);
        cc.transferir(1000, ca);
        
        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
    }
}
