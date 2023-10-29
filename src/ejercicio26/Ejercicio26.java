/*
Autobus
Utilizando dos estructuras de datos (array) unidimensional cree un programa que
permita gestionar la asignación de asientos en un microbús con una distribución 
de filas
y asientos en dos lados, izquierdo y derecho. Los asientos pueden ser vendidos y
devueltos, y el programa debe llevar un registro de las ventas totales.
*/
package ejercicio26;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ejercicio26 {
    static boolean disponibles(int [] arreglo){
        for (int i =0; i < arreglo.length; i++){
            if (arreglo [i] == -1){
            return true;
            }
        }
        return false;
    }
    static boolean disponible(int [] arreglo, int cantidad){
        int conta = 0;
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i]==-1){
                conta++;
            }
        }
        return conta>=cantidad;
    }
    static void elLado (int arreglo[], String lado){
        System.out.println("Asientos del lado: "+lado);
        for (int i = 0; i < arreglo.length; i++){
            System.out.printf("Asiento[%d] = %d%n",(i+1),arreglo[i]);
        }
    }
    static boolean ventaAsiento(int[] arreglo, int posicion){
        if (arreglo[posicion-1]==-1){
         arreglo [posicion-1]=1;
         return true;
        }
        return false;
    }
    public static void main(String [] args){
        int cantidad, lugar, asientos,numAsiento;
        double caja = 0;
        boolean vendido=false;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas del autobus (entre 6-10)"));
        while (true){
            if  (cantidad>=6&&cantidad<=10){
                break;
            } else {
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Error debe ingrese la cantidad de filas (entre 6-10)"));
            }
        }
        int [] asientosA = new int [cantidad];
        int [] asientosB = new int [cantidad];
        Arrays.fill(asientosA, -1);
        Arrays.fill(asientosB, -1);
        
        int opcion;
        do {
            opcion  = Integer.parseInt(JOptionPane.showInputDialog("Menú principal \n"
            +"1. Ver Distribución \n"
            +"2. Comprar asientos \n"
            +"3. Devolver asientos \n"
            +"4. Mostrar caja \n "
            +"5. Salir \n"
            +"Ingrese el numero de la opcion que desea: "));
                switch (opcion){
                    case 1:
                        for (int i = 0; i < asientosA.length; i++){
                            System.out.printf("Asientos lado derecho [%d]=%d   |   Asientos lado izquierdo [%d]=%d%n", (i + 1), asientosA [i], (i + 1), asientosB[i]);
                        }
                        break;
                        case 2: 
                            if (disponibles (asientosA)  || disponibles (asientosB)){
                                do {
                                lugar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de el lado en el que desea viajar (1. Izquierda 2. Derecha)"));
                                }while(lugar<1 || lugar>2);
                                if (lugar==1){
                                    do {
                                    asientos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asientos que desea (1. uno 2. dos)"));
                                    }while(asientos<1 || asientos>2);
                                        if (disponible (asientosA,asientos)){
                                            if (asientos==1){
                                                elLado (asientosA, "izquierdo");
                                                do{
                                                numAsiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de asiento que desea "));
                                                }while(numAsiento < 1 || numAsiento > cantidad);
                                                vendido = ventaAsiento(asientosA,numAsiento);
                                                    if (vendido){
                                                        JOptionPane.showMessageDialog(null, "Venta completada ");
                                                        caja+=0.35;
                                                    } else {
                                                    JOptionPane.showMessageDialog(null, "No hay asientos disponibles ");
                                                    }
                                            }else {
                                                 elLado (asientosA, "izquierdo");
                                                int primerAsiento;
                                                int segundoAsiento;
                                                do{
                                                primerAsiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del primer asiento que desea "));
                                                }while(primerAsiento < 1 || primerAsiento < cantidad);
                                                
                                                do{
                                                segundoAsiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del segundo asiento que desea "));
                                                }while(segundoAsiento < 1 || segundoAsiento < cantidad);
                                                if (ventaAsiento(asientosA,primerAsiento) && ventaAsiento(asientosA,segundoAsiento) ){
                                                    JOptionPane.showMessageDialog(null, "Venta completada ");
                                                    caja+=0.50;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Asiento/s ocupado/os ");
                                                }
                                            }
                                        }else {
                                        JOptionPane.showMessageDialog(null, "No hay asientos disponibles ");
                                        }do {
                                    asientos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de asientos que desea (1. uno 2. dos)"));
                                    }while(asientos<1 || asientos>2);
                                        if (disponible (asientosB,asientos)){
                                            if (asientos==2){
                                                elLado (asientosA, "izquierdo");
                                                do{
                                                numAsiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de asiento que desea "));
                                                }while(numAsiento < 1 || numAsiento > cantidad);
                                                vendido = ventaAsiento(asientosB,numAsiento);
                                                    if (vendido){
                                                        JOptionPane.showMessageDialog(null, "Venta completada ");
                                                        caja+=0.35;
                                                    } else {
                                                    JOptionPane.showMessageDialog(null, "No hay asientos disponibles ");
                                                    }
                                            }else {
                                                 elLado (asientosB, "derecho");
                                                int primerAsiento;
                                                int segundoAsiento;
                                                do{
                                                primerAsiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del primer asiento que desea "));
                                                }while(primerAsiento < 1 || primerAsiento < cantidad);
                                                
                                                do{
                                                segundoAsiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del segundo asiento que desea "));
                                                }while(segundoAsiento < 1 || segundoAsiento < cantidad);
                                                if (ventaAsiento(asientosB,primerAsiento) && ventaAsiento(asientosA,segundoAsiento) ){
                                                    JOptionPane.showMessageDialog(null, "Venta completada ");
                                                    caja+=0.50;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Asiento/s ocupado/os ");
                                                }
                                            }
                                        }else {
                                        JOptionPane.showMessageDialog(null, "No hay asientos disponibles ");
                                        }
                                    
                                }else { 
                                
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No hay asientos disponibles ");
                            }
                        break;
                        case 3:
                        break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "En caja hay $"+caja);
                        break;
                        case 5:
                        break;
                }
        
        }while(opcion!=5);
    }
    
}
