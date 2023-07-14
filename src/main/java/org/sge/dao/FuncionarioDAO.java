package org.sge.dao;

import org.sge.base.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuncionarioDAO implements DaoInterface{
    private Connection connection;
    private Logger logger = LoggerFactory.getLogger(getClass().getName());

    public FuncionarioDAO(Connection connection) {
        this.connection = connection;
    }

    public boolean cadastrarFuncionario(Funcionario funcionario) {
        String queryFuncionarios = "INSERT INTO funcionarios (nome, sobrenome, datanasc, cpf, endereco, setor, cargo, salario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        String queryUsers = "INSERT INTO users (username, password) VALUES (?, ?)";

        try (PreparedStatement stmtFuncionarios = connection.prepareStatement(queryFuncionarios);
                PreparedStatement stmtUsers = connection.prepareStatement(queryUsers)) {

            stmtFuncionarios.setString(1, funcionario.getNome());
            stmtFuncionarios.setString(2, funcionario.getSobrenome());
            stmtFuncionarios.setString(3, funcionario.getDataNasc());
            stmtFuncionarios.setString(4, funcionario.getCpf());
            stmtFuncionarios.setString(5, funcionario.getEndereco());
            stmtFuncionarios.setString(6, funcionario.getSetor());
            stmtFuncionarios.setString(7, funcionario.getCargo());
            stmtFuncionarios.setFloat(8, funcionario.getSalario());

            stmtFuncionarios.executeUpdate();

            // Inserir dados na tabela 'users'
            stmtUsers.setString(1, funcionario.getUsername());
            stmtUsers.setString(2, funcionario.getPassword());
            stmtUsers.executeUpdate();

            // logger.info("Dados do funcionario inseridos com sucesso nas tabelas
            // 'funcionarios' e 'users'.");
        } catch (SQLException e) {
            logger.error("Erro ao cadastrar funcionario: {}" + e.getMessage(), e);
            return false;
        }

        return true;
    }

    public List<Funcionario> buscarListaFuncionario() {
        List<Funcionario> listaFuncionarioes = new ArrayList<>();

        String query = "SELECT id,nome, cpf FROM funcionarios";

        try (PreparedStatement stmt = connection.prepareStatement(query);
                ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");

                Funcionario tmpAluno = new Funcionario(id, nome, cpf);
                listaFuncionarioes.add(tmpAluno);
            }
        } catch (SQLException e) {
            logger.error("Erro ao buscar lista de funcionários: {}" + e.getMessage(), e);
        }

        return listaFuncionarioes;
    }

    public Funcionario buscarPorId(int id) {
        String queryFuncionarios = "SELECT * FROM funcionarios WHERE id = ?";
        String queryUsers = "SELECT * FROM users WHERE id = ?";

        try (PreparedStatement stmtFuncionarios = connection.prepareStatement(queryFuncionarios);
                PreparedStatement stmtUsers = connection.prepareStatement(queryUsers)) {

            stmtFuncionarios.setInt(1, id);

            try (ResultSet rsFuncionarios = stmtFuncionarios.executeQuery()) {
                if (rsFuncionarios.next()) {
                    String nome = rsFuncionarios.getString("nome");
                    String sobrenome = rsFuncionarios.getString("sobrenome");
                    String dataNasc = rsFuncionarios.getString("datanasc");
                    String cpf = rsFuncionarios.getString("cpf");
                    String endereco = rsFuncionarios.getString("endereco");

                    stmtUsers.setInt(1, id);

                    try (ResultSet rsUsers = stmtUsers.executeQuery()) {
                        if (rsUsers.next()) {
                            String username = rsUsers.getString("username");
                            String password = rsUsers.getString("password");

                            return new Funcionario(id, nome, sobrenome, dataNasc, cpf, endereco, username, password);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            logger.error("Erro ao buscar por ID: {}" + e.getMessage(), e);
        }

        return null; // Retorna null se nenhum funcionário for encontrado com o ID especificado
    }

    public boolean alterarFuncionario(Funcionario funcionario) {
        String queryFuncionarios = "UPDATE funcionarios SET nome = ?, sobrenome = ?, datanasc = ?, cpf = ?, endereco = ? WHERE id = ?";
        String queryUsers = "UPDATE users SET username = ?, password = ? WHERE id = ?";

        try (PreparedStatement stmtFuncionarios = connection.prepareStatement(queryFuncionarios);
                PreparedStatement stmtUsers = connection.prepareStatement(queryUsers)) {

            stmtFuncionarios.setString(1, funcionario.getNome());
            stmtFuncionarios.setString(2, funcionario.getSobrenome());
            stmtFuncionarios.setString(3, funcionario.getDataNasc());
            stmtFuncionarios.setString(4, funcionario.getCpf());
            stmtFuncionarios.setString(5, funcionario.getEndereco());
            stmtFuncionarios.setLong(6, funcionario.getId());

            stmtFuncionarios.executeUpdate();

            // Atualizar dados na tabela 'users'
            stmtUsers.setString(1, funcionario.getUsername());
            stmtUsers.setString(2, funcionario.getPassword());
            stmtUsers.setLong(3, funcionario.getId());
            stmtUsers.executeUpdate();

            return true;
        } catch (SQLException e) {
            logger.error("Erro ao alterar funcionário: {}" + e.getMessage(), e);
            return false;
        }
    }

    public boolean excluirFuncionario(int id) {
        String queryFuncionarios = "DELETE FROM funcionarios WHERE id = ?";
        String queryUsers = "DELETE FROM users WHERE id = ?";

        try (PreparedStatement stmtFuncionarios = connection.prepareStatement(queryFuncionarios);
                PreparedStatement stmtUsers = connection.prepareStatement(queryUsers)) {

            stmtFuncionarios.setInt(1, id);
            stmtUsers.setInt(1, id);

            int rowsAffectedFuncionarios = stmtFuncionarios.executeUpdate();
            int rowsAffectedUsers = stmtUsers.executeUpdate();

            return (rowsAffectedFuncionarios > 0) && (rowsAffectedUsers > 0);
        } catch (SQLException e) {
            logger.error("Erro ao excluir funcionário: {}" + e.getMessage(), e);
            return false;
        }
    }

}