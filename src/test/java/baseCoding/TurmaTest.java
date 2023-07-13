package baseCoding;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TurmaTest {
    @Test
    public void testGetListaIdAlunos(){
        // Arrange
        int id = 1;
        String nome = "Maria";
        Aluno aluno = new Aluno(id, nome, "Souza", "02/02/2001", "0987654321", "Rua B");
        List<Aluno> listAluno = new ArrayList<>();
        listAluno.add(aluno);
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", listAluno, null);

        // Act
        List<Integer> result = turma.getListaIdAlunos();

        // Assert
        assertEquals(id, result.get(0), "ID não corresponde");
    }

    @Test
    public void testGetListaIdsDisciplinas(){
        // Arrange
        int id = 1;
        String nome = "Maria";
        Disciplina disciplina = new Disciplina(id, nome, "10/08/2000", "02/02/2001", "matheus");
        List<Disciplina> listDiscip = new ArrayList<>();
        listDiscip.add(disciplina);
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", null, listDiscip);

        // Act
        List<Integer> result = turma.getListaIdsDisciplinas();

        // Assert
        assertEquals(id, result.get(0), "ID não corresponde");
    }

    @Test
    public void testAddAluno(){
        // Arrange
        int id = 1;
        String nome = "Maria";
        Aluno aluno = new Aluno(id, nome, "Souza", "02/02/2001", "0987654321", "Rua B");
        List<Aluno> listAluno = new ArrayList<>();
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", listAluno, null);

        // Act
        turma.addAluno(aluno);

        // Assert
        assertEquals(id, turma.getAlunos().get(0).getId(), "ID não corresponde");
    }

    @Test
    public void testAddProfessor(){
        // Arrange
        int id = 1;
        String nome = "Maria";
        Professor professor = new Professor(id, nome, "Souza", "02/02/2001", "0987654321", "Rua B");
        List<Professor> listProfessor = new ArrayList<>();
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", null, null);

        // Act
        turma.addProfessor(professor);

        // Assert
        assertEquals(id, turma.getProfessores().get(0).getId(), "ID não corresponde");
    }

    // @Test
    // public void testGetProfessores(){
    //     // Arrange
    //     int id = 1;
    //     String nome = "Maria";
    //     Professor professor = new Professor(id, nome, "Souza", "02/02/2001", "0987654321", "Rua B");
    //     List<Professor> listProfessor = new ArrayList<>();
    //     listProfessor.add(professor);
    //     Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", null, null);

    //     // Act
    //     turma.setProfessores((LinkedList<Professor>) listProfessor);

    //     // Assert
    //     assertEquals(id, turma.getProfessores().get(0).getId(), "ID não corresponde");
    // }

    // @Test
    // public void testSetProfessor(){
    //     // Arrange
    //     int id = 1;
    //     String nome = "Maria";
    //     Professor professor = new Professor(id, nome, "Souza", "02/02/2001", "0987654321", "Rua B");
    //     List<Professor> listProfessor = new ArrayList<>();
    //     listProfessor.add(professor);
    //     Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", null, null);

    //     // Act
    //     turma.setProfessores((LinkedList<Professor>) listProfessor);

    //     // Assert
    //     assertEquals(id, turma.getProfessores().get(0).getId(), "ID não corresponde");
    // }

    // @Test
    // public void testSetAlunos(){
    //     // Arrange
    //     int id = 1;
    //     String nome = "Maria";
    //     Aluno aluno = new Aluno(id, nome, "Souza", "02/02/2001", "0987654321", "Rua B");
    //     List<Aluno> listAluno = new ArrayList<>();
    //     listAluno.add(aluno);
    //     Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", listAluno, null);

    //     // Act
    //     turma.setAlunos((LinkedList<Aluno>) listAluno);

    //     // Assert
    //     assertEquals(id, turma.getAlunos().get(0).getId(), "ID não corresponde");

    // }

    @Test
    public void testGetNome(){
        // Arrange
        String nome = "ec11";
        Turma turma = new Turma(nome, "ec11-001", "02/02/2021", "02/02/2022", null, null);

        // Act
        String result = turma.getNome();

        // Assert
        assertEquals(nome, result, "Nome não corresponde");
    }

    // @Test
    // public void testGetCurso(){
    //     // Arrange
    //     String curso = "ec11-001";
    //     Turma turma = new Turma("ec11", curso, "02/02/2021", "02/02/2022", null, null);

    //     // Act
    //     String result = turma.getCurso();

    //     // Assert
    //     assertEquals(curso, result, "Curso não corresponde");
    // }

    @Test
    public void testSetCodigo(){
        // Arrange
        String codigo = "ec11-001";
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", null, null);

        // Act
        turma.setCodigo(codigo);

        // Assert
        assertEquals(codigo, turma.getCodigo(), "Código não corresponde");
    }

    @Test
    public void testGetDataInicio(){
        // Arrange
        String dataInicio = "02/02/2021";
        Turma turma = new Turma("ec11", "ec11-001", dataInicio, "02/02/2022", null, null);

        // Act
        String result = turma.getDataInicio();

        // Assert
        assertEquals(dataInicio, result, "Data de início não corresponde");
    }

    @Test
    public void testGetDataFim(){
        // Arrange
        String dataFim = "02/02/2022";
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", dataFim, null, null);

        // Act
        String result = turma.getDataFim();

        // Assert
        assertEquals(dataFim, result, "Data de fim não corresponde");
    }

    @Test
    public void testGetId(){
        // Arrange
        int id = 1;
        Turma turma = new Turma(id ,"ec11", null, null);

        // Act
        int result = turma.getId();

        // Assert
        assertEquals(id, result, "ID não corresponde");
    }

}
