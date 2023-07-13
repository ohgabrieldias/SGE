package integrationTests;

import DAO.AlunoDAO;
import baseCoding.Aluno;

public class AlunoIntegrationTest {
    
    
    public static void main(String[] args) {
        // Create a test student
        Aluno aluno = new Aluno("Maria", "Silva", "2023-12-15", "98765432109", "Av n sei onde", "paps", "12345678910",
                2021002);
        // Insert the student into the database for testing

        // Test the registration and search functionality
        testCadastrarAluno(aluno);
        testBuscarAluno(aluno);

        // Test the deletion functionality
        testExcluirAluno(aluno);
    }

    public static void testCadastrarAluno(Aluno aluno) {
        AlunoDAO alunoDao = new AlunoDAO();
        // Register the student in the database
        alunoDao.cadastrarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso.");
    }

    public static void testBuscarAluno(Aluno aluno) {
        AlunoDAO alunoDao = new AlunoDAO();
        // Search for the student in the database
        Aluno alunoEncontrado = alunoDao.buscarAluno(aluno.getMatricula());

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

    public static void testExcluirAluno(Aluno aluno) {
        AlunoDAO alunoDao = new AlunoDAO();
        // Delete the student from the database
        alunoDao.excluirAluno(aluno.getMatricula());
        System.out.println("Aluno excluído com sucesso.");
    }
}
