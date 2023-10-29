/*
14. Dado el siguiente array ordenar en orden ascendente y descendente utilizando dos
métodos de ordenamiento puede usar el que desee.
*/
package ejercicio14;


public class Ejercicio14 {
     public static void main(String[] args) {
     int[] numerosDesordenados = {64, 25, 12, 22, 11, 1, 77, 36, 98,45};
     //metodo de ordemanimento de burbuja 
     int auxiliar;
     for (int i=0;i<numerosDesordenados.length-1;i++){
        for (int j=0;j<numerosDesordenados.length-1;j++){
            if (numerosDesordenados[j]>numerosDesordenados[j+1]){
                auxiliar = numerosDesordenados[j];
                numerosDesordenados[j] = numerosDesordenados[j+1];
                numerosDesordenados[j+1] = auxiliar;
                }
            }
        }
         //imprimir el arreglo
         System.out.println("Arreglo ordenado de forma ascendente");
         for (int i=0;i<numerosDesordenados.length;i++){
             System.out.println(numerosDesordenados[i]);
         }
         System.out.println("Arreglo ordenado de forma descendente");
         for (int i = numerosDesordenados.length-1; i >= 0; i--){
             System.out.println(numerosDesordenados[i]);
         }
         //ordenamiento por insercion
         int posicion,aux;
         for (int i = 0; i < numerosDesordenados.length; i++){
         posicion = i;
         aux = numerosDesordenados[i];
         
         while ((posicion>0) && (numerosDesordenados[posicion-1]) > aux){
         numerosDesordenados[posicion] = numerosDesordenados[posicion-1];
         posicion--;
         }
         numerosDesordenados[posicion] = aux;
         }
         //imprimir el  arreglo 
         System.out.println("Arreglo ordenado de forma ascendente (ordenamiento por insercion)");
         for (int i=0;i<numerosDesordenados.length;i++){
             System.out.println(numerosDesordenados[i]);
         }
         System.out.println("Arreglo ordenado de forma descendente (ordenamiento por insercion)");
         for (int i = numerosDesordenados.length-1; i >= 0; i--){
             System.out.println(numerosDesordenados[i]);
         }
         
     
     }
}
