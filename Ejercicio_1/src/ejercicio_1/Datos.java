/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1;

/**
 *
 * @author mariaobduliagonzalezfernandez
 */
public class Datos {
    String nombre;
    int NumeroLista;
    boolean control;

    public Datos(String nombre, int NumeroLista, boolean control) {
        this.nombre = nombre;
        this.NumeroLista = NumeroLista;
        this.control = control;
    }
    public Datos()
    {
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroLista() {
        return NumeroLista;
    }

    public boolean isControl() {
        return control;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroLista(int NumeroLista) {
        this.NumeroLista = NumeroLista;
    }

    public void setControl(boolean control) {
        this.control = control;
    }
    
}
