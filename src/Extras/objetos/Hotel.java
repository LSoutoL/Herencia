/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

import java.util.Comparator;

/**
 *
 * @author lucia
 * Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas.
 */
public class Hotel extends Alojamiento {
    protected Integer habitaciones;
    protected Integer camas;
    protected Integer pisos;
    protected Integer precio;

    public Hotel() {
    }

    public Hotel(Integer habitaciones, Integer camas, Integer pisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public Integer getCamas() {
        return camas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
        
    public Integer calcularPrecio(){
        this.precio= 50+camas;
        return precio;
    }
    
    public static Comparator<Hotel> precioDesc = new Comparator<Hotel>() {
        @Override
        public int compare(Hotel o1, Hotel o2) {
            return o2.getPrecio().compareTo(o1.getPrecio());
        }
            
    };
            
    @Override
    public String toString() {
        super.toString();
        return "Las habitaciones poseen un precio de " + precio;
    }
    
    
}
