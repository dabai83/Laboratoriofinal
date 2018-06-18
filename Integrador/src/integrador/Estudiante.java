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
public class Estudiante extends Padre{
    private String nombre,apellido,usuario,correo;
    private int anho, numero;
    private Sexo sexo;

    public Estudiante(String nombre, String apellido, String usuario, String correo, int anho, int numero, Sexo sexo) {
      //  Apartamento n = new Apartamento();
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.correo = correo;
        this.anho = anho;
        this.numero = numero;//n.getNumero();
        this.sexo = sexo;
    }
    public Estudiante() {

    }
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", correo=" + correo + ", anho=" + anho + ", numero=" + numero + ", sexo=" + sexo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public void Eliminar() {
      
    }

  
    public void Actualizar(String nombre, String apellido, String usuario, String correo, int anho, int numero, Sexo sexo ,String facultad_ant,String facultad_act) {
        Edificio n    = new Edificio();
        String s      = n.getFacultad();
        this.nombre   = nombre;
        this.apellido = apellido;
        this.usuario  = usuario;
        this.correo   = correo;
        this.anho     = anho;     
        this.sexo     = sexo;  
        if(facultad_ant.equals(facultad_act)){
          this.numero   = numero;        
        }
        else{
         System.out.println( "El estudiante que pertenece a la facultad de "+ facultad_act +" no puede mudarse a un apartamento que nos sea de su facultad");
      }
      
    }

    @Override
    public void Mostrar() {
        System.out.println( "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", correo=" + correo + ", anho=" + anho + ", numero de apartamento=" + numero + ", sexo=" + sexo + '}');
    }


    public void Registrar(String nombre, String apellido, String usuario, String correo, int anho, int numero, Sexo sexo ) {
        this.nombre   = nombre;
        this.apellido = apellido;
        this.usuario  = usuario;
        this.correo   = correo;
        this.anho     = anho;
        this.numero   = numero;
        this.sexo     = sexo;
    }

  
}
