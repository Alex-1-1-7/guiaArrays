/*
15. Dado un conjunto de nombres de Pokémon almacenados en un array y otro
conjunto de sus respectivas cantidades de poder almacenadas en otro array, se
solicita al usuario ingresar un nombre de Pokémon y una cantidad de poder. El
objetivo es buscar el nombre del Pokémon proporcionado por el usuario en el array
de nombres. Si se encuentra el nombre del Pokémon en el array, se actualizará la
cantidad de poder asociada a ese Pokémon con la cantidad proporcionada por el
usuario.
*/
package ejercicio15;

import java.util.Scanner;


public class Ejercicio15 {
    public static void main(String[] args ){
        Scanner entrada = new Scanner(System.in);
    String[] nombresPokemon = {"pikachu", "charizard",
    "bulbasaur", "squirtle", "jigglypuff"};
     int[] poderesPokemon = {100, 150, 80, 90, 120};
        String nombre;
        boolean siEsta=true;
        int  cantidadPoder,posicion=0;
        
        System.out.print("Ingrese el nombre de un pokemon para saber si esta "
                + "en la pokedex: ");
        nombre = entrada.nextLine();
        // pasar la primera letra a mayúscula por si acaso
        /*char primeraLetra = Character.toUpperCase(nombre.charAt(0));
        nombre = primeraLetra + nombre.substring(1);*/
        System.out.println("Ingrese la cantidad de poder de dicho pokemon.");
        cantidadPoder = entrada.nextInt();
        for(int i=0;i<nombresPokemon.length;i++){
        if (nombresPokemon[i].equals(nombre)){
            System.out.println("Si se encuentra el pokemon: "+(nombre));
            posicion = i;
            siEsta = false;
            break;
        }
        }
        if (siEsta){
            System.out.println("No se encuentra el pokemon: "+nombre);
        }
        //imprimir antes de modificar el nivel 
        System.out.println("Pokemones antes de actulizar la cantidad de poder \n");
        if (!siEsta){
        for (int i=0;i<poderesPokemon.length;i++){
            System.out.println("Nombre pokemon:  "+nombresPokemon[i]+"  cantidad de poder: "+poderesPokemon[i]);
        }}
        if (!siEsta){
        poderesPokemon[posicion]=cantidadPoder;
        }
        System.out.println("");
        System.out.println("El pokemon: "+nombre+" tiene una  cantidad de poder actulizada de: "+cantidadPoder);
        System.out.println("Lista de pokemones con el pokemon  solicitado actualizado. ");
        for (int i=0;i<poderesPokemon.length;i++){
          System.out.println("Nombre pokemon:  "+nombresPokemon[i]+"  cantidad de poder: "+poderesPokemon[i]);
        }
    
    }

}
