/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicos.objetos;

/**
 *
 * @author lucia
 */
public class Animal {
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String razaAnimal;

    public Animal(String nombre, String alimento, Integer edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }
    
    public void Alimentarse(){
        System.out.println("Me alimento de " + alimento);
    }
}
