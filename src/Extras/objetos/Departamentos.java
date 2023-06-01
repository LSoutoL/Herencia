/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 */
public enum Departamentos {
    
    CS_SOCIALES ("Ciencias Sociales"), CS_EXACTAS ("Ciencias Exactas");
    
    public String value;

    private Departamentos(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    
    
    
}
