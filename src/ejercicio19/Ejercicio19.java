/*
19. Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir si se
obtiene la
misma tabla al cambiar las filas por columnas.
*/
package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {
     public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        int[][] matriz = new int[4][4];
        boolean esSime = true;
        System.out.println("Rellene la  matriz 4x4");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Matriz fila ["+(i+1)+"] columna ["+(j+1)+"] :");
                matriz [j] [i] = entrada.nextInt();
            }
        }
        int i=0,j=0;
        while (i<matriz.length){
            while (j<matriz.length){
                if (matriz[i][j]!=matriz[j][i]){
                  esSime = false;
                }
                j++;
            }
            i++;
        }
        if (esSime){
            System.out.println("La matriz es simetrica");
        } else if (!esSime){
            System.out.println("NO es simetrica la matriz");
        }
         
     }
    
}
