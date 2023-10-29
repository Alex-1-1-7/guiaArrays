/*
Crear un programa que lea por teclado un array de 10 números enteros y los
desplace una posición hacia
abajo: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así
sucesivamente. El último pasa a
ser el primero.
*/
package ejercicio09;

import java.util.Scanner;
public class Ejercicio09 {
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int [] numeros = new int[10];
    int i;
        System.out.println("Ingrese 10 numeros enteros ");
    for ( i =0; i<numeros.length;i++){
        System.out.println("Ingrese el numero "+(i+1));
        numeros [i] = entrada.nextInt();
        //1,2,3,4,5,6,7,8,9,10
    }
    int ultimoNumero = numeros[9];
     // ultimo = 10 
    for (i=8;i>=0;i--){
//indice i=8; (indice)8,7,6,5,4,3,2,1,0
//numeros ingresados: 9,8,7,6,5,4,3,2,1
    numeros [i+1]= numeros[i];
          //i desde indice 9,8,7,6,5,4,3,2,1,0
    //  numeros ingresados 1,9,8,7,6,5,4,3,2....
    }
    numeros[0] = ultimoNumero;
//      indice 0  = 9
//numero ingresado 1 pasa a ser 10 
        System.out.println("numeros desplazados");
        
        for (i=0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    
    }
}
