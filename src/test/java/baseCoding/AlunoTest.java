package baseCoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void testGetMatricula() {
        // Arrange
        long matricula = 123456789;
        Aluno aluno = new Aluno("João", "Silva", "01/01/2000", "1234567890", "Rua A", "Responsável", "9876543210", matricula);

        // Act
        long result = aluno.getMatricula();

        // Assert
        assertEquals(matricula, result, "Matrícula não corresponde");
    }

    @Test
    public void testGetId() {
        // Arrange
        int id = 1;
        Aluno aluno = new Aluno(id, "Maria", "Souza", "02/02/2001", "0987654321", "Rua B");

        // Act
        int result = aluno.getId();

        // Assert
        assertEquals(id, result, "ID não corresponde");
    }

    @Test
    public void testGetEnd() {
        // Arrange
        String endereco = "Rua C";
        Aluno aluno = new Aluno(2, "Carlos", "Santos", "03/03/2002", "9876543210", endereco);

        // Act
        String result = aluno.getEnd();

        // Assert
        assertEquals(endereco, result, "Endereço não corresponde");
    }

    // Outros métodos de teste...

}
