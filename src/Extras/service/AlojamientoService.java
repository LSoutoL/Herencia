/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.service;

import Extras.objetos.Alojamiento;
import Extras.objetos.Camping;
import Extras.objetos.Gimnasio;
import Extras.objetos.Hotel;
import Extras.objetos.Hotel4;
import Extras.objetos.Hotel5;
import Extras.objetos.Residencia;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class AlojamientoService {
    private ArrayList<Alojamiento> lista;
    private Scanner leer;

    public AlojamientoService() {
        this.lista=new ArrayList<>();
        this.leer= new Scanner(System.in).useDelimiter("\n");
    }
    
    public void cargarAlojamiento(){
    Hotel5 hotel5 = new Hotel5(3, 2, 2, Gimnasio.B, "Vruta Gula", 25, 6, 20, 1, "Templado", "35 y 140", "Mercedes", "Maria");
    hotel5.setPrecio(hotel5.calcularPrecio());
    lista.add(hotel5);
    Hotel4 hotel4 = new Hotel4(Gimnasio.A, "Agua viva", 35, 10, 100, 3, "L'eau vive", "San Martin 600", "Lujan", "Lautaro");
    hotel4.setPrecio(hotel4.calcularPrecio());
    lista.add(hotel4);
    Camping camping = new Camping(20, 6, false, false, 1000, "El lago", "Bustillo km. 12", "Bariloche", "Silvana");
    lista.add(camping);
    Residencia residencia = new Residencia(10, false, true, true, 500, "General Peron", "Sarmiento 435", "CABA", "Maxi");
    lista.add(residencia);
    }
    
    public void MostrarAlojamientos(){
        for (Alojamiento alojamiento : lista) {
            System.out.println(alojamiento);
        }
    }
    
    public void HotelesPorPrecio(){
        ArrayList<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : lista) {
            if (alojamiento instanceof Hotel hotel) {
                hoteles.add(hotel);
            }
        }
       hoteles.sort(Hotel.precioDesc);
        for (Hotel hotele : hoteles) {
            System.out.println(hotele);
        }
    }
     public void CampingResto(){
         int aux=0;
         for (Alojamiento alojamiento : lista) {
             if (alojamiento instanceof Camping camping) {
                if (camping.isResto()){
                    System.out.println(camping);
                    aux++;
                }         
             }
         }
         if (aux==0){
            System.out.println("No disponible.");
        }
     }
    public void ResidenciaDescuento(){
        int aux=0;
        for (Alojamiento alojamiento : lista) {
            if (alojamiento instanceof Residencia residencia) {
                if(residencia.isDescuentoGremial()){
                    System.out.println(residencia);
                    aux++;
                }
            }
        }
        if (aux==0){
            System.out.println("No disponible.");
        }
    }
}
