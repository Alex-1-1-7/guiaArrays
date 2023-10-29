/*
21. Invertir orden de un array
ejemplo:
[1,2,3,4,5] array original
[5,4,3,2,1] array invertido

*/
package ejercicio21;


public class Ejercicio21 {
    public static void main(String[] args){
      int[] numeros = {1, 2, 3, 4, 5};
        
        // Invertir el orden del array
        for (int i = 0; i < numeros.length / 2; i++) {
            int temporal = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            //    [i=0] = numeros[la ultima posicion menos uno  
            // porque el indice empieza en cero y menos 1 para que vaya decreciendo 
            // (como que vaya corriendo a la inversa) 
            
            numeros[numeros.length - 1 - i] = temporal;
            // aqui es donde le decimos que el ultimo numero va a pasar al indice 0
            // el penultimo va a psar al indice 1 y asi ......
        }
        
        // Imprimir el array invertido
        for (int i = 0;i < numeros.length ;i++){
        System.out.println(numeros[i]);  
        }
        
    }
}
