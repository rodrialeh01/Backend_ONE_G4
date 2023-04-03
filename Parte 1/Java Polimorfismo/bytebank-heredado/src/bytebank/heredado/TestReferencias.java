/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebank.heredado;

/**
 *
 * @author rodri
 */
public class TestReferencias {
    public static void main(String[] args) {
        /*
        El elemento mas generico puede ser adaptado al elemento mas especifico
        */
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Diego");
        
        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");
        
        funcionario.setSalario(2000);
        gerente.setSalario(10000);
        
        
    }
}
