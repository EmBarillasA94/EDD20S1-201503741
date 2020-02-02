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
public class Duenio {

    Moneda moneda;
    String nombre;
    int Cantidad;
    
    public Duenio() {
    }
    
    public Duenio(String nombre, Moneda moneda, int Cantidad){
        this.nombre = nombre;
        this.moneda = moneda;
        this.Cantidad = Cantidad;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
}
