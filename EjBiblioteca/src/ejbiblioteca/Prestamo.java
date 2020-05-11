/*
- solicitante: String
- cantidadDias: int
- devuelto: boolean
----------------------
+ constructor
+ get / set
+ toString()
 */
package ejbiblioteca;

/**
 *
 * @author MarioAriel
 */
public class Prestamo {
     private String nombreSolicitante;
    private int cantDias;
    private int devuelto;

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public Prestamo() {
    }

    public Prestamo(String nombreSolicitante, int cantDias, int devuelto) {
        this.nombreSolicitante = nombreSolicitante;
        this.cantDias = cantDias;
        this.devuelto = devuelto;
    }
    
    public String libroDevuelto(int x){
        String dev = "Sin especificar.";
        if (x == 1) {
            dev = "Si.";
        }
        else if (x == 2)
            dev = "No.";
        return dev;
    }
    
    @Override
    public String toString(){
        return "Solicitante: " + nombreSolicitante + ", Dias de prestamo: " + cantDias + ", Devuelto: " + libroDevuelto(devuelto);
    }
    
}
