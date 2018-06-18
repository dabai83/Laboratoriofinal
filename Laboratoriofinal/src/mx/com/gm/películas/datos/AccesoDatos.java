/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.películas.datos;

import java.util.List;
import mx.com.gm.películas.domain.Pelicula;
import mx.com.gm.películas.excepciones.AccesoDatosEx;
import mx.com.gm.películas.excepciones.EscrituraDatosEx;
import mx.com.gm.películas.excepciones.LecturaDatosEx;

/**
 *
 * @author Visita
 */
public interface AccesoDatos {
    public boolean Existe(String nombreArchivo);
    public List<Pelicula> listar(String nombre)throws LecturaDatosEx;
    public void escribir(Pelicula pelicula,String nombreArchivo, boolean anexar)throws EscrituraDatosEx;  
    public String Buscar(String nombreArchivo, String buscar)throws LecturaDatosEx; 
    public void crear(String nombreArchivo)throws AccesoDatosEx; 
    public void borrar(String nombreArchivo)throws AccesoDatosEx; 
}
