package baseCoding;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {
    @Test

    public void testGetId() {
        // Arrange
        int id = 1;
        Professor professor = new Professor(id, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B");

        // Act
        int result = professor.getId();

        // Assert
        assertEquals(id, result, "ID não corresponde");
    }

    @Test

    public void testeGetCodigoProfessor(){
        // Arrange
        int codigoProfessor = 1;
        Professor professor = new Professor("João", "Silva", "01/01/2000", "1234567890", "Rua A");

        // Act
        int result = professor.getCodigoProfessor();

        // Assert
        assertEquals(codigoProfessor, result, "Código do professor não corresponde");
    }
    
}
