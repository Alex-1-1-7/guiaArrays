/*
17. Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.
*/
package ejercicio17;

import java.util.Scanner;


public class Ejercicio17 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        
        System.out.println("Rellene  la matriz de 3x3.");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("Matriz fila ["+(i+1)+"] columna ["+(j+1)+"] :");
                matriz [j] [i] = entrada.nextInt();
            }
        }
        System.out.println("la matriz original es: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz [j][i]+" ");
            }
            System.out.println("");
        }
        // transponiendo la matriz
        int aux;
        for (int i=0;i<3; i++) {
            for (int j=0;j<i; j++){
            aux = matriz [i][j];
            matriz [i] [j] = matriz [j][i];
            matriz [j] [i] = aux;
            }
        }
        
        System.out.println("la matriz transpuesta es: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz [j][i]+" ");
            }
            System.out.println("");
        }
    }
    
}
