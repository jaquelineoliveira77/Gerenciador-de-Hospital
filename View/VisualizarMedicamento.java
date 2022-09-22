/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Medicamento;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaqueline Oliveira
 */
public class VisualizarMedicamento extends javax.swing.JFrame {

    ArrayList<Medicamento> listaMedicamentos;

    public VisualizarMedicamento(ArrayList<Medicamento> lista) {

        initComponents();

        // lista_medicamento vai receber a lista de medicamentos
        listaMedicamentos = lista;

        for (int i = 0; i < listaMedicamentos.size(); i++) {

            //adicionando a lista de medicamento no comboBox
            //vai pegar o nome do medicamento na posição i da lista e vai adicionar ao comboBox
            jComboBox1_ListaMed.addItem(listaMedicamentos.get(i).getNome());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1_ListaMed = new javax.swing.JComboBox<>();
        jButton1_Imprimir = new javax.swing.JButton();
        jButton2_remover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Medicamentos");

        jButton1_Imprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1_Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/newspaper_go.png"))); // NOI18N
        jButton1_Imprimir.setText("Imprimir");
        jButton1_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ImprimirActionPerformed(evt);
            }
        });

        jButton2_remover.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2_remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/cross.png"))); // NOI18N
        jButton2_remover.setText("Remover");
        jButton2_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_removerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1_ListaMed, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1_Imprimir)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2_remover)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jComboBox1_ListaMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_Imprimir)
                    .addComponent(jButton2_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ImprimirActionPerformed

        //variável nome vai receber o que foi selecionado no comboBox
        String nome = jComboBox1_ListaMed.getSelectedItem().toString();

        for (int i = 0; i < listaMedicamentos.size(); i++) {

            //se o nome da posição i, for igual ao nome que foi selecionado, vai ser mostrado
            if (listaMedicamentos.get(i).getNome().equals(nome)) {

                InformacoesMedicamento informacoesMedicamento = new InformacoesMedicamento(listaMedicamentos.get(i));
                informacoesMedicamento.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton1_ImprimirActionPerformed

    private void jButton2_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_removerActionPerformed

        //mostrando um aviso se relamente u usuário deseja excluir o medicamento
        switch (JOptionPane.showConfirmDialog(this, "Tem certeza disso?")) {
            case 0: //sim

                //variável nome vai receber o que foi selecionado no comboBox
                String nome = jComboBox1_ListaMed.getSelectedItem().toString();

                for (int i = 0; i < listaMedicamentos.size(); i++) {

                    //se o nome da posição i, for igual ao nome que foi selecionado, será excluído
                    if (listaMedicamentos.get(i).getNome().equals(nome)) {

                        //vai ser removido o medicamento da posição i da lista
                        listaMedicamentos.remove(i);
                        jComboBox1_ListaMed.removeItemAt(i);

                        if (listaMedicamentos.size() == 0) {
                            this.dispose();
                        }
                    }
                }
                break;
            case 1:
                break;
            case 2:
                break;
        }
    }//GEN-LAST:event_jButton2_removerActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Imprimir;
    private javax.swing.JButton jButton2_remover;
    private javax.swing.JComboBox<String> jComboBox1_ListaMed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
