/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseCoding;

public class Aluno extends Pessoa {
    private long matricula;
    
    public Aluno(String nome, int cpf, String end, long matricula) {
        super(nome,cpf,end);
        this.matricula = matricula;
    }
    
    // Getters and setters for the 'matricula' attribute
    
    public long getMatricula() {
        return matricula;
    }
    
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
}
