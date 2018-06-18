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
public class Apartamento extends Edificio{
    private int pasos, numero ,telefono; 
    private Capacidad_apartamento capacidad;

    public Apartamento(int pasos, int numero, int telefono, Capacidad_apartamento capacidad, String nombre, String manzana, String dirección, String facultad) {
        super(nombre, manzana, dirección, facultad);
        this.pasos = pasos;
        this.numero = numero;
        this.telefono = telefono;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Apartamento{" + "pasos=" + pasos + ", numero=" + numero + ", telefono=" + telefono + ", capacidad=" + capacidad + '}';
    }

 

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

 

    public Capacidad_apartamento getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Capacidad_apartamento capacidad) {
        this.capacidad = capacidad;
    }

    public void Registrar(int pasos, int numero, int telefono, String nombre, Capacidad_apartamento capacidad) {
        this.pasos     = pasos;
        this.numero    = numero;
        this.telefono  = telefono;
        this.capacidad = capacidad;
    }

    @Override
    public void Mostrar() {
        System.out.println( "Apartamento{" + "pasos=" + pasos + ", numero=" + numero + ", telefono=" + telefono  + ", capacidad=" + capacidad + '}');
    }

    @Override
    public void Actualizar(Padre p) {

    }

    @Override
    public void Eliminar() {
        super.Eliminar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Registrar(Padre p) {
        this.pasos     = ((Apartamento)p).getPasos();
        this.numero    = ((Apartamento)p).getNumero();
        this.telefono  = ((Apartamento)p).getTelefono();             
        this.capacidad = ((Apartamento)p).getCapacidad();
    }

   
    
}
