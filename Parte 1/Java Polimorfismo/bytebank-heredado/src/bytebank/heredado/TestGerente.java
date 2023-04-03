/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebank.heredado;

/**
 *
 * @author rodri
 */
public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        //Funcionario gerente = new Funcionario();
        gerente.setSalario(6000);
        gerente.setTipo(1);
        
        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
    }
}
