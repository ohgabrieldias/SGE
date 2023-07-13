package baseCoding;


import sge.MySQLConnector;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;
import java.util.logging.Level;


public class Professor extends Pessoa {
    private int codigoProfessor;
    private int id;

    Logger logger = Logger.getLogger(getClass().getName());
    MySQLConnector connector = new MySQLConnector();
    
    public Professor(String nome, String sobrenome, String dataNasc, String cpf, String endereco){
        super(nome, sobrenome, dataNasc, cpf, endereco);
    }
    
    public Professor(int id, String nome, String sobrenome, String dataNasc, String cpf, String end){
        super(nome, sobrenome, dataNasc, cpf, end);
        this.id = id;
    }
    
    public Professor(int id, String nome, String cpf){
        super(nome,  cpf);
        this.id = id;
    }

    public int getCodigoProfessor(){
    return this.codigoProfessor;  
    }

    public int getId(){
        return this.id;
    }
  public Boolean cadastrarProfessor(Professor professor) {
    String query = "INSERT INTO professores (nome, sobrenome, datanasc, cpf, endereco) VALUES (?, ?, ?, ?, ?)";
    try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
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
    try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
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
    try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
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
}
