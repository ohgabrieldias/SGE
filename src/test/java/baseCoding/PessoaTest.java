package baseCoding;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
    @Test
    public void testGetNome(){
        // Arrange
        String nome = "Maria";
        Pessoa pessoa = new Pessoa(nome, "Souza", "02/02/2001", "0987654321", "Rua B");

        // Act
        String result = pessoa.getNome();

        // Assert
        assertEquals(nome, result, "Nome não corresponde");
    }

    @Test
    public void testSetNome(){
        // Arrange
        String nome = "Maria";
        Pessoa pessoa = new Pessoa(nome, "Souza", "02/02/2001", "0987654321", "Rua B");

        // Act
        pessoa.setNome(nome);

        // Assert
        assertEquals(nome, pessoa.getNome(), "Nome não corresponde");
    }

    @Test
    public void testGetSobrenome(){
        // Arrange
        String sobrenome = "Souza";
        Pessoa pessoa = new Pessoa("Maria", sobrenome, "02/02/2001", "0987654321", "Rua B");

        // Act
        String result = pessoa.getSobrenome();

        // Assert
        assertEquals(sobrenome, result, "Sobrenome não corresponde");
    }

    @Test
    public void testSetSobrenome(){
        // Arrange
        String sobrenome = "Souza";
        Pessoa pessoa = new Pessoa("Maria", sobrenome, "02/02/2001", "0987654321", "Rua B");

        // Act
        pessoa.setSobrenome(sobrenome);

        // Assert
        assertEquals(sobrenome, pessoa.getSobrenome(), "Sobrenome não corresponde");
    }

    @Test
    public void testGetDataNasc(){
        // Arrange
        String dataNasc = "02/02/2001";
        Pessoa pessoa = new Pessoa("Maria", "Souza", dataNasc, "0987654321", "Rua B");

        // Act
        String result = pessoa.getDataNasc();

        // Assert
        assertEquals(dataNasc, result, "Data de nascimento não corresponde");
    }

    @Test
    public void testSetDataNasc(){
        // Arrange
        String dataNasc = "02/02/2001";
        Pessoa pessoa = new Pessoa("Maria", "Souza", dataNasc, "0987654321", "Rua B");

        // Act
        pessoa.setDataNasc(dataNasc);

        // Assert
        assertEquals(dataNasc, pessoa.getDataNasc(), "Data de nascimento não corresponde");
    }

    @Test
    public void testGetCpf(){
        // Arrange
        String cpf = "0987654321";
        Pessoa pessoa = new Pessoa("Maria", "Souza", "02/02/2001", cpf, "Rua B");

        // Act
        String result = pessoa.getCpf();

        // Assert
        assertEquals(cpf, result, "CPF não corresponde");
    }

    @Test
    public void testSetCpf(){
        // Arrange
        String cpf = "0987654321";
        Pessoa pessoa = new Pessoa("Maria", "Souza", "02/02/2001", cpf, "Rua B");

        // Act
        pessoa.setCpf(cpf);

        // Assert
        assertEquals(cpf, pessoa.getCpf(), "CPF não corresponde");
    }

    @Test
    public void testGetEndereco(){
        // Arrange
        String endereco = "Rua B";
        Pessoa pessoa = new Pessoa("Maria", "Souza", "02/02/2001", "0987654321", endereco);

        // Act
        String result = pessoa.getEndereco();

        // Assert
        assertEquals(endereco, result, "Endereço não corresponde");
    }

    @Test
    public void testSetEndereco(){
        // Arrange
        String endereco = "Rua B";
        Pessoa pessoa = new Pessoa("Maria", "Souza", "02/02/2001", "0987654321", endereco);

        // Act
        pessoa.setEndereco(endereco);

        // Assert
        assertEquals(endereco, pessoa.getEndereco(), "Endereço não corresponde");
    }

    @Test
    public void testPessoa(){
        // Arrange
        String nome = "Maria";
        String sobrenome = "Souza";
        String dataNasc = "02/02/2001";
        String cpf = "0987654321";
        String endereco = "Rua B";
        Pessoa pessoa = new Pessoa(nome, sobrenome, dataNasc, cpf, endereco);

        // Act
        String resultNome = pessoa.getNome();
        String resultSobrenome = pessoa.getSobrenome();
        String resultDataNasc = pessoa.getDataNasc();
        String resultCpf = pessoa.getCpf();
        String resultEndereco = pessoa.getEndereco();

        // Assert
        assertEquals(nome, resultNome, "Nome não corresponde");
        assertEquals(sobrenome, resultSobrenome, "Sobrenome não corresponde");
        assertEquals(dataNasc, resultDataNasc, "Data de nascimento não corresponde");
        assertEquals(cpf, resultCpf, "CPF não corresponde");
        assertEquals(endereco, resultEndereco, "Endereço não corresponde");
    }
}
