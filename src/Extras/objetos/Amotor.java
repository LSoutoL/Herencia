/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 */
public class Amotor extends Bote {
    protected Integer potencia;

    public Amotor() {
    }

    public Amotor(Long matricula, Integer eslora, Integer anio, Integer potencia) {
        super(matricula, eslora, anio);
        this.potencia=potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public int calcularModulo() {
        return super.calcularModulo()+potencia;
    }
    
    
}
