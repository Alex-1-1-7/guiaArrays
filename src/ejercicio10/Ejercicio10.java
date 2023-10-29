/*
Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
Éstos los guardaremos en un array de tamaño 10. Leer un número N, e insertarlo en
el lugar adecuado para que el array continúe ordenado.
*/
package ejercicio10;

import java.util.Scanner;
public class Ejercicio10 {
    
     public static void main (String[] args) {
     Scanner entrada = new Scanner(System.in);
     int  [] numeros = new int [10];
     int numero;
         System.out.println("Ingresar 5 numeros enteros de forma creciente");
    for (int i=0;i<5;i++){
        System.out.println("Ingrese el numero: "+(i+1));
        numeros[i] = entrada.nextInt();
    } 
         System.out.println("Ingrese  un numero entero: "); 
         numero = entrada.nextInt();
         
         
         // lugar adecuado para insertar el número
        int indice = 0;
        while (indice < 5 && numeros[indice] < numero) {
            indice++;
        }

        // Desplazar los elementos hacia la derecha para hacer espacio al numero
        for (int i = 4; i >= indice; i--) {
            numeros[i + 1] = numeros[i];
        }

        // Insertar el número en el lugar adecuado
        numeros[indice] = numero;

        // ya con el numero agregado
        System.out.println("Despues de insertar el número:");
        for (int i = 0; i < 6; i++) {
            System.out.println(numeros[i]);
        }
    }
    
}
