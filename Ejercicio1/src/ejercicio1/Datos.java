/*
 * datos de nuestro proyecto
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author mariaobduliagonzalezfernandez
 */
public class Datos {

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroLista(int numeroLista) {
        this.numeroLista = numeroLista;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroLista() {
        return numeroLista;
    }

    public Datos(String nombre, int numeroLista) {
        this.nombre = nombre;
        this.numeroLista = numeroLista;
    }
    public Datos() {
       
    }
    
    String nombre;
    int numeroLista;
    
    public void ingresarDatos(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        nombre=sc.nextLine();
        System.out.println("Ingresa tu nombre");
        numeroLista=sc.nextInt();
        
    }
    
    
    
}
