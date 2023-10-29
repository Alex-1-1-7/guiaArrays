/*
Crea un programa que encuentre el valor máximo y mínimo en un array de números
enteros. se debe llenar el array con números ingresados por el usuario.
 */
package ejercicio05;

import java.util.Scanner;
public class Ejercicio05 {
 
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    int [] numeros = new int[6];
    
    System.out.println("Ingrese 6 numeros enteros");
    for (int i = 0; i< numeros.length; i++){
        System.out.println("Ingrese el numero: "+(i+1));
        //suponiendo que ingresamos : 1,2,3,4,5,6
        numeros [i] = entrada.nextInt(); 
    }
    int maximo = numeros[0];
    // maximo vale 1
    //para ver el valor del primer numero ingresado y asi aguardarlo en maximo
    // maximo sera utilizado para ir comparando con los demas numeros ingresados
    //cuando encuentre un numero mayor que maximo, lo guarda y sera el nuevo maximo
    int minimo = numeros[0];
    
    for (int i = 1; i < numeros.length; i++) {
        // empezamos i=1  porque ya hemos tomado el elemento 0 del array para guardarlo 
        //en maximo
        if (numeros[i] > maximo) {
            //numeros [1] > maximo [0]
            // i[1]=2  >  i[0]=1
                maximo = numeros[i];
                // si se llega cumplir que numeros [i] es mayor que
                // maximo, entonces guarda ese numero en maximo 
                // para este caso ahora maximo vale 2
            }
        if (numeros[i] < minimo) {
            //numeros[1] < minimo[0]
            // i[1]=2    < i[0]=1
            //numeros no es menor que minimo, entonces minimo no cambia su valor  
                minimo = numeros[i];
            }
        }
        
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
    }
}
