package Database;

import Model.Bloco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BlocoDao {
    protected DB db;
    protected String table;
    
    public BlocoDao(){
        this.db = new DB();
        this.table = "bloco";
    }
    
    
    /**
    * Funções básicas de CRUD 
    */
    
    // Obter um objeto com base na coluna dada
    public Bloco get (Bloco b, String column) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" WHERE "+column+" = ?";
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
    
    // Obter um objeto ATIVO com base na coluna dada
    public Bloco getAtivo (Bloco b, String column) {
        Bloco bloco = get (b, column);
        
        if(bloco.isAtivo() == true)
            return bloco;
        else
            return null;
    }
    
    
    // Obter todos os objetos
    public List<Bloco> getAll () {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table;
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
    
    // Obter todos os objetos ATIVOS
    public List<Bloco> getAllAtivos () {
        List<Bloco> blocos = getAll();  
        List<Bloco> ativos = new ArrayList<Bloco>();
        for (Bloco bloco : blocos){
            if(bloco.isAtivo() == true)
                ativos.add(bloco);
        }
        
        return ativos;
    }
    
    
    
    // Insere um dado objeto do BD
    public boolean insert (Bloco b){
        try{
            Connection con = db.connect();

            String query = "INSERT INTO "+table+" (codigo, ativo) VALUES (?, ?)";
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
    
    
    // Atualiza um dado objeto no BD
    public boolean update (Bloco b){
        try{
            Connection con = db.connect();

            String query = "UPDATE "+table+" SET codigo = ?, ativo = ? WHERE id = ?";
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
    
    // Desabilita o objeto no sistema
    public boolean disable (Bloco b) {
        b.setAtivo(false);
        
        return update(b);
    }
    
    // Reabilita o objeto no sistema
    public boolean enable (Bloco b) {
        b.setAtivo(true);
        
        return update(b);
    }
}
