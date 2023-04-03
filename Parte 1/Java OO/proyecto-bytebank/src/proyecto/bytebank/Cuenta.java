/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.bytebank;

/**
 *
 * @author rodri
 */
public class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total = 0;
    public Cuenta(int agencia){
        if(agencia <=0){
            System.out.println("No se permite 0");
            this.agencia = 1;
        }else{
            this.agencia = agencia;
        }
        total++;
        System.out.println("Se van creando: " +total + " cuentas" );
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }
    
    public boolean retirar(double valor){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean transferir(double valor, Cuenta cuenta){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            cuenta.depositar(valor);
            return true;
        }else{
            return false;
        }
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    public int getAgencia(){
        return this.agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }
    
    public static int getTotal(){
        return Cuenta.total;
    }
}
