package unitTests;

import baseCoding.Aluno;

public class ExcluirAlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", "Silva", "2023-12-15", "98765432109", "Av n sei onde", "paps", "12345678910", 2021002);
        // Insert the student into the database for testing
        aluno.cadastrarAluno(aluno);


        // Delete the student from the database
        aluno.excluirAluno(aluno.getMatricula());

        // Try to search for the deleted student in the database
        Aluno alunoEncontrado = aluno.buscarAluno(aluno.getMatricula());

        // Verify if the student was not found
        if (alunoEncontrado == null) {
            System.out.println("Aluno excluído com sucesso.");
        } else {
            System.out.println("Falha ao excluir aluno.");
        }
    }
}
