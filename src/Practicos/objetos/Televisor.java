/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicos.objetos;

/**
 *
 * @author lucia
 */
public final class Televisor extends Electrodomestico {
    private Double resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Double precio, String color, String consumo, Integer peso, Double resolucion, boolean sintonizador) {
        super(precio, color, consumo, peso);
        this.resolucion=resolucion;
        this.sintonizador=sintonizador;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    /*Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.*/
    
    public void crearTelevisor(String color, char letra, Integer peso, Double resolucion, boolean sintonizador){
        crearElectrodomestico(color, letra, peso);
        this.resolucion=resolucion;
        this.sintonizador=sintonizador;
    }
    
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (resolucion>40){
            this.precio+= (precio*0.3);
        }
        if (sintonizador){
            this.precio+=500;
        }
    }
    
    
}
