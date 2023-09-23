package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {

    private Connection con = null;

    public Connection getConnection() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String base = "user_register_system";
            String url = "jdbc:mysql://localhost:3306/" + base;
            String user = "root";
            String pass = "J@rgeMaria205454";
            con = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);

        }

        return con;
    }
}