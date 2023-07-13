/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.sge.dao;

import org.sge.dao.MySQLConnector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;


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
    // Add more test methods as needed to cover other functionality of the MySQLConnector class

}
