package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DB {
    // Dados da conexão com o banco online
    String host = "sql10.freemysqlhosting.net";
    String database = "sql10181452";
    String user = "sql10181452";
    String password = "ibRYhyb2Ia";
    
    // Dados da conexão com o banco local
//    String host = "localhost";
//    String database = "salasutf";
//    String user = "root";
//    String password = "";
    
    public Connection connect(){
        try{
            return DriverManager.getConnection("jdbc:mysql://"+host+"/"+database, user, password);
        } catch(SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
