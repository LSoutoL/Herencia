/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

import java.util.Scanner;

/**
 *
 * @author lucia
 * En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
 */
public final class Estudiante extends Persona {
    private Cursos curso;

    public Estudiante() {
    }

    public Estudiante(Cursos curso, String nombre, String apellido, Integer ID, String estado) {
        super(nombre, apellido, ID, estado);
        this.curso = curso;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }
    public void rematriculacion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Seleccione el nuevo curso:");
        for (int i = 0; i < Cursos.values().length; i++) {
            System.out.println((i+1) + ". " + Cursos.values()[i]);
        }
        int opcion = leer.nextInt();
        this.curso=Cursos.values()[opcion-1];
    }
    
    @Override
    public String toString() {
        return "Estudiante: " + super.toString() + " Matriculado en curso: " + curso;
    }
    
    
}
