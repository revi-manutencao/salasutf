package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import Model.*;
import java.sql.PreparedStatement;



public class DB {
    String host = "localhost";
    String database = "salasutf";
    String user = "root";
    String password = "";
    
    public Connection connect(){
        try{
            return DriverManager.getConnection("jdbc:mysql://"+host+"/"+database, user, password);
        } catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
