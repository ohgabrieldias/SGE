/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseCoding;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author Matheus
 */
public class Turma {
    private LinkedList<Aluno> alunos;
    private Professor professor;
    private String codTurma;
    private Date dataInicio;
    private Date dataFim;
   
public Turma(LinkedList<Aluno> alunos, Professor professor, String codTurma, Date dataInicio, Date dataFim){
    this.alunos = alunos;
    this.professor = professor;
    this.codTurma = codTurma;
    this.dataInicio = dataInicio;
    this.dataFim = dataFim;
}

public List<Aluno> getAlunos(){
    return this.alunos;
}
public Professor getProfessor(){
    return this.professor;
}
public String getCodTurma(){
    return this.codTurma;
}
public Date getDataInicio(){
    return this.dataInicio;
}
public Date getDataFim(){
    return this.dataFim;
}

public String toString(){
    return "{" +
            " alunos='" + getAlunos() + "'" +
            ", professor='" + getProfessor() + "'" +
            ", codTurma='" + getCodTurma() + "'" +
            ", dataInicio='" + getDataInicio() + "'" +
            ", dataFim='" + getDataFim() + "'" +
            "}";
}
    
}
