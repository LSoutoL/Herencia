/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 * Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
public class Hotel4 extends Hotel {
    protected Gimnasio gim;
    protected String resto;
    protected Integer capacidadResto;

    public Hotel4() {
    }

    public Hotel4(Gimnasio gim, String resto, Integer capacidadResto, Integer habitaciones, Integer camas, Integer pisos, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
        this.gim = gim;
        this.resto = resto;
        this.capacidadResto = capacidadResto;
    }

    public Gimnasio getGim() {
        return gim;
    }

    public String getResto() {
        return resto;
    }

    public Integer getCapacidadResto() {
        return capacidadResto;
    }

    @Override
    public Integer calcularPrecio() {
     super.calcularPrecio();
     
     if (capacidadResto>50){
         this.precio+=50;
     } else if (capacidadResto>30){
         this.precio+=30;
     } else this.precio+=10;
     
     switch (gim){
         case A: this.precio+=50;
         break;
         case B: this.precio+=30;
         break;
     }
     return precio;
    }

    @Override
    public String toString() {
        return nombre.toUpperCase() + "- " + direccion + ", " + localidad + ". Gerente: " + gerente + ". Hotel **** - Precio:" + precio;
    }
   
    
    
}
