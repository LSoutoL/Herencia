/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

import java.util.Scanner;

/**
 *
 * @author lucia
 * Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
public final class Profesor extends Empleados {
    private Departamentos departamento;

    public Profesor() {
    }

    public Profesor(Departamentos departamento, Integer anio, Integer despacho, String nombre, String apellido, Integer ID, String estado) {
        super(anio, despacho, nombre, apellido, ID, estado);
        this.departamento = departamento;
    }

    public Departamentos getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamentos departamento) {
        this.departamento = departamento;
    }
    
    public void reasignacionDepartamento(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Seleccione el nuevo departamento:");
        for (int i = 0; i < Departamentos.values().length; i++) {
            System.out.println((i+1) + ". " + Departamentos.values()[i]);
        }
        int opcion = leer.nextInt();
        this.departamento=Departamentos.values()[opcion-1];
    }

    @Override
    public String toString() {
        return "Profesor: " + super.toString() + " Pertenece al departamento " + departamento;
    }
    
    
}
