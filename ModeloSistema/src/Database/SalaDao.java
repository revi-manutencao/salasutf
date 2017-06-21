package Database;

import Model.Sala;
import static com.sun.xml.internal.ws.util.StringUtils.capitalize;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SalaDao {
    protected DB db;
    protected String table;
    
    public SalaDao(){
        this.db = new DB();
        this.table = "sala";
    }
    
    public List<Sala> buscaSalas (String busca) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" WHERE (UPPER(codigo) LIKE UPPER(?) OR UPPER(equipamentos) LIKE UPPER(?)) AND ativo = true";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, "%"+busca+"%");
            stmt.setString(2, "%"+busca+"%");

            ResultSet rs = stmt.executeQuery();
            
            List<Sala> salas = new ArrayList<Sala>();
            
            while (rs.next()){
                Sala sala = new Sala();
                sala.setId(rs.getInt("id"));
                sala.setCodigo(rs.getString("codigo"));
                sala.setIdAdministrador(rs.getString("id_administrador"));
                sala.setIdBloco(rs.getInt("id_bloco"));
                sala.setIdTipoSala(rs.getInt("id_tipo_de_sala"));
                sala.setAtivo(rs.getBoolean("ativo"));
                sala.setEquipamentos(rs.getString("equipamentos"));
                
                salas.add(sala);
            }
            
            con.close();
            return salas;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    
    /**
    * Funções básicas de CRUD 
    */
    
    // Obter um objeto com base na coluna dada
    public Sala get (Sala s, String column) {
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
            
            Sala sala = new Sala();
            
            while (rs.next()){
                sala.setId(rs.getInt("id"));
                sala.setCodigo(rs.getString("codigo"));
                sala.setIdAdministrador(rs.getString("id_administrador"));
                sala.setIdBloco(rs.getInt("id_bloco"));
                sala.setIdTipoSala(rs.getInt("id_tipo_de_sala"));
                sala.setAtivo(rs.getBoolean("ativo"));
                sala.setEquipamentos(rs.getString("equipamentos"));
            }
            
            con.close();
            return sala;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter um objeto ATIVO com base na coluna dada
    public Sala getAtivo (Sala s, String column) {
        Sala sala = get (s, column);
        
        if(sala.isAtivo() == true)
            return sala;
        else
            return null;
    }
    
    
    // Obter todos os objetos
    public List<Sala> getAll () {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table;
            PreparedStatement stmt = con.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();
            
            List<Sala> salas = new ArrayList<Sala>();
            
            while (rs.next()){
                Sala sala = new Sala();
                sala.setId(rs.getInt("id"));
                sala.setCodigo(rs.getString("codigo"));
                sala.setIdAdministrador(rs.getString("id_administrador"));
                sala.setIdBloco(rs.getInt("id_bloco"));
                sala.setIdTipoSala(rs.getInt("id_tipo_de_sala"));
                sala.setAtivo(rs.getBoolean("ativo"));
                sala.setEquipamentos(rs.getString("equipamentos"));
                
                salas.add(sala);
            }
            
            con.close();
            return salas;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter todos os objetos ATIVOS
    public List<Sala> getAllAtivos () {
        List<Sala> salas = getAll();  
        List<Sala> ativos = new ArrayList<Sala>();
        for (Sala sala : salas){
            if(sala.isAtivo() == true)
                ativos.add(sala);
        }
        
        return ativos;
    }
    
    
    
    // Insere um dado objeto do BD
    public boolean insert (Sala s){
        try{
            Connection con = db.connect();

            String query = "INSERT INTO "+table+" (codigo, id_bloco, "
                    + "id_tipo_de_sala, id_administrador, equipamentos, ativo) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, s.getCodigo());
            stmt.setInt(2, s.getIdBloco());
            stmt.setInt(3, s.getIdTipoSala());
            stmt.setString(4, s.getIdAdministrador());
            stmt.setString(5, s.getEquipamentos());
            stmt.setBoolean(6, s.isAtivo());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    
    // Atualiza um dado objeto no BD
    public boolean update (Sala s){
        try{
            Connection con = db.connect();

            String query = "UPDATE "+table+" SET codigo = ?, id_bloco = ?, "
                    + "id_tipo_de_sala = ?, id_administrador = ?, equipamentos = ?, "
                    + "ativo = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            
            
            stmt.setString(1, s.getCodigo());
            stmt.setInt(2, s.getIdBloco());
            stmt.setInt(3, s.getIdTipoSala());
            stmt.setString(4, s.getIdAdministrador());
            stmt.setString(5, s.getEquipamentos());
            stmt.setBoolean(5, s.isAtivo());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    // Desabilita o objeto no sistema
    public boolean disable (Sala s) {
        s.setAtivo(false);
        
        return update(s);
    }
    
    // Reabilita o objeto no sistema
    public boolean enable (Sala s) {
        s.setAtivo(true);
        
        return update(s);
    }
}
