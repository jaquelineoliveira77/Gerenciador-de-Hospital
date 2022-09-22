package View;


import Model.Comum;
import Model.Funcionario;
import Model.Plantonista;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaqueline Oliveira
 */
public class VisualizarFuncionario extends javax.swing.JFrame {

    ArrayList<Funcionario> lista_funcionarios;

    //trazendo por parametro a lista de funcionários cadastrados
    public VisualizarFuncionario(ArrayList<Funcionario> lista) {
        initComponents();

        // lista_funcionarios vai receber a lista de funcionários
        lista_funcionarios = lista;

        for (int i = 0; i < lista_funcionarios.size(); i++) {

            //adicionando a lista de funcionários no comboBox
            //vai pegar o nome do funcionário na posição i da lista e vai adicionar ao comboBox
            jComboBox1_ListaFun.addItem(lista_funcionarios.get(i).getNome());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1_ListaFun = new javax.swing.JComboBox<>();
        jButton1_Imprimir = new javax.swing.JButton();
        jButton2_remover = new javax.swing.JButton();
        jButton3_Salvar = new javax.swing.JButton();
        jButton4_EnviarMsg = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funcionários");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Funcionários");

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

        jButton3_Salvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/user_add.png"))); // NOI18N
        jButton3_Salvar.setText("Salvar");
        jButton3_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_SalvarActionPerformed(evt);
            }
        });

        jButton4_EnviarMsg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4_EnviarMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/shape_square_go.png"))); // NOI18N
        jButton4_EnviarMsg.setText("Enviar Msg");
        jButton4_EnviarMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_EnviarMsgActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1_ListaFun, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1_Imprimir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2_remover)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3_Salvar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4_EnviarMsg)))
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1_ListaFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_Imprimir)
                    .addComponent(jButton3_Salvar)
                    .addComponent(jButton4_EnviarMsg))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1_Imprimir, jButton2_remover, jButton3_Salvar, jButton4_EnviarMsg});

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ImprimirActionPerformed

        //variável nome vai receber o que foi selecionado no comboBox
        String nome = jComboBox1_ListaFun.getSelectedItem().toString();

        for (int i = 0; i < lista_funcionarios.size(); i++) {

            //se o nome da posição i, for igual ao nome que foi selecionado, vai ser mostrado
            if (lista_funcionarios.get(i).getNome().equals(nome)) {

                if (lista_funcionarios.get(i).getTurno().equals("Comum")) {
                    InformacoesFuncionario informacoesFuncionario = new InformacoesFuncionario((Comum) lista_funcionarios.get(i));
                    informacoesFuncionario.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    informacoesFuncionario.setVisible(true);
                } else {
                    InformacoesFuncionario informacoesFuncionario = new InformacoesFuncionario((Plantonista) lista_funcionarios.get(i));
                    informacoesFuncionario.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    informacoesFuncionario.setVisible(true);
                }

            }
        }

    }//GEN-LAST:event_jButton1_ImprimirActionPerformed

    private void jButton2_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_removerActionPerformed

        //mostrando um aviso se relamente u usuário deseja excluir o funcionário
        switch (JOptionPane.showConfirmDialog(this, "Tem certeza disso?")) {
            case 0: //sim

                //variável nome vai receber o que foi selecionado no comboBox
                String nome = jComboBox1_ListaFun.getSelectedItem().toString();

                for (int i = 0; i < lista_funcionarios.size(); i++) {

                    //se o nome da posição i, for igual ao nome que foi selecionado, será excluído
                    if (lista_funcionarios.get(i).getNome().equals(nome)) {

                        //vai ser removido o funcionário da posição i da lista
                        lista_funcionarios.remove(i);
                        jComboBox1_ListaFun.removeItemAt(i);

                        if (lista_funcionarios.size() == 0) {
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

    private void jButton3_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_SalvarActionPerformed

        //Serialização
        String nomeDoArquivo = "funcionarios.ser";

        try {

            //Gera o arquivo para armazenar o objeto
            FileOutputStream arquivo = new FileOutputStream(nomeDoArquivo);

            //Classe responsavel por inserir os objetos
            ObjectOutputStream out = new ObjectOutputStream(arquivo);

            //write grava um caractere (16 bits) por vez
            out.writeObject(lista_funcionarios);
            out.close();
            arquivo.close();

            System.out.println("Funcionários salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados!");
        }

    }//GEN-LAST:event_jButton3_SalvarActionPerformed

    private void jButton4_EnviarMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_EnviarMsgActionPerformed

        for (int i = 0; i < lista_funcionarios.size(); i++) {

            /*O instanceof é um operador que permite testar se um objeto
            é uma instância de um tipo específico de uma class, subclass ou interface
             
            verificando se o que está na posição i da lista é um tipo de objeto da classe plantonista
             */
            if (lista_funcionarios.get(i) instanceof Plantonista) {

                //p vai receber a lista na posição i
                Plantonista p = (Plantonista) lista_funcionarios.get(i);
                p.enviarMsg();
                // vai ser enviado a mensagem
            }
        }
    }//GEN-LAST:event_jButton4_EnviarMsgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Imprimir;
    private javax.swing.JButton jButton2_remover;
    private javax.swing.JButton jButton3_Salvar;
    private javax.swing.JButton jButton4_EnviarMsg;
    private javax.swing.JComboBox<String> jComboBox1_ListaFun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
