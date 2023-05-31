/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Practicos.objetos;

/**
 *
 * @author lucia
 */
public interface Formas {
    final Double PI=3.14159265359;
    
    static Double areaCirculo(double radio){return PI*(Math.pow(radio, 2));}
    static Double perimetroCirculo(double radio){return PI*(radio*2);}
    static Double areaRectangulo(double base, double altura){return base*altura;}
    static Double perimetroRectangulo(double base, double altura){return (base+altura)*2;}
    
   Double area();
    
    Double perimetro();
}
