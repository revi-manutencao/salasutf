package Database;

import Model.TipoSala;
import static com.sun.xml.internal.ws.util.StringUtils.capitalize;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TipoSalaDao {
    protected DB db;
    protected String table;
    
    public TipoSalaDao(){
        this.db = new DB();
        this.table = "tipo_de_sala";
    }
    
    /**
    * Funções básicas de CRUD 
    */
    
    // Obter um objeto com base na coluna dada
    public TipoSala get (TipoSala s, String column) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" WHERE "+column+" = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            try{
                Method m = s.getClass().getMethod("get" + capitalize(column));
                String val = String.valueOf(m.invoke(s));
                
                stmt.setString(1, val);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            
            ResultSet rs = stmt.executeQuery();            
            
            TipoSala tiposala = new TipoSala();
            
            while (rs.next()){
                tiposala.setId(rs.getInt("id"));
                tiposala.setDescricao(rs.getString("descricao"));
                tiposala.setAtivo(rs.getBoolean("ativo"));
            }
            
            con.close();
            return tiposala;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter um objeto ATIVO com base na coluna dada
    public TipoSala getAtivo (TipoSala s, String column) {
        TipoSala tiposala = get (s, column);
        
        if(tiposala.isAtivo() == true)
            return tiposala;
        else
            return null;
    }
    
    
    // Obter todos os objetos
    public List<TipoSala> getAll () {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table;
            PreparedStatement stmt = con.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();
            
            List<TipoSala> ts = new ArrayList<TipoSala>();
            
            while (rs.next()){
                TipoSala tiposala = new TipoSala();
                tiposala.setId(rs.getInt("id"));
                tiposala.setDescricao(rs.getString("descricao"));
                tiposala.setAtivo(rs.getBoolean("ativo"));
                
                ts.add(tiposala);
            }
            
            con.close();
            return ts;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter todos os objetos ATIVOS
    public List<TipoSala> getAllAtivos () {
        List<TipoSala> ts = getAll();  
        List<TipoSala> ativos = new ArrayList<TipoSala>();
        for (TipoSala tiposala : ts){
            if(tiposala.isAtivo() == true)
                ativos.add(tiposala);
        }
        
        return ativos;
    }
    
    
    
    // Insere um dado objeto do BD
    public boolean insert (TipoSala s){
        try{
            Connection con = db.connect();

            String query = "INSERT INTO "+table+" (descricao,  ativo) "
                    + "VALUES (?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, s.getDescricao());
            stmt.setBoolean(2, s.isAtivo());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    
    // Atualiza um dado objeto no BD
    public boolean update (TipoSala s){
        try{
            Connection con = db.connect();

            String query = "UPDATE "+table+" SET descricao = ?, ativo = ? WHERE "
                    + "id = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            
            
            stmt.setString(1, s.getDescricao());
            stmt.setBoolean(2, s.isAtivo());
            stmt.setInt(3,s.getId());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    // Desabilita o objeto no sistema
    public boolean disable (TipoSala s) {
        s.setAtivo(false);
        
        return update(s);
    }
    
    // Reabilita o objeto no sistema
    public boolean enable (TipoSala s) {
        s.setAtivo(true);
        
        return update(s);
    }
}
