/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglote;

/**
 *
 * @author Usuario
 */
public class EVA1_7_ARREGLOTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int datos[] = new int[200000000000];
        //LLENAR EL ARREGLO DE VALORES AÑEATORIOS
        for(int i = 0; i < datos.length; i ++){
                        //Casting
            datos[i] = (int)(Math.random() * 100);
    }
    }  
}
