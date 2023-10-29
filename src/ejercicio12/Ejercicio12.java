/*
12. Pedir al usuario el nombre de un pokemon, buscarlo en el siguiente array si se
encuentra mostrar el indice en el que se encontro sino mostrar un mensaje
adecuado notificandolo
*/
package ejercicio12;

import java.util.Scanner;


public class Ejercicio12 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
    String[] nombresPokemonB = {"Venusaur","Blastoise","Dragonite","Gyarados","Alakazam",
        "Arcanine","Lapras","Golem","Gyarados","Rhydon"};
    String nombre;
    boolean siEsta=true;
        System.out.print("Ingrese el nombre de un pokemon para saber si esta "
                + "en la pokedex: ");
        nombre = entrada.nextLine();
        // pasar la primera letra a mayúscula por si acaso
        char primeraLetra = Character.toUpperCase(nombre.charAt(0));
        nombre = primeraLetra + nombre.substring(1);
        for(int i=0;i<nombresPokemonB.length;i++){
        if (nombresPokemonB[i].equals(nombre)){
            System.out.println("Si se encuentra el pokemon: "+(nombre)+"  y esta en la posicion: "+(i+1));
            siEsta = false;
            break;
        
        }
        }
        if (siEsta){
            System.out.println("No se encuentra el pokemon: "+nombre);
        }
    
    }
    
}
