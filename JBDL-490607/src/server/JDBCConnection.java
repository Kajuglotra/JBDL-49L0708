package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JBDL49", "root","root");
        Statement statement = connection.createStatement();
        String sql = "CREATE TABLE jbdl_49 (id INTEGER, name VARCHAR(30))";
        statement.execute(sql);

    }
}
