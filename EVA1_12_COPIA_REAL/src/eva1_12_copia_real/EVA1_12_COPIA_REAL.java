/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_copia_real;

/**
 *
 * @author Usuario
 */
public class EVA1_12_COPIA_REAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int datos [] = new int [10];
        System.out.println(datos);
        for (int i = 0; i < datos.length; i++){
            datos[i] = (int)(Math.random()*100);
        }
        for(int valor: datos){
            System.out.println("[" + valor + "]");
        }
        int copia[] = new int[datos.length];
        System.out.println(copia);
        for (int i = 0; i < datos.length; i++) {
            copia[i] = datos[i];
        }
        System.out.println("");
        System.out.println("Arreglo original:");
        for (int valor : datos) {
            System.out.print("[" + valor + "] ");
        }
        System.out.println("");
        System.out.println("\nCopia del arreglo:");
        for (int valor : copia) {
            System.out.print("[" + valor + "] ");
        }
    } 
}
