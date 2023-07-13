package unitTests;

import baseCoding.Aluno;

public class BuscarAlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", "Silva", "19/06/2023", "98765432109", "Av n sei onde", "paps", "12345678910", 2021002);
        // Insert the student into the database for testing
        cadastrarAluno(aluno);
        // Search for the student in the database
        Aluno alunoEncontrado = buscarAluno(aluno.getMatricula());

        // Verify if the student was found
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado:");
            System.out.println("Nome: " + alunoEncontrado.getNome());
            System.out.println("CPF: " + alunoEncontrado.getCpf());
            System.out.println("Endereço: " + alunoEncontrado.getEndereco());
            System.out.println("Matrícula: " + alunoEncontrado.getMatricula());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    private static void cadastrarAluno(Aluno aluno) {
        // Implement the logic to insert the student into the database
        System.out.println("Cadastrando aluno: " + aluno.getNome());
        // ...
    }

    private static Aluno buscarAluno(long matricula) {
        // Implement the logic to search for the student in the database
        System.out.println("Buscando aluno com matrícula: " + matricula);
        // ...
        return null; // Replace with the actual implementation
    }
}
