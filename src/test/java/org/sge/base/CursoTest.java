package org.sge.base;

import org.sge.base.Curso;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CursoTest {
    
    @Test
    public void testGetCurso() {
        String nome = "Curso";
        Curso curso = new Curso(nome);
        String result = curso.getCurso();
        assertEquals(nome, result, "Curso não corresponde");
    }
}

