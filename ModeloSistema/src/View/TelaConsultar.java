/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Renato
 */
public class TelaConsultar extends javax.swing.JPanel {

    /**
     * Creates new form TelaReservas
     */
    public TelaConsultar() {
           initComponents();
    }
    
    public void focusInput() {
        jtDadosdePesquisa.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpConsultarSala = new javax.swing.JPanel();
        jtDadosdePesquisa = new javax.swing.JTextField();
        jlSubtituloData = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpResultadosdaBusca = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistResultadosBusca = new javax.swing.JList<>();
        jbuttonConsultar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(700, 430));
        setMinimumSize(new java.awt.Dimension(680, 430));
        setPreferredSize(new java.awt.Dimension(700, 430));
        setVerifyInputWhenFocusTarget(false);

        jpConsultarSala.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONSULTAR SALA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jpConsultarSala.setPreferredSize(new java.awt.Dimension(660, 450));

        jtDadosdePesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDadosdePesquisaActionPerformed(evt);
            }
        });

        jlSubtituloData.setText("Informe a data");

        jLabel1.setText("<html>Informe o código, o tipo ou uma palavra-chave para encontrar a sala que deseja consultar a disponibilidade. </html>");

        jLabel2.setText("Informações da sala que você quer");

        javax.swing.GroupLayout jpConsultarSalaLayout = new javax.swing.GroupLayout(jpConsultarSala);
        jpConsultarSala.setLayout(jpConsultarSalaLayout);
        jpConsultarSalaLayout.setHorizontalGroup(
            jpConsultarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultarSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpConsultarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jtDadosdePesquisa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpConsultarSalaLayout.createSequentialGroup()
                        .addGroup(jpConsultarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSubtituloData)
                            .addComponent(jLabel2))
                        .addGap(0, 211, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpConsultarSalaLayout.setVerticalGroup(
            jpConsultarSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultarSalaLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtDadosdePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlSubtituloData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpResultadosdaBusca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESULTADOS DA BUSCA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jlistResultadosBusca.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "A001   (3 horarios disponíveis)", "A002   (3 horarios disponíveis)", "A003   (3 horarios disponíveis)", "A004   (3 horarios disponíveis)", "A005   (3 horarios disponíveis)", "A006   (3 horarios disponíveis)", "A007   (3 horarios disponíveis)", "A008   (3 horarios disponíveis)", "A009   (3 horarios disponíveis)", "A010   (3 horarios disponíveis)", "A011   (3 horarios disponíveis)", "A001   (3 horarios disponíveis)", "A002   (3 horarios disponíveis)", "A003   (3 horarios disponíveis)", "A004   (3 horarios disponíveis)", "A005   (3 horarios disponíveis)", "A006   (3 horarios disponíveis)", "A007\t(3 horarios disponíveis)", "A008\t(3 horarios disponíveis)", "A009\t(3 horarios disponíveis)", "A010\t(3 horarios disponíveis)", "A011\t(3 horarios disponíveis)" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlistResultadosBusca.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlistResultadosBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistResultadosBuscaMouseClicked(evt);
            }
        });
        jlistResultadosBusca.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jlistResultadosBuscaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jlistResultadosBusca);

        jbuttonConsultar.setText("Consultar");
        jbuttonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpResultadosdaBuscaLayout = new javax.swing.GroupLayout(jpResultadosdaBusca);
        jpResultadosdaBusca.setLayout(jpResultadosdaBuscaLayout);
        jpResultadosdaBuscaLayout.setHorizontalGroup(
            jpResultadosdaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadosdaBuscaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jbuttonConsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpResultadosdaBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpResultadosdaBuscaLayout.setVerticalGroup(
            jpResultadosdaBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadosdaBuscaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbuttonConsultar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpConsultarSala, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpResultadosdaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpConsultarSala, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jpResultadosdaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(4, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void jtDadosdePesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDadosdePesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDadosdePesquisaActionPerformed

    private void jlistResultadosBuscaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jlistResultadosBuscaValueChanged
    }//GEN-LAST:event_jlistResultadosBuscaValueChanged

    private void jlistResultadosBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistResultadosBuscaMouseClicked
        if(evt.getClickCount()==2){
        System.out.println("teste "+ jlistResultadosBusca.getSelectedValue());
        DescricaoSala descricaosala = new DescricaoSala();
        descricaosala.setVisible(true);
        
        }
    }//GEN-LAST:event_jlistResultadosBuscaMouseClicked

    private void jbuttonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbuttonConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbuttonConsultar;
    private javax.swing.JLabel jlSubtituloData;
    private javax.swing.JList<String> jlistResultadosBusca;
    private javax.swing.JPanel jpConsultarSala;
    private javax.swing.JPanel jpResultadosdaBusca;
    private javax.swing.JTextField jtDadosdePesquisa;
    // End of variables declaration//GEN-END:variables
}
