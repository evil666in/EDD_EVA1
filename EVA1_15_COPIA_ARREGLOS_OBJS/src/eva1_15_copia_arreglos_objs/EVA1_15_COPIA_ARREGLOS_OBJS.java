/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_copia_arreglos_objs;

/**
 *
 * @author Usuario
 */
public class EVA1_15_COPIA_ARREGLOS_OBJS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona datos[]=new Persona [5];
       datos[0]=new Persona();
       datos[1]=new Persona();
       datos[2]=new Persona();
       datos[3]=new Persona();
       datos[4]=new Persona();
        for (int i = 0; i < datos.length; i++) {
            datos[i]=new Persona();
        }
        datos[0].setNombre("NOMBRE 1");
        datos[1].setNombre("NOMBRE 2");
        datos[2].setNombre("NOMBRE 3");
        datos[3].setNombre("NOMBRE 4");
        datos[4].setNombre("NOMBRE 5");
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i].getNombre());
        }
        //agregar la copia del arreglo anterior
        Persona copia[] = new Persona[datos.length];
        for (int i = 0; i < datos.length; i++) {
            copia[i] = new Persona();
            copia[i].setNombre(datos[i].getNombre());
        }
        // Modificar la copia
        copia[0].setNombre("NOMBRE COPIA 1"); 
        copia[1].setNombre("NOMBRE COPIA 2");
        copia[2].setNombre("NOMBRE COPIA 3");
        copia[3].setNombre("NOMBRE COPIA 4");
        copia[4].setNombre("NOMBRE COPIA 5");

        // Imprimir los nombres del arreglo copiado
        System.out.println("\nArreglo copia:");
        for (int i = 0; i < copia.length; i++) {
            System.out.println(copia[i].getNombre());
        }
     
    }
    }


    class Persona{
        private String nombre;
        //metodos get y set

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
    }

   
    

