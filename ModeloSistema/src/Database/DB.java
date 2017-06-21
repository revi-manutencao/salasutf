package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DB {
    String host = "sql10.freemysqlhosting.net";
    String database = "sql10181452";
    String user = "sql10181452";
    String password = "ibRYhyb2Ia";
    
    public Connection connect(){
        try{
            return DriverManager.getConnection("jdbc:mysql://"+host+"/"+database, user, password);
        } catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
