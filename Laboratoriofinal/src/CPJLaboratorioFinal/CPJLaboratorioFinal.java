/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CPJLaboratorioFinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.CatalogoPeliculasImpl;

/**
 *
 * @author Visita
 */
public class CPJLaboratorioFinal {

    /**
     * @param args the command line arguments
     */
    
     private static final Scanner s = new Scanner(System.in);
      private static int opcion = -1;
      private static final String nombreArchivo = "C:\\Users\\Albert\\Desktop\\peliculas.txt";
      private static final CatalogoPeliculasImpl  catalogoPeliculas = new CatalogoPeliculasImpl();
    public static void main(String[] args) {
        // TODO code application logic here
      //Scanner s  = new Scanner(system.in);
     
      
      System.out.println("1.- Iniciar catalogo películas ");
      System.out.println("2.- Agregar película ");
      System.out.println("3.- Listar Películas ");
      System.out.println("4.- Buscar Película  ");
      System.out.println("0.- Salir  ");      
      opcion = s.nextInt();
      
      if (opcion == 1){
          System.out.println(nombreArchivo);
          catalogoPeliculas.iniciarArchivo(nombreArchivo);
     
        }      
      else {
         if (opcion == 2){
             System.out.println("entro");
             catalogoPeliculas.agregarPelicula("avengers", nombreArchivo);
         }
         else{
                if (opcion == 3){
                catalogoPeliculas.listarPelicula(nombreArchivo);
               } 
              else{
               if (opcion == 4){
                catalogoPeliculas.buscarPelicula( nombreArchivo,"avengers");
               } 
               else{
                  if (opcion == 0){
                      System.out.println("Salio");
               }  
               }
      } 
    
    }
    
}
      }
    }
//C:\catalogoPeliculas