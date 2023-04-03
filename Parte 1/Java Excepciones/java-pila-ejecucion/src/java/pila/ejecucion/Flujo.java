/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.pila.ejecucion;

/**
 *
 * @author rodri
 */
public class Flujo {
    public static void main(String[] args) {
        System.out.println("Inicio Main");
        metodo1();
        System.out.println("Fin Main");
    }
    
    private static void metodo1(){
        System.out.println("Inicio metodo1");
        metodo2();
        System.out.println("Fin metodo1");
    }
    
    private static void metodo2(){
        System.out.println("Inicio metodo2");
        for (int i = 0; i <=5; i++) {
            System.out.println(i);
            try{
                //int num = 0;
                //int resultado = i/num;
                //System.out.println(resultado);
                String test = null;
                System.out.println(test.toString());
            }catch(ArithmeticException exception){
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }catch(NullPointerException exception){
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        }
        System.out.println("Fin metodo2");
    }
}
