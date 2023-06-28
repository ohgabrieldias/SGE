/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitTests;

import baseCoding.Funcionario;

/**
 *
 * @author gabriel
 */
import java.text.SimpleDateFormat;

public class TesteInsercaoFuncionarios {

    public static void main(String[] args) {
        // Criação dos objetos Funcionario
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Funcionario funcionario1 = new Funcionario("João", "Silva", "1990-01-01", "11111111111", "Rua A");
        funcionario1.setSetor("Vendas");
        funcionario1.setCargo("Vendedor");
        funcionario1.setSalario(2000.0f);

        Funcionario funcionario2 = new Funcionario("Maria", "Santos","1991-02-02", "22222222222", "Rua B");
        funcionario2.setSetor("Financeiro");
        funcionario2.setCargo("Contadora");
        funcionario2.setSalario(3000.0f);

        Funcionario funcionario3 = new Funcionario("Pedro", "Souza", "1992-03-03", "33333333333", "Rua C");
        funcionario3.setSetor("RH");
        funcionario3.setCargo("Recursos Humanos");
        funcionario3.setSalario(2500.0f);

        Funcionario funcionario4 = new Funcionario("Ana", "Lima", "1993-04-04", "44444444444", "Rua D");
        funcionario4.setSetor("Produção");
        funcionario4.setCargo("Operadora de Máquina");
        funcionario4.setSalario(2200.0f);

        Funcionario funcionario5 = new Funcionario("Luiz", "Gomes", "1994-05-05", "55555555555", "Rua E");
        funcionario5.setSetor("TI");
        funcionario5.setCargo("Desenvolvedor");
        funcionario5.setSalario(4000.0f);

        // Inserção dos funcionários
        Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3, funcionario4, funcionario5};

        for (Funcionario funcionario : funcionarios) {
            boolean inserido = funcionario.cadastrarFuncionario(funcionario);
            if (inserido) {
                System.out.println("Funcionário inserido com sucesso: " + funcionario.getNome() + " " + funcionario.getSobrenome());
            } else {
                System.out.println("Falha ao inserir funcionário: " + funcionario.getNome() + " " + funcionario.getSobrenome());
            }
        }
    }
}
