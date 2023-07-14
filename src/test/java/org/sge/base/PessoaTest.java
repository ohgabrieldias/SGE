package org.sge.base;

import org.sge.base.Pessoa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {
    @Test
    public void testGetNome() {
        String nome = "Maria";
        Pessoa pessoa = new Pessoa(nome, "Souza", "02/02/2001", "0987654321", "Rua B");
        String result = pessoa.getNome();
        assertEquals(nome, result, "Nome não corresponde");
    }

    @Test
    public void testSetNome() {
        String nome = "Maria";
        Pessoa pessoa = new Pessoa(nome, "Souza", "02/02/2001", "0987654321", "Rua B");
        pessoa.setNome(nome);
        assertEquals(nome, pessoa.getNome(), "Nome não corresponde");
    }

    @Test
    public void testGetSobrenome() {
        String sobrenome = "Souza";
        Pessoa pessoa = new Pessoa("Maria", sobrenome, "02/02/2001", "0987654321", "Rua B");
        String result = pessoa.getSobrenome();
        assertEquals(sobrenome, result, "Sobrenome não corresponde");
    }

    @Test
    public void testSetSobrenome() {
        String sobrenome = "Souza";
        Pessoa pessoa = new Pessoa("Maria", sobrenome, "02/02/2001", "0987654321", "Rua B");
        pessoa.setSobrenome(sobrenome);
        assertEquals(sobrenome, pessoa.getSobrenome(), "Sobrenome não corresponde");
    }

    @Test
    public void testGetDataNasc() {
        String dataNasc = "02/02/2001";
        Pessoa pessoa = new Pessoa("Maria", "Souza", dataNasc, "0987654321", "Rua B");
        String result = pessoa.getDataNasc();
        assertEquals(dataNasc, result, "Data de nascimento não corresponde");
    }

    @Test
    public void testSetDataNasc() {
        String dataNasc = "02/02/2001";
        Pessoa pessoa = new Pessoa("Maria", "Souza", dataNasc, "0987654321", "Rua B");
        pessoa.setDataNasc(dataNasc);
        assertEquals(dataNasc, pessoa.getDataNasc(), "Data de nascimento não corresponde");
    }

    @Test
    public void testGetCpf() {
        String cpf = "0987654321";
        Pessoa pessoa = new Pessoa("Maria", "Souza", "02/02/2001", cpf, "Rua B");
        String result = pessoa.getCpf();
        assertEquals(cpf, result, "CPF não corresponde");
    }

    @Test
    public void testSetCpf() {
        String cpf = "0987654321";
        Pessoa pessoa = new Pessoa("Maria", "Souza", "02/02/2001", cpf, "Rua B");
        pessoa.setCpf(cpf);
        assertEquals(cpf, pessoa.getCpf(), "CPF não corresponde");
    }

    @Test
    public void testGetEndereco() {
        String endereco = "Rua B";
        Pessoa pessoa = new Pessoa("Maria", "Souza", "02/02/2001", "0987654321", endereco);
        String result = pessoa.getEndereco();
        assertEquals(endereco, result, "Endereço não corresponde");
    }

    @Test
    public void testSetEndereco() {
        String endereco = "Rua B";
        Pessoa pessoa = new Pessoa("Maria", "Souza", "02/02/2001", "0987654321", endereco);
        pessoa.setEndereco(endereco);
        assertEquals(endereco, pessoa.getEndereco(), "Endereço não corresponde");
    }

    @Test
    public void testPessoa() {
        String nome = "Maria";
        String sobrenome = "Souza";
        String dataNasc = "02/02/2001";
        String cpf = "0987654321";
        String endereco = "Rua B";
        Pessoa pessoa = new Pessoa(nome, sobrenome, dataNasc, cpf, endereco);
        String resultNome = pessoa.getNome();
        String resultSobrenome = pessoa.getSobrenome();
        String resultDataNasc = pessoa.getDataNasc();
        String resultCpf = pessoa.getCpf();
        String resultEndereco = pessoa.getEndereco();
        assertEquals(nome, resultNome, "Nome não corresponde");
        assertEquals(sobrenome, resultSobrenome, "Sobrenome não corresponde");
        assertEquals(dataNasc, resultDataNasc, "Data de nascimento não corresponde");
        assertEquals(cpf, resultCpf, "CPF não corresponde");
        assertEquals(endereco, resultEndereco, "Endereço não corresponde");
    }
}

