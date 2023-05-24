/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import herencia.entidades.Animal;
import herencia.entidades.Gato;
import herencia.entidades.Perro;
import java.util.ArrayList;

/**
 *
 * @author lucia
 */
public class ManosalaObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*EJERCICIO ANIMAL
    Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.*/
     
    Animal a = new Animal("pepe", "canguro");
    Animal b = new Perro("Pepa", "perro");
    Animal c = new Gato("Foca", "Gato");
        
    ArrayList<Animal> animales = new ArrayList<>();
    animales.add(a);
    animales.add(b);
    animales.add(c);
    
        for (Animal animal : animales) {
            animal.hacerRuido();
        }
        
        for (Animal animal : animales) {
            animal.mostrar();
        }
        
    }
    
}
