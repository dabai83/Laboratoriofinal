/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.peliculas.negocio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.películas.datos.AccesoDatos;
import mx.com.gm.películas.datos.AccesoDatosImpl;
import mx.com.gm.películas.domain.Pelicula;
import mx.com.gm.películas.excepciones.AccesoDatosEx;
import mx.com.gm.películas.excepciones.EscrituraDatosEx;
import mx.com.gm.películas.excepciones.LecturaDatosEx;

/**
 *
 * @author albert
 */
public class CatalogoPeliculasImpl implements CatalogoPeliculas{
    
   private final AccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        //try {
            anexar = datos.Existe(nombreArchivo);
            try {
                datos.escribir(pelicula, nombreArchivo, anexar);
            } catch (EscrituraDatosEx ex) {
                Logger.getLogger(CatalogoPeliculasImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } //catch (AccesoDatosEx ex) {
            //System.out.println("Error de acceso a datos");
       // }
   // }

    @Override
    public void listarPelicula(String nombreArchivo) {
        try {
            List<Pelicula> peliculas = datos.listar(nombreArchivo);
            peliculas.stream().forEach((pelicula) -> {
                System.out.println("Pelicula:" + pelicula);
            });
        } catch (LecturaDatosEx ex) {
           Logger.getLogger(CatalogoPeliculasImpl.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        String resultado = null;
        try {
            resultado = datos.Buscar(buscar, nombreArchivo);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar la pelicula");
        }
        System.out.println("Resultado busqueda:" + resultado);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        try {
            if (datos.Existe(nombreArchivo)) {
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                //creamos archivo
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
        }
    }
    
}
