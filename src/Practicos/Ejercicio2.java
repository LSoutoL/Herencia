/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practicos;

import Practicos.objetos.Electrodomestico;
import Practicos.objetos.Lavadora;
import Practicos.objetos.Televisor;

/**
 *
 * @author lucia
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.*/
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora("violeta", 'B', 23, 8);
        lavadora.precioFinal();
        System.out.println("precio: " + lavadora.getPrecio());
        
        Televisor televisor = new Televisor();
        televisor.crearTelevisor("gris", 'W', 20, 30.5, true);
        televisor.precioFinal();
        System.out.println("precio: "+televisor.getPrecio());
        
    }
    
}
