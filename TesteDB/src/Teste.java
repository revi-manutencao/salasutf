
import java.sql.Connection;
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
public class Teste {
    public static void main(String[] args){
        try{
            Connection con = new DB().connect("texto", "root", "");
            System.out.println("meu texto de teste do git");
            System.out.println("Conectou");
            con.close();
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
