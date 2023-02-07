package dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AbstractDAO {

    public Connection connect() throws Exception {

//        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/test";
        String username = "postgres";
        String password = "12345";

        Connection connection = DriverManager.getConnection(url, username, password);

        return connection;
    }

}
