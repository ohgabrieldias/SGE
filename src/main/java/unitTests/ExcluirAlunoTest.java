package unitTests;
import java.util.logging.Logger;
import java.util.logging.Level;

import baseCoding.Aluno;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class ExcluirAlunoTest {
    private static final Logger logger = Logger.getLogger(ExcluirAlunoTest.class.getName());

    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("application.log");
            fileHandler.setLevel(Level.ALL); // Define o nível de log desejado
            fileHandler.setFormatter(new SimpleFormatter());
            
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Aluno aluno = new Aluno("Maria", "Silva", "2023-12-15", "98765432109", "Av n sei onde", "paps", "12345678910", 2021002);
        // Insert the student into the database for testing
        aluno.cadastrarAluno(aluno);


        // Delete the student from the database
        aluno.excluirAluno(aluno.getMatricula());

        // Try to search for the deleted student in the database
        Aluno alunoEncontrado = aluno.buscarAluno(aluno.getMatricula());

        // Verify if the student was not found
        if (alunoEncontrado == null) {
            logger.info("Aluno excluído com sucesso.");
        } else {
            logger.info("Falha ao excluir aluno.");
        }
    }
}
