/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebank.heredado;

/**
 *
 * @author rodri
 */
public class ControlBonificacion {
    private double suma;
    
    public double registrarSalario(Funcionario funcionario){
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("Calculo actual: "+this.suma);
        return this.suma;
    }
}
