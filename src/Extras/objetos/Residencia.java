/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 * Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
 */
public final class Residencia extends Extrahotelero {
    private Integer habitaciones;
    private boolean descuentoGremial;
    private boolean campoDeportes;

    public Residencia() {
    }

    public Residencia(Integer habitaciones, boolean descuentoGremial, boolean campoDeportes, boolean privado, Integer superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.descuentoGremial = descuentoGremial;
        this.campoDeportes = campoDeportes;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public boolean isDescuentoGremial() {
        return descuentoGremial;
    }

    public boolean isCampoDeportes() {
        return campoDeportes;
    }

    @Override
    public String toString() {
        return nombre.toUpperCase() + "- " + direccion + ", " + localidad + ". Gerente: " + gerente + ". Residencia.";
    }
    
}
