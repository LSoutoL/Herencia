/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Extras;

import Extras.objetos.Edificio;
import Extras.objetos.EdificioDeOficinas;
import Extras.objetos.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.*/
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Edificio> lista = new ArrayList<>();
        
        Edificio a = new Polideportivo(100, 5,100, "CEF 40", true);
        lista.add(a);
        
        Edificio b = new Polideportivo(50, 4,50, "CEF 39", false);
        lista.add(b);
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Indique la cantidad de personas por oficina");
            Integer persona = leer.nextInt();
            System.out.println("Indique la cantidad de oficinas por piso");
            Integer oficinas = leer.nextInt();
            System.out.println("Indique la cantidad de pisos");
            Integer pisos = leer.nextInt();
            lista.add(new EdificioDeOficinas(oficinas, persona, pisos, (oficinas*5), (pisos*4), (oficinas*10)));
        }
        int techados=0;
        for (Edificio edificio : lista) {
            System.out.println("La superficie del edificio es " + edificio.calcularSuperficie());
            System.out.println("El volumen del edificio es " + edificio.calcularVolumen());
            if (edificio instanceof Polideportivo object) {
                if (object.isTechado()){
                    techados++;
                }
                
            }
            if (edificio instanceof EdificioDeOficinas object) {
                object.cantPersonas();
            }
        }
        System.out.println("La cantidad de polideportivos techados es " + techados);
    }
    
}
