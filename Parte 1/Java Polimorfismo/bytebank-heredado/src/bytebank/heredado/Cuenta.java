/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebank.heredado;

/**
 *
 * @author rodri
 */
public abstract class Cuenta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total = 0;
    public Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        Cuenta.total++;
    }
    
    public abstract void depositar(double valor);
    
    public boolean retirar(double valor){
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean saca(double valor){
        if(this.saldo >=valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean transferir(double valor, Cuenta destino){
        if (this.saldo >= valor) {
            this.saca(valor);
            destino.depositar(valor);
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

