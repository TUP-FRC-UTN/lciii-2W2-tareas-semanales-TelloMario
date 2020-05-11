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
public class Material {
    
       private String descripcion;
    private int codigo;
    private float valorUnitario;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Material() {
    }

    public Material(String descripcion, int codigo, float valorUnitario) {
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
    }
    
    @Override
    public String toString(){
        return "Producto [ Descripcion: " + descripcion + ", Código: " + codigo + ", Valor Unitario: " + valorUnitario + " ]";
    }
}
