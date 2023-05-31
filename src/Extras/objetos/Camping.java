/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 * Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
public final class Camping extends Extrahotelero {
    private Integer carpas;
    private Integer banios;
    private boolean resto;

    public Camping() {
    }

    public Camping(Integer carpas, Integer banios, boolean resto, boolean privado, Integer superficie, String nombre, String direccion, String localidad, String gerente) {
        super(privado, superficie, nombre, direccion, localidad, gerente);
        this.carpas = carpas;
        this.banios = banios;
        this.resto = resto;
    }

    public Integer getCarpas() {
        return carpas;
    }

    public Integer getBanios() {
        return banios;
    }

    public boolean isResto() {
        return resto;
    }

    @Override
    public String toString() {
        return nombre.toUpperCase() + "- " + direccion + ", " + localidad + ". Gerente: " + gerente + ". Camping.";
    }
    
}
