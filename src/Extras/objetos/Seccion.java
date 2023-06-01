/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 */
public enum Seccion {
    BIBLIOTECA ("Biblioteca"), DECANATO ("Decanato"), SECRETARIA ("Sceretaria"), AS_ESTUDIANTILES ("Asuntos Estudiantiles");
    
    public String value;

    private Seccion(String value) {
        this.value=value;
    }

    @Override
    public String toString() {
        return value;
    }
    
    
    
}
