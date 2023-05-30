/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

import java.util.Date;

/**
 *
 * @author lucia
 * En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
public class Alquiler {
    private String nombre;
    private Long DNI;
    private Date alquiler;
    private Date devolucion;
    private int posicion;
    private Bote ocupa;

    public Alquiler() {
    }

    public Alquiler(String nombre, Long DNI, Date alquiler, Date devolucion, Bote ocupa) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.alquiler = alquiler;
        this.devolucion = devolucion;
        this.posicion = (int) Math.random()*10;
        this.ocupa = ocupa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDNI() {
        return DNI;
    }

    public void setDNI(Long DNI) {
        this.DNI = DNI;
    }

    public Date getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Date alquiler) {
        this.alquiler = alquiler;
    }

    public Date getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(Date devolucion) {
        this.devolucion = devolucion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Bote getOcupa() {
        return ocupa;
    }

    public void setOcupa(Bote ocupa) {
        this.ocupa = ocupa;
    }
    
    /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).*/
    public void calcularAlquiler(){
        int tiempo = (int)((devolucion.getTime()-alquiler.getTime())/86400000+1);
        int modulo = ocupa.calcularModulo();
        System.out.println("El precio del alquiler es " + (tiempo*modulo));
    }
}
