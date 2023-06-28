/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */

public class Validator {
    public static boolean validarNome(String nome) {
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inválido");
            return false;
        }
        
        // Adicione outras validações específicas para o nome, se necessário
        
        return true;
    }
    
    public static boolean validarSobrenome(String sobrenome) {
        if (sobrenome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Sobrenome inválido");
            return false;
        }
        
        // Adicione outras validações específicas para o sobrenome, se necessário
        
        return true;
    }
    
    public static boolean validarDataNascimento(String dataNascimento) {
        if (dataNascimento.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Data de nascimento inválida");
            return false;
        }
        
        // Adicione outras validações específicas para a data de nascimento, se necessário
        
        return true;
    }
    
    public static boolean validarCPF(String cpf) {
        // Remova caracteres especiais do CPF (pontos e traço)
        cpf = cpf.replaceAll("[^0-9]", "");
        
        if (cpf.length() != 11) {
            JOptionPane.showMessageDialog(null, "CPF inválido");
            return false;
        }
        
        if (cpf.matches("(\\d)\\1{10}")) {
            JOptionPane.showMessageDialog(null, "CPF inválido");
            return false;
        }
        
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }
        
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 > 9) {
            digito2 = 0;
        }
        
        if (digito1 != (cpf.charAt(9) - '0') || digito2 != (cpf.charAt(10) - '0')) {
            JOptionPane.showMessageDialog(null, "CPF inválido3");
            return false;
        }
        
        return true;
    }
}

