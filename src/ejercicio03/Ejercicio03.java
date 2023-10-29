/*Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el
último, el segundo, el
penúltimo, el tercero, etc.*/

package ejercicio03;

import java.util.Scanner;


public class Ejercicio03 {
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    int i;
    int [] numeros = new  int[10];
        System.out.println("Ingrese 10 numeros enteros ");
    for ( i =0;  i< numeros.length;i++){
        System.out.print("Ingrese el numero entero "+ (i + 1)+": ");
    numeros [i] = entrada.nextInt();
    
    }
    // en orden inverso al ingresado
    /*System.out.println("Los números en orden inverso al ingresado:");
    for (i = numeros.length - 1; i >= 0; i--) {
    System.out.println(numeros[i]);
        }*/
    // me confundi al leer el ejercicio pero ya habia hecho lo anterior.
   
        System.out.println("El primero es: "+numeros[0]);
        System.out.println("El ultimo es: "+numeros[9]);
        System.out.println("El segundo es: "+numeros[1]);
        System.out.println("El penultimo es: "+numeros[8]);
        System.out.println("El tercero es: "+numeros[2]);
        System.out.println("El antepenultimo es: "+numeros[7]);
        System.out.println("El cuarto es: "+numeros[3]);
        System.out.println("El preantepenúltimo es: "+numeros[6]);
        System.out.println("El quinto es: "+numeros[4]);
        System.out.println("El antepreantepenúltimo es: "+numeros[5]);   
        
       
    
    }
}
