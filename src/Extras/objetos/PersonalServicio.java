/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

import java.util.Scanner;

/**
 *
 * @author lucia
 * Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
public final class PersonalServicio extends Empleados {
    private Seccion seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(Seccion seccion, Integer anio, Integer despacho, String nombre, String apellido, Integer ID, String estado) {
        super(anio, despacho, nombre, apellido, ID, estado);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
    public void reasignacionSeccion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Seleccione la nueva seccion:");
        for (int i = 0; i < Seccion.values().length; i++) {
            System.out.println((i+1) + ". " + Seccion.values()[i]);
        }
        int opcion = leer.nextInt();
        this.seccion=Seccion.values()[opcion-1];
    }

    @Override
    public String toString() {
        return "Personal de Servicio: " + super.toString() + " Seccion " + seccion;
    }

    
}
