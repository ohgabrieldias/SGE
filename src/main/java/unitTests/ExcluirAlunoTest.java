package unitTests;

import baseCoding.Aluno;

public class ExcluirAlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "123456789", "Rua A", 123456789);

        // Insert the student into the database for testing
        aluno.cadastrarAluno(aluno.getNome(), aluno.getEnd(), aluno.getCpf(), aluno.getMatricula());

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
