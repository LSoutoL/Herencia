/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practicos;

import Practicos.objetos.Electrodomestico;
import Practicos.objetos.Lavadora;
import Practicos.objetos.Televisor;
import java.util.ArrayList;

/**
 *
 * @author lucia
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.*/
    ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
    
    Lavadora L1 = new Lavadora();
    L1.crearLavadora("violeta", 'B', 23, 8);
    electrodomesticos.add(L1);
    
    Lavadora L2 = new Lavadora();
    L2.crearLavadora("azul", 'A', 50, 32);
    electrodomesticos.add(L2);
    
    Televisor T1 = new Televisor();
    T1.crearTelevisor("gris", 'W', 20, 30.5, true);
    electrodomesticos.add(T1);
    
    Televisor T2 = new Televisor();
    T2.crearTelevisor("negro", 'c', 81, 41d, false);
    electrodomesticos.add(T2);
    
    Double precios=0d;
    
        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();
            System.out.println(electrodomestico.getPrecio());
            precios+=electrodomestico.getPrecio();
        }
        
        System.out.println("El precio total de los electrodomesticos es " + precios);
    }
    
}
