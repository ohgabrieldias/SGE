package org.sge.dao;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySQLConnector{
    private Logger logger = LoggerFactory.getLogger(getClass().getName());
    private Connection connection;
    private String dbHost;
    private String dbPort;
    private String dbName;
    private String dbUser;
    private String dbPassword;

    public MySQLConnector() {
        initializeConnectionParameters();
    }

    public MySQLConnector(Connection connection) {
        this.connection = connection;
    }

    private void initializeConnectionParameters() {
        Dotenv dotenv = Dotenv.configure().load();
        dbHost = dotenv.get("DB_HOST");
        dbPort = dotenv.get("DB_PORT");
        dbName = dotenv.get("DB_NAME");
        dbUser = dotenv.get("DB_USER");
        dbPassword = dotenv.get("DB_PASSWORD");
    }

    public Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            } else {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
                connection = DriverManager.getConnection(url, dbUser, dbPassword);
                return connection;
            }
        } catch (ClassNotFoundException | SQLException e) {
            logger.error("Erro ao conectar ao banco de dados: {}" + e.getMessage(), e);
        }
        return null;
    }

    public boolean authenticateUser(String username, String password) {
        String query = "SELECT COUNT(*) FROM users WHERE username = ? AND password = ?";

        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);

            try (ResultSet rs = stmt.executeQuery()) {
                rs.next();
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            logger.error("Erro ao autenticar usuário: {}" + e.getMessage(), e);
        }

        return false;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            logger.error("Erro ao fechar conexão: {}" + e.getMessage(), e);
        }
    }
}
