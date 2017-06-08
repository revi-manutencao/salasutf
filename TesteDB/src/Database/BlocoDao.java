/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Bloco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinicius
 */
public class BlocoDao {
    protected DB db;
    
    public BlocoDao(){
        this.db = new DB();
    }
    
    
    public Bloco get (Bloco b) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM bloco WHERE id = ? AND ativo = true";
            PreparedStatement stmt = con.prepareStatement(query);

            stmt.setInt(1, b.getId());
            
            ResultSet rs = stmt.executeQuery();
            
            
            Bloco bloco = new Bloco();
            
            while (rs.next()){
                bloco.setId(rs.getInt("id"));
                bloco.setCodigo(rs.getString("codigo"));
                bloco.setAtivo(rs.getBoolean("ativo"));
            }
            
            con.close();
            return bloco;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    
    public List<Bloco> getAll () {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM bloco WHERE ativo = true";
            PreparedStatement stmt = con.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();
            
            List<Bloco> blocos = new ArrayList<Bloco>();
            
            while (rs.next()){
                Bloco bloco = new Bloco();
                bloco.setId(rs.getInt("id"));
                bloco.setCodigo(rs.getString("codigo"));
                bloco.setAtivo(rs.getBoolean("ativo"));
                
                blocos.add(bloco);
            }
            
            con.close();
            return blocos;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    public boolean insert (Bloco b){
        try{
            Connection con = db.connect();

            String query = "INSERT INTO bloco (codigo, ativo) VALUES (?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, b.getCodigo());
            stmt.setBoolean(2, b.isAtivo());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    public boolean update (Bloco b){
        try{
            Connection con = db.connect();

            String query = "UPDATE bloco SET codigo = ?, ativo = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, b.getCodigo());
            stmt.setBoolean(2, b.isAtivo());
            stmt.setInt(3, b.getId());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    
    public boolean disable (Bloco b) {
        b.setAtivo(false);
        
        return update(b);
    }
}
