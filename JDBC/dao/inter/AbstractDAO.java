package JDBC.dao.inter;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class AbstractDAO {

    public Connection connect() throws Exception {

//        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/resume";
        String username = "root";
        String password = "";

        Connection connection = DriverManager.getConnection(url, username, password);

        return connection;
    }

}
