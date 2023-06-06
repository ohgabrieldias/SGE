/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseCoding;

/**
 *
 * @author Matheus
 */
public class Professor extends Pessoa {
    private int codigoProfessor;
    
public Professor(String nome, String cpf, String endereco, int codigoProfessor){
    super(nome,cpf,endereco);
    this.codigoProfessor = codigoProfessor;
 }

public int getCodigoProfessor(){
   return this.codigoProfessor;  
  }
}
