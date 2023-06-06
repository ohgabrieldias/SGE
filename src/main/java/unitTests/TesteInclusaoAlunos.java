/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitTests;

import baseCoding.Aluno;

/**
 *
 * @author gabriel
 */
public class TesteInclusaoAlunos {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "123456789", "Rua A", 123456789);
        aluno1.cadastrarAluno("João", "123456789", "Rua A", 123456789);

        Aluno aluno2 = new Aluno("João", "123456789", "Rua A", 123456789);
        aluno2.cadastrarAluno("Maria", "987654321", "Rua B", 987654321);
    }
}
