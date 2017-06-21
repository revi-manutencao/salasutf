/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastrar;

import Database.DepartamentoDao;
import Database.UsuarioDao;
import Model.Departamento;
import Model.TipoUsuario;
import Model.Usuario;
import Util.Auth;
import Util.Hash;
import static Util.Utility.disposeModal;
import static Util.Utility.now;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class CadastrarUsuario extends javax.swing.JPanel {

    /**
     * Creates new form CadastrarUsuario
     */
    public CadastrarUsuario() {
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

        jlNome = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jtNome = new javax.swing.JTextField();
        jlTitulo = new javax.swing.JLabel();
        jtLogin = new javax.swing.JTextField();
        jlLogin = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jcbTiposUsuário = new javax.swing.JComboBox<>();
        jcbDepartamento = new javax.swing.JComboBox<>();
        jbCancelar = new javax.swing.JButton();
        jPassSenha = new javax.swing.JPasswordField();
        jlEmail1 = new javax.swing.JLabel();
        jlEmail2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(300, 280));
        setMinimumSize(new java.awt.Dimension(300, 280));
        setPreferredSize(new java.awt.Dimension(300, 280));

        jlNome.setText("Nome");

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Cadastrar Usuário");

        jtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtLoginActionPerformed(evt);
            }
        });

        jlLogin.setText("Login");

        jlSenha.setText("Senha");

        jlEmail.setText("Email");

        jtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEmailActionPerformed(evt);
            }
        });

        if(Auth.getLoggedUser().getTipoUsuario() == TipoUsuario.ADMIN)
        jcbTiposUsuário.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor" }));
        else if(Auth.getLoggedUser().getTipoUsuario() == TipoUsuario.MASTER){
            jcbTiposUsuário.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Professor", "Administrador" }));
        }
        jcbTiposUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTiposUsuárioActionPerformed(evt);
            }
        });

        List<Departamento> dpts = new DepartamentoDao().getAllAtivos();
        Departamento[] arrDepto =  new Departamento[dpts.size()];
        arrDepto = dpts.toArray(arrDepto);
        jcbDepartamento.setModel(new javax.swing.DefaultComboBoxModel(arrDepto));

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlEmail1.setText("Tipos de usuário");

        jlEmail2.setText("Departamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jlNome))
                            .addComponent(jlSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlLogin, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtLogin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNome)
                            .addComponent(jPassSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlEmail2)
                            .addComponent(jlEmail1)
                            .addComponent(jlEmail))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbTiposUsuário, 0, 162, Short.MAX_VALUE)
                                    .addComponent(jtEmail)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(128, Short.MAX_VALUE)
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCadastrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLogin)
                    .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSenha)
                    .addComponent(jPassSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail1)
                    .addComponent(jcbTiposUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail2)
                    .addComponent(jcbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    private void jtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLoginActionPerformed

    private void jtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEmailActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        disposeModal(this);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jcbTiposUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTiposUsuárioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTiposUsuárioActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
       Usuario user = new Usuario();
       
       // Definir Aceito e Ativo com base no aceite do admin - a princípio define tudo true
       user.setAceito(true);
       user.setAtivo(true);
       
       user.setDataHoraCadastro(now());
       user.setLogin(jtLogin.getText());
       user.setNome(jtNome.getText());
       user.setEmail(jtEmail.getText());
       user.setSenha(Hash.hashPassword(String.valueOf(jPassSenha.getPassword())));
       
       if(jcbTiposUsuário.getSelectedItem().equals("Professor")){
           user.setTipoUsuario(Model.TipoUsuario.PROF);
       } else {
           user.setTipoUsuario(Model.TipoUsuario.ADMIN);
       }
       
       Departamento dpt = (Departamento) jcbDepartamento.getSelectedItem();
       user.setIdDepartamento(dpt.getId());
       
       UsuarioDao ud = new UsuarioDao();
       if(ud.insert(user)){
           JOptionPane.showMessageDialog(null, "O usuário foi cadastrado", "Sucesso", JOptionPane.PLAIN_MESSAGE);
           disposeModal(this);
       } else {
           JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o usuário", "Erro", JOptionPane.PLAIN_MESSAGE);
           jtNome.requestFocus();
       }
    }//GEN-LAST:event_jbCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField jPassSenha;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JComboBox<String> jcbDepartamento;
    private javax.swing.JComboBox<String> jcbTiposUsuário;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlEmail1;
    private javax.swing.JLabel jlEmail2;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtLogin;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables
}
