/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 * Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa.
 */
public class Extrahotelero extends Alojamiento {
    protected boolean privado;
    protected Integer superficie;

    public Extrahotelero() {
    }

    public Extrahotelero(boolean privado, Integer superficie, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.superficie = superficie;
    }

    public boolean isPrivado() {
        return privado;
    }

    public Integer getSuperficie() {
        return superficie;
    }


    
}
