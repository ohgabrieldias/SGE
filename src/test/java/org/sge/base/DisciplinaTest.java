package org.sge.base;

import org.sge.base.Disciplina;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisciplinaTest {

    @Test
    public void testGetNome() {
        String nome = "Matemática";
        Disciplina disciplina = new Disciplina(1, nome, "02/02/2001", "02/02/2002", "Maria");
        String result = disciplina.getNome();
        assertEquals(nome, result, "Nome não corresponde");
    }

    @Test
    public void testGetId() {
        int id = 1;
        Disciplina disciplina = new Disciplina(id, "Matemática", "02/02/2001", "02/02/2002", "Maria");
        int result = disciplina.getId();
        assertEquals(id, result, "ID não corresponde");
    }

    @Test
    public void testGetNomeProfessor() {
        String nomeProfessor = "Maria";
        Disciplina disciplina = new Disciplina(1, "Matemática", "02/02/2001", "02/02/2002", nomeProfessor);
        String result = disciplina.getNomeProfessor();
        assertEquals(nomeProfessor, result, "Nome do professor não corresponde");
    }

    @Test
    public void testGetDataInicio() {
        String dataInicio = "02/02/2001";
        Disciplina disciplina = new Disciplina(1, "Matemática", dataInicio, "02/02/2002", "Maria");
        String result = disciplina.getDataInicio();
        assertEquals(dataInicio, result, "Data de início não corresponde");
    }

    @Test
    public void testGetDataFim() {
        String dataFim = "02/02/2002";
        Disciplina disciplina = new Disciplina(1, "Matemática", "02/02/2001", dataFim, "Maria");
        String result = disciplina.getDataFim();
        assertEquals(dataFim, result, "Data de fim não corresponde");
    }
}
