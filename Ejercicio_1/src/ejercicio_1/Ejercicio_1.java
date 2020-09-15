/*
Programa para crear arreglos de objetos.
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author mariaobduliagonzalezfernandez
 */
public class Ejercicio_1 {
    int tope;
     Datos alumnos []= new Datos [5];
     Scanner sc= new Scanner(System.in);
public void capturarDatos(){
    if(tope>=5)
        {
            System.out.println("error");

        } else
         {
          alumnos[tope]= new Datos();
             System.out.println("Dame el nombre del alumno");
             alumnos[tope].nombre=sc.nextLine();
             System.out.println("Dame elnumero de lista");
             alumnos[tope].NumeroLista=sc.nextInt();
             alumnos[tope].control=false; 
             tope++;
         } 
    
      } 
public void MostarDAtos(){
      for(int i=0;i<=tope;i++)
          
      {
          System.out.println("nombre del allumno"+ alumnos[i].nombre);
          System.out.println("numero de lista"+ alumnos[i].NumeroLista);
      
      } 
         }      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Programa para capturar datos de una ruleta de participación");
        /*menu*/
        
       
        
        
    }
    
}
