package Database;

import Model.Horario;
import Model.Reserva;
import Model.Sala;
import Util.Auth;
import static com.sun.xml.internal.ws.util.StringUtils.capitalize;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ReservaDao {
    protected DB db;
    protected String table;
    
    public ReservaDao(){
        this.db = new DB();
        this.table = "reserva";
    }
    
    
    public List<Reserva> getBySalaEData (Sala sala, String data) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" WHERE id_sala = ? AND data_uso = ? AND ativo = true";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setInt(1, sala.getId());
            stmt.setString(2, data);

            ResultSet rs = stmt.executeQuery();
            
            List<Reserva> ress = new ArrayList<Reserva>();
            
            while (rs.next()){
                Reserva res = new Reserva();
                res.setId(rs.getInt("id"));
                res.setDataUso(rs.getString("data_uso"));
                res.setDataHoraReserva(rs.getString("data_hora_reserva"));
                res.setIdSala(rs.getInt("id_sala"));
                res.setIdProfessor(rs.getString("id_professor"));
                res.setHorario(rs.getString("id_horarios"));
                res.setAtivo(rs.getBoolean("ativo"));
                
                ress.add(res);
            }
            
            con.close();
            return ress;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    public List<Reserva> buscaBySalaEDataDoUsuario (String dadosSala, String data) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" LEFT JOIN sala ON "+table
                    + ".id_sala = sala.id WHERE (UPPER(sala.id) LIKE UPPER(?) OR "
                    + "UPPER(sala.equipamentos) LIKE UPPER(?)) AND data_uso = ? "
                    + "AND reserva.ativo = true AND reserva.id_professor = ? ORDER BY reserva.id_sala, "
                    + "reserva.id_horarios ";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, "%"+dadosSala+"%");
            stmt.setString(2, "%"+dadosSala+"%");
            stmt.setString(3, data);
            stmt.setString(4, Auth.getLoggedUser().getLogin());

            ResultSet rs = stmt.executeQuery();
            
            List<Reserva> ress = new ArrayList<Reserva>();
            
            while (rs.next()){
                Reserva res = new Reserva();
                res.setId(rs.getInt("id"));
                res.setDataUso(rs.getString("data_uso"));
                res.setDataHoraReserva(rs.getString("data_hora_reserva"));
                res.setIdSala(rs.getInt("id_sala"));
                res.setIdProfessor(rs.getString("id_professor"));
                res.setHorario(rs.getString("id_horarios"));
                res.setAtivo(rs.getBoolean("ativo"));
                
                ress.add(res);
            }
            
            con.close();
            return ress;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    public Reserva getBySalaDataHorario (Sala sala, String data, Horario horario) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" WHERE id_sala = ? AND data_uso = ? AND id_horarios = ? AND ativo = true";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setInt(1, sala.getId());
            stmt.setString(2, data);
            stmt.setString(3, horario.getId());

            ResultSet rs = stmt.executeQuery();
            
            Reserva res = new Reserva();
            
            while (rs.next()){
                res.setId(rs.getInt("id"));
                res.setDataUso(rs.getString("data_uso"));
                res.setDataHoraReserva(rs.getString("data_hora_reserva"));
                res.setIdSala(rs.getInt("id_sala"));
                res.setIdProfessor(rs.getString("id_professor"));
                res.setHorario(rs.getString("id_horarios"));
                res.setAtivo(rs.getBoolean("ativo"));
            }
            
            con.close();
            return res;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    /**
    * Funções básicas de CRUD 
    */
    
    // Obter um objeto com base na coluna dada
    public Reserva get (Reserva r, String column) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" WHERE "+column+" = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            try{
                Method m = r.getClass().getMethod("get" + capitalize(column));
                String val = (String) m.invoke(r);
                
                stmt.setString(1, val);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            
            ResultSet rs = stmt.executeQuery();            
            
            Reserva res = new Reserva();
            
            while (rs.next()){
                res.setId(rs.getInt("id"));
                res.setDataUso(rs.getString("data_uso"));
                res.setDataHoraReserva(rs.getString("data_hora_reserva"));
                res.setIdSala(rs.getInt("id_sala"));
                res.setIdProfessor(rs.getString("id_professor"));
                res.setHorario(rs.getString("id_horarios"));
                res.setAtivo(rs.getBoolean("ativo"));
            }
            
            con.close();
            return res;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter um objeto ATIVO com base na coluna dada
    public Reserva getAtivo (Reserva r, String column) {
        Reserva res = get (r, column);
        
        if(res.isAtivo() == true)
            return res;
        else
            return null;
    }
    
    
    // Obter todos os objetos
    public List<Reserva> getAll () {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table;
            PreparedStatement stmt = con.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();
            
            List<Reserva> ress = new ArrayList<Reserva>();
            
            while (rs.next()){
                Reserva res = new Reserva();
                res.setId(rs.getInt("id"));
                res.setDataUso(rs.getString("data_uso"));
                res.setDataHoraReserva(rs.getString("data_hora_reserva"));
                res.setIdSala(rs.getInt("id_sala"));
                res.setIdProfessor(rs.getString("id_professor"));
                res.setHorario(rs.getString("id_horarios"));
                res.setAtivo(rs.getBoolean("ativo"));
                
                ress.add(res);
            }
            
            con.close();
            return ress;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter todos os objetos ATIVOS
    public List<Reserva> getAllAtivos () {
        List<Reserva> reservas = getAll();  
        List<Reserva> ativos = new ArrayList<Reserva>();
        for (Reserva res : reservas){
            if(res.isAtivo() == true)
                ativos.add(res);
        }
        
        return ativos;
    }
    
    
    
    // Insere um dado objeto do BD
    public boolean insert (Reserva r){
        try{
            Connection con = db.connect();

            String query = "INSERT INTO "+table+" (data_uso, data_hora_reserva, "
                    + "id_sala, id_professor, ativo, id_horarios) VALUES "
                    + "(?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, r.getDataUso());
            stmt.setString(2, r.getDataHoraReserva());
            stmt.setInt(3, r.getIdSala());
            stmt.setString(4, r.getIdProfessor());
            stmt.setBoolean(5, r.isAtivo());
            stmt.setString(6, r.getHorario());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    
    // Atualiza um dado objeto no BD
    public boolean update (Reserva r){
        try{
            Connection con = db.connect();

            String query = "UPDATE "+table+" SET data_uso = ?, data_hora_reserva = ?, "
                    + "id_sala = ?, id_professor = ?, ativo = ?, id_horarios = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            
            
            stmt.setString(1, r.getDataUso());
            stmt.setString(2, r.getDataHoraReserva());
            stmt.setInt(3, r.getIdSala());
            stmt.setString(4, r.getIdProfessor());
            stmt.setBoolean(5, r.isAtivo());
            stmt.setString(6, r.getHorario());
            stmt.setInt(7, r.getId());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    // Desabilita o objeto no sistema
    public boolean disable (Reserva r) {
        r.setAtivo(false);
        
        return update(r);
    }
    
    // Reabilita o objeto no sistema
    public boolean enable (Reserva r) {
        r.setAtivo(true);
        
        return update(r);
    }
}
