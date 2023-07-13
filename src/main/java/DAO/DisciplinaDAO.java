package DAO;

import baseCoding.Disciplina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sge.MySQLConnector;

public class DisciplinaDAO implements DaoInterface {
    private Connection connection;
    Logger logger = Logger.getLogger(getClass().getName());

    public DisciplinaDAO(Connection connection){
        this.connection = connection;
    }

    public List<String> buscarNomesDisciplinas() {
        List<String> nomesDisciplinas = new ArrayList<>();

        String query = "SELECT nome FROM disciplinas";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            try (ResultSet resultSet = stmt.executeQuery()) {

                while (resultSet.next()) {
                    String nome = resultSet.getString("nome");
                    nomesDisciplinas.add(nome);
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao buscar nomes das disciplinas: " + e.getMessage(), e);
        }

        return nomesDisciplinas;
    }
    
    public boolean cadastrarDisciplinas(Disciplina disc) {
        // Insert data into the "alunos" table
        String query = "INSERT INTO disciplinas (nome, dataInicio, dataFim, professor) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, disc.getNome());
            stmt.setString(2, disc.getDataInicio());
            stmt.setString(3, disc.getDataFim());
            stmt.setString(4, disc.getNomeProfessor());

            stmt.executeUpdate();
            logger.info("Student data inserted successfully into the 'disciplinas' table.");

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao cadastrar disciplina: " + e.getMessage(), e);
        }

        return true;
    }
    
    public List<Disciplina> getDisciplinas() {
        List<Disciplina> disciplinas = new ArrayList<>();

        String query = "SELECT id,nome FROM disciplinas";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            try (ResultSet resultSet = stmt.executeQuery()) {

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nome = resultSet.getString("nome");
                    Disciplina tmpDisciplina = new Disciplina(id, nome);
                    disciplinas.add(tmpDisciplina);
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao buscar disciplinas: " + e.getMessage(), e);
        }

        return disciplinas;
    }

    public boolean checkVinculo(String professor) {
        String query = "SELECT * FROM disciplinas WHERE nome = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, professor);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    // Faça algo com o nome da disciplina
                    return true;
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao checar vinculo com disciplinas: " + e.getMessage(), e);
        }

        return false;
    }

    public Disciplina buscarPorId(int id) {
        String query = "SELECT * FROM disciplinas WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String dataInicio = rs.getString("dataInicio");
                    String dataFim = rs.getString("dataFim");
                    String professor = rs.getString("professor");

                    return new Disciplina(id, nome, dataInicio, dataFim, professor);
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao buscar por ID: " + e.getMessage(), e);
        }
        return null; // Retorna null se nenhum aluno for encontrado com o ID especificado
    }

}
