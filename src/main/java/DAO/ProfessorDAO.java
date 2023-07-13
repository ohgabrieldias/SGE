package DAO;

import baseCoding.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProfessorDAO implements DaoInterface {
    private Connection connection;
    Logger logger = Logger.getLogger(getClass().getName());
    
    public ProfessorDAO(Connection connection){
        this.connection = connection;
    }
    
    public Boolean cadastrarProfessor(Professor professor) {
        String query = "INSERT INTO professores (nome, sobrenome, datanasc, cpf, endereco) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getSobrenome());
            stmt.setString(3, professor.getDataNasc());
            stmt.setString(4, professor.getCpf());
            stmt.setString(5, professor.getEndereco());
            stmt.executeUpdate();
            logger.info("Professor cadastrado com sucesso!");
        } catch(SQLException e){
            logger.log(Level.SEVERE, "Erro ao cadastrar professor: " + e.getMessage(), e);
        }
        return true;
      }

    private void excliurProfessor(int codigoProfessor) {
      String query = "DELETE FROM professores WHERE codigoProfessor = ?";
      try (PreparedStatement stmt = connection.prepareStatement(query)) {
          stmt.setInt(1, codigoProfessor);
          stmt.executeUpdate();
          logger.info("Professor excluido com sucesso!");
      } catch(SQLException e){
          logger.log(Level.SEVERE, "Erro ao excluir professor: " + e.getMessage(), e);
      }
    }

    private Professor buscarProfessor(Professor professor){
      Professor tmpProfessor = null;
      String query = "SELECT * FROM professores WHERE codigoProfessor = ?";
      try (PreparedStatement stmt = connection.prepareStatement(query)) {
          stmt.setInt(1, professor.getCodigoProfessor());
          try (ResultSet rs = stmt.executeQuery()) {
              if (rs.next()) {
                  String nome = rs.getString("nome");
                  String sobrenome = rs.getString("sobrenome");
                  String dataNasc = rs.getString("datanasc");
                  String cpf = rs.getString("cpf");
                  String endereco = rs.getString("endereco");
                  tmpProfessor = new Professor(nome, sobrenome, dataNasc, cpf, endereco);
              }
          }
      } catch(SQLException e){
          logger.log(Level.SEVERE, "Erro ao buscar professor: " + e.getMessage(), e);
      }
      return tmpProfessor;
    }
    
    public List<String> buscarNomesProfessores() {
        List<String> nomesProfessores = new ArrayList<>();

        String query = "SELECT nome FROM professores";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
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

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
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

        try (PreparedStatement stmt = connection.prepareStatement(query);
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

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
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

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
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

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao excluir professore: " + e.getMessage(), e);
            return false;
        }
    }

}
