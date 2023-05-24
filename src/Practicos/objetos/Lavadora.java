/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicos.objetos;

/**
 *
 * @author lucia
 * 
 */
public final class Lavadora extends Electrodomestico {
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Double precio, String color, String consumo, Integer peso, Integer carga) {
        super(precio, color, consumo, peso);
        this.carga=carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    /*Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.*/
    public void crearLavadora(String color, char letra, Integer peso, Integer carga){
        crearElectrodomestico(color,letra, peso);
        this.carga=carga;
    }
    
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga>30){
            this.precio+=500;
        }
    }
    
}
