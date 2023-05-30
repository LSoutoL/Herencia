/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 */
public class Velero extends Bote {
    private Integer mastiles;

    public Velero() {
    }

    public Velero(Long matricula, Integer eslora, Integer anio, Integer mastiles) {
        super(matricula, eslora, anio);
        this.mastiles=mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public int calcularModulo() {
        return super.calcularModulo()+mastiles; 
    }
    
    
}
