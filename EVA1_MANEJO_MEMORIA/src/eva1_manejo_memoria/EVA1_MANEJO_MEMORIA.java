/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_manejo_memoria;

/**
 *
 * @author Usuario
 */
public class EVA1_MANEJO_MEMORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicia main");
        A();
        System.out.println("termina main");
    }
    public static void A(){
        System.out.println("inicia A");
        B();
        System.out.println("Termina A");
    }
    public static void B(){
        System.out.println("Incia B");
        System.out.println("Termina B");
    }
}
