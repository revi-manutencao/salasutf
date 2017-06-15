package Main;


import Database.*;
import Model.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.security.MessageDigest;
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
//        blocoSearch.setCodigo("I");
//        Bloco bl = bdao.get(blocoSearch, "codigo");
        


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

//        // Select specific
//        System.out.println("Cod: "+bl.getCodigo()+"\nId: "+bl.getId());

        // Disable object
//        bdao.disable(bl);


        // re enable object
//        bdao.enable(bl);

        // update object
//        bl.setCodigo("K");
//        bdao.update(bl);

//Gravar arquivo - útil para informações do usuário
//        try{
//            FileWriter arq = new FileWriter("c:\\tabuada.txt");
//            PrintWriter gravarArq = new PrintWriter(arq);
//
//            gravarArq.printf("Username: X%n");
//            gravarArq.printf("Password: Y%n");
//
//            arq.close();
//
//        } catch(Exception e){}

        // Ler arquivo txt gerado
//        try {
//            FileReader arq = new FileReader("c:\\tabuada.txt");
//            BufferedReader lerArq = new BufferedReader(arq);
//
//            String linha = lerArq.readLine(); // lê a primeira linha
//              // a variável "linha" recebe o valor "null" quando o processo
//              // de repetição atingir o final do arquivo texto
//
//            while (linha != null) {
//              System.out.printf("%s\n", linha);
//
//              linha = lerArq.readLine(); // lê da segunda até a última linha
//            }
//
//            arq.close();
//        } catch (Exception e) {
//            System.err.printf("Erro na abertura do arquivo: %s.\n",
//              e.getMessage());
//        }

        // Exibir senha encriptada
            System.out.println(hashPassword("admin"));

    }
    
    // Função para encriptação de senhas
    public static String hashPassword (String password) {
        String passwordToHash = "password";
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(passwordToHash.getBytes());
            //Get the hash's bytes 
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }
}
