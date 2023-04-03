/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebank.heredado;

/**
 *
 * @author rodri
 */
public class SistemaInterno {
    
    private String clave = "12345";
    public boolean autentica(Autenticable gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if(puedeIniciarSesion){
            System.out.println("Login Exitoso");
            return true;
        }else{
            System.out.println("Error en el Login");
            return false;
        }
    }
}
