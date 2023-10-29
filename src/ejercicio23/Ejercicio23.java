/*
23. "POKEDEX" Permite al usuario ingresar el nombre de un Pokémon y muestra sus
estadísticas completas si se encuentra.
*/
package ejercicio23;

import java.util.Scanner;


public class Ejercicio23 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String[][] estadisticasPokemon = {
        {"Pikachu", "90", "55", "40", "35"},
        {"Charizard", "100", "84", "78", "78"},
        {"Bulbasaur", "45", "49", "49", "45"},
        {"Squirtle", "43", "48", "65", "44"},
        {"Mewtwo", "130", "110", "90", "106"},
        {"Gengar", "110", "65", "60", "60"},
        {"Dragonite", "80", "134", "95", "91"},
        {"Snorlax", "30", "110", "65", "160"},
        {"Vaporeon", "65", "60", "95", "130"},
        {"Machamp", "55", "130", "80", "90"},
        {"Eevee", "55", "55", "50", "55"},
        {"Alakazam", "120", "50", "45", "55"},
        {"Lapras", "60", "85", "80", "130"},
        {"Gyarados", "81", "125", "79", "95"},
        {"Jigglypuff", "20", "45", "20", "115"}
            };
        
        
        System.out.print("Ingrese el nombre de un Pokémon: ");
        String nombrePokemon = entrada.nextLine();
        
        boolean encontrado = false;
        
        for (int i = 0; i < estadisticasPokemon.length; i++) {
            if (estadisticasPokemon[i][0].equalsIgnoreCase(nombrePokemon)) {
                encontrado = true;
                System.out.println("Estadísticas de " + nombrePokemon + ":");
                System.out.println("Velocidad: " + estadisticasPokemon[i][1]);
                System.out.println("Ataque: " + estadisticasPokemon[i][2]);
                System.out.println("Defensa: " + estadisticasPokemon[i][3]);
                System.out.println("HP: " + estadisticasPokemon[i][4]);
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron estadísticas para " + nombrePokemon);
        }
        
        
    
    }
    
}
