/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_arreglos;

/**
 *
 * @author Usuario
 */
public class EVA1_5_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = new int [10]; //N 0 10 elementos
        //I¿int [] A, B, C; //tres arrglos de tipo entero
        //int a, b[], c; //un arreglo de tipo entero
        //Los arrglos son de ACCESO ALEATORIO (POR INDICES)
        datos [0] = 100;
        datos[1] = 200;
        //datos[10] = 1000; //GENERA EXEPCIÓN (LLEGA HASTA 9)
        datos[9] = 1000;
        
        //uso de ciclos para manejar arreglos:
        
        for (int i = 0; i < 10; i++) { //asignacion de datos
            datos [i] = 100;
        }
        for (int i = 0; i < 10; i++) { //lectura
            System.out.println("[" + datos[i]+ "]");
        }
    }
    
}
