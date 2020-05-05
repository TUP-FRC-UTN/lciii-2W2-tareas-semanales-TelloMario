/*
Una veterinaria encargada del cuidado de mascotas
ha solicitado la realizacion de un software para
obtener resultados sobre sus clientes y sus
respectivas mascotas. (Suponer que cada cliente
posee una sola mascota).

Se sabe que cada cliente de esta veterinaria
tienen: un numero de cliente, un nombre, una
antiguedad (hace cuanto que son clientes de la 
veterinaria) y una mascota.

De la Mascota se dispone los siguientes datos:
nombre y edad.

el software requiere cargar un numero n de
clientes (este valor debera ser cargado por teclado)

almacenar la informacion de los clientes en un
arreglo.

se pide:

- mostrar cantidad de clientes
- mostrar promedio de edad de las mascotas
- informar cuantos clientes tienen una antiguedad
mayor o igual a 5 años.

 */
package ejerciciotarea2.pkg2.pkg2;

import java.util.Scanner;

/**
 *
 * @author Bangho
 */
public class EjercicioTarea222 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Veterinaria vet;
        
        System.out.println("ingrese la cantidad de Clientes: ");
        int cantcli = sc.nextInt();
        
        vet = new Veterinaria(cantcli);
        
        
        for (int i = 0; i < cantcli; i++) {
            System.out.println("Nuevo Cliente N° " + (i+1));
            System.out.println("ID del cliente: ");
            
            int numero = sc.nextInt();
            
            sc.nextLine();
            
            System.out.println("Nombre del cliente: ");
            
            String nombre = sc.nextLine();
            
            
            System.out.println("Antiguedad del cliente: ");
            
            int antiguedad = sc.nextInt();
            
            Cliente cli = new Cliente(numero, nombre, antiguedad);
             
            sc.nextLine();
            
            System.out.println("Mascota del cliente n° " + numero);
            
            System.out.println("Nombre de la mascota: ");
            
            String nombreMascota = sc.nextLine();
            
            System.out.println("Edad de la mascota: ");
            
            int edadMascota = sc.nextInt();
            
            Mascota masc = new Mascota(nombreMascota, edadMascota);
            
            cli.NuevaMascota(masc);
            
            
            vet.agregarCliente(cli);
        }
       
        
        System.out.println(vet.listaClientes());
        
        System.out.println("Promedio de edad de las mascotas: " + vet.promedioEdadMascotas());
        
        System.out.println("Clientes con antiguedad mayor a 5 años: " + vet.antiguedadMayor5());
        
    }
    
}
