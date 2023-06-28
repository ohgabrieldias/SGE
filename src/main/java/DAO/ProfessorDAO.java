/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import baseCoding.Professor;
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
public class ProfessorDAO {
    MySQLConnector connector = new MySQLConnector();
    
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
            e.printStackTrace();
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
//                    professor = new Professor(nome);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return professor;
    }    
}
