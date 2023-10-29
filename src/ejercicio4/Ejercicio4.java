
/* 4. Leer 5 nombres de pokemon y mostralos en orden inverso al introducido. */
package ejercicio4;

import java.util.Scanner;
public class Ejercicio4 {
public static void main (String[] args) {
Scanner entrada = new Scanner(System.in);

String [] pokemon = new String [5];
int i;  
    System.out.println("Ingrese 5 nombres de pokemon");
for (i =0; i < pokemon.length; i++ ){
    System.out.println("Ingrese el nombre del pokemon numero: "+(i+1));
    pokemon[i] = entrada.nextLine();
            
}          
    System.out.println("Los pokemon ingresados son(de forma inversa):");
    for (i = pokemon.length-1;  i>=0;i--){
        System.out.println(pokemon[i]);
    }
    
}    
}
