package org.sge.base;

import org.sge.base.Professor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfessorTest {

    @Test
    public void testGetId() {
        int id = 1;
        Professor professor = new Professor(id, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B");
        int result = professor.getId();
        assertEquals(id, result, "ID não corresponde");
    }
}

