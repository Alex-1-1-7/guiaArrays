/*
Registro de Notas
Desarrollarás un programa para gestionar las calificaciones de un grupo de estudiantes
a lo largo de varios períodos académicos. El programa permitirá a los usuarios ingresar
y consultar calificaciones por período y por estudiante.
*/
package ejercicio28;

import java.util.Scanner;



public class Ejercicio28 {
    
    public static int validarEstudiantes() {
        Scanner entrada = new Scanner(System.in);
        int cantidadEstudiantes;
        do {
            System.out.print("Ingrese la cantidad de estudiantes (de 1-10): ");
            cantidadEstudiantes = entrada.nextInt();
            if (cantidadEstudiantes < 1 || cantidadEstudiantes > 10) {
                System.out.println("El número está fuera del rango válido.");
            }
        } while (cantidadEstudiantes < 1 || cantidadEstudiantes > 10);
        return cantidadEstudiantes;
    }

    public static int cantidadPeriodos() {
        Scanner entrada = new Scanner(System.in);
        int cantidadPeriodos;
        do {
            System.out.print("Ingrese la cantidad de periodos (de 3-5): ");
            cantidadPeriodos = entrada.nextInt();
            if (cantidadPeriodos < 3 || cantidadPeriodos > 5) {
                System.out.println("El número está fuera del rango válido.");
            }
        } while (cantidadPeriodos < 3 || cantidadPeriodos > 5);
        return cantidadPeriodos;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadEstudiantes = validarEstudiantes();
        int cantidadPeriodos = cantidadPeriodos();
        double[][] notas = new double[cantidadEstudiantes][cantidadPeriodos];

        int opcion;
        int numeroPeriodo;
        double nota;

        do {
            System.out.println("Menu principal \n"
                    + "1. Ingresar calificaciones por periodo. \n"
                    + "2. Ingresar calificaciones por estudiante \n"
                    + "3. Ver calificaciones. \n"
                    + "4. Salir. \n"
                    + "Ingrese el numero de la opcion que desea: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el numero del periodo en el que desea ingresar las notas "
                            + "\n" + "(entre 1 y " + cantidadPeriodos + ") : ");
                    numeroPeriodo = entrada.nextInt();
                    while (numeroPeriodo < 1 || numeroPeriodo > cantidadPeriodos) {
                        System.out.print("ERROR. Ingrese el numero del periodo en el que desea ingresar las notas "
                                + "\n" + "(entre 1 y " + cantidadPeriodos + ") : ");
                        numeroPeriodo = entrada.nextInt();
                    }
                    for (int i = 0; i < notas.length; i++){
                        do{
                        System.out.print("Ingrese la nota del estudiante " + (i + 1) + " para el periodo " + numeroPeriodo + ": ");
                                   
                        nota = entrada.nextDouble();                         
                        } while(nota < 0 || nota > 10);
                        notas[i][numeroPeriodo - 1] = nota; 
                    }
                    
                    break;
                    
                    
                case 2:
                    System.out.print("Ingrese el numero de estudiante al que desea ingresar las calificaciones "
                    + "(entre 1 y " + cantidadEstudiantes + "): ");
                    int numeroEstudiante = entrada.nextInt();
                    while (numeroEstudiante < 1 || numeroEstudiante > cantidadEstudiantes) {
                        System.out.print("ERROR. Ingrese el numero de estudiante al que desea ingresar las calificaciones "
                        + "(entre 1 y " + cantidadEstudiantes + "): ");
                            numeroEstudiante = entrada.nextInt();
                    }
                    for (int i = 0; i < cantidadPeriodos; i++) {
                          System.out.print("Ingrese la calificacion del estudiante " + numeroEstudiante + " para el período " + (i + 1) + ": ");
                            double calificacion = entrada.nextDouble();
                            while(calificacion<0||calificacion>10){
                                System.out.println("Error al ingresar la nota, la nota debe  estar entre 0-10");
                                calificacion = entrada.nextDouble();
                            }
                            notas[numeroEstudiante - 1][i] = calificacion;
                            
                    }
                    break;
                case 3:
                    System.out.println("Tabla de calificaciones:");
                    System.out.print("Numero de estudiante\t");
                    for (int i = 1; i <= cantidadPeriodos; i++) {
                        System.out.print("Período " + i + "\t");
                    }
                    System.out.println();
                    for (int i = 0; i < cantidadEstudiantes; i++) {
                        System.out.print((i + 1) + "\t\t\t");
                        for (int j = 0; j < cantidadPeriodos; j++) {
                            System.out.print(notas[i][j] + "\t\t");
                        }
                        System.out.println();
                    }

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opción no válida. Ingrese un número del 1 al 4.");
            }
        } while (opcion != 4);
    }
}
    
    
        
    

