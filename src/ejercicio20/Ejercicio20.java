/*
20. Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
*/
package ejercicio20;

import java.util.Scanner;


public class Ejercicio20 {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        int[][] matriz = new int[3][3];
        int[][] matriz1 = new int[3][3];
        int[][] suma = new int[3][3];
        System.out.println("Rellene la  matriz 1 (3x3)");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Matriz fila ["+(i+1)+"] columna ["+(j+1)+"] :");
                matriz [j] [i] = entrada.nextInt();
            }
        }
        System.out.println("Rellene la  matriz 2 (3x3)");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("Matriz fila ["+(i+1)+"] columna ["+(j+1)+"] :");
                matriz1 [j] [i] = entrada.nextInt();
            }
        }
        // suma las matrices
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                suma[i][j] = matriz[i][j] + matriz1[i][j];
            }
        }
        
        
        System.out.println("La suma de las matrices es:");
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
        // no sabia si lo queria asi:
        int totalsuma=0;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                totalsuma += matriz[i][j] + matriz1[i][j];
            }
        }
        
        
        System.out.println("La suma total es: " + totalsuma);
        
    }
}
