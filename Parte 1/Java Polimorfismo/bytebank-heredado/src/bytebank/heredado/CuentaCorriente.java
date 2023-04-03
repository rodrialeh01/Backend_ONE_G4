/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebank.heredado;

/**
 *
 * @author rodri
 */
public class CuentaCorriente extends Cuenta{
    
    public CuentaCorriente(int agencia,int numero){
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double comision = 0.2;
        return super.saca(valor+ comision);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }
    
}
