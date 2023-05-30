/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras.objetos;

/**
 *
 * @author lucia
 * Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */
public class Bote {
    protected Long matricula;
    protected Integer eslora;
    protected Integer anio;

    public Bote() {
    }

    public Bote(Long matricula, Integer eslora, Integer anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    
    public int calcularModulo(){
        return eslora*10;
    }
}
