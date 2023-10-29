/*
25. Realice un programa que verifique si una contraseña cumple con los siguientes
requisitos:
Tiene al menos 8 caracteres de longitud.
Contiene al menos 1 letra mayúscula.
Contiene al menos 1 letra minúscula.
Contiene al menos 1 dígito.
Contiene al menos 1 símbolo.
*/
package ejercicio25;

import java.util.Scanner;


public class Ejercicio25 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese la cantidad de caracteres que desea para su contraseña \n(entre 8 y 15 caracteres)");
        cantidad = entrada.nextInt();
        char[] contraseña = new char[cantidad];
        System.out.println("Requisitos:\n"+
        "Tiene al menos 8 caracteres de longitud.\n" +
        "Contiene al menos 1 letra mayúscula.\n" +
        "Contiene al menos 1 letra minúscula.\n" +
        "Contiene al menos 1 dígito.\n" +
        "Contiene al menos 1 símbolo.");
        for (int i = 0; i < cantidad; i++) {
            System.out.print((i + 1) + ". Ingrese la contraseña caracter por caracter: ");
            contraseña[i] = entrada.next().charAt(0);
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;
        boolean tieneSimbolo = false;

        for (int i = 0; i < cantidad; i++) {
            char caracter = contraseña[i];

            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            }

            if (Character.isLowerCase(caracter)) {
                tieneMinuscula = true;
            }

            if (Character.isDigit(caracter)) {
                tieneDigito = true;
            }

            if (!Character.isLetterOrDigit(caracter)) {
                tieneSimbolo = true;
            }
        }

        if (contraseña.length < 8 || contraseña.length > 15 || !tieneMayuscula || !tieneMinuscula || !tieneDigito || !tieneSimbolo) {
            System.out.println("Error: La contraseña no cumple con los requisitos.");
        } else {
            System.out.println("Contraseña ingresada correctamente: " + new String(contraseña));
        }
    }
    
    
}
