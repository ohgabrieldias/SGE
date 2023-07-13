package baseCoding;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DisciplinaTest {

    @Test
    public void testGetNome(){
        // Arrange
        String nome = "Matematica";
        Disciplina disciplina = new Disciplina(1, nome, "02/02/2001", "02/02/2002", "Maria");

        // Act
        String result = disciplina.getNome();

        // Assert
        assertEquals(nome, result, "Nome não corresponde");
    }

    @Test
    public void testGetId(){
        // Arrange
        int id = 1;
        Disciplina disciplina = new Disciplina(id, "Matematica", "02/02/2001", "02/02/2002", "Maria");

        // Act
        int result = disciplina.getId();

        // Assert
        assertEquals(id, result, "ID não corresponde");
    }

    @Test
    public void testGetNomeProfessor(){
        // Arrange
        String nomeProfessor = "Maria";
        Disciplina disciplina = new Disciplina(1, "Matematica", "02/02/2001", "02/02/2002", nomeProfessor);

        // Act
        String result = disciplina.getNomeProfessor();

        // Assert
        assertEquals(nomeProfessor, result, "Nome do professor não corresponde");
    }

    @Test
    public void testGetDataInicio(){
        // Arrange
        String dataInicio = "02/02/2001";
        Disciplina disciplina = new Disciplina(1, "Matematica", dataInicio, "02/02/2002", "Maria");

        // Act
        String result = disciplina.getDataInicio();

        // Assert
        assertEquals(dataInicio, result, "Data de inicio não corresponde");
    }

    @Test
    public void testGetDataFim(){
        // Arrange
        String dataFim = "02/02/2002";
        Disciplina disciplina = new Disciplina(1, "Matematica", "02/02/2001", dataFim, "Maria");

        // Act
        String result = disciplina.getDataFim();

        // Assert
        assertEquals(dataFim, result, "Data de fim não corresponde");
    }
}
