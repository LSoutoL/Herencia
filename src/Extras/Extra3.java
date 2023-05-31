/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Extras;

import Extras.service.AlojamientoService;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.*/
    
    AlojamientoService sistema = new AlojamientoService();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    sistema.cargarAlojamiento();
    int opcion;
    do{
        System.out.println("Bienvenido al sistema de consultas. Indique la busqueda que desea  realizar:");
        System.out.println("1. Todos los alojamientos");
        System.out.println("2. Hoteles (de mas caro a mas barato)");
        System.out.println("3. Campings con restaurante");
        System.out.println("4. Residencias con descuento para gremios");
        System.out.println("5. Salir");
        opcion = leer.nextInt();
        System.out.println("");
        
        switch (opcion){
            case 1: sistema.MostrarAlojamientos();
            break;
            case 2: sistema.HotelesPorPrecio();
            break;
            case 3: sistema.CampingResto();
            break;
            case 4: sistema.ResidenciaDescuento();
            break;
        }
    } while(opcion!=5);
    }
    
}
