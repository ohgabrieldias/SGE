package org.sge.base;

import org.sge.base.Professor;
import org.sge.base.Aluno;
import org.sge.base.Turma;
import org.sge.base.Disciplina;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TurmaTest {
    @Test
    public void testGetListaIdAlunos(){
        int id = 1;
        String nome = "Maria";
        Aluno aluno = new Aluno(id, nome, "Souza", "02/02/2001", "0987654321", "Rua B");
        List<Aluno> listAluno = new ArrayList<>();
        listAluno.add(aluno);
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", listAluno, null);
        List<Integer> result = turma.getListaIdAlunos();
        assertEquals(id, result.get(0), "ID não corresponde");
    }

    @Test
    public void testGetListaIdsDisciplinas(){
        int id = 1;
        String nome = "Maria";
        Disciplina disciplina = new Disciplina(id, nome, "10/08/2000", "02/02/2001", "matheus");
        List<Disciplina> listDiscip = new ArrayList<>();
        listDiscip.add(disciplina);
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", null, listDiscip);
        List<Integer> result = turma.getListaIdsDisciplinas();
        assertEquals(id, result.get(0), "ID não corresponde");
    }

    @Test
    public void testAddAluno(){
        int id = 1;
        String nome = "Maria";
        Aluno aluno = new Aluno(id, nome, "Souza", "02/02/2001", "0987654321", "Rua B");
        List<Aluno> listAluno = new ArrayList<>();
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", listAluno, null);
        turma.addAluno(aluno);
        assertEquals(id, turma.getAlunos().get(0).getId(), "ID não corresponde");
    }

    @Test
    public void testAddProfessor(){
        int id = 1;
        String nome = "Maria";
        Professor professor = new Professor(id, nome, "Souza", "02/02/2001", "0987654321", "Rua B");
        List<Professor> listProfessor = new ArrayList<>();
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", null, null);
        turma.addProfessor(professor);
        assertEquals(id, turma.getProfessores().get(0).getId(), "ID não corresponde");
    }

    @Test
    public void testGetProfessores(){
        int id = 1;
        String nome = "Maria";
        Professor professor = new Professor(id, nome, "Souza", "02/02/2001", "0987654321", "Rua B");
        List<Professor> listProfessor = new ArrayList<>();
        listProfessor.add(professor);
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", null, null);
        turma.setProfessores(listProfessor);
        assertEquals(id, turma.getProfessores().get(0).getId(), "ID não corresponde");
    }

    @Test
    public void testSetProfessor(){
        int id = 1;
        String nome = "Maria";
        Professor professor = new Professor(id, nome, "Souza", "02/02/2001", "0987654321", "Rua B");
        List<Professor> listProfessor = new ArrayList<>();
        listProfessor.add(professor);
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", null, null);
        turma.setProfessores(listProfessor);
        assertEquals(id, turma.getProfessores().get(0).getId(), "ID não corresponde");
    }

    @Test
    public void testSetAlunos(){
        int id = 1;
        String nome = "Maria";
        Aluno aluno = new Aluno(id, nome, "Souza", "02/02/2001", "0987654321", "Rua B");
        List<Aluno> listAluno = new ArrayList<>();
        listAluno.add(aluno);
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", listAluno, null);
        turma.setAlunos(listAluno);
        assertEquals(id, turma.getAlunos().get(0).getId(), "ID não corresponde");

    }

    @Test
    public void testGetNome(){
        String nome = "ec11";
        Turma turma = new Turma(nome, "ec11-001", "02/02/2021", "02/02/2022", null, null);
        String result = turma.getNome();
        assertEquals(nome, result, "Nome não corresponde");
    }

    // @Test
    // public void testGetCurso(){
    //     String curso = "ec11-001";
    //     Turma turma = new Turma("ec11", curso, "02/02/2021", "02/02/2022", null, null);
    //     String result = turma.getCurso();
    //     assertEquals(curso, result, "Curso não corresponde");
    // }

    @Test
    public void testSetCodigo(){
        String codigo = "ec11-001";
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", "02/02/2022", null, null);
        turma.setCodigo(codigo);
        assertEquals(codigo, turma.getCodigo(), "Código não corresponde");
    }

    @Test
    public void testGetDataInicio(){
        String dataInicio = "02/02/2021";
        Turma turma = new Turma("ec11", "ec11-001", dataInicio, "02/02/2022", null, null);
        String result = turma.getDataInicio();
        assertEquals(dataInicio, result, "Data de início não corresponde");
    }

    @Test
    public void testGetDataFim(){
        String dataFim = "02/02/2022";
        Turma turma = new Turma("ec11", "ec11-001", "02/02/2021", dataFim, null, null);
        String result = turma.getDataFim();
        assertEquals(dataFim, result, "Data de fim não corresponde");
    }

    @Test
    public void testGetId(){
        int id = 1;
        Turma turma = new Turma(id ,"ec11", null, null);
        int result = turma.getId();
        assertEquals(id, result, "ID não corresponde");
    }
 }

