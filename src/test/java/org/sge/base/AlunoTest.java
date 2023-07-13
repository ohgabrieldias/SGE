package org.sge.base;

import org.sge.base.Aluno;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {

    @Test
    public void testGetMatricula() {
        long matricula = 123456789;
        Aluno aluno = new Aluno("João", "Silva", "01/01/2000", "1234567890", "Rua A", "Responsável", "9876543210", matricula);
        long result = aluno.getMatricula();
        assertEquals(matricula, result, "Matrícula não corresponde");
    }

    @Test
    public void testGetId() {
        int id = 1;
        Aluno aluno = new Aluno(id, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B");
        int result = aluno.getId();
        assertEquals(id, result, "ID não corresponde");
    }

    @Test
    public void testGetEnd() {
        String endereco = "Rua C";
        Aluno aluno = new Aluno(2, "Carlos", "Santos", "03/03/2002", "9876543210", endereco);
        String result = aluno.getEnd();
        assertEquals(endereco, result, "Endereço não corresponde");
    }

    // Outros métodos de teste...

}

