/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 */
public final class Polideportivo extends Edificio{
    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(Integer ancho, Integer alto, Integer largo, String nombre, boolean techado) {
        super(ancho, alto, largo);
        this.nombre=nombre;
        this.techado=techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
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
