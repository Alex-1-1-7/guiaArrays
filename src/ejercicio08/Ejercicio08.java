/*
8. Diseñar una aplicación que declare un array de10 elementos enteros. Leer mediante
el teclado 8 números.
Después se debe pedir un número y una posición, insertarlo en la posición indicada,
desplazando los que estén
detrás.
*/
package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero,posicion;
        int [] numeros = new int[10];
        
        System.out.println("Ingrese 8 numeros enteros: ");
       
         //for (int i=2; i<numeros.length;i++){
        for (int i=0; i<8;i++){
        System.out.println("Ingrese el numero: "+(i+1));
        numeros[i] = entrada.nextInt();
      
        }
            System.out.println("Ingrese un  numero");
            numero = entrada.nextInt();
            System.out.println("Ingrese la posision donde desea ingresarlo\n"
                    + "(Del 1 al 10)");
            posicion = entrada.nextInt();
            //suponiendo que se ingresa  5
            
            // Desplazar los elementos hacia atrás
        for (int i = numeros.length - 1; i > posicion - 1; i--) {
                   //              10-1;  i>        5 - 1  
                               //    9                4 
            numeros[i] = numeros[i - 1];
            
        }
        
        // numero en la posición indicada
        // posisicion - 1 se debe a que length  nos devuelve  un indicee de  mas 
        // por decrilo asi, ya que en un array se  empieza desde cero 
        // por eso a posesion se le debe restar 1, ya que de lo contrario es posible
        // que se intente ingresar un numero en una posicion que no existe
        // el indice 10 no  existe para este caso, ya que el array empieza de cero a 
        // 09 
        numeros[posicion - 1] = numero;
            
        
        for (int i=0; i>numeros.length;i++){
        
            System.out.println(numeros[i]);
        }
}
    
}
