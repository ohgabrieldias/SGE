/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseCoding;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sge.MySQLConnector;


/**
 *
 * @author gabriel
 */
public class Disciplina {
    private int id;
    private String nome;
    private String dataInicio;
    private String dataFim;
    private String professor;
    
    MySQLConnector connector = new MySQLConnector();
    Logger logger = Logger.getLogger(getClass().getName());
    
    public Disciplina(String nome, String dataInicio, String dataFim, String professor){
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.professor = professor;
    }
    
    public Disciplina(int id, String nome, String dataInicio, String dataFim, String professor){
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.professor = professor;
    }
    
    public Disciplina(int id, String nome){
        this.nome = nome;
        this.id = id;
    }
    
    public boolean cadastrarDisciplinas(Disciplina disc) {
        // Insert data into the "alunos" table
        String query = "INSERT INTO disciplinas (nome, dataInicio, dataFim, professor) VALUES (?, ?, ?, ?)";
        
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
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
    
    public String getNome(){
        return this.nome;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getNomeProfessor(){
        return this.professor;
    }
    
    public String getDataInicio(){
        return this.dataInicio;
    }

    public String getDataFim(){
        return this.dataFim;
    }
    
}
