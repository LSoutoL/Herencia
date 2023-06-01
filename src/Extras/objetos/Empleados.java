/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

import java.util.Scanner;

/**
 *
 * @author luciaCon respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
 */
public class Empleados extends Persona {
    protected Integer anio;
    protected Integer despacho;

    public Empleados() {
    }

    public Empleados(Integer anio, Integer despacho, String nombre, String apellido, Integer ID, String estado) {
        super(nombre, apellido, ID, estado);
        this.anio = anio;
        this.despacho = despacho;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getDespacho() {
        return despacho;
    }

    public void setDespacho(Integer despacho) {
        this.despacho = despacho;
    }

    public void reasignacionDespacho(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor, indique el nuevo numero de despacho:");
        this.despacho=leer.nextInt();
    }
    
    @Override
    public String toString() {
        return super.toString() + " Despacho: " + despacho + ".";
    }
    
    
}
