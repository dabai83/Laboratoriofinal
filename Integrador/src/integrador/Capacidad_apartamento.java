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
public enum Capacidad_apartamento {
    minima(),media(),maxima();

    public static int getMinima() {
        return 4;
    }

    public static int getMedia() {
        return 6;
    }

    public static int getMaxima() {
        return 8;
    }
    
}
