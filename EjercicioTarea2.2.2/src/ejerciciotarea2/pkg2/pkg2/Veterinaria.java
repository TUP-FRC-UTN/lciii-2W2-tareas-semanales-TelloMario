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
public class Veterinaria {

    Cliente[] cliente;

    public Veterinaria() {
    }

    public Veterinaria(int cantClientes) {
        this.cliente = new Cliente[cantClientes];
    }

    public void agregarCliente(Cliente nuevoCliente) {

        for (int i = 0; i < cliente.length; i++) {
            if (cliente[i] == null) {
                cliente[i] = nuevoCliente;
                return;
            }

        }

    }

    public String listaClientes() {

        StringBuilder lista = new StringBuilder();
        for (Cliente cliente1 : cliente) {

            if (cliente1 != null) {

                lista.append(cliente1.toString());
                lista.append("\n");
            }

        }

        return lista.toString();

    }

    public float promedioEdadMascotas() {

        float acu = 0;
        int c = 0;
        for (Cliente cliente1 : cliente) {
            if (cliente1 != null) {
                acu += cliente1.mascota.edadMascota;
                c++;
            }
        }

        return acu / c;
    }

    public int antiguedadMayor5() {

        int c = 0;

        for (Cliente cliente1 : cliente) {
            if (cliente1.antiguedad > 5) {

                c++;
            }
        }
        return c;
    }

}
