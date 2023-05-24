/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia.entidades;

/**
 *
 * @author lucia
 * Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva 
 * un saludo “Hola”.
 */
public class Animal implements Interfaz{
    protected String nombre;
    protected String tipo;

    public Animal() {
    }

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public void hacerRuido(){
        System.out.println("Hola");
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
    }
}
