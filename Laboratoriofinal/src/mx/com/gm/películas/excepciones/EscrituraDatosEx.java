/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.películas.excepciones;

/**
 *
 * @author Visita
 */
public class EscrituraDatosEx extends Exception{
         private String mensaje;
    public EscrituraDatosEx(String message) {
        this.mensaje = message;
  
    }   
}
