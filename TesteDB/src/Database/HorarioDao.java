package Database;

import Model.Horario;
import static com.sun.xml.internal.ws.util.StringUtils.capitalize;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class HorarioDao {
    protected DB db;
    protected String table;
    
    public HorarioDao(){
        this.db = new DB();
        this.table = "horario";
    }
    
    
    /**
    * Funções básicas de CRUD 
    */
    
    // Obter um objeto com base na coluna dada
    public Horario get (Horario h, String column) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" WHERE "+column+" = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            try{
                Method m = h.getClass().getMethod("get" + capitalize(column));
                String val = (String) m.invoke(h);
                
                stmt.setString(1, val);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
                        
            
            ResultSet rs = stmt.executeQuery();            
            
            Horario horario = new Horario();
            
            while (rs.next()){
                horario.setId(rs.getInt("id"));
                horario.setDescricao(rs.getString("descricao"));
                horario.setHorarioInicio(rs.getString("horarioInicio"));
                horario.setHorarioFim(rs.getString("horarioFim"));
                horario.setTurno(rs.getString("turno"));
                horario.setAtivo(rs.getBoolean("ativo"));
            }
            
            con.close();
            return horario;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter um objeto ATIVO com base na coluna dada
    public Horario getAtivo (Horario h, String column) {
        Horario dep = get (h, column);
        
        if(dep.isAtivo() == true)
            return dep;
        else
            return null;
    }
    
    
    // Obter todos os objetos
    public List<Horario> getAll () {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table;
            PreparedStatement stmt = con.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();
            
            List<Horario> horarios = new ArrayList<Horario>();
            
            while (rs.next()){
                Horario horario = new Horario();
                horario.setId(rs.getInt("id"));
                horario.setDescricao(rs.getString("descricao"));
                horario.setHorarioInicio(rs.getString("horarioInicio"));
                horario.setHorarioFim(rs.getString("horarioFim"));
                horario.setTurno(rs.getString("turno"));
                horario.setAtivo(rs.getBoolean("ativo"));
                
                horarios.add(horario);
            }
            
            con.close();
            return horarios;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter todos os objetos ATIVOS
    public List<Horario> getAllAtivos () {
        List<Horario> horas = getAll();  
        List<Horario> ativos = new ArrayList<Horario>();
        for (Horario hora : horas){
            if(hora.isAtivo() == true)
                ativos.add(hora);
        }
        
        return ativos;
    }
    
    
    
    // Insere um dado objeto do BD
    public boolean insert (Horario h){
        try{
            Connection con = db.connect();

            String query = "INSERT INTO "+table+" (descricao, horarioInicio, "
                    +"horarioFim, turno, ativo) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, h.getDescricao());
            stmt.setString(2, h.getHorarioInicio());
            stmt.setString(3, h.getHorarioFim());
            stmt.setString(4, h.getTurno());
            stmt.setBoolean(5, h.isAtivo());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    
    // Atualiza um dado objeto no BD
    public boolean update (Horario h){
        try{
            Connection con = db.connect();

            String query = "UPDATE "+table+" SET descricao = ?, horarioInicio = ?, "
                    + "horarioFim = ?, turno = ?, ativo = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, h.getDescricao());
            stmt.setString(2, h.getHorarioInicio());
            stmt.setString(3, h.getHorarioFim());
            stmt.setString(4, h.getTurno());
            stmt.setBoolean(5, h.isAtivo());
            stmt.setInt(6, h.getId());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    // Desabilita o objeto no sistema
    public boolean disable (Horario h) {
        h.setAtivo(false);
        
        return update(h);
    }
    
    // Reabilita o objeto no sistema
    public boolean enable (Horario h) {
        h.setAtivo(true);
        
        return update(h);
    }
}
