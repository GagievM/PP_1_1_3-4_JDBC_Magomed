package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    public Connection getConn() {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cick",
                    "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void closeConn(Connection conn) throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }
}

