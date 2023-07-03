/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseCoding;

/**
 *
 * @author gabriel
 */
public class Curso {
    private String nome;
    private int cargaHoraria;
    
    public Curso(String nome) {
        this.nome = nome;
    }
    
    
    public String getCurso(){
        return this.nome;
    }
}
