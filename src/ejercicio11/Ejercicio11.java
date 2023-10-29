/*
Leer por teclado un array de 10 elementos numéricos enteros y una posición (entre
0 y 9). Eliminar el
elemento situado en la posición dada sin dejar huecos.
*/
package ejercicio11;

import java.util.Scanner;
public class Ejercicio11 {
    
    public static void main (String[] args) {
    Scanner entrada = new  Scanner(System.in);
    int [] numeros = new int[10]; 
    int posicion;
    
    System.out.println("Ingrese 10 numeros enteros: ");
    for (int i=0;i<numeros.length;i++){
    System.out.println("Ingrese el numero. "+(i+1)+": ");
     numeros[i] = entrada.nextInt();
    }
    
    System.out.println("Ingrese la posicion del elemmento que desea eliminar (entre 0-9)\n"
            + "si desea eliminar la posicion 4 por ejemplo, ingresar 3 ");
    posicion = entrada.nextInt();
    // 4
    
    // Eliminar el elemento en la posición dada
    for (int i = posicion; i < 9; i++) {
          // i = 4           < 9 
    numeros[i] = numeros[i + 1];
    //numeros [posicion i =4]  = numeros[i+1=5]
    
    }
    numeros[9] = 0; // le damos valor de 0 a la ultima posicion para eliminar el elemento
            
    // imprimir el vector actualizado
    System.out.println("Después de eliminar el elemento:");
    for (int i = 0; i < 10; i++) {
    System.out.println(numeros[i]);
    }
}
}
