/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_heap;

/**
 *
 * @author evely
 */
public class EVA1_3_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Prueba prueba = new Prueba(); 
        System.out.println("prueba.x");
        
        Prueba prueba2 = new Prueba ();
        Prueba2.x =prueba.x;
        
        System.out.println("prueba2.x");//prueba 2
        prueba.x = 200;
        System.out.println("prueba.x");//valor de prueba 200
        System.out.println("prueba2.x");//valor de prueba 2 copia
        System.out.println("prueba");//direccion prueba 1
        System.out.println("prueba2");//direccion prueba 2
        
        if (prueba == prueba2)
            System.out.println("Objetos iguales");
        else
            System.out.println("Objetos diferentes");
    }
    
}
