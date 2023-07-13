package org.sge.base;

import org.sge.base.Curso;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {
    
    @Test
    public void testGetCurso() {
        // Arrange
        String nome = "Curso";
        Curso curso = new Curso(nome);

        // Act
        String result = curso.getCurso();

        // Assert
        assertEquals(nome, result, "Curso não corresponde");
    }

}
