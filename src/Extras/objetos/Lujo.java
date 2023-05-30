/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 */
public class Lujo extends Amotor {
    private Integer camarotes;

    public Lujo() {
    }

    public Lujo(Long matricula, Integer eslora, Integer anio, Integer potencia, Integer camarotes) {
        super(matricula, eslora, anio, potencia);
        this.camarotes=camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public int calcularModulo() {
        return super.calcularModulo()+camarotes;
    }

    
}
