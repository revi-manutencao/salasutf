/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author vinicius
 */
public class DescricaoSala extends javax.swing.JPanel {

    /**
     * Creates new form DescSala
     */
    public DescricaoSala() {
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

        jlNomeSala1 = new javax.swing.JLabel();
        jlDescricao1 = new javax.swing.JLabel();
        jlHorariosDisponiveis1 = new javax.swing.JLabel();
        jpResultadoHorarios1 = new java.awt.Panel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtabHorariosDisponiveis1 = new javax.swing.JTable();
        jbReservar1 = new javax.swing.JButton();
        jldescricaoHorario1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(367, 545));
        setMinimumSize(new java.awt.Dimension(367, 545));

        jlNomeSala1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlNomeSala1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNomeSala1.setText("SALA X");

        jlDescricao1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlDescricao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDescricao1.setText("Descrição da sala selecionada");

        jlHorariosDisponiveis1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jlHorariosDisponiveis1.setText("Reservar esta sala");

        jpResultadoHorarios1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        jtabHorariosDisponiveis1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"M1", "M1", "M1", "", "M1"},
                {"M2", null, null, "M2", null},
                {"", "M3", "M3", null, null},
                {"M4", null, null, null, "M4"},
                {"", "M5", null, "M5", "M5"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "SEG", "TER", "QUA", "QUI", "SEX"
            }
        ));
        jtabHorariosDisponiveis1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtabHorariosDisponiveis1ComponentAdded(evt);
            }
        });
        jScrollPane4.setViewportView(jtabHorariosDisponiveis1);

        javax.swing.GroupLayout jpResultadoHorarios1Layout = new javax.swing.GroupLayout(jpResultadoHorarios1);
        jpResultadoHorarios1.setLayout(jpResultadoHorarios1Layout);
        jpResultadoHorarios1Layout.setHorizontalGroup(
            jpResultadoHorarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadoHorarios1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpResultadoHorarios1Layout.setVerticalGroup(
            jpResultadoHorarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadoHorarios1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        jbReservar1.setText("Reservar");

        jldescricaoHorario1.setBackground(new java.awt.Color(255, 102, 102));
        jldescricaoHorario1.setText("Selecione um horário disponível");

        jLabel2.setText("<html>X computadores...</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNomeSala1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlDescricao1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(jbReservar1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jldescricaoHorario1)
                        .addComponent(jpResultadoHorarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlHorariosDisponiveis1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlNomeSala1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlDescricao1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jlHorariosDisponiveis1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jldescricaoHorario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpResultadoHorarios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbReservar1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtabHorariosDisponiveis1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtabHorariosDisponiveis1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtabHorariosDisponiveis1ComponentAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbReservar1;
    private javax.swing.JLabel jlDescricao1;
    private javax.swing.JLabel jlHorariosDisponiveis1;
    private javax.swing.JLabel jlNomeSala1;
    private javax.swing.JLabel jldescricaoHorario1;
    private java.awt.Panel jpResultadoHorarios1;
    private javax.swing.JTable jtabHorariosDisponiveis1;
    // End of variables declaration//GEN-END:variables
}
