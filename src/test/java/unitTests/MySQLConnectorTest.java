/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unitTests;

import io.github.cdimascio.dotenv.Dotenv;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import sge.MySQLConnector;

public class MySQLConnectorTest {
    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockStatement;

    @Mock
    private ResultSet mockResultSet;

    private MySQLConnector connector;

    @BeforeEach
    public void setup() throws SQLException {
        connector = new MySQLConnector(mockConnection);
    }

    @Test
    public void testAuthenticateUser_ValidCredentials_ReturnsTrue() throws SQLException {
        // Arrange
        String username = "testUser";
        String password = "testPassword";
        String query = "SELECT COUNT(*) FROM users WHERE username = ? AND password = ?";
        when(mockConnection.prepareStatement(query)).thenReturn(mockStatement);
        when(mockStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt(1)).thenReturn(1);

        // Act
        boolean result = connector.authenticateUser(username, password);

        // Assert
        assertTrue(result, "User authentication should be successful");
        verify(mockStatement).setString(1, username);
        verify(mockStatement).setString(2, password);
        verify(mockStatement).executeQuery();
    }

    @Test
    public void testAuthenticateUser_InvalidCredentials_ReturnsFalse() throws SQLException {
        // Arrange
        String username = "testUser";
        String password = "testPassword";
        String query = "SELECT COUNT(*) FROM users WHERE username = ? AND password = ?";
        when(mockConnection.prepareStatement(query)).thenReturn(mockStatement);
        when(mockStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getInt(1)).thenReturn(0);

        // Act
        boolean result = connector.authenticateUser(username, password);

        // Assert
        assertFalse(result, "User authentication should be unsuccessful");
        verify(mockStatement).setString(1, username);
        verify(mockStatement).setString(2, password);
        verify(mockStatement).executeQuery();
    }

    @Test
    public void testExecuteQuery_SuccessfulExecution_ReturnsResultSet() throws SQLException {
        // Arrange
        String query = "SELECT * FROM users";
        when(mockConnection.prepareStatement(query)).thenReturn(mockStatement);
        when(mockStatement.executeQuery()).thenReturn(mockResultSet);

        // Act
        ResultSet result = connector.executeQuery(query);

        // Assert
        assertNotNull(result, "ResultSet should not be null");
        verify(mockStatement).executeQuery();
    }

    @Test
    public void testExecuteQuery_ExceptionThrown_ReturnsNull() throws SQLException {
        // Arrange
        String query = "SELECT * FROM users";
        when(mockConnection.prepareStatement(query)).thenThrow(new SQLException());

        // Act
        ResultSet result = connector.executeQuery(query);

        // Assert
        assertNull(result, "ResultSet should be null");
    }

    // Restante dos métodos de teste...

    @AfterEach
    public void teardown() throws SQLException {
        connector.closeConnection();
    }
}
