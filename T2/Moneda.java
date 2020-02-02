/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2;

/**
 *
 * @author EDDY
 */
public class Moneda {

    String Nombre;
    double Valor;
    
    public Moneda() {
    }

    public Moneda(String Nombre, double Cantidad){
        this.Nombre = Nombre;
        this.Valor = Cantidad;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getCantidad() {
        return Valor;
    }

    public void setCantidad(double Cantidad) {
        this.Valor = Cantidad;
    }

    
}
