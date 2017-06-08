
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinicius.baroni
 */
public class DB {
    public Connection connect(String db, String user, String pass){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/"+db, user, pass);
        } catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
