/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitTests;
import baseCoding.Aluno;
import util.Formater;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author gabriel
 */


public class TesteInserirAlunos {
    public static void main(String[] args) {
        // Array com os dados dos alunos
        String[][] dadosAlunos = {
            {"João", "Silva", "01/01/2000", "12345678901", "Endereço 1", "Responsável 1", "98765432101"},
            {"Maria", "Santos", "02/02/2001", "98765432109", "Endereço 2", "Responsável 2", "12345678909"},
            {"Pedro", "Ferreira", "03/03/2002", "45678912309", "Endereço 3", "Responsável 3", "65432198709"},
            {"Ana", "Oliveira", "04/04/2003", "78912345609", "Endereço 4", "Responsável 4", "32165498709"},
            {"Carlos", "Ribeiro", "05/05/2004", "98712365409", "Endereço 5", "Responsável 5", "78965432109"},
            {"Mariana", "Gomes", "06/06/2005", "32145698709", "Endereço 6", "Responsável 6", "45698712309"},
            {"Rafael", "Almeida", "07/07/2006", "65478932109", "Endereço 7", "Responsável 7", "98732165409"},
            {"Fernanda", "Sousa", "08/08/2007", "78965412309", "Endereço 8", "Responsável 8", "12378945609"},
            {"Gabriel", "Cavalcanti", "09/09/2008", "98732145609", "Endereço 9", "Responsável 9", "65412378909"},
            {"Lucas", "Lima", "10/10/2009", "32178965409", "Endereço 10", "Responsável 10", "78945612309"}
        };
        
        // Loop para inserir os alunos
        for (String[] alunoData : dadosAlunos) {
            String nome = alunoData[0];
            String sobrenome = alunoData[1];
            String dataString = alunoData[2];
            String cpf = alunoData[3];
            String endereco = alunoData[4];
            String responsavel = alunoData[5];
            String cpfResponsavel = alunoData[6];
            
            try {
                String dataFormatada = Formater.formatarData("kjkk");
                
                // Generate a random 10-digit student ID
                Random random = new Random();
                long matricula = 1_000_000_000L + random.nextInt(9_000_000);                
                // Inserir aluno no banco de dados usando a data formatada corretamente
                Aluno aluno = new Aluno(nome, sobrenome, dataFormatada, cpf, endereco, responsavel, cpfResponsavel, matricula);
                aluno.cadastrarAluno(aluno);
                
                System.out.println("Aluno cadastrado com sucesso: " + nome + " " + sobrenome);
            } catch (ParseException e) {
                System.out.println("Erro ao cadastrar aluno: " + nome + " " + sobrenome);
            }
        }
    }
}


