/*
Una empresa que fabrica caños de diferentes tipos, materiales y medidas está
desarrollando un sistema para automatizar la planificación y control de su circuito
productivo. Suponga que usted es parte del equipo de desarrollo y le asignan la
siguiente tarea:

 Desarrolle la clase Material de manera que contenga en su interior los atributos: descripción (String) código(int) valorUnitario (float).
 Desarrolle la clase Producto de manera que contenga en su interior los atributos descripción (String) y Materiales (Material[]).
 Desarrolle en la clase Producto un constructor que reciba por parámetro una cantidad de elementos y dimensione el vector de materiales.
 Desarrolle en la clase Producto un método que permita agregar un Material recibido por parámetro al vector.
 Desarrolle en la clase Producto un método que retorne el costo total. Dicho valor se calcula sumando todos los valores unitarios de los Materiales que componen el Producto.
 Desarrolle en la clase Producto un método que reciba por parámetro un código de material y retorne true si dicho material forma parte del Producto.
 Desarrolle en la clase producto un método que retorne un vector con todos los materiales que tengan un valor unitario menor a un parámetro.
 Desarrolle en la clase producto un método que retorne un vector donde cada casillero contenga la cantidad de materiales por precio, siguiendo las siguiente regla: Si 0 < precio ≤ 10 contarlo en el primer casillero. Si 10 < precio ≤ 20 contarlo en el segundo casillero. Si 20 < precio ≤ 30 contarlo en el tercer casillero. Si precio > 30 contarlo en el cuarto casillero.
 Desarrolle un programa principal que permita ingresar los datos de un producto, cree un objeto de esa clase y luego posibilite mediante un menú llamar a los métodos de los puntos 4 a 8 todas las veces y en el orden que el usuario quiera.
 */
package empresacanios;

import java.util.Scanner;

/**
 *
 * @author MarioAriel
 */
public class EmpresaCanios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Producto prod;
        //----------Agregar Nuevo Producto
        System.out.print("Ingrese la descripcion del producto: ");
        String desc = scan.next();
        System.out.print("Ingrese la cantidad de materiales: ");
        int cantMat = scan.nextInt();
        
        prod = new Producto(desc, cantMat);
        //-------------Agregar Productos----------
        for (int i = 0; i < cantMat; i++) {
            System.out.println((i + 1) + "° Material");
            //-------Datos del Material
            System.out.print("Descipcion: ");
            String descMat = scan.next();
            System.out.print("Código: ");
            int cod = scan.nextInt();
            System.out.print("Valor Unitario: ");
            float vUnitario = scan.nextFloat();
            //------creo el material y agrego
            Material mate = new Material(descMat, cod, vUnitario);
            prod.agregarMaterial(mate);
        }
        
        // Punto 5
        System.out.println("Costo total del producto: " + prod.costoTotal());
        // Punto 6
        System.out.print("Ingrese el codigo del material para verificar si forma parte del producto: ");
        int codigo =  scan.nextInt();
        if (prod.materialParteProducto(codigo)) {
            System.out.println("El Material pertenece al producto.");
        }
        else{
            System.out.println("El material no pertenece al producto.");
        }
        // Punto 7 -------- este creo que es asi
        System.out.print("Mostrar materiales menor a:");
        float precioMenor = scan.nextFloat();
        Material[] materialMenor = prod.materialesMenorA(precioMenor);// como el metodo devuelve un Vector del Tipo Material, debo crear un vector del mismo tipo para guardarlo y usarlo en el main
        System.out.println("MATERIALES:");
        for (Material m : materialMenor) {// uso el vector recien creado
            System.out.print("- " + m.toString()+ "\n");
        }
        // Punto 8
        int[] matePorPrecio = prod.materialesPorPrecio();
        System.out.println("Materiales con precios:");
        System.out.println("Mayor 0 y menor a 10: " + matePorPrecio[0]);
        System.out.println("Mayor 10 y menor a 20: " + matePorPrecio[1]);
        System.out.println("Mayor 20 y menor a 30: " + matePorPrecio[2]);
        System.out.println("Mayor 30: " + matePorPrecio[3]);
    }
    
}
