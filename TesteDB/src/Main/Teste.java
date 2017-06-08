package Main;


import Database.*;
import Model.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


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
        
        BlocoDao bdao = new BlocoDao();
        
        Bloco b = new Bloco();
        b.setCodigo("I");
        b.setAtivo(true);
        
        //Insert
//        bdao.insert(b);
        
        // Select all
//        List<Bloco> blocos = bdao.getAll();        
//        for (Bloco bloco : blocos){
//            System.out.println("Cod: "+bloco.getCodigo()+"\nId: "+bloco.getId()+"\n");
//        }

        // Select specific
        Bloco blocoSearch = new Bloco();
        blocoSearch.setId(3);
        Bloco bloco = bdao.get(blocoSearch);
        System.out.println("Cod: "+bloco.getCodigo()+"\nId: "+bloco.getId());

        // Disable object
//        Bloco blocoSearch = new Bloco();
//        blocoSearch.setId(3);
//        Bloco bloco = bdao.get(blocoSearch);
//        bdao.disable(bloco);
        
    }
}
