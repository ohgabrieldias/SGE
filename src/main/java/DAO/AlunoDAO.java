/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import baseCoding.Aluno;
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
public class AlunoDAO {
    MySQLConnector connector = new MySQLConnector();
    
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
                    String tmpResp = rs.getString("responsavel");
                    tmpAluno = new Aluno(nome, sobrenome, dataNasc, cpf, endereco, tmpResp, tmpCpfResp, matricula);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return tmpAluno;
    }
    
    public List<Aluno> buscarListaAluno() {
    List<Aluno> listaAlunos = new ArrayList<>();

    String query = "SELECT id,nome, cpf FROM alunos";

    try (PreparedStatement stmt = connector.getConnection().prepareStatement(query);
         ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String cpf = rs.getString("cpf");

            Aluno tmpAluno = new Aluno(id,nome,cpf);
            listaAlunos.add(tmpAluno);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return listaAlunos;
    }

    //Criar um metodo pra conseguir modificar dados do aluno 
    public void alterarAluno(Aluno aluno) {
        String query = "UPDATE alunos SET nome = ?, sobrenome = ?, datanasc = ?, cpf = ?, endereco = ?, cpfresp = ?, responsavel = ? WHERE matricula = ?";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getSobrenome());
            stmt.setString(3, aluno.getDataNasc());
            stmt.setString(4, aluno.getCpf());
            stmt.setString(5, aluno.getEndereco());
            stmt.setString(6, aluno.getCpfResp());
            stmt.setString(7, aluno.getResponsavel());
            stmt.setLong(8, aluno.getMatricula());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }   
    }

    public List<Aluno> atualizarBD() {
        List<Aluno> listaAlunos = new ArrayList<>();

        String query = "SELECT * FROM alunos";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                String nome = rs.getString("nome");
                String sobrenome = rs.getString("sobrenome");
                String dataNasc = rs.getString("datanasc");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                String tmpCpfResp = rs.getString("cpfresp");
                String tmpResp = rs.getString("responsavel");
                long matricula = rs.getLong("matricula");

                Aluno tmpAluno = new Aluno(nome, sobrenome, dataNasc, cpf, endereco, tmpResp, tmpCpfResp, matricula);
                listaAlunos.add(tmpAluno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaAlunos;
    }

    public Aluno buscarPorId(int id) {
    String query = "SELECT * FROM alunos WHERE id = ?";

    try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
        stmt.setInt(1, id);

        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                String nome = rs.getString("nome");
                String sobrenome = rs.getString("sobrenome");
                String dataNasc = rs.getString("datanasc");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                return new Aluno(nome, sobrenome, dataNasc, cpf, endereco);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return null; // Retorna null se nenhum aluno for encontrado com o ID especificado
}
    
    public List<String> buscarNomesAlunos() {
        List<String> nomesAlunos = new ArrayList<>();

        String query = "SELECT nome, cpf FROM alunos";

        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            try (ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String cpf = resultSet.getString("cpf");
                String nomeCpf = nome + " - CPF: " + cpf;
                nomesAlunos.add(nomeCpf);
             }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nomesAlunos;
    }
    
}
