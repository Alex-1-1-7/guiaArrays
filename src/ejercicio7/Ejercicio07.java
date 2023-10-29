/*
7. Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si
los números están
ordenados de forma creciente, decreciente, o si están desordenados.
*/
package ejercicio7;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main (String[] args) {
      Scanner entrada = new Scanner(System.in);  
      int [] numeros = new int[10];
      
      System.out.println("Ingrese 10 numeros enteros ");
      for (int i =0; i<numeros.length;i++){
          System.out.print("Ingrese el numero "+(i+1)+": ");
          numeros[i] = entrada.nextInt();
          //suponiendo que hemos ingresado 1,2,3,4,5,6,7,8,9,10
          }
        
      boolean creciente = true;
      boolean decreciente = true;
      
      for (int i =0; i<numeros.length-1;i++){
          if (numeros[i]>numeros[i+1]){
              // 1      >    2
              // como 1 no es mayor que 2, entonces este if  queda como 
              //verdadero y es el que se imprimira
          creciente = false;
          }
          else if(numeros[i]<numeros[i+1]){
              //        1  < 2 
              // en este caso 1 si es menor que 2,  por lo tanto  
          decreciente = false; 
                        // este if que estaba verdadero pasa a ser falso
          }
      } 
      if (creciente){
      System.out.println("Los  numeros fueron ingresados de forma creciente ");
      } else if (decreciente){
      System.out.println("Los numeros fueron ingresador de forma decreciente");
      }
      else {
        System.out.println("Los numeros fueron ingresados de forma desordenada");
      }
      
     
 }    
}
