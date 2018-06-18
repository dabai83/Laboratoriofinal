

package mx.com.gm.películas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
//import mx.com.gm.películas.datos.AccesoDatos;
import mx.com.gm.películas.domain.Pelicula;
import mx.com.gm.películas.excepciones.AccesoDatosEx;
import mx.com.gm.películas.excepciones.EscrituraDatosEx;
import mx.com.gm.películas.excepciones.LecturaDatosEx;

/**
 *
 * @author Alejandro
 */
public class AccesoDatosImpl implements AccesoDatos{

   
   
    @Override
    public boolean Existe(String nombreArchivo)  {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    /**
     *
     * @param nombreArchivo
     * @return
     * @throws LecturaDatosEx
     */
    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return peliculas;
    }

    
  @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito correctamente al archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

   public String Buscar(String buscar, String nombreArchivo)throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        String resultado = null;
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            int i = 0;
            linea = entrada.readLine();
            while (linea != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    resultado = "Pelicula " + linea + " encontrada en indice " + i;
                    break;
                }
                linea = entrada.readLine();
                i++;
            }
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }
@Override
    public void crear(String nombreArchivo) throws AccesoDatosEx{
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo correctamente");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    

   @Override
    public void borrar(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        archivo.delete();
        System.out.println("Se ha borrado el archivo correctamente");
    }
    
}
