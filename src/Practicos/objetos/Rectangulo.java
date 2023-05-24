/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicos.objetos;

/**
 *
 * @author lucia
 */
public class Rectangulo implements Formas{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.*/

    @Override
    public Double area() {
       return base*altura; 
    }

    @Override
    public Double perimetro() {
        return (base+altura)*2;
    }
    
}
