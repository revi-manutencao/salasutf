package Main;


import Database.*;
import Model.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;



public class Teste {
    public static void main(String[] args){
        
        BlocoDao bdao = new BlocoDao();
        
//        Bloco b = new Bloco();
//        b.setCodigo("I");
//        b.setAtivo(true);
        
//        Bloco blocoSearch = new Bloco();
//        blocoSearch.setId(3);
//        Bloco bl = bdao.get(blocoSearch, "id");
        


        /**
         * Teste de operações com o BD
         */

        //Insert
//        bdao.insert(b);
        
        // Select all
//        List<Bloco> blocos = bdao.getAll();        
//        for (Bloco bloco : blocos){
//            System.out.println("Cod: "+bloco.getCodigo()+"\nId: "+bloco.getId()+"\n");
//        }
        
        // Select all actives
//        List<Bloco> blocos = bdao.getAllAtivos();        
//        for (Bloco bloco : blocos){
//            System.out.println("Cod: "+bloco.getCodigo()+"\nId: "+bloco.getId()+"\n");
//        }

        // Select specific
//        System.out.println("Cod: "+bl.getCodigo()+"\nId: "+bl.getId());

        // Disable object
//        bdao.disable(bl);


        // re enable object
//        bdao.enable(bl);

        // update object
//        bl.setCodigo("K");
//        bdao.update(bl);
        
    }
}
