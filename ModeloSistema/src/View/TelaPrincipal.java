package View;

import View.Cadastrar.CadastrarBlocos;
import View.Cadastrar.CadastrarDepartamentos;
import View.Cadastrar.CadastrarHorarios;
import View.Cadastrar.CadastrarSalas;
import View.Cadastrar.CadastrarTpsSala;
import View.Cadastrar.CadastrarUsuarios;
import View.Editar.EditarBlocos;
import View.Editar.EditarDepartamentos;
import View.Editar.EditarHorarios;
import View.Editar.EditarSalas;
import View.Editar.EditarTpsSala;
import View.Editar.EditarUsuarios;



public class TelaPrincipal extends javax.swing.JFrame {
    
    TelaReservas telareservas = new TelaReservas();
    TelaConsultar telaconsultar = new TelaConsultar();
    int telax = 680;
    int telay = 450;

    public TelaPrincipal() {
        telareservas.setVisible(false);
        telaconsultar.setVisible(false);
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        login1 = new View.Login();
        jmenubar = new javax.swing.JMenuBar();
        jmConsultar = new javax.swing.JMenu();
        jmReservas = new javax.swing.JMenu();
        jmGerenciar = new javax.swing.JMenu();
        jmCadastrar = new javax.swing.JMenu();
        jmCadSalas = new javax.swing.JMenuItem();
        jmCadBlocos = new javax.swing.JMenuItem();
        jmCadTipodeSalas = new javax.swing.JMenuItem();
        jmCadHorarios = new javax.swing.JMenuItem();
        jmCadDepartamento = new javax.swing.JMenuItem();
        jmCadUsuarios = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmEditar = new javax.swing.JMenu();
        jmEditarSalas = new javax.swing.JMenuItem();
        jmEditarBlocos = new javax.swing.JMenuItem();
        jmEditarTipodeSalas = new javax.swing.JMenuItem();
        jmEditarHorarios = new javax.swing.JMenuItem();
        jmEditarDepartamento = new javax.swing.JMenuItem();
        jmEditarUsuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpPrincipal.setPreferredSize(new java.awt.Dimension(660, 450));

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        jmenubar.setName(""); // NOI18N
        jmenubar.setRequestFocusEnabled(false);
        jmenubar.setVerifyInputWhenFocusTarget(false);

        jmConsultar.setText("Consultar");
        jmConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmConsultarMouseClicked(evt);
            }
        });
        jmConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultarActionPerformed(evt);
            }
        });
        jmenubar.add(jmConsultar);

        jmReservas.setText("Reservas");
        jmReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmReservasMouseClicked(evt);
            }
        });
        jmenubar.add(jmReservas);

        jmGerenciar.setText("Gerenciar");
        jmGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGerenciarActionPerformed(evt);
            }
        });

        jmCadastrar.setText("Cadastrar");

        jmCadSalas.setText("Salas");
        jmCadSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadSalasActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadSalas);

        jmCadBlocos.setText("Blocos");
        jmCadBlocos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadBlocosActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadBlocos);

        jmCadTipodeSalas.setText("Tipo de salas");
        jmCadTipodeSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadTipodeSalasActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadTipodeSalas);

        jmCadHorarios.setText("Horários");
        jmCadHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadHorariosActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadHorarios);

        jmCadDepartamento.setText("Departamento");
        jmCadDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadDepartamentoActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadDepartamento);

        jmCadUsuarios.setText("Usuários");
        jmCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadUsuariosActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadUsuarios);

        jmGerenciar.add(jmCadastrar);
        jmGerenciar.add(jSeparator2);

        jmEditar.setText("Editar");

        jmEditarSalas.setText("Salas");
        jmEditarSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarSalasActionPerformed(evt);
            }
        });
        jmEditar.add(jmEditarSalas);

        jmEditarBlocos.setText("Blocos");
        jmEditarBlocos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarBlocosActionPerformed(evt);
            }
        });
        jmEditar.add(jmEditarBlocos);

        jmEditarTipodeSalas.setText("Tipo de salas");
        jmEditarTipodeSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarTipodeSalasActionPerformed(evt);
            }
        });
        jmEditar.add(jmEditarTipodeSalas);

        jmEditarHorarios.setText("Horários");
        jmEditarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarHorariosActionPerformed(evt);
            }
        });
        jmEditar.add(jmEditarHorarios);

        jmEditarDepartamento.setText("Departamento");
        jmEditarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarDepartamentoActionPerformed(evt);
            }
        });
        jmEditar.add(jmEditarDepartamento);

        jmEditarUsuarios.setText("Usuários");
        jmEditarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarUsuariosActionPerformed(evt);
            }
        });
        jmEditar.add(jmEditarUsuarios);

        jmGerenciar.add(jmEditar);

        jmenubar.add(jmGerenciar);

        setJMenuBar(jmenubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultarActionPerformed
    
    }//GEN-LAST:event_jmConsultarActionPerformed

    private void jmCadSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadSalasActionPerformed
        CadastrarSalas cadsalas = new CadastrarSalas();
        cadsalas.setVisible(true);
    }//GEN-LAST:event_jmCadSalasActionPerformed

    private void jmEditarSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarSalasActionPerformed
        EditarSalas editarsalas = new EditarSalas();
        editarsalas.setVisible(true);

    }//GEN-LAST:event_jmEditarSalasActionPerformed

    private void jmGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGerenciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmGerenciarActionPerformed

    private void jmConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmConsultarMouseClicked
        if(!telaconsultar.isVisible()){
            jpPrincipal.add(telaconsultar).setBounds(0,0,telax,telay);
            telaconsultar.setVisible(true);
            telareservas.setVisible(false);
        }else{
            System.out.println("Tela já aberta");
        }

    }//GEN-LAST:event_jmConsultarMouseClicked

    private void jmReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmReservasMouseClicked
        if(!telareservas.isVisible()){
            jpPrincipal.add(telareservas).setBounds(0,0,telax,telay);
            telareservas.setVisible(true);
            telaconsultar.setVisible(false);
        }else{
            System.out.println("Tela já aberta");
        }

    }//GEN-LAST:event_jmReservasMouseClicked

    private void jmEditarBlocosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarBlocosActionPerformed
        
        EditarBlocos editarblocos = new EditarBlocos();
        editarblocos.setVisible(true);


    }//GEN-LAST:event_jmEditarBlocosActionPerformed

    private void jmEditarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarDepartamentoActionPerformed
        EditarDepartamentos editardepartamentos = new EditarDepartamentos();
        editardepartamentos.setVisible(true);

    }//GEN-LAST:event_jmEditarDepartamentoActionPerformed

    private void jmEditarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarHorariosActionPerformed
        EditarHorarios editarhorarios = new EditarHorarios();
        
        editarhorarios.setVisible(true);
    }//GEN-LAST:event_jmEditarHorariosActionPerformed

    private void jmCadBlocosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadBlocosActionPerformed
        CadastrarBlocos cadblocos = new CadastrarBlocos();
        cadblocos.setVisible(true);


    }//GEN-LAST:event_jmCadBlocosActionPerformed

    private void jmCadTipodeSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadTipodeSalasActionPerformed
        CadastrarTpsSala cadtiposala = new CadastrarTpsSala();
        cadtiposala.setVisible(true);


    }//GEN-LAST:event_jmCadTipodeSalasActionPerformed

    private void jmCadHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadHorariosActionPerformed
        CadastrarHorarios cadhorarios = new CadastrarHorarios();
        cadhorarios.setVisible(true);


    }//GEN-LAST:event_jmCadHorariosActionPerformed

    private void jmCadDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadDepartamentoActionPerformed
        CadastrarDepartamentos caddepartamentos = new CadastrarDepartamentos();
        caddepartamentos.setVisible(true);

    }//GEN-LAST:event_jmCadDepartamentoActionPerformed

    private void jmCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadUsuariosActionPerformed
        CadastrarUsuarios cadusuarios = new CadastrarUsuarios();
        cadusuarios.setVisible(true);

    }//GEN-LAST:event_jmCadUsuariosActionPerformed

    private void jmEditarTipodeSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarTipodeSalasActionPerformed
        EditarTpsSala editartiposala = new EditarTpsSala();
        editartiposala.setVisible(true);

    }//GEN-LAST:event_jmEditarTipodeSalasActionPerformed

    private void jmEditarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarUsuariosActionPerformed
        EditarUsuarios editarusuarios = new EditarUsuarios();
        editarusuarios.setVisible(true);

    }//GEN-LAST:event_jmEditarUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem jmCadBlocos;
    private javax.swing.JMenuItem jmCadDepartamento;
    private javax.swing.JMenuItem jmCadHorarios;
    private javax.swing.JMenuItem jmCadSalas;
    private javax.swing.JMenuItem jmCadTipodeSalas;
    private javax.swing.JMenuItem jmCadUsuarios;
    private javax.swing.JMenu jmCadastrar;
    private javax.swing.JMenu jmConsultar;
    private javax.swing.JMenu jmEditar;
    private javax.swing.JMenuItem jmEditarBlocos;
    private javax.swing.JMenuItem jmEditarDepartamento;
    private javax.swing.JMenuItem jmEditarHorarios;
    private javax.swing.JMenuItem jmEditarSalas;
    private javax.swing.JMenuItem jmEditarTipodeSalas;
    private javax.swing.JMenuItem jmEditarUsuarios;
    private javax.swing.JMenu jmGerenciar;
    private javax.swing.JMenu jmReservas;
    private javax.swing.JMenuBar jmenubar;
    private javax.swing.JPanel jpPrincipal;
    private View.Login login1;
    // End of variables declaration//GEN-END:variables
}