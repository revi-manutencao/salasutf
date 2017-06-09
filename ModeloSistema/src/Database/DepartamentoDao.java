package Database;

import Model.Departamento;
import static com.sun.xml.internal.ws.util.StringUtils.capitalize;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DepartamentoDao {
    protected DB db;
    protected String table;
    
    public DepartamentoDao(){
        this.db = new DB();
        this.table = "departamento";
    }
    
    
    /**
    * Funções básicas de CRUD 
    */
    
    // Obter um objeto com base na coluna dada
    public Departamento get (Departamento d, String column) {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table+" WHERE "+column+" = ?";
            PreparedStatement stmt = con.prepareStatement(query);

            try{
                Method m = d.getClass().getMethod("get" + capitalize(column));
                String val = (String) m.invoke(d);
                
                stmt.setString(1, val);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
                        
            
            ResultSet rs = stmt.executeQuery();            
            
            Departamento departamento = new Departamento();
            
            while (rs.next()){
                departamento.setId(rs.getInt("id"));
                departamento.setNome(rs.getString("nome"));
                departamento.setSigla(rs.getString("sigla"));
                departamento.setAtivo(rs.getBoolean("ativo"));
            }
            
            con.close();
            return departamento;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter um objeto ATIVO com base na coluna dada
    public Departamento getAtivo (Departamento d, String column) {
        Departamento dep = get (d, column);
        
        if(dep.isAtivo() == true)
            return dep;
        else
            return null;
    }
    
    
    // Obter todos os objetos
    public List<Departamento> getAll () {
        try{
            Connection con = db.connect();

            String query = "SELECT * FROM "+table;
            PreparedStatement stmt = con.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();
            
            List<Departamento> departamentos = new ArrayList<Departamento>();
            
            while (rs.next()){
                Departamento departamento = new Departamento();
                departamento.setId(rs.getInt("id"));
                departamento.setNome(rs.getString("nome"));
                departamento.setSigla(rs.getString("sigla"));
                departamento.setAtivo(rs.getBoolean("ativo"));
                
                departamentos.add(departamento);
            }
            
            con.close();
            return departamentos;
            
        } catch(SQLException e){
            System.out.println(e);
            return null;
        }
    }
    
    // Obter todos os objetos ATIVOS
    public List<Departamento> getAllAtivos () {
        List<Departamento> deptos = getAll();  
        List<Departamento> ativos = new ArrayList<Departamento>();
        for (Departamento depto : deptos){
            if(depto.isAtivo() == true)
                ativos.add(depto);
        }
        
        return ativos;
    }
    
    
    
    // Insere um dado objeto do BD
    public boolean insert (Departamento d){
        try{
            Connection con = db.connect();

            String query = "INSERT INTO "+table+" (nome, sigla, ativo) VALUES (?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, d.getNome());
            stmt.setString(2, d.getSigla());
            stmt.setBoolean(3, d.isAtivo());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    
    // Atualiza um dado objeto no BD
    public boolean update (Departamento d){
        try{
            Connection con = db.connect();

            String query = "UPDATE "+table+" SET nome = ?, sigla = ?, ativo = ? WHERE id = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, d.getNome());
            stmt.setString(2, d.getSigla());
            stmt.setBoolean(2, d.isAtivo());
            stmt.setInt(3, d.getId());

            stmt.execute();
            
            con.close();
            return true;
            
        } catch(SQLException e){
            System.out.println(e);
            return false;
        }
    }
    
    // Desabilita o objeto no sistema
    public boolean disable (Departamento d) {
        d.setAtivo(false);
        
        return update(d);
    }
    
    // Reabilita o objeto no sistema
    public boolean enable (Departamento d) {
        d.setAtivo(true);
        
        return update(d);
    }
}
