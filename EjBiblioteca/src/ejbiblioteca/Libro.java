/*
- titulo: String
- precio: int
- estado: int
- prestamos: Prestamo[]
----------------------------
+ constructor( cantidadPrestamos: int )
+ agregarPrestamo(nuevo: Prestamo)
+ listadoSolicitantes(): String
+ cantidadPrestamos(): int
 */
package ejbiblioteca;

/**
 *
 * @author MarioAriel
 */
public class Libro {
     private String titulo;
    private float precioReposicion;
    private int estado;//0 Disponible - 1 Prestado - 2 Extraviado
    private Prestamo[] solicitante;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecioReposicion() {
        return precioReposicion;
    }

    public void setPrecioReposicion(float precioReposicion) {
        this.precioReposicion = precioReposicion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public Libro() {
    }

    public Libro(String titulo, float precioReposicion, int estado, int CantMaxSolicitante) {
        this.titulo = titulo;
        this.precioReposicion = precioReposicion;
        this.estado = estado;
        solicitante =  new Prestamo[CantMaxSolicitante];
    }
    
    //</editor-fold>
    
    public void agregarPrestamo(Prestamo nuevo){
        for (int i = 0; i < solicitante.length; i++) {
            if (solicitante[i] == null) {
                solicitante[i] = nuevo;
                return;
            }
        }
    }
    
    public String listadoSolicitantes(){
        StringBuilder sb = new StringBuilder();
        for (Prestamo prest : solicitante) {
            if (prest != null) {
                sb.append(prest.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    
    public int cantPrestamos(){
        int c = 0;
        for (Prestamo p : solicitante) {
            if (p != null) {
                c++;
            }
        }
        return c;
    }
}
