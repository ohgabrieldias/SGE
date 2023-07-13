/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnectorTest {

    @Test
    public void testConnection() {
        MySQLConnector connector = new MySQLConnector();
        Connection connection = connector.getConnection();

        Assertions.assertNotNull(connection, "Connection should not be null");
    }

    @Test
    public void testAuthentication() {
        MySQLConnector connector = new MySQLConnector();
        boolean authenticated = connector.authenticateUser("mingau.do mau", "K78C#!9E\"M");

        Assertions.assertTrue(authenticated, "User authentication should be successful");
    }

    @Test
    public void testExecuteQuery() throws SQLException {
        MySQLConnector connector = new MySQLConnector();
        ResultSet resultSet = connector.executeQuery("SELECT * FROM users");

        Assertions.assertNotNull(resultSet, "ResultSet should not be null");

        // Perform assertions on the ResultSet if needed
        // For example:
        // resultSet.next();
        // int id = resultSet.getInt("id");
        // Assertions.assertEquals(1, id, "ID should be 1");
    }

    // Add more test methods as needed to cover other functionality of the MySQLConnector class

}
