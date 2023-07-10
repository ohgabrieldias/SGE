/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import baseCoding.Disciplina;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sge.MySQLConnector;

/**
 *
 * @author gabriel
 */
public class DisciplinaDAO {
    MySQLConnector connector = new MySQLConnector();
    
    public List<String> buscarNomesDisciplinas() {
        List<String> nomesDisciplinas = new ArrayList<>();

        String query = "SELECT nome FROM disciplinas";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            try (ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                nomesDisciplinas.add(nome);
             }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nomesDisciplinas;
    }
    
    public List<Disciplina> getDisciplinas() {
        List<Disciplina> disciplinas = new ArrayList<>();

        String query = "SELECT id,nome FROM disciplinas";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            try (ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                Disciplina tmpDisciplina = new Disciplina(id, nome);
                disciplinas.add(tmpDisciplina);
             }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return disciplinas;
    }
    
    public Disciplina buscarPorId(int id) {
        String query = "SELECT * FROM disciplinas WHERE id = ?";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nome = rs.getString("nome");
                    String dataInicio = rs.getString("dataInicio");
                    String dataFim = rs.getString("dataFim");
                    String professor = rs.getString("professor");

                    return new Disciplina(id,nome, dataInicio, dataFim, professor);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Retorna null se nenhum aluno for encontrado com o ID especificado
    }
    
}
