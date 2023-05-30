/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicos.objetos;

/**
 *
 * @author lucia
 */
public class Circulo implements Formas {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

  
    @Override
    public Double area() {
        return PI*(Math.pow(radio, 2));
    }
    @Override
    public Double perimetro() {
        return PI*(radio*2);
    }
    
}
