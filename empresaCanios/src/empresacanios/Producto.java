/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresacanios;

/**
 *
 * @author MarioAriel
 */
public class Producto {
    
    private String descripcion;
    private Material[] materiales;
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
    

    public Producto() {
    }

    public Producto(String descripcion, int maxMateriales) {
        this.descripcion = descripcion;
        this.materiales = new Material[maxMateriales];
    }
   
    // Punto 4
    public void agregarMaterial(Material mat){
        for (int i = 0; i < materiales.length; i++) {//Se usa For xq hay que modificar el array
            if (materiales[i] == null) {//se busca espacio vacio pa agregar un nuevo material
                materiales[i] =  mat;
                return;
            }
        }
    }
    // Punto 5
    public float costoTotal(){
        float ac = 0;
        for (Material mat : materiales) {// Se usa Foreach xq no necesitamos modificar el vector
            if (mat != null) {// solos los lugares ocupados
                ac += mat.getValorUnitario();
            }
        }
        return ac;
    }
    // Punto 6
    public boolean materialParteProducto( int codMat){
        for (Material mat : materiales) {
            if (mat != null && mat.getCodigo() == codMat) {
                return true;
            }
        }
        return false;
    }
    //Punto 7
    public Material[] materialesMenorA(float precio){
        int c = 0;
        for (Material mat : materiales) {// Primero veo cuantos materiales hay con un precio menor al parametro
            if (mat != null && mat.getValorUnitario() < precio) {
                c++;//tamaño del vector
            }
        }
        Material[] mate = new Material[c];
        int n = 0;// variable que usamos como indice para guardar los materiales en el nuevo vector
        for (Material materiale : materiales) {
            if (materiale != null && materiale.getValorUnitario() < precio) {
                mate[n++] = materiale;// cada vez que guardo un material aumento el indice para no "pisarlo"
            }
        }
        return mate;
    }
    // Punto 8
    public int[] materialesPorPrecio(){
        int[] precios = {0, 0, 0, 0};
        for (Material mat : materiales) {
            if (mat.getValorUnitario() > 0 && mat.getValorUnitario() <= 10) {
                precios[0]++;
            }
            else if (mat.getValorUnitario() > 10 && mat.getValorUnitario() <= 20) {
                precios[1]++;
            }
            else if (mat.getValorUnitario() > 20 && mat.getValorUnitario() <= 30) {
                precios[2]++;
            }
            else if (mat.getValorUnitario() > 30) {
                precios[3]++;
            }
        }
        return precios;
    }
    
}
