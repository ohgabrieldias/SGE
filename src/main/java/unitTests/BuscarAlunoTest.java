package unitTests;

import baseCoding.Aluno;

public class BuscarAlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", "Silva", "19/06/2023", "98765432109", "Av n sei onde", "paps", "12345678910", 2021002);
        // Insert the student into the database for testing
        aluno.cadastrarAluno(aluno);
        // Search for the student in the database
        Aluno alunoEncontrado = aluno.buscarAluno(aluno.getMatricula());

        // Verify if the student was found
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado:");
            System.out.println("Nome: " + alunoEncontrado.getNome());
            System.out.println("CPF: " + alunoEncontrado.getCpf());
            System.out.println("Endereço: " + alunoEncontrado.getEnd());
            System.out.println("Matrícula: " + alunoEncontrado.getMatricula());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}