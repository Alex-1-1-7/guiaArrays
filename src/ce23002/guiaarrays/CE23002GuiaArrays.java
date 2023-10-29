
package ce23002.guiaarrays;

import java.util.Scanner;

public class CE23002GuiaArrays {


    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        
    //declaracion del array
    int [] numeros = new int [5];   
    
    // le introducimos a cada espacio del array un  numero
    for (int i = 0; i <5; i++){
        System.out.println("Ingrese un numero: "+i);
        numeros [i] = entrada.nextInt();
        
        
    }
        //para leer los numeros ingresados 
        System.out.println("Los numeros ingresados son:");   
        for (int i = 0; i <5; i++){
            System.out.println(numeros [i]);
        }
        
    }
    
}
