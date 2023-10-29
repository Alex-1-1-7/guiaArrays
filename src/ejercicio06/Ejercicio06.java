/*
Dado los siguientes Arrays mezclar los nombres de Pokémon de los arrays
nombresPokemonA y nombresPokemonB en un tercer array
nombresPokemonC de la forma el 1o de A, el 1o de B, el 2o de A, el 2o de B, etc.),
 */
package ejercicio06;


public class Ejercicio06 {
    
     public static void main (String[] args) {
     String[] nombresPokemonA = {"Pikachu","Charizard","Bulbasaur","Squirtle",
        "Jigglypuff","Eevee","Mewtwo","Snorlax","Gengar","Machamp"};
     String[] nombresPokemonB = {"Venusaur","Blastoise","Dragonite","Gyarados","Alakazam", 
         "Arcanine","Lapras","Golem","Gyarados","Rhydon"};
     String[] nombresPokemonC = new  String [20];
     
     // se me olvido que era con un tercer array 
     // pero funciona de la misma manera sin necesidad del tercer array 
     /*for (int i = 0; i<nombresPokemonA.length; i++){
         System.out.println("Nombre de pokemones "+(i+1)+" combinado: "+nombresPokemonA[i]+" "+nombresPokemonB[i]);
     }*/
     int j=0;
     for (int i=0;i<nombresPokemonA.length;i++){
     nombresPokemonC[j] = nombresPokemonA[i];
     j++;
     nombresPokemonC[j] = nombresPokemonB[i];
     j++;
     }
     
    System.out.println("El tercer arreglo queda asi:");
         
    for(int i = 0; i<20;i++){
    System.out.print(nombresPokemonC[i]+" ");
    }
         System.out.println("\n");
         
         
    System.out.println("Otra forma de conbinarlos");
    for (int i = 0; i<10; i++){
     nombresPokemonC [i] = nombresPokemonA[i] +  " "+ nombresPokemonB[i];
     System.out.println("Nombre de pokemones "+(i+1)+" combinado: "+nombresPokemonC[i]);
     }
}
}
