/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_edd.tarea1_201503741;

import java.util.Scanner;

/**
 *
 * @author EDDY
 */
public class C_EDDTarea1_201503741 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño de la matriz");
        Scanner numero = new Scanner(System.in);
        int tamanio = numero.nextInt();
        Crear(tamanio);
    }

    private static void Crear(int tamanio) {
        String[][] matriz1 = new String[tamanio][tamanio];

        //rellenar la matriz
        for (int i = 0; i <= tamanio - 1; i++) {
            for (int j = 0; j <= tamanio - 1; j++) {
                if (i == 0 || i == tamanio - 1) {
                    matriz1[i][j] = "1";
                } else if (i <= tamanio - 1 && j == 0 || i <= tamanio && j == tamanio - 1) {
                    matriz1[i][j] = "1";
                }
            }
        }

        //imprimir
        for (int i = 0; i <= tamanio - 1; i++) {
            for (int j = 0; j <= tamanio - 1; j++) {
                System.out.print("|" + matriz1[i][j] + "|");
            }
            System.out.println("");
        }

    }

}
