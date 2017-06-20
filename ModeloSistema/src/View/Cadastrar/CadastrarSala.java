/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastrar;

import Database.BlocoDao;
import Database.SalaDao;
import Database.TipoSalaDao;
import Database.UsuarioDao;
import Model.Bloco;
import Model.Sala;
import Model.TipoSala;
import Model.Usuario;
import static Util.Utility.disposeModal;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius
 */
public class CadastrarSala extends javax.swing.JPanel {

    /**
     * Creates new form cadSala
     */
    public CadastrarSala() {
        initComponents();
        //Combobox Administrador
        /*UsuarioDao usuariodao = new UsuarioDao();
        List<Usuario> usuario = usuariodao.getAllAtivos();
        for(Usuario usuarios : usuario){
            if(usuarios.getTipoUsuario() == 1)
            jcbAdministrador.addItem(usuarios.getNome());
        }*/
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
        jtxtCodSala = new javax.swing.JTextField();
        jlCodigodaSala = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        jbBloco = new javax.swing.JComboBox<>();
        jbTiposdeSala = new javax.swing.JComboBox<>();
        jlAdministrador = new javax.swing.JLabel();
        jlBloco = new javax.swing.JLabel();
        jlTipodeSala = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jcbAdministrador = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtDescricao = new javax.swing.JTextArea();

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Cadastrar Sala");

        jlCodigodaSala.setText("Código da sala");

        jlDescricao.setText("Descrição");

        List<Bloco> blocos = new BlocoDao().getAllAtivos();
        Bloco[] arrBlocos =  new Bloco[blocos.size()];
        arrBlocos = blocos.toArray(arrBlocos);
        jbBloco.setModel(new javax.swing.DefaultComboBoxModel(arrBlocos));
        jbBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBlocoActionPerformed(evt);
            }
        });

        List<TipoSala> tiposSala = new TipoSalaDao().getAllAtivos();
        TipoSala[] arrTipoSala =  new TipoSala[tiposSala.size()];
        arrTipoSala = tiposSala.toArray(arrTipoSala);
        jbTiposdeSala.setModel(new javax.swing.DefaultComboBoxModel(arrTipoSala));

        jlAdministrador.setText("Administrador");

        jlBloco.setText("Bloco");

        jlTipodeSala.setText("Tipo de sala");

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        List<Usuario> admins = new UsuarioDao().getAllAdmins();
        Usuario[] arrAdmin =  new Usuario[admins.size()];
        arrAdmin = admins.toArray(arrAdmin);
        jcbAdministrador.setModel(new javax.swing.DefaultComboBoxModel(arrAdmin));

        jtDescricao.setColumns(20);
        jtDescricao.setLineWrap(true);
        jtDescricao.setRows(5);
        jScrollPane2.setViewportView(jtDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlCodigodaSala)
                            .addComponent(jlAdministrador)
                            .addComponent(jlBloco)
                            .addComponent(jlTipodeSala))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbTiposdeSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbAdministrador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtCodSala)
                            .addComponent(jbBloco, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jlDescricao))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCodSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCodigodaSala))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAdministrador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBloco)
                    .addComponent(jbBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipodeSala)
                    .addComponent(jbTiposdeSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbCadastrar))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        disposeModal(this);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        // Base para fazer o create - analisar o combobox
        Sala sala = new Sala();
        sala.setAtivo(true);
        sala.setCodigo(jtxtCodSala.getText());
        
        Usuario admin = (Usuario) jcbAdministrador.getSelectedItem();
        sala.setIdAdministrador(admin.getLogin());
        
        Bloco bloco = (Bloco) jbBloco.getSelectedItem();
        sala.setIdBloco(bloco.getId());
        
        TipoSala tiposala = (TipoSala) jbTiposdeSala.getSelectedItem();
        sala.setIdTipoSala(tiposala.getId());
        sala.setEquipamentos(jtDescricao.getText());
        
        SalaDao sd = new SalaDao();
        if(sd.insert(sala)){
            JOptionPane.showMessageDialog(null, "A sala foi cadastrada", "Sucesso", JOptionPane.PLAIN_MESSAGE);
            disposeModal(this);
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar a sala", "Erro", JOptionPane.PLAIN_MESSAGE);
            jtxtCodSala.requestFocus();
        }
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBlocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbBlocoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jbBloco;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JComboBox<String> jbTiposdeSala;
    private javax.swing.JComboBox<String> jcbAdministrador;
    private javax.swing.JLabel jlAdministrador;
    private javax.swing.JLabel jlBloco;
    private javax.swing.JLabel jlCodigodaSala;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlTipodeSala;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextArea jtDescricao;
    private javax.swing.JTextField jtxtCodSala;
    // End of variables declaration//GEN-END:variables
}
