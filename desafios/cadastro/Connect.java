package desafios.cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
    public void connect() {
        public Connection connection = null;
        public ResultSet resultSet = null;
        public Statement statement = null;

        try {
            final String url = "jdbc:sqlite:db/myDB.db";

            connection = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");
        } catch(SQLException exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                if(connection != null) {
                    connection.close();
                }
            } catch (SQLException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}