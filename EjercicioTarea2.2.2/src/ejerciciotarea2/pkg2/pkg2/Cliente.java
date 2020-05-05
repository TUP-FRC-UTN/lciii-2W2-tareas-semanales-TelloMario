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
public class Cliente {
    
    int numeroCliente;
    
    String nombreCliente;
    
    int antiguedad;
    
    Mascota mascota;

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Cliente() {
    }

    public Cliente(int numeroCliente, String nombreCliente, int antiguedad) {
        this.numeroCliente = numeroCliente;
        this.nombreCliente = nombreCliente;
        this.antiguedad = antiguedad;
        
    }

    public Cliente(int numeroCliente, String nombreCliente, int antiguedad, Mascota mascota){
    
        this.numeroCliente = numeroCliente;
        this.nombreCliente = nombreCliente;
        this.antiguedad = antiguedad;
        this.mascota = new Mascota();
        this.mascota = mascota;
    
    }

    public void NuevaMascota(Mascota nuevaMascota){
    
        this.mascota = new Mascota();
        this.mascota = nuevaMascota;
    
        
    }
    
    @Override
    public String toString() {
        return "Cliente: numero de Cliente = " + numeroCliente + ", nombre del Cliente = " + nombreCliente + ", antiguedad = " + antiguedad + " años, mascota = " + mascota.nombreMascota + " , edad mascota = " + mascota.edadMascota;
    }
    
    
}
