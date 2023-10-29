/*
22. Crear una matriz “marco” de tamaño 8x6: todos sus elementos deben ser 0 salvo
los de los bordes que
deben ser 1. Mostrarla.
*/
package ejercicio22;

public class Ejercicio22 {
    public static void main (String [] args){
                int[][] matriz = new int[8][6];
        
        // matriz con 0
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
        
        // los bordes con 1
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = 1; // primer columna
            matriz[i][matriz[i].length - 1] = 1; // ultima columna
        }
        for (int j = 0; j < matriz[0].length; j++) {
            matriz[0][j] = 1; // primera fila
            matriz[matriz.length - 1][j] = 1; // ultima fila
        }
        
        // imprimir
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    
    
    }
    
}
