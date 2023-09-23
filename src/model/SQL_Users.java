package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQL_Users extends Connect{

    public boolean register(Users usr) {

        PreparedStatement ps;
        Connection con = getConnection();

        String sql = "INSERT INTO users (usr_name, password, name, email, id_type) " +
                "VALUES(?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUser());
            ps.setString(2, usr.getPassword());
            ps.setString(3, usr.getName());
            ps.setString(4, usr.getEmail());
            ps.setInt(5, usr.getId_type());
            ps.execute();
            return true;

        } catch (SQLException ex) {

            Logger.getLogger(SQL_Users.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }
}