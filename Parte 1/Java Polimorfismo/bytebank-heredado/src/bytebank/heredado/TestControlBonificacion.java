/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebank.heredado;

/**
 *
 * @author rodri
 */
public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setSalario(2000);
        
        Gerente jimena = new Gerente();
        jimena.setSalario(10000);
        
        Contador alexiz = new Contador();
        alexiz.setSalario(5000);
        
        ControlBonificacion controlBonificacion = new ControlBonificacion();
        
        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alexiz);
    }
}
