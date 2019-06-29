package pattern.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:" + getDatabase() + "://localhost:3306/banco",
                "usuario",
                "senha");
    }

    private String getDatabase() {
        return System.getenv("dbSelected");
    }
}
