package Database;

import Model.ObservacaoSala;
import static com.sun.xml.internal.ws.util.StringUtils.capitalize;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ObservacaoSalaDao {
    protected DB db;
    protected String table;
    
    public ObservacaoSalaDao(){
        this.db = new DB();
        this.table = "observacao_sala";
    }
    
    
    /**
    * Funções básicas de CRUD 
    */
    
    // Obter um objeto com base na coluna dada
    public ObservacaoSala get (ObservacaoSala obs, String column) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" WHERE "+column+" = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            try{
                Method m = obs.getClass().getMethod("get" + capitalize(column));
                String val = (String) m.invoke(obs);
                
                stmt.setString(1, val);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            
            ResultSet rs = stmt.executeQuery();            
            
            ObservacaoSala obsSala = new ObservacaoSala();
            
            while (rs.next()){
                obsSala.setId(rs.getInt("id"));
                obsSala.setDescricao(rs.getString("descricao"));
                obsSala.setDataHora(rs.getString("data_hora"));
                obsSala.setIdSala(rs.getInt("id_sala"));
                obsSala.setIdUsuario(rs.getString("id_usuario"));
                obsSala.setAtivo(rs.getBoolean("ativo"));
            }
            
            con.close();
            return obsSala;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter um objeto ATIVO com base na coluna dada
    public ObservacaoSala getAtivo (ObservacaoSala obs, String column) {
        ObservacaoSala obsSala = get (obs, column);
        
        if(obsSala.isAtivo() == true)
            return obsSala;
        else
            return null;
    }
    
    
    // Obter todos os objetos
    public List<ObservacaoSala> getAll () {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table;
            PreparedStatement stmt = con.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();
            
            List<ObservacaoSala> obsSalas = new ArrayList<ObservacaoSala>();
            
            while (rs.next()){
                ObservacaoSala obsSala = new ObservacaoSala();
                obsSala.setId(rs.getInt("id"));
                obsSala.setDescricao(rs.getString("descricao"));
                obsSala.setDataHora(rs.getString("data_hora"));
                obsSala.setIdSala(rs.getInt("id_sala"));
                obsSala.setIdUsuario(rs.getString("id_usuario"));
                obsSala.setAtivo(rs.getBoolean("ativo"));
                
                obsSalas.add(obsSala);
            }
            
            con.close();
            return obsSalas;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter todos os objetos ATIVOS
    public List<ObservacaoSala> getAllAtivos () {
        List<ObservacaoSala> obsSalas = getAll();  
        List<ObservacaoSala> ativos = new ArrayList<ObservacaoSala>();
        for (ObservacaoSala obsSala : obsSalas){
            if(obsSala.isAtivo() == true)
                ativos.add(obsSala);
        }
        
        return ativos;
    }
    
    
    
    // Insere um dado objeto do BD
    public boolean insert (ObservacaoSala obs){
        try{
            Connection con = db.connect();

            String query = "INSERT INTO "+table+" (descricao, data_hora, "
                    + "id_sala, id_usuario, ativo) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, obs.getDescricao());
            stmt.setString(2, obs.getDataHora());
            stmt.setInt(3, obs.getIdSala());
            stmt.setString(4, obs.getIdUsuario());
            stmt.setBoolean(5, obs.isAtivo());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    
    // Atualiza um dado objeto no BD
    public boolean update (ObservacaoSala obs){
        try{
            Connection con = db.connect();

            String query = "UPDATE "+table+" SET descricao = ?, data_hora = ?, "
                    + "id_sala = ?, id_usuario = ?, ativo = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            
            
            stmt.setString(1, obs.getDescricao());
            stmt.setString(2, obs.getDataHora());
            stmt.setInt(3, obs.getIdSala());
            stmt.setString(4, obs.getIdUsuario());
            stmt.setBoolean(5, obs.isAtivo());
            stmt.setInt(6, obs.getId());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    // Desabilita o objeto no sistema
    public boolean disable (ObservacaoSala obs) {
        obs.setAtivo(false);
        
        return update(obs);
    }
    
    // Reabilita o objeto no sistema
    public boolean enable (ObservacaoSala obs) {
        obs.setAtivo(true);
        
        return update(obs);
    }
}
