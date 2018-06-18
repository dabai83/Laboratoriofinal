/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

/**
 *
 * @author Visita
 */
public class Edificio extends Padre{
    private String nombre, manzana ,dirección,facultad;

    public Edificio(String nombre, String manzana, String dirección, String facultad) {
        this.nombre = nombre;
        this.manzana = manzana;
        this.dirección = dirección;
        this.facultad = facultad;
    }
    public Edificio() {
      
    }

    @Override
    public String toString() {
        return "Edificio{" + "nombre=" + nombre + ", manzana=" + manzana + ", direccion=" + dirección + ", facultad=" + facultad + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

 
    @Override
    public void Eliminar() {
      
    }


    @Override
    public void Actualizar(Padre p){
        
        this.nombre = ((Edificio)p).getNombre();
        this.manzana = ((Edificio)p).getManzana();
        this.dirección =((Edificio)p).getDirección();
        this.facultad = ((Edificio)p).getFacultad();
    }


    @Override
    public void Mostrar() {
        System.out.println( "Edificio{" + "nombre=" + nombre + ", manzana=" + manzana + ", direccion=" + dirección + ", facultad=" + facultad + '}');
    }


    @Override
    public void Registrar(Padre p) {
        
        this.nombre    = ((Edificio)p).getNombre();
        this.manzana   = ((Edificio)p).getManzana();
        this.dirección = ((Edificio)p).getDirección();
        this.facultad  = ((Edificio)p).getFacultad();  
    }


}
