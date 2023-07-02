package baseCoding;

import java.io.IOException;
import sge.MySQLConnector;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Aluno extends Pessoa {
    private long matricula;
    private String responsavel;
    private String cpfresp;
    private static final Logger logger = Logger.getLogger(Aluno.class.getName());


    MySQLConnector connector = new MySQLConnector();

    public Aluno(String nome, String sobrenome, String dataNasc, String cpf, String end, String resp, String cpfresp, long matricula) {
        super(nome, sobrenome, dataNasc, cpf, end);
        this.matricula = matricula;
        this.responsavel = resp;
        this.cpfresp = cpfresp;
    }
    
    public Aluno(String nome, String cpf) {
        super(nome,cpf);
    }
    // Getters and setters for the 'matricula' attribute

    public long getMatricula() {
        return matricula;
    }

    public String getEnd() {
        return super.getEndereco();
    }
    
    public String getResponsavel() {
        return responsavel;
    }
    
    public String getCpfResp() {
        return cpfresp;
    }
    
    public Aluno buscarAluno(long matricula) {
        Aluno tmpAluno = null;
    
        String query = "SELECT * FROM alunos WHERE matricula = ?";
    
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setLong(1, matricula);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String sobrenome = rs.getString("sobrenome");
                    String dataNasc = rs.getString("datanasc");
                    String cpf = rs.getString("cpf");
                    String endereco = rs.getString("endereco");
                    String tmpCpfResp = rs.getString("cpfresp");
                    String tmpResp = rs.getString("resp");
                    tmpAluno = new Aluno(nome, sobrenome, dataNasc, cpf, endereco, tmpResp, tmpCpfResp, matricula);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return tmpAluno;
    }        
    
    public void excluirAluno(long matricula) {
        try {
            FileHandler fileHandler = new FileHandler("excliur.log");
            fileHandler.setLevel(Level.ALL); // Define o nível de log desejado
            fileHandler.setFormatter(new SimpleFormatter());
            
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        logger.log(Level.INFO, "Aluno com matrícula {0} excluído com sucesso.", matricula);
        String query = "DELETE FROM alunos WHERE matricula = ?";
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setLong(1, matricula);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public boolean cadastrarAluno(Aluno aluno) {
        // Insert data into the "alunos" table
        String query = "INSERT INTO alunos (nome, sobrenome, datanasc, cpf, endereco, cpfresp, responsavel, matricula) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getSobrenome());
            stmt.setString(3, aluno.getDataNasc());
            stmt.setString(4, aluno.getCpf());
            stmt.setString(5, aluno.getEnd());
            stmt.setString(6, aluno.getCpfResp());
            stmt.setString(7, aluno.getResponsavel());
            stmt.setLong(8, aluno.getMatricula());
            stmt.executeUpdate();
            logger.info("Student data inserted successfully into the 'alunos' table.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return true;
    }
    
    
    
    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("application.log");
            fileHandler.setLevel(Level.ALL); // Define o nível de log desejado
            fileHandler.setFormatter(new SimpleFormatter());
            
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Aluno aluno = new Aluno("Maria", "Silva", "2023-12-15", "98765432109", "Av n sei onde", "paps", "12345678910", 2021002);
        aluno.cadastrarAluno(aluno);
        aluno.excluirAluno(2021002);
    }
    
}