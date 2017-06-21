/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Editar;

import Database.BlocoDao;
import Database.HorarioDao;
import Model.Bloco;
import Model.Horario;
import static Util.Utility.disposeModal;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class EditarHorario extends javax.swing.JPanel {

    /**
     * Creates new form EditarHorario
     */
    public EditarHorario() {
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

        jlTitulo = new javax.swing.JLabel();
        jpPesquisar = new javax.swing.JPanel();
        jbConfirmar = new javax.swing.JButton();
        jbSubTitulo = new javax.swing.JLabel();
        jcbHorario = new javax.swing.JComboBox<>();
        jpAlterar = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jtInicio = new javax.swing.JTextField();
        jlInicio = new javax.swing.JLabel();
        jlFim = new javax.swing.JLabel();
        jtFim = new javax.swing.JTextField();
        jcbTurno = new javax.swing.JComboBox<>();
        jbCancelar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jrDesativar = new javax.swing.JRadioButton();
        jlTurno = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(272, 367));
        setMinimumSize(new java.awt.Dimension(272, 367));

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("EDITAR HORÁRIOS");

        jpPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));
        jpPesquisar.setPreferredSize(new java.awt.Dimension(300, 169));

        jbConfirmar.setText("Confirmar");
        jbConfirmar.setPreferredSize(new java.awt.Dimension(80, 23));
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarjButton1ActionPerformed(evt);
            }
        });

        jbSubTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbSubTitulo.setText("Selecione o horáriosque deseja alterar");

        jcbHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horário", "M1", "M2", "M3", "M4", "M5" }));
        jcbHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHorariojComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPesquisarLayout = new javax.swing.GroupLayout(jpPesquisar);
        jpPesquisar.setLayout(jpPesquisarLayout);
        jpPesquisarLayout.setHorizontalGroup(
            jpPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jbSubTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpPesquisarLayout.setVerticalGroup(
            jpPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPesquisarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSubTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118))
        );

        jpAlterar.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar"));
        jpAlterar.setPreferredSize(new java.awt.Dimension(300, 246));

        jlNome.setText("Nome");

        jtNome.setFocusable(false);
        jtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNomeActionPerformed(evt);
            }
        });

        jtInicio.setFocusable(false);

        jlInicio.setText("Início");

        jlFim.setText("Fim");

        jtFim.setFocusable(false);

        jcbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Manhã", "Tarde", "Noite" }));

        jbCancelar.setText("Cancelar");
        jbCancelar.setPreferredSize(new java.awt.Dimension(70, 23));
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.setPreferredSize(new java.awt.Dimension(70, 23));

        jrDesativar.setText("Desativar");

        jlTurno.setText("Turno");

        javax.swing.GroupLayout jpAlterarLayout = new javax.swing.GroupLayout(jpAlterar);
        jpAlterar.setLayout(jpAlterarLayout);
        jpAlterarLayout.setHorizontalGroup(
            jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAlterarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAlterarLayout.createSequentialGroup()
                        .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlInicio)
                                .addComponent(jlNome))
                            .addComponent(jlTurno)
                            .addComponent(jlFim, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtFim, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpAlterarLayout.createSequentialGroup()
                                .addComponent(jrDesativar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jcbTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jpAlterarLayout.setVerticalGroup(
            jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTurno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrDesativar)
                .addGap(18, 18, 18)
                .addGroup(jpAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(jpPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarjButton1ActionPerformed
                     
    }//GEN-LAST:event_jbConfirmarjButton1ActionPerformed

    private void jcbHorariojComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHorariojComboBox1ActionPerformed
        Horario horario = (Horario) jcbHorario.getSelectedItem();
        horario.setAtivo(!jrDesativar.isSelected());
        horario.setDescricao(jtNome.getText());
        horario.setHorarioInicio(jtInicio.getText());
        horario.setHorarioFim(jtFim.getText());
        
        HorarioDao hdao = new HorarioDao();
        if (hdao.update(horario)) {
            JOptionPane.showMessageDialog(null, "O horário foi atualizado", "Sucesso", JOptionPane.PLAIN_MESSAGE);
            disposeModal(this);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o horário", "Erro", JOptionPane.PLAIN_MESSAGE);
            jtNome.requestFocus();
        }



    }//GEN-LAST:event_jcbHorariojComboBox1ActionPerformed

    private void jtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNomeActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        disposeModal(this);
    }//GEN-LAST:event_jbCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JLabel jbSubTitulo;
    private javax.swing.JComboBox<String> jcbHorario;
    private javax.swing.JComboBox<String> jcbTurno;
    private javax.swing.JLabel jlFim;
    private javax.swing.JLabel jlInicio;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlTurno;
    private javax.swing.JPanel jpAlterar;
    private javax.swing.JPanel jpPesquisar;
    private javax.swing.JRadioButton jrDesativar;
    private javax.swing.JTextField jtFim;
    private javax.swing.JTextField jtInicio;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables
}
