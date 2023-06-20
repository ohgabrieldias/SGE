/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrationTests;

import baseCoding.Aluno;
/**
 *
 * @author gabriel
 */
public class AlunoIntegrationTest {
    public static void main(String[] args) {
        // Create a test student
        Aluno aluno = new Aluno("Maria", "Silva", "2023-12-15", "98765432109", "Av n sei onde", "paps", "12345678910", 2021002);
        // Insert the student into the database for testing
        

        // Test the registration and search functionality
        testCadastrarAluno(aluno);
        testBuscarAluno(aluno);

        // Test the deletion functionality
        testExcluirAluno(aluno);
    }

    public static void testCadastrarAluno(Aluno aluno) {
        // Register the student in the database
        aluno.cadastrarAluno(aluno);
        System.out.println("Aluno cadastrado com sucesso.");
    }

    public static void testBuscarAluno(Aluno aluno) {
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

    public static void testExcluirAluno(Aluno aluno) {
        // Delete the student from the database
        aluno.excluirAluno(aluno.getMatricula());
        System.out.println("Aluno excluído com sucesso.");
    }
}
