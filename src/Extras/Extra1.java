/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Extras;

import Extras.objetos.Alquiler;
import Extras.objetos.Amotor;
import Extras.objetos.Bote;
import Extras.objetos.Lujo;
import Extras.objetos.Velero;
import Extras.service.AlquilerService;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlquilerService servicio = new AlquilerService();
        Alquiler nuevo = servicio.cargarAlquiler();
        System.out.println("");
        nuevo.calcularAlquiler();
    }
    
}
