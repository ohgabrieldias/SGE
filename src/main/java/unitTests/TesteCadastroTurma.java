/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitTests;

/**
 *
 * @author gabriel
 */
import baseCoding.*;
import java.util.Date;
import java.util.LinkedList;

public class TesteCadastroTurma {

    public static void main(String[] args) {
        // Criando objetos para teste
        Curso curso = new Curso("Engenharia de Software");
        LinkedList<Aluno> alunos = new LinkedList<>();
        LinkedList<Professor> professores = new LinkedList<>();
        LinkedList<String> disciplinas = new LinkedList<>();

        Aluno aluno1 = new Aluno("João", "Silva", "01/01/2000", "123456789", "Rua A, 123", "987654321", "Pai", 12345);
        Aluno aluno2 = new Aluno("Maria", "Santos", "01/01/2000", "987654321", "Rua B, 456", "123456789", "Mãe", 54321);
        alunos.add(aluno1);
        alunos.add(aluno2);

        Professor professor1 = new Professor("Carlos", "Ferreira", "01/01/2000", "123456789", "Av. X");
        Professor professor2 = new Professor("Ana", "Souza", "01/01/2000", "987654321", "Rua Y, 789");
        professores.add(professor1);
        professores.add(professor2);

        disciplinas.add("ES");
        disciplinas.add("SO");
        disciplinas.add("LF");

        Date dataInicio = new Date();
        Date dataFim = new Date();

        // Criando a turma
        Turma turma = new Turma(curso, "EC11", "EC11-001", dataInicio, dataFim);
        turma.setAlunos(alunos);
        turma.setProfessores(professores);
        turma.setDisciplinas(disciplinas);

        // Testando o cadastro da turma
        boolean cadastroSucesso = turma.cadastrarTurma(turma);

        if (cadastroSucesso) {
            System.out.println("Turma cadastrada com sucesso!");
        } else {
            System.out.println("Falha ao cadastrar a turma.");
        }
    }
}

