/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia.entidades;

/**
 *
 * @author lucia
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String tipo) {
        super(nombre, tipo);
    }

    @Override
    public void mostrar() {
        super.mostrar();
    }
    
    @Override
    public void hacerRuido() {
        System.out.println("Miau!");
    }
    
}
