package View;

import Model.TipoUsuario;
import Util.*;
import static Util.Utility.setModal;
import View.Cadastrar.*;
import View.Editar.*;
import javax.swing.JOptionPane;



public class TelaPrincipal extends javax.swing.JFrame {
    
    TelaReservas telareservas = new TelaReservas();
    TelaConsultar telaconsultar = new TelaConsultar();
    int telax = 700;
    int telay = 450;

    public TelaPrincipal() {
        telareservas.setVisible(false);
        telaconsultar.setVisible(false);
        initComponents();
        
       // Exibe a tela de acordo com o estado de autenticação do usuário
        if(Auth.autenticaAutomatico()){
            jmenubar.setVisible(true);
            
            // Oculta o menu de gerenciar caso seja do tipo professor
            if(Auth.getLoggedUser().getTipoUsuario() == TipoUsuario.PROF){
                jmGerenciar.setVisible(false);
            } else {
                jmGerenciar.setVisible(true);
            }
            
            jpLogin.setVisible(false);
            jpPrincipal.setVisible(true);
        
            jpPrincipal.add(telaconsultar).setBounds(0,0,telax,telay);
            telaconsultar.setVisible(true);
            telareservas.setVisible(false);
        } else {
            Auth.sair();
            jmenubar.setVisible(false);
            jpLogin.setVisible(true);
            jpPrincipal.setVisible(false);
        }
        
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jpLogin = new javax.swing.JPanel();
        TituloSistema = new javax.swing.JLabel();
        LabelLogin = new javax.swing.JLabel();
        LabelSenha = new javax.swing.JLabel();
        InputLogin = new javax.swing.JTextField();
        BtnEntrar = new javax.swing.JToggleButton();
        TituloLogin = new javax.swing.JLabel();
        InputSenha = new javax.swing.JPasswordField();
        LabelDescricao = new javax.swing.JLabel();
        jpPrincipal = new javax.swing.JPanel();
        jmenubar = new javax.swing.JMenuBar();
        jmConsultar = new javax.swing.JMenu();
        jmReservas = new javax.swing.JMenu();
        jmGerenciar = new javax.swing.JMenu();
        jmCadastrar = new javax.swing.JMenu();
        jmCadSala = new javax.swing.JMenuItem();
        jmCadBloco = new javax.swing.JMenuItem();
        jmCadTipoSala = new javax.swing.JMenuItem();
        jmCadHorario = new javax.swing.JMenuItem();
        jmCadDepartamento = new javax.swing.JMenuItem();
        jmCadUsuario = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmEditar = new javax.swing.JMenu();
        jmEditarSala = new javax.swing.JMenuItem();
        jmEditarBloco = new javax.swing.JMenuItem();
        jmEditarTipoSala = new javax.swing.JMenuItem();
        jmEditarHorario = new javax.swing.JMenuItem();
        jmEditarDepartamento = new javax.swing.JMenuItem();
        jmEditarUsuario = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reserva de Salas");
        setResizable(false);

        jpLogin.setMaximumSize(new java.awt.Dimension(647, 442));
        jpLogin.setMinimumSize(new java.awt.Dimension(647, 420));
        jpLogin.setPreferredSize(new java.awt.Dimension(647, 442));

        TituloSistema.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TituloSistema.setText("Reserva de Salas");

        LabelLogin.setText("Login");

        LabelSenha.setText("Senha");

        InputLogin.setName(""); // NOI18N

        BtnEntrar.setText("Entrar");
        BtnEntrar.setAutoscrolls(true);
        BtnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEntrarMouseClicked(evt);
            }
        });

        TituloLogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TituloLogin.setText("Entrar no sistema");

        InputSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputSenhaActionPerformed(evt);
            }
        });

        LabelDescricao.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        LabelDescricao.setText("<html>Encontre e reserve salas facilmente.<br><br>Confira as salas e os horários disponíveis e garanta seu acesso a ela para quando precisar.<br><br>Tudo isso em alguns poucos cliques e pouca burocracia.</html>");
        LabelDescricao.setMaximumSize(new java.awt.Dimension(296, 44));
        LabelDescricao.setMinimumSize(new java.awt.Dimension(296, 44));
        LabelDescricao.setName(""); // NOI18N

        javax.swing.GroupLayout jpLoginLayout = new javax.swing.GroupLayout(jpLogin);
        jpLogin.setLayout(jpLoginLayout);
        jpLoginLayout.setHorizontalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnEntrar)
                .addGap(103, 103, 103))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(InputLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLoginLayout.createSequentialGroup()
                        .addComponent(TituloLogin)
                        .addGap(20, 20, 20))
                    .addComponent(LabelLogin)
                    .addComponent(LabelSenha)
                    .addComponent(InputSenha))
                .addGap(28, 28, 28))
        );
        jpLoginLayout.setVerticalGroup(
            jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLoginLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(TituloSistema)
                .addGap(10, 10, 10)
                .addComponent(TituloLogin)
                .addGroup(jpLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(LabelLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEntrar)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jpPrincipal.setMaximumSize(new java.awt.Dimension(700, 450));
        jpPrincipal.setMinimumSize(new java.awt.Dimension(700, 450));
        jpPrincipal.setPreferredSize(new java.awt.Dimension(700, 450));

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        jmenubar.setFocusable(false);
        jmenubar.setName(""); // NOI18N
        jmenubar.setRequestFocusEnabled(false);
        jmenubar.setVerifyInputWhenFocusTarget(false);

        jmConsultar.setText("Consultar");
        jmConsultar.setContentAreaFilled(false);
        jmConsultar.setFocusable(false);
        jmConsultar.setRequestFocusEnabled(false);
        jmConsultar.setVerifyInputWhenFocusTarget(false);
        jmConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmConsultarMouseClicked(evt);
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

        jmCadSala.setText("Sala");
        jmCadSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadSalaActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadSala);

        jmCadBloco.setText("Bloco");
        jmCadBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadBlocoActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadBloco);

        jmCadTipoSala.setText("Tipo de sala");
        jmCadTipoSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadTipoSalaActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadTipoSala);

        jmCadHorario.setText("Horário");
        jmCadHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadHorarioActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadHorario);

        jmCadDepartamento.setText("Departamento");
        jmCadDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadDepartamentoActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadDepartamento);

        jmCadUsuario.setText("Usuário");
        jmCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadUsuarioActionPerformed(evt);
            }
        });
        jmCadastrar.add(jmCadUsuario);

        jmGerenciar.add(jmCadastrar);
        jmGerenciar.add(jSeparator2);

        jmEditar.setText("Editar");

        jmEditarSala.setText("Sala");
        jmEditarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarSalaActionPerformed(evt);
            }
        });
        jmEditar.add(jmEditarSala);

        jmEditarBloco.setText("Bloco");
        jmEditarBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarBlocoActionPerformed(evt);
            }
        });
        jmEditar.add(jmEditarBloco);

        jmEditarTipoSala.setText("Tipo de sala");
        jmEditarTipoSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarTipoSalaActionPerformed(evt);
            }
        });
        jmEditar.add(jmEditarTipoSala);

        jmEditarHorario.setText("Horário");
        jmEditarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarHorarioActionPerformed(evt);
            }
        });
        jmEditar.add(jmEditarHorario);

        jmEditarDepartamento.setText("Departamento");
        jmEditarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarDepartamentoActionPerformed(evt);
            }
        });
        jmEditar.add(jmEditarDepartamento);

        jmEditarUsuario.setText("Usuário");
        jmEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEditarUsuarioActionPerformed(evt);
            }
        });
        jmEditar.add(jmEditarUsuario);

        jmGerenciar.add(jmEditar);

        jmenubar.add(jmGerenciar);

        jmSair.setText("Desconectar");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jmenubar.add(jmSair);

        setJMenuBar(jmenubar);
        jmenubar.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
        );

        jpLogin.setVisible(true);
        jpPrincipal.setVisible(false);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmCadSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadSalaActionPerformed
        setModal(new CadastrarSala(), this, 300, 390, "Cadastrar sala");        
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmCadSalaActionPerformed

    private void jmEditarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarSalaActionPerformed
        setModal(new EditarSala(), this, 287, 424, "Editar sala");
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmEditarSalaActionPerformed

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
        telareservas.limpaConsulta();
    }//GEN-LAST:event_jmConsultarMouseClicked

    private void jmReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmReservasMouseClicked
        if(!telareservas.isVisible()){
            jpPrincipal.add(telareservas).setBounds(0,0,telax,telay);
            telareservas.setVisible(true);
            telaconsultar.setVisible(false);
        }else{
            System.out.println("Tela já aberta");
        }
        telaconsultar.limpaConsulta();

    }//GEN-LAST:event_jmReservasMouseClicked

    private void jmEditarBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarBlocoActionPerformed
        setModal(new EditarBloco(), this, 259, 312, "Editar bloco");
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmEditarBlocoActionPerformed

    private void jmEditarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarDepartamentoActionPerformed
        setModal(new EditarDepartamento(), this, 308, 333, "Editar departamento");
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmEditarDepartamentoActionPerformed

    private void jmEditarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarHorarioActionPerformed
        setModal(new EditarHorario(), this, 272, 387, "Editar horário");
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmEditarHorarioActionPerformed

    private void jmCadBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadBlocoActionPerformed
        setModal(new CadastrarBloco(), this, 304, 150, "Cadastrar bloco");
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmCadBlocoActionPerformed

    private void jmCadTipoSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadTipoSalaActionPerformed
        setModal(new CadastrarTipoSala(), this, 350, 140, "Cadastrar tipo de sala");
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmCadTipoSalaActionPerformed

    private void jmCadHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadHorarioActionPerformed
        setModal(new CadastrarHorario(), this, 300, 277, "Cadastrar horário");
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmCadHorarioActionPerformed

    private void jmCadDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadDepartamentoActionPerformed
        setModal(new CadastrarDepartamento(), this, 300, 185, "Cadastrar departamento");
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmCadDepartamentoActionPerformed

    private void jmCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadUsuarioActionPerformed
        setModal(new CadastrarUsuario(), this, 300, 300, "Cadastrar usuário");
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmCadUsuarioActionPerformed

    private void jmEditarTipoSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarTipoSalaActionPerformed
        setModal(new EditarTipoSala(), this, 304, 305, "Editar tipo de sala");
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmEditarTipoSalaActionPerformed

    private void jmEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEditarUsuarioActionPerformed
        setModal(new EditarUsuario(), this, 305, 490, "Editar usuário");
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmEditarUsuarioActionPerformed

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        Auth.sair();
        
        InputLogin.setText("");
        InputSenha.setText("");
       
        jmenubar.setVisible(false);
        
        jpPrincipal.setVisible(false);
        jpLogin.setVisible(true);
        InputLogin.requestFocus();
        
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_jmSairMouseClicked

    private void InputSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputSenhaActionPerformed

    private void BtnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEntrarMouseClicked
        if (Util.Auth.autenticaLogin(InputLogin.getText(), new StringBuilder().append(InputSenha.getPassword()).toString())){
            jmenubar.setVisible(true);
            jpLogin.setVisible(false);
            jpPrincipal.setVisible(true);

            // Oculta o menu de gerenciar caso seja do tipo professor
            if(Auth.getLoggedUser().getTipoUsuario() == TipoUsuario.PROF){
                jmGerenciar.setVisible(false);
            } else {
                jmGerenciar.setVisible(true);
            }
            jpPrincipal.add(telaconsultar).setBounds(0,0,telax,telay);
            telaconsultar.setVisible(true);
            telareservas.setVisible(false);
        } else{
            JOptionPane.showMessageDialog(null, "Os dados digitados estão incorretos.", "", JOptionPane.WARNING_MESSAGE);
            //            InputLogin.setText("");
            //            InputSenha.setText("");
            InputLogin.requestFocus();
        }
        telareservas.limpaConsulta();
        telaconsultar.limpaConsulta();
    }//GEN-LAST:event_BtnEntrarMouseClicked

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
    private javax.swing.JToggleButton BtnEntrar;
    private javax.swing.JTextField InputLogin;
    private javax.swing.JPasswordField InputSenha;
    private javax.swing.JLabel LabelDescricao;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel TituloLogin;
    private javax.swing.JLabel TituloSistema;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem jmCadBloco;
    private javax.swing.JMenuItem jmCadDepartamento;
    private javax.swing.JMenuItem jmCadHorario;
    private javax.swing.JMenuItem jmCadSala;
    private javax.swing.JMenuItem jmCadTipoSala;
    private javax.swing.JMenuItem jmCadUsuario;
    private javax.swing.JMenu jmCadastrar;
    private javax.swing.JMenu jmConsultar;
    private javax.swing.JMenu jmEditar;
    private javax.swing.JMenuItem jmEditarBloco;
    private javax.swing.JMenuItem jmEditarDepartamento;
    private javax.swing.JMenuItem jmEditarHorario;
    private javax.swing.JMenuItem jmEditarSala;
    private javax.swing.JMenuItem jmEditarTipoSala;
    private javax.swing.JMenuItem jmEditarUsuario;
    private javax.swing.JMenu jmGerenciar;
    private javax.swing.JMenu jmReservas;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuBar jmenubar;
    private javax.swing.JPanel jpLogin;
    private javax.swing.JPanel jpPrincipal;
    // End of variables declaration//GEN-END:variables
}
