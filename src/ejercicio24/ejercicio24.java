/*
24. Dado el siguiente array crear otro array donde guardara el array original sin los
números duplicados
*/
package ejercicio24;

public class ejercicio24 {
    public static void main(String[] args){
        int[] arrayOriginal = {1, 2, 2, 3, 4, 4, 5};
        int contador = 0;
        boolean repetido;
        // elementos no repetidos
        for (int i = 0; i < arrayOriginal.length; i++){
            repetido = false;
            for (int j = i+1; j <  arrayOriginal.length; j++){
                if (i != j && arrayOriginal[i] == arrayOriginal[j]){
                repetido = true;   
                break;
                }
            }
            if (!repetido){
            contador ++;
            }
        }   //necesitaba saber cuantos elementos no repetidos hay para asi 
            //hacer un array con ese espacio
            
            // guardar los elementos que no estan repetidos en el nuevo array 
        int[] nuevoArray = new int[contador];
        int nuevo = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            repetido = false;
            for (int j = i + 1; j < arrayOriginal.length; j++) {
                if (arrayOriginal[i] == arrayOriginal[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                nuevoArray[nuevo] = arrayOriginal[i];
                nuevo++;
            }
        }
        for (int i = 0; i < nuevoArray.length; i++){
        System.out.println(nuevoArray [i]);
        }
    }
    
}
