/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Database.*;
import Model.*;
import Util.Hash;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class Auth {
    public static boolean autenticaLogin (String login, String password) {
        Usuario u = new Usuario();
        u.setLogin(login);
        u.setSenha(Hash.hashPassword(password));
        
        UsuarioDao ud = new UsuarioDao();
        Usuario user = ud.getAuth(u);        
        
        if(user.getLogin() == null) {
            return false;
        } else {
            try{
                FileWriter arq = new FileWriter("userdata.txt");
                PrintWriter gravarArq = new PrintWriter(arq);

                gravarArq.printf(login+"%n");
                gravarArq.printf(Hash.hashPassword(password)+"%n");

                arq.close();

            } catch(Exception e){}
            return true;
        }
    }
    
    public static boolean autenticaAutomatico () {
        Usuario user = getLoggedUser();        
        
        if(user.getLogin() == null) {
            return false;
        } else {
            return true;
        }
    }
    
    
    public static void sair () {
        try{
            FileWriter arq = new FileWriter("userdata.txt");
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.printf("%n");

            arq.close();

        } catch(Exception e){}
    }
    
    
    public static Usuario getLoggedUser () {
        String login = "", password = "";
        
        try { // Tenta obter os dados de acesso do arquivo
            FileReader arq = new FileReader("userdata.txt");
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine(); // lê a primeira linha
              // a variável "linha" recebe o valor "null" quando o processo
              // de repetição atingir o final do arquivo texto

            int i = 1;
            while (linha != null) {
              
              if(i == 1)
                  login = linha;
              else if(i == 2)
                  password = linha;

              linha = lerArq.readLine(); // lê da segunda até a última linha
              i++;
            }

            arq.close();
        } catch (Exception e) {
//            System.out.println(e.getMessage());
        }
        
        Usuario u = new Usuario();
        u.setLogin(login);
        u.setSenha(password);
        
        UsuarioDao ud = new UsuarioDao();
        Usuario user = ud.getAuth(u);
        
        return user;
    }
}
