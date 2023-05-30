/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.service;

import Extras.objetos.Alquiler;
import Extras.objetos.Amotor;
import Extras.objetos.Bote;
import Extras.objetos.Lujo;
import Extras.objetos.Velero;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class AlquilerService {
    private Scanner leer;

    public AlquilerService() {
        this.leer=new Scanner(System.in).useDelimiter("\n");
    }
    
    public Bote cargarBote(){
        System.out.println("Ahora debe ingresar los datos basicos de la embarcacion.");
        System.out.println("Matricula de la embarcacion:");
        Long matricula=leer.nextLong();
        System.out.println("Eslora de la embarcacion (en metros):");
        Integer eslora = leer.nextInt();
        System.out.println("Anio de la embarcacion:");
        Integer anio = leer.nextInt();
        System.out.println("Tipo de embarcacion:");
        System.out.println("1. EMBARCACION (general)");
        System.out.println("2. VELERO");
        System.out.println("3. EMBARCACION A MOTOR");
       
        int opcion = leer.nextInt();
        Bote ocupa = new Bote();
        switch (opcion){
            case 1: ocupa= new Bote(matricula, eslora, anio);
            break;
            case 2: System.out.println("Iindique la cantidad de mastiles del velero:");
            Integer mastiles = leer.nextInt();
            ocupa = new Velero(matricula, eslora, anio, mastiles);
            break;
            case 3: System.out.println("Indique la potencia del motor en CV:");
            Integer potencia = leer.nextInt();
            System.out.println("Es una embarcacion de lujo? s/n");
            String lujo = leer.next();
            if (lujo.equalsIgnoreCase("s")){
                System.out.println("Indique la cantidad de camarotes:");
                Integer camarotes = leer.nextInt();
                ocupa = new Lujo(matricula, eslora, anio, potencia, camarotes);
            } else ocupa = new Amotor(matricula, eslora, anio, potencia);
            break;
        }
        return ocupa;
    }
    
    public Alquiler cargarAlquiler(){
        System.out.println("Bienvenido. Ingrese los datos del alquiler.");
        System.out.println("Nombre del cliente:");
        String nombre = leer.next();
        System.out.println("DNI del cliente:");
        Long DNI = leer.nextLong();
        System.out.println("Fecha de inicio del alquiler (en formato AAAA/MM/DD).");
        Date alquiler = new Date(leer.nextInt(),leer.nextInt(),leer.nextInt());
        System.out.println("Fecha de fin del alquiler (en formato AAAA/MM/DD).");
        Date devolucion = new Date(leer.nextInt(),leer.nextInt(),leer.nextInt());
        Bote ocupa = cargarBote();
        return new Alquiler(nombre, DNI, alquiler, devolucion, ocupa);
    }
}
