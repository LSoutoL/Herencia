/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 */
public enum Cursos {
    MATEMATICA ("Matematica"), LENGUA ("Lengua"), HISTORIA ("Historia"), BIOLOGIA ("Biologia");
    
    public String value;

    private Cursos(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
    
}
