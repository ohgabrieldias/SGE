/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import baseCoding.Turma;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sge.MySQLConnector;
import com.google.gson.Gson;

/**
 *
 * @author gabriel
 */
    public class TurmaDAO {
        MySQLConnector connector = new MySQLConnector();

        public boolean cadastrarTurma(Turma turma) {
        String query = "INSERT INTO turmas (nome, codigo, dataInicio, dataFim, listaIdAlunos, listaIdsDisciplinas) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setString(1, turma.getNome());
            stmt.setString(2, turma.getCodigo());
            stmt.setString(3, turma.getDataInicio());
            stmt.setString(4, turma.getDataFim());
            stmt.setString(5, toJsonString(turma.getListaIdAlunos()));
            stmt.setString(6, toJsonString(turma.getListaIdsDisciplinas()));

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
    }

    return false;
    }

    //criar um metodo para buscar todas as turmas no banco de dados
    public Turma buscarTurma() {
        List<Turma> listaTurmas = new ArrayList<>();
        String query = "SELECT id FROM turmas";

        try(PreparedStatement stmt = connector.getConnection().prepareStatement(query) ;
            ResultSet rs = stmt.executeQuery()){

            while(rs.next()){
                int id = rs.getInt("id");
                Turma tmpTurma = new Turma(id);
                listaTurmas.add(tmpTurma);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (Turma) listaTurmas;
    }

    private String toJsonString(List<Integer> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }


}
