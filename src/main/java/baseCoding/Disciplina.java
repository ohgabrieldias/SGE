/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseCoding;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import sge.MySQLConnector;


/**
 *
 * @author gabriel
 */
public class Disciplina {
    private String nome;
    private String dataInicio;
    private String dataFim;
    
    MySQLConnector connector = new MySQLConnector();
    private static final Logger logger = Logger.getLogger(Disciplina.class.getName());
    
    public Disciplina(String nome, String dataInicio, String dataFim){
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
    
    public boolean cadastrarDisciplinas(Disciplina disc) {
        // Insert data into the "alunos" table
        String query = "INSERT INTO disciplinas (nome, dataInicio, dataFim) VALUES (?, ?, ?)";
        
        try (PreparedStatement stmt = connector.getConnection().prepareStatement(query)) {
            stmt.setString(1, disc.getNome());
            stmt.setString(2, disc.getDataInicio());
            stmt.setString(3, disc.getDataFim());

            stmt.executeUpdate();
            logger.info("Student data inserted successfully into the 'alunos' table.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return true;
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getDataInicio(){
        return this.dataInicio;
    }

    public String getDataFim(){
        return this.dataFim;
    }
    
}
