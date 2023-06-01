/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Extras;

import Extras.objetos.Cursos;
import Extras.objetos.Departamentos;
import Extras.objetos.Estudiante;
import Extras.objetos.PersonalServicio;
import Extras.objetos.Profesor;
import Extras.objetos.Seccion;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Estudiante a = new Estudiante(Cursos.LENGUA, "Lucia", "Souto", 1234, "soltera");
       Profesor b = new Profesor(Departamentos.CS_EXACTAS, 2010, 7, "Lautaro", "Valenzuela", 12345, "soltero");
       PersonalServicio c = new PersonalServicio(Seccion.DECANATO, 2000, 1, "Pepe", "Pepon", 123, "soltero");
       
        System.out.println(a);
       a.cambioEstado();
       a.rematriculacion();
        System.out.println(a);
        System.out.println("");
        System.out.println(b);
       b.reasignacionDespacho();
       b.reasignacionDepartamento();
        System.out.println(b);
        System.out.println("");
        System.out.println(c);
       c.reasignacionSeccion();
        System.out.println(c);
       
        
    }
    
}
