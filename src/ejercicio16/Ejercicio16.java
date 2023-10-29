/*
Encuentra y muestra el nombre del Pokémon con la mayor cantidad de poder
*/
package ejercicio16;


public class Ejercicio16 {
    public static void  main(String [] args ){
    String[] nombresPokemon = {"Pikachu", "Charizard", "Bulbasaur",
    "Squirtle"};
    int[] poderesPokemon = {100, 150, 80, 90};
    int mayor=0, posicion=0;
    
    for (int  i = 0; i< poderesPokemon.length;i++){
        if (poderesPokemon[i]>mayor){
        mayor = poderesPokemon[i];
        posicion = i;
        }
        }
        System.out.println("El pokemon con mayor poder es: "+nombresPokemon[posicion]);
    }
}



