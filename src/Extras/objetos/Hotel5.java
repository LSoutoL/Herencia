/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 * Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
public final class Hotel5 extends Hotel4 {
    private Integer salones;
    private Integer suites;
    private Integer limos;

    public Hotel5() {
    }

    public Hotel5(Integer salones, Integer suites, Integer limos, Gimnasio gim, String resto, Integer capacidadResto, Integer habitaciones, Integer camas, Integer pisos, String nombre, String direccion, String localidad, String gerente) {
        super(gim, resto, capacidadResto, habitaciones, camas, pisos, nombre, direccion, localidad, gerente);
        this.salones = salones;
        this.suites = suites;
        this.limos = limos;
    }

    public Integer getSalones() {
        return salones;
    }

    public Integer getSuites() {
        return suites;
    }

    public Integer getLimos() {
        return limos;
    }

    @Override
    public Integer calcularPrecio() {
        super.calcularPrecio();
        this.precio+=(limos*15);
        return precio;  
    }

    @Override
    public String toString() {
        return nombre.toUpperCase() + "- " + direccion + ", " + localidad + ". Gerente: " + gerente + ". Hotel ***** - Precio:" + precio;
    }

    
    
    
}
