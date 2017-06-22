/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Editar;

import Database.BlocoDao;
import Model.Bloco;
import static Util.Utility.disposeModal;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class EditarBloco extends javax.swing.JPanel {

    /**
     * Creates new form EditarBloco
     */
    public EditarBloco() {
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

        jpPesquisar = new javax.swing.JPanel();
        jbConfirmar = new javax.swing.JButton();
        jlSubTitulo = new javax.swing.JLabel();
        jcbBloco = new javax.swing.JComboBox<>();
        jpAlterar = new javax.swing.JPanel();
        jcbCancelar = new javax.swing.JButton();
        jlNome = new javax.swing.JLabel();
        jrDesativar = new javax.swing.JRadioButton();
        jtNome = new javax.swing.JTextField();
        jbAlterar = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(259, 292));
        setMinimumSize(new java.awt.Dimension(259, 292));

        jpPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));
        jpPesquisar.setPreferredSize(new java.awt.Dimension(300, 169));

        jbConfirmar.setText("Confirmar");
        jbConfirmar.setPreferredSize(new java.awt.Dimension(80, 23));
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jlSubTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSubTitulo.setText("Selecione o bloco que deseja alterar");

        List<Bloco> blocos = new BlocoDao().getAll();
        Bloco[] arrBlocos =  new Bloco[blocos.size()];
        arrBlocos = blocos.toArray(arrBlocos);
        jcbBloco.setModel(new javax.swing.DefaultComboBoxModel(arrBlocos));
        jcbBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBlocoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPesquisarLayout = new javax.swing.GroupLayout(jpPesquisar);
        jpPesquisar.setLayout(jpPesquisarLayout);
        jpPesquisarLayout.setHorizontalGroup(
            jpPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPesquisarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jlSubTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpPesquisarLayout.setVerticalGroup(
            jpPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPesquisarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlSubTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );

        jpAlterar.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar"));
        jpAlterar.setPreferredSize(new java.awt.Dimension(300, 246));

        jcbCancelar.setText("Cancelar");
        jcbCancelar.setPreferredSize(new java.awt.Dimension(70, 23));
        jcbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCancelarActionPerformed(evt);
            }
        });

        jlNome.setText("Nome");

        jrDesativar.setText("Desativar");
        jrDesativar.setEnabled(false);

        jtNome.setEnabled(false);
        jtNome.setFocusable(false);

        jbAlterar.setText("Alterar");
        jbAlterar.setEnabled(false);
        jbAlterar.setPreferredSize(new java.awt.Dimension(70, 23));
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAlterarLayout = new javax.swing.GroupLayout(jpAlterar);
        jpAlterar.setLayout(jpAlterarLayout);
        jpAlterarLayout.setHorizontalGroup(
            jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlterarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrDesativar)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAlterarLayout.setVerticalGroup(
            jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAlterarLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrDesativar)
                .addGap(24, 24, 24)
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("EDITAR BLOCO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(jpPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        Bloco bloco = (Bloco) jcbBloco.getSelectedItem();
        jtNome.setText(bloco.getCodigo());
        jrDesativar.setSelected(!bloco.isAtivo());
        jtNome.setFocusable(true);
        jtNome.setEnabled(true);
        jtNome.requestFocus();
        jrDesativar.setEnabled(true);
        jbAlterar.setEnabled(true);
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jcbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCancelarActionPerformed
        disposeModal(this);
    }//GEN-LAST:event_jcbCancelarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        Bloco bloco = (Bloco) jcbBloco.getSelectedItem();
        bloco.setAtivo(!jrDesativar.isSelected());
        bloco.setCodigo(jtNome.getText());
        
        BlocoDao bdao = new BlocoDao();
        if (bdao.update(bloco)) {
            JOptionPane.showMessageDialog(null, "O bloco foi atualizado", "Sucesso", JOptionPane.PLAIN_MESSAGE);
            disposeModal(this);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o bloco", "Erro", JOptionPane.PLAIN_MESSAGE);
            jtNome.requestFocus();
        }

    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jcbBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBlocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbBlocoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JComboBox<String> jcbBloco;
    private javax.swing.JButton jcbCancelar;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSubTitulo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpAlterar;
    private javax.swing.JPanel jpPesquisar;
    private javax.swing.JRadioButton jrDesativar;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables
}
