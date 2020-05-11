/*
Una biblioteca necesita un software que le permita registrar los datos de los libros que posee y de sus préstamos. De cada libro conoce su título, precio de reposición (para el caso de extravíos o daños) y estado (1: disponible, 2: prestado, 3: extraviado).
Por otro lado, cada vez que un libro es prestado se registra el nombre del solicitante, la cantidad de días del préstamo y si fue devuelto o no. El conjunto de préstamos debe ser almacenado como un atributo del libro en cuestión.
Se necesita entonces un programa en Java que solicite por teclado los datos de los libros y sus préstamos y luego de finalizada la carga informe:
 Cantidad de libros en cada estado (tres totales)
 Sumatoria del precio de reposición de todos los libros extraviados
 Nombre de todos los solicitantes de un libro en particular identificado por su título
 Promedio de veces que fueron prestados los libros de la biblioteca. Es decir, se debe responder a la consulta de cuántas veces es prestado en promedio cada libro
 */
package ejbiblioteca;

import java.util.Scanner;

/**
 *
 * @author MarioAriel
 */
public class EjBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Biblioteca bibl;

        //-------- Pedir cantidad de libros -----------
        System.out.print("Ingrese la cantidad de libros: ");
        int cantLib = scan.nextInt();
        bibl = new Biblioteca(cantLib);

        //--------- Ingresar Libros ------------
        for (int i = 0; i < cantLib; i++) {
            System.out.println("\nIngrese los datos del " + (i + 1) + "° Libro:");
            System.out.print("Titulo: ");
            String nombreLibro = scan.next();
            //scan.next();// para que deje ingresar titulo con 2 palabras
            System.out.print("Estado: \n 1)Disponible.\n 2)Prestado.\n 3)Extraviado.\nOpcion: ");
            int estadoLibro = scan.nextInt();
            System.out.print("Precio Reposicion: ");
            float precioLibro = scan.nextFloat();
            System.out.print("Cantidad de solicitantes: ");
            int solicitantesLibro = scan.nextInt();

            //---- crear libro
            Libro lib = new Libro(nombreLibro, precioLibro, (estadoLibro - 1), solicitantesLibro);

            bibl.agregarLibro(lib);

            //------- Cargar Solicitantes
            for (int j = 0; j < solicitantesLibro; j++) {
                System.out.println("\nIngrese los datos del " + (j + 1) + "° solicitante:");
                System.out.print("Nombre: ");
                String nombreSolicitante = scan.next();
                System.out.print("Cantidad de dias prestado: ");
                int diasSolicitante = scan.nextInt();
                System.out.print("Libro devuelto (1)Si - (2)No: ");
                int devueltoSolicitante = scan.nextInt();

                //----agrego prestamo
                Prestamo p = new Prestamo(nombreSolicitante, diasSolicitante, devueltoSolicitante);
                lib.agregarPrestamo(p);
            }
            System.out.println("--------- DATOS ------------");
            //Punto A
            System.out.println("Cantidad de libros en cada estado:");
            int[] estado = bibl.cantidadLibrosPorEstado();
            System.out.println("Disponible: " + estado[0]);
            System.out.println("Prestado: " + estado[1]);
            System.out.println("Extraviado: " + estado[2]);
            //Punto B
            System.out.println("Total del precio de reposicion: " + bibl.sumaPrecioExtraviados());
            //Punto C
            System.out.print("Ingrese el titulo del libro paramostrar todos sus prestamos: ");
            String tituLibro = scan.next();
            System.out.print(bibl.listadoSolicitantes(tituLibro));
            System.out.println("Promedio General de prestamos: " + bibl.promedioPrestamos());

        }

    }

}
