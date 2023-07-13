/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitTests;

import DAO.FuncionarioDAO;
import baseCoding.Funcionario;

/**
 *
 * @author gabriel
 */
public class TesteInsercaoFuncionarios {
    public static void main(String[] args) {
        FuncionarioDAO funcionarioDao = new FuncionarioDAO();

        // Inserir 10 funcionários
        for (int i = 1; i <= 10; i++) {
            String nome = "Funcionario " + i;
            String sobrenome = "Sobrenome " + i;
            String dataNasc = "1990-01-01";
            String cpf = "123456789" + i;
            String endereco = "Endereço " + i;
            String username = nome.toLowerCase().replace(" ", "") + "." + sobrenome.toLowerCase().replace(" ", "");
            String password = "password" + i;

            Funcionario funcionario = new Funcionario(nome, sobrenome, dataNasc, cpf, endereco, username, password);
            boolean sucesso = funcionarioDao.cadastrarFuncionario(funcionario);

            if (sucesso) {
                System.out.println("Funcionário " + i + " cadastrado com sucesso.");
            } else {
                System.out.println("Falha ao cadastrar funcionário " + i + ".");
            }
        }
    }
}
