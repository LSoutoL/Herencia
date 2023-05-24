/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia.entidades;

/**
 *
 * @author lucia
 *  Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban
 * método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main 
 * vamos a crear un ArrayList de animales y los siguientes animales
 */
public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String tipo) {
        super(nombre, tipo);
    }
    
    @Override
    public void mostrar() {
        super.mostrar();
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau!");
    }

    
    
    
}
