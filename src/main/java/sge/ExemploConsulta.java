/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sge;

/**
 *
 * @author gabriel
 */
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExemploConsulta {
    public static void main(String[] args) {
        MySQLConnector connector = new MySQLConnector();
        
        // Exemplo de consulta
        String query = "SELECT * FROM users";
        ResultSet resultSet = connector.executeQuery(query);
        
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nome = resultSet.getString("username");
                    String senha = resultSet.getString("password");
                    
                    System.out.println("ID: " + id);
                    System.out.println("Nome: " + nome);
                    System.out.println("Senha: " + senha);
                    System.out.println("--------------------------");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        connector.closeConnection();
    }
}