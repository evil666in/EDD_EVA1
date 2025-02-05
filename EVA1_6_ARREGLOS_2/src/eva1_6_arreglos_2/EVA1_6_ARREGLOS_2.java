/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_arreglos_2;

/**
 *
 * @author Usuario
 */
public class EVA1_6_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int datos[] = new int[10];
        System.out.println(datos);
        System.out.println(datos.length);
        //LLENAR EL ARREGLO DE VALORES AÑEATORIOS
        for(int i = 0; i < datos.length; i ++){
                        //Casting
            datos[i] = (int)(Math.random() * 100);
    }
     for (int i = 0; i < datos.length; i++){
         System.out.println("[" + datos [i] + "]");
     }
     
     
}
}