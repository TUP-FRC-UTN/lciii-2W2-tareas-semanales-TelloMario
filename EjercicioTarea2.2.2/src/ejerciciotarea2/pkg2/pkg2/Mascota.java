/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotarea2.pkg2.pkg2;

/**
 *
 * @author MarioAriel
 */
public class Mascota {
    
    String nombreMascota;
    
    int edadMascota;

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdadMascota() {
        return edadMascota;
    }

    public void setEdadMascota(int edadMascota) {
        this.edadMascota = edadMascota;
    }


    public Mascota(){ 
    
    }

    public Mascota(String nombreMascota, int edadMascota) {
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }
    
    

    @Override
    public String toString() {
        return "Mascota: nombre = " + nombreMascota + ", edad = " + edadMascota;
    }

    
}
