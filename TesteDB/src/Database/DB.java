package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Model.*;
import java.sql.PreparedStatement;

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
    String host = "localhost";
    String database = "salasutf";
    String user = "root";
    String password = "root";
    
    public Connection connect(){
        try{
            return DriverManager.getConnection("jdbc:mysql://"+host+"/"+database, user, password);
        } catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
