package DAO;

import baseCoding.Professor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sge.MySQLConnector;

public class ProfessorDAO {
    MySQLConnector connector = new MySQLConnector();
    Logger logger = Logger.getLogger(getClass().getName());

    public List<String> buscarNomesProfessores() {
        List<String> nomesProfessores = new ArrayList<>();

        String query = "SELECT nome FROM professores";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            try (ResultSet resultSet = stmt.executeQuery()) {

                while (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    nomesProfessores.add(nome);
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao buscar nomes dos professores: " + e.getMessage(), e);
        }

        return nomesProfessores;
    }

    public Professor buscarProfessorPorNome(String nomeProfessor) {
        Professor professor = null;

        String query = "SELECT nome FROM professores WHERE nome = ?";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setString(1, nomeProfessor);

            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    // professor = new Professor(nome);
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao buscar professor por nome: " + e.getMessage(), e);
        }

        return professor;
    }

    public List<Professor> buscarListaProfessor() {
        List<Professor> listaProfessores = new ArrayList<>();

        String query = "SELECT id,nome, cpf FROM professores";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");

                Professor tmpAluno = new Professor(id, nome, cpf);
                listaProfessores.add(tmpAluno);
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao buscar lista professores: " + e.getMessage(), e);
        }

        return listaProfessores;
    }

    public Professor buscarPorId(int id) {
        String query = "SELECT * FROM professores WHERE id = ?";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String sobrenome = rs.getString("sobrenome");
                    String dataNasc = rs.getString("datanasc");
                    String cpf = rs.getString("cpf");
                    String endereco = rs.getString("endereco");
                    return new Professor(id, nome, sobrenome, dataNasc, cpf, endereco);
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao buscar professores por ID " + e.getMessage(), e);
        }

        return null; // Retorna null se nenhum aluno for encontrado com o ID especificado
    }

    public boolean alterarProfessor(Professor professor) {
        String query = "UPDATE professores SET nome = ?, sobrenome = ?, datanasc = ?, cpf = ?, endereco = ? WHERE id = ?";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getSobrenome());
            stmt.setString(3, professor.getDataNasc());
            stmt.setString(4, professor.getCpf());
            stmt.setString(5, professor.getEndereco());
            // stmt.setString(6, professor.getCpfResp());
            // stmt.setString(7, professor.getResponsavel());
            stmt.setLong(6, professor.getId());
            stmt.executeUpdate();

            return true;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao alterar professore: " + e.getMessage(), e);
            return false;
        }
    }

    public boolean excluirProfessor(int id) {
        String query = "DELETE FROM professores WHERE id = ?";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao excluir professore: " + e.getMessage(), e);
            return false;
        }
    }

}
