/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

import java.util.Scanner;

/**
 *
 * @author lucia
 * Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos.
 */
public final class EdificioDeOficinas extends Edificio {
    private Integer oficinas;
    private Integer personas;
    private Integer pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer oficinas, Integer personas, Integer pisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public Integer getOficinas() {
        return oficinas;
    }

    public void setOficinas(Integer oficinas) {
        this.oficinas = oficinas;
    }

    public Integer getPersonas() {
        return personas;
    }

    public void setPersonas(Integer personas) {
        this.personas = personas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }
    
    /*De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.*/
    public void cantPersonas(){
        System.out.println("En cada piso entran " + (personas*oficinas) + " personas.");
        System.out.println("En el edificio entran " + (personas*oficinas*pisos) + " personas en total.");
    }
    
    @Override
    public Integer calcularSuperficie() {
       return largo*ancho;
    }

    @Override
    public Integer calcularVolumen() {
       return largo*ancho*alto;
    }
    
}
