/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Visita
 */
public class Integrador {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     List<Padre> lis_est = new ArrayList();
     Estudiante  e = new Estudiante("albert", "aguero", "usuario", "correo", 34, 12, Sexo.Masculino);
     Estudiante  f = new Estudiante("ruben", "uzabal", "usuario", "correo", 34, 13, Sexo.Masculino);
     Apartamento a = new Apartamento(12, 12, 02111333, Capacidad_apartamento.media, "Luis Alberto del Parana", "A", "1234","Ingenieria");
     Apartamento b = new Apartamento(12, 13, 02111333, Capacidad_apartamento.media, "Luis Alberto de Luque", "A", "1234","Filosoria");
     lis_est.add(e);
     lis_est.add(f);     
     //lis_est.add(a);
     //lis_est.add(b);
     //2
    //e.Actualizar("albert", "aguero", "usuario", "correo", 34, 12, Sexo.Masculino,"Filosoria",a.getFacultad());
       System.out.println("cantidad de alumno "+ lis_est.size());
     for ( Padre p : lis_est){
           //1
           if (p instanceof Estudiante){        
              ((Estudiante)p).Mostrar();
            
            }             
        }
    }   
}