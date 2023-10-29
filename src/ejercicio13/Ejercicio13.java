/*
Pedir un numero entero (index) validar que este en el rango del array proporcionado
y mostrar el nombre del pokemon que se encuentra en ese indice.
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String[] nombresPokemonB = {"Venusaur","Blastoise","Dragonite","Gyarados",
        "Alakazam","Arcanine","Lapras","Golem","Gyarados","Rhydon"};
    int numero;
        System.out.println("Ingrese un numero (indice) para ver cual es el pokemon en ese indice");
        numero = entrada.nextInt();
        numero = numero-1;
    while (numero<0||numero>=nombresPokemonB.length){
        System.out.println("Ingrese un numero valido para el array.\n"
                + "El array contiene: "+nombresPokemonB.length+" elementos");
        numero = entrada.nextInt();
        numero = numero-1;
        }
    
    
    /*for (int i =0;i<nombresPokemonB.length;i++){
    if(numero==i){
        System.out.println("El pokemon en la posicion: "+(numero+1)+" es: "+nombresPokemonB[(i+1)]);
        break;
    }
    }*/
    // mas facil asi:
     System.out.println("El pokemon en la posición " + (numero + 1) + " es: " + nombresPokemonB[numero]);
    }
}
