/*
- libros: Libro[]
------------------------------------------
+ constructor( cantidadLibros: int )
+ agregarLibro(l: Libro)
+ cantidadLibros(estado: int): int
+ cantidadLibrosPorEstado(): int[]
+ listadoSolicitantes(titulo: String): String
+ promedioPrestamos(): float
+ sumaPrecioExtraviados(): float
*/
package ejbiblioteca;

/**
 *
 * @author MarioAriel
 */
public class Biblioteca {
      Libro[] lib;

    public Biblioteca() {
    }

    public Biblioteca(int cantLib) {
        lib = new Libro[cantLib];
    }
    
    public void agregarLibro(Libro nuevoLib){
        for (int i = 0; i < lib.length; i++) {
            if (lib[i] == null) {
                lib[i] = nuevoLib;
                return;
            } 
        }
    }
    public int cantidadLibros(int estado){
        int c = 0;
        for (Libro li : lib) {
            if (li != null) {
                c++;
            }
        }
        return c;
    }
    
    public int[] cantidadLibrosPorEstado(){
        int[] i = {0, 0, 0};
        for (Libro l : lib) {
            if (l != null) {
                i[l.getEstado()]++;
            }
        }
        return i;
    }
    
    public String listadoSolicitantes(String titulo){
        boolean existe = false;
        String listado= "No hay solicitantes.\n";// este no se imprime nuna....
        for (Libro li : lib) {
            if (li != null && li.getTitulo().compareTo(titulo) == 0) {
                listado = li.listadoSolicitantes();
                existe = true;
                if (listado.compareTo("") == 0) {
                    listado = "No hay solicitantes.\n";
                }
            }
        }
        if (!existe) {// por si pone un titulo que no existe
            listado = "El libro no existe.\n";
        }
        return listado;
    }
    
    public float promedioPrestamos(){
        int c = 0;
        float ac = 0f,promedio = 0;
        for (Libro li : lib) {
            if (li != null) {
                c++;
                ac += li.cantPrestamos();
            }
        }
        if (c != 0) {// en el caso de que no haya ningun libro
            promedio = ac / c;
        }
        return promedio;
    }
    
     public float sumaPrecioExtraviados(){
         float ac = 0f;
         for (Libro li : lib) {
             if (li != null && li.getEstado() == 3) {// el 3 es "Estado Extraviado"
                 ac += li.getPrecioReposicion();
             }
         }
         return ac;
     }
    
}
