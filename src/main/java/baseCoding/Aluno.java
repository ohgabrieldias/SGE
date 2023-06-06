package baseCoding;

import sge.MySQLConnector;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Aluno extends Pessoa {
    private long matricula;
    MySQLConnector connector = new MySQLConnector();

    public Aluno(String nome, String cpf, String end, long matricula) {
        super(nome, cpf, end);
        this.matricula = matricula;
    }


    // Getters and setters for the 'matricula' attribute

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    // Métodos getters e setters para os atributos nome, cpf e end

    public String getNome() {
        return super.getNome();
    }


    public String getCpf() {
        return super.getCpf();
    }

 

    public String getEnd() {
        return super.getEndereco();
    }

    public void cadastrarAluno(String nome, String endereco, String cpf, long matricula) {
        // Inserir dados na tabela "users"
        String query = "INSERT INTO users2 (nome, endereco, cpf, matricula) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setString(1, nome);
            stmt.setString(2, endereco);
            stmt.setString(3, cpf);
            stmt.setLong(4, matricula);
            stmt.executeUpdate();
            System.out.println("Dados do aluno inseridos com sucesso na tabela 'users'.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public static void main(String[] args) {
        // Aluno aluno = new Aluno("João", "123456789", "Rua A", 123456789);
        // System.out.println("Nome: " + aluno.getNome());
        // System.out.println("CPF: " + aluno.getCpf());
        // System.out.println("Endereço: " + aluno.getEnd());
        // System.out.println("Matrícula: " + aluno.getMatricula());
    
        
        Aluno aluno = new Aluno("João", "123456789", "Rua A", 123456789);
        aluno.cadastrarAluno("João", "123456789", "Rua A", 123456789);
    }
    
}