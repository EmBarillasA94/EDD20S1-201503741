/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2;

import java.util.ArrayList;

/**
 *
 * @author EDDY
 */
public class Lista {
    ArrayList<Duenio> Lista1 = new ArrayList<Duenio>();

    public Lista() {
    }
    
    public void Agregar(Duenio nuevo_duenio){
        Lista1.add(nuevo_duenio);
    }
    
    public void Tranferencia(Duenio _duenio, int Cantidad, Moneda _moneda){
        //bucamos al dueño
        int index =0;
        for(Duenio D : Lista1){
            if(!_duenio.getNombre().equalsIgnoreCase(D.getNombre())){
                index++;
            }else {
                break;
            }
        }
        //tranferir las monedas
        Duenio Chang_D = Lista1.get(index);
        Chang_D.setCantidad(Cantidad);
        Chang_D.setMoneda(_moneda);
        Lista1.set(index, Chang_D);
    }
    
    public void TranferenciaFrom(Duenio Duenio1, Duenio Duenio2, int Cantidad){
        //bucamos al dueño 1 quien transfiere monedas al otro dueño
        int index =0;
        for(Duenio D : Lista1){
            if(!Duenio1.getNombre().equalsIgnoreCase(D.getNombre())){
                index++;
            }else {
                break;
            }
        }
        //tranferencia 
        Duenio chang_D = Lista1.get(index);
        chang_D.setCantidad(chang_D.getCantidad()-Cantidad);//restamos las monedas
        
        //buscamos al dueño 2 quien recibe las monedas
        int index2 =0;
        for(Duenio D : Lista1){
            if(!Duenio2.getNombre().equalsIgnoreCase(D.getNombre())){
                index++;
            }else {
                break;
            }
        }
        //tranferencia 
        Duenio chang_D2 = Lista1.get(index);
        chang_D2.setCantidad(chang_D2.getCantidad()+Cantidad);//restamos las monedas
    }
}
