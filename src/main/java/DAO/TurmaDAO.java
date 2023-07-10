/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import baseCoding.Aluno;
import baseCoding.Disciplina;
import baseCoding.Turma;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sge.MySQLConnector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.TypeReference;

/**
 *
 * @author gabriel
 */
    public class TurmaDAO {
        AlunoDAO alunoDao = new AlunoDAO();
        DisciplinaDAO discipDao = new DisciplinaDAO();
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
    public List<Turma> buscarTurma() {
        List<Turma> listaTurmas = new ArrayList<>();
        String query = "SELECT id, nome FROM turmas";

        try(PreparedStatement stmt = connector.getConnection().prepareStatement(query) ;
            ResultSet rs = stmt.executeQuery()){

            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Turma tmpTurma = new Turma(id,nome);
                listaTurmas.add(tmpTurma);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaTurmas;
    }
    
    public boolean alterarTurma(Turma turma) {
        String query = "UPDATE turmas SET nome = ?, codigo = ?, dataInicio = ?, dataFim = ?, listaIdAlunos = ?, listaIdsDisciplinas = ? WHERE id = ?";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setString(1, turma.getNome());
            stmt.setString(2, turma.getCodigo());
            stmt.setString(3, turma.getDataInicio());
            stmt.setString(4, turma.getDataFim());
            stmt.setString(5, toJsonString(turma.getListaIdAlunos()));
            stmt.setString(6, toJsonString(turma.getListaIdsDisciplinas()));
            stmt.setInt(7, turma.getId()); // supondo que o ID seja um atributo da classe Turma

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean atualizarNomeTurma(int id, String novoNome) {
        String query = "UPDATE turmas SET nome = ? WHERE id = ?";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setString(1, novoNome);
            stmt.setInt(2, id);

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public Turma buscarPorId(int id){
        String query = "SELECT * FROM turmas WHERE id = ?";
        try(PreparedStatement stmt = connector.getConnection().prepareStatement(query)){
            stmt.setInt(1, id);
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next()){
                    String nome = rs.getString("nome");
                    String listaIdAlunosString = rs.getString("listaIdAlunos");
                    String listaIdDisciplinasString = rs.getString("listaIdsDisciplinas");
                    
                    List<Disciplina> listaIdDisciplinas = convertStringToListDisc(listaIdDisciplinasString);
                    List<Aluno> listaIdAlunos = convertJsonToListAluno(listaIdAlunosString);
//                    System.out.println(id);
                return new Turma(id, nome, listaIdAlunos, listaIdDisciplinas);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean atualizarListaAlunosTurma(int idTurma, List<Integer> list) {
        String query = "UPDATE turmas SET listaIdAlunos = ? WHERE id = ?";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            String listaAlunosJson = toJsonString(list);
            stmt.setString(1, listaAlunosJson);
            stmt.setInt(2, idTurma);

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean atualizarListaDisciplinasTurma(int idTurma, List<Integer> list) {
        String query = "UPDATE turmas SET listaIdsDisciplinas = ? WHERE id = ?";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setString(1, toJsonString(list));
            stmt.setInt(2, idTurma);

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean excluirTurma(int id){
        String query = "DELETE FROM turmas WHERE id = ?";
        try(PreparedStatement stmt = connector.getConnection().prepareStatement(query)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    private String toJsonString(List<Integer> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }
    
    public List<Aluno> convertJsonToListAluno(String jsonString) {
        Gson gson = new Gson();

        List<Integer> listaIds = gson.fromJson(jsonString, new TypeToken<List<Integer>>() {}.getType());

        List<Aluno> listaAlunos = new ArrayList<>();
        for (Integer id : listaIds) {
            // Criar objeto Aluno com base no ID
            
            Aluno aluno = alunoDao.buscarPorId(id);
            listaAlunos.add(aluno);
        }

        return listaAlunos;
    }

    
    public List<Disciplina> convertStringToListDisc(String jsonString) {
        Gson gson = new Gson();

        List<Integer> listaIds = gson.fromJson(jsonString, new TypeToken<List<Integer>>() {}.getType());

        List<Disciplina> listaDisc = new ArrayList<>();
        for (Integer id : listaIds) {
            // Criar objeto Aluno com base no ID
            
            Disciplina discip = discipDao.buscarPorId(id);
            listaDisc.add(discip);
        }

        return listaDisc;
    }

}
