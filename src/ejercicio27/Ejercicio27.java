/*
 Tic Tac Toe
Desarrollarás un programa para implementar el juego de Tic Tac Toe, también conocido
como Tres en Línea, para dos jugadores. El programa permitirá a los jugadores realizar
movimientos en un tablero y verificar si hay un ganador o si el juego termina en empate.
*/
package ejercicio27;

import java.util.Scanner;


public class Ejercicio27 {
    static void inicio (char[][] tabla) {
        for (int fila = 0; fila < tabla.length; fila++) {
            for (int columna = 0; columna < tabla.length; columna++) {
                tabla[fila][columna] = ' ';
            }
        }
    }
    
    static void laTabla(char[][] tabla) {
        System.out.println(" ");
        System.out.println(ANSI_RED +"    1   2   3" + ANSI_RESET);
        System.out.println("  -------------");
        for (int fila = 0; fila < tabla.length; fila++) {
            System.out.print(ANSI_RED + (fila + 1) + ANSI_RESET);
            for (int columna = 0; columna < tabla.length; columna++) {
                System.out.print(" | " + tabla [fila][columna]);
            }
            System.out.println(" |");
            System.out.println("  -------------");
        }

    }
    static boolean estaLlena(char[][] tabla) {

        for (int fila = 0; fila < tabla.length; fila++) {
            for (int columna = 0; columna < tabla.length; columna++) {
                if (tabla[fila][columna] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }
    static boolean validoMov(char[][] tabla, int fila, int columna) {

        if (fila >= 0 && fila <= 2 && columna >= 0 && columna <= 2) {
            return tabla[fila][columna] == ' ';
        }

        return false;

    }
    static char ganador(char[][] tabla) {
        
    
        for (int fila = 0; fila < tabla.length; fila++) {
            if (tabla[fila][0] != ' ' && tabla[fila][0] == tabla[fila][1] && tabla[fila][1] == tabla[fila][2]) {
                return tabla [fila][0];
            }
        }
 
        for (int columna = 0; columna < tabla.length; columna++) {
            if (tabla[0][columna] != ' ' && tabla[0][columna] == tabla[1][columna] && tabla[1][columna] == tabla[2][columna]) {
                return tabla[0][columna];
            }
        }   
        // diagonales
        // principal

        if (tabla[0][0] != ' ' && tabla[0][0] == tabla[1][1] && tabla[1][1] == tabla[2][2]) {
            return tabla [0][0];
        }
        //  secundaria

        if (tabla[2][0] != ' ' && tabla[2][0] == tabla[1][1] && tabla[1][1] == tabla[0][2]) {
            return tabla[2][0];
        }

        return ' ';

    }
    
    
    public static void main(String[] args) {

        inicio(tabla);

        System.out.println("Bienvenido al juego Tic Tac Toe");

        laTabla(tabla);

        while (!finalJuego) {

            System.out.print("Jugador " + jugador + "\nIngrese la fila: ");
            int fila = scanner.nextInt() - 1;
            System.out.print("\nIngrese la columna: ");
            int columna = scanner.nextInt() - 1;

            if (validoMov(tabla, fila, columna)) {

                tabla[fila][columna] = jugador;

                jugadorGanador = ganador (tabla);

                if (jugadorGanador != ' ') {
                    finalJuego = true;
                } else if (estaLlena(tabla)) {
                    finalJuego = true;
                }

                laTabla(tabla);
                
                if (jugador == 'X') {
                     jugador = 'O';
                } else {
                  jugador = 'X';
                }

            } else {
                System.out.println(ANSI_RED + "Movimiento no válido" + ANSI_RESET);
                
            }


        }


        if (jugadorGanador != ' ') {
            System.out.println("El ganador ha sido el jugador " + jugadorGanador+" Felicidades :)");
        } else {
            System.out.println("Empataron :/");
        }


    }
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_RESET = "\u001B[0m";
    static char[][] tabla = new char[3][3];
    static Scanner scanner = new Scanner(System.in);
    static char jugador = 'X';
    static boolean finalJuego = false;
    static char jugadorGanador = ' ';
    
}
