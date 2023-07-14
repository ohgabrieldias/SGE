package org.sge.dao;

import org.sge.base.Aluno;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlunoDAO implements DaoInterface {
    private Connection connection;
    private Logger logger = LoggerFactory.getLogger(AlunoDAO.class);
    private static final String SOBRENOME = "sobrenome";
    private static final String DATANASC = "datanasc";
    private static final String ENDERECO = "endereco";

    public AlunoDAO(Connection connection) {
        this.connection = connection;
    }

    public void recreateConnection() {
        MySQLConnector connector = new MySQLConnector();
        connection = connector.getConnection();
    }

    public Aluno buscarAluno(long matricula) {
        Aluno tmpAluno = null;

        String query = "SELECT * FROM alunos WHERE matricula = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setLong(1, matricula);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String sobrenome = rs.getString(SOBRENOME);
                    String dataNasc = rs.getString(DATANASC);
                    String cpf = rs.getString("cpf");
                    String endereco = rs.getString(ENDERECO);
                    String tmpCpfResp = rs.getString("cpfresp");
                    String tmpResp = rs.getString("responsavel");
                    tmpAluno = new Aluno(nome, sobrenome, dataNasc, cpf, endereco, tmpResp, tmpCpfResp, matricula);
                }
            }
        } catch (SQLException e) {
            logger.error("Erro ao buscar aluno: {}" + e.getMessage(), e);
        }

        return tmpAluno;
    }       
    
    
    public void excluirAluno(long matricula) {
        try {
            FileHandler fileHandler = new FileHandler("excliur.log");
            fileHandler.setLevel(Level.ALL); // Define o nível de log desejado
            fileHandler.setFormatter(new SimpleFormatter());
            
        } catch (IOException e) {
            logger.error("Erro ao criar arquivo de log: {}" + e.getMessage(), e);
        }
        
        logger.info("Aluno com matrícula {} excluído com sucesso.", matricula);
        String query = "DELETE FROM alunos WHERE matricula = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setLong(1, matricula);
            stmt.executeUpdate();
        } catch (SQLException e) {
            logger.error("Erro ao excluir aluno: {}" + e.getMessage(), e);
        }
    }

    
    public boolean cadastrarAluno(Aluno aluno) {
        // Insert data into the "alunos" table
        String query = "INSERT INTO alunos (nome, sobrenome, datanasc, cpf, endereco, cpfresp, responsavel, matricula) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
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
            logger.error("Error inserting student data into the 'alunos' table: {}" + e.getMessage(), e);
        }
        return true;
    }
    
    public List<Aluno> buscarListaAluno() {
        List<Aluno> listaAlunos = new ArrayList<>();

        String query = "SELECT id,nome, cpf FROM alunos";

        try (PreparedStatement stmt = connection.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");

                Aluno tmpAluno = new Aluno(id, nome, cpf);
                listaAlunos.add(tmpAluno);
            }
        } catch (SQLException e) {
            logger.error("Erro ao buscar lista de alunos: {}" + e.getMessage(), e);
        }

        return listaAlunos;
    }

    // Criar um metodo pra conseguir modificar dados do aluno
    public void alterarAluno(Aluno aluno) {
        String query = "UPDATE alunos SET nome = ?, sobrenome = ?, datanasc = ?, cpf = ?, endereco = ? WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getSobrenome());
            stmt.setString(3, aluno.getDataNasc());
            stmt.setString(4, aluno.getCpf());
            stmt.setString(5, aluno.getEndereco());
            stmt.setLong(6, aluno.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            logger.error("Erro ao buscar aluno: {}" + e.getMessage(), e);
        }
    }

    public Aluno buscarPorId(int id) {
        String query = "SELECT * FROM alunos WHERE id = ?";
        if (connection == null) recreateConnection();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String sobrenome = rs.getString(SOBRENOME);
                    String dataNasc = rs.getString(DATANASC);
                    String cpf = rs.getString("cpf");
                    String endereco = rs.getString(ENDERECO);
                    return new Aluno(id, nome, sobrenome, dataNasc, cpf, endereco);
                }
            }
        } catch (SQLException e) {
            logger.error("Erro ao buscar aluno por ID: {}" + e.getMessage(), e);

        }

        return null; // Retorna null se nenhum aluno for encontrado com o ID especificado
    }

    public List<String> buscarNomesAlunos() {
        List<String> nomesAlunos = new ArrayList<>();

        String query = "SELECT nome, cpf FROM alunos";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            try (ResultSet resultSet = stmt.executeQuery()) {

                while (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    String cpf = resultSet.getString("cpf");
                    String nomeCpf = nome + " - CPF: {}" + cpf;
                    nomesAlunos.add(nomeCpf);
                }
            }
        } catch (SQLException e) {
            logger.error("Erro ao buscar nomes dos alunos: {}" + e.getMessage(), e);
        }

        return nomesAlunos;
    }

}
