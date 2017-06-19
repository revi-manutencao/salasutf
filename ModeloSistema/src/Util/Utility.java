/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Model.Bloco;
import java.awt.Dimension;
import java.awt.Frame;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author vinicius
 */
public class Utility {
    public static void setModal(JPanel inner, Frame parent, int width, int height, String title){
        JDialog frame = new JDialog (parent, title, true);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setResizable(false);
        frame.add(inner);
        frame.pack();
        frame.setLocationRelativeTo(parent);
        frame.setVisible(true);
    }
    
    public static void disposeModal(JPanel painelModal) {
        JDialog parent = (JDialog) painelModal.getParent().getParent().getParent().getParent();
        parent.dispose();
    }
    
    public static String now() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.toString();
    }
}