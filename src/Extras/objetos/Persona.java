/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

import java.util.Scanner;

/**
 *
 * @author lucia
 * Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
* • Cambio del estado civil de una persona.
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected Integer ID;
    protected String estado;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer ID, String estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void cambioEstado(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor, indique el nuevo estado civil:");
        this.estado=leer.next();
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", apellido=" + apellido + ", ID=" + ID + ", estado=" + estado + '.';
    }
    
    
    
}
