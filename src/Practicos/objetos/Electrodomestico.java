/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicos.objetos;

import java.util.ArrayList;

/**
 *
 * @author lucia
 * 
 */
public class Electrodomestico {
    /*Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.*/
    protected Double precio;
    protected String color;
    protected String consumo;
    protected Integer peso;

    /*Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.*/

    public Electrodomestico () {
    }

    public Electrodomestico(Double precio, String color, String consumo, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
    
    /*Métodos getters y setters de todos los atributos.*/

    public Double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public String getConsumo() {
        return consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    /* Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    
    private String comprobarConsumoEnergetico (char letra){
        String aux = String.valueOf(letra).toUpperCase();
        switch (aux){
            case "A":break;
            case "B": break;
            case "C":break;
            case "D": break;
            case "E": break;
            case "F": break;
            default: aux="F";
        }
        return aux;
    }
  
    /* Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    private String comprobarColor (String color){
        color=color.toLowerCase();
       switch (color){
           case "blanco": break;
           case "negro": break;
           case "rojo": break;
           case "azul":break;
           case "gris": break;
           default: color="blanco";
       }
       return color; 
    }
    
    /* Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    
    public void crearElectrodomestico (String color, char letra, Integer peso){
        this.precio=1000d;
        this.color=comprobarColor(color);
        this.consumo=comprobarConsumoEnergetico(letra);
        this.peso=peso;
    }
    
    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:*/
    
    public void precioFinal(){
        switch(consumo){
            case "A": this.precio+=1000;
            break;
            case "B": this.precio+=800;
            break;
            case "C":this.precio+=600;
            break;
            case "D": this.precio+=500;
            break;
            case "E": this.precio+=300;
            break;
            case "F":this.precio+=100;
            break;
        }
        if (peso>=80){
            this.precio+=1000;
        } else if (peso>=50){
            this.precio+=800;
        } else if (precio>=20){
            this.precio+=500;
        } else this.precio+=100;
    } 
}
