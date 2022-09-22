/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Comum;
import Model.Funcionario;
import Model.Plantonista;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Jaqueline Oliveira
 */
public class CadastroFuncionario extends javax.swing.JFrame {

    //ArrayList é uma classe para coleções
    //declarando, criando um Array, do tipo Funcionário, que armazenará uma lista de funcionários
    ArrayList<Funcionario> lista_funcionarios;

    public CadastroFuncionario() {
        initComponents();

        //lista vai receber o Array criado
        lista_funcionarios = new ArrayList();
    }

    //passando no construtor a lista
    //public CadastroFuncionario(ArrayList lista_funcionarios) {
    //   initComponents();
    // }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1_titulo = new javax.swing.JLabel();
        jLabel2_nome = new javax.swing.JLabel();
        jLabel3_cargo = new javax.swing.JLabel();
        jLabel4_matricula = new javax.swing.JLabel();
        jLabel5_setor = new javax.swing.JLabel();
        jLabel1_genero = new javax.swing.JLabel();
        jRadioButton1_feminino = new javax.swing.JRadioButton();
        jRadioButton2_masculino = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3_dataDeAdmissao = new javax.swing.JLabel();
        jTextField1_nome = new javax.swing.JTextField();
        jTextField3_cargo = new javax.swing.JTextField();
        jTextField4_setor = new javax.swing.JTextField();
        jTextField5_matricula = new javax.swing.JTextField();
        jButton1_cadastrar = new javax.swing.JButton();
        jButton2_vizualizar = new javax.swing.JButton();
        jButton3_carregar = new javax.swing.JButton();
        jRadioButton1_Comum = new javax.swing.JRadioButton();
        jRadioButton2_Plantonista = new javax.swing.JRadioButton();
        jButton3_carregar1 = new javax.swing.JButton();
        txfData = new javax.swing.JFormattedTextField();
        jTextField1_telefone = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Funcionários");

        jLabel1_titulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_titulo.setText("Cadastro de Funcionários");

        jLabel2_nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2_nome.setText("Nome");

        jLabel3_cargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3_cargo.setText("Cargo");

        jLabel4_matricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4_matricula.setText("Matrícula");

        jLabel5_setor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5_setor.setText("Setor");

        jLabel1_genero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1_genero.setText("Genero");

        buttonGroup1.add(jRadioButton1_feminino);
        jRadioButton1_feminino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1_feminino.setText("Feminino");
        jRadioButton1_feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_femininoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2_masculino);
        jRadioButton2_masculino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton2_masculino.setText("Masculino");
        jRadioButton2_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2_masculinoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Telefone");

        jLabel3_dataDeAdmissao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3_dataDeAdmissao.setText("Data de Admissão");

        jTextField3_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3_cargoActionPerformed(evt);
            }
        });

        jTextField5_matricula.setToolTipText("");
        jTextField5_matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5_matriculaActionPerformed(evt);
            }
        });
        jTextField5_matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5_matriculaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5_matriculaKeyTyped(evt);
            }
        });

        jButton1_cadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/tick.png"))); // NOI18N
        jButton1_cadastrar.setText("Cadastrar");
        jButton1_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_cadastrarActionPerformed(evt);
            }
        });

        jButton2_vizualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2_vizualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/magnifier.png"))); // NOI18N
        jButton2_vizualizar.setText("Vizualizar");
        jButton2_vizualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_vizualizarActionPerformed(evt);
            }
        });

        jButton3_carregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3_carregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/server_go.png"))); // NOI18N
        jButton3_carregar.setText("Carregar");
        jButton3_carregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_carregarActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton1_Comum);
        jRadioButton1_Comum.setText("Comum");
        jRadioButton1_Comum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_ComumActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2_Plantonista);
        jRadioButton2_Plantonista.setText("Plantonista");

        jButton3_carregar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3_carregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons/world_go.png"))); // NOI18N
        jButton3_carregar1.setText("Voltar");
        jButton3_carregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_carregar1ActionPerformed(evt);
            }
        });

        try {
            txfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txfData.setNavigationFilter(null);
        txfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDataActionPerformed(evt);
            }
        });

        jTextField1_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_telefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1_feminino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2_masculino))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField5_matricula, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField3_cargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5_setor)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField4_setor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField1_telefone))))
                            .addComponent(jTextField1_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(195, 195, 195))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3_dataDeAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfData, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jButton2_vizualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1_Comum, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jRadioButton2_Plantonista))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3_carregar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3_carregar1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1_cadastrar, jButton2_vizualizar, jButton3_carregar, jButton3_carregar1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_nome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3_cargo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5_setor)
                        .addComponent(jTextField4_setor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4_matricula)
                    .addComponent(jTextField5_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_genero)
                    .addComponent(jRadioButton1_feminino)
                    .addComponent(jRadioButton2_masculino))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3_dataDeAdmissao)
                    .addComponent(txfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1_Comum)
                    .addComponent(jRadioButton2_Plantonista))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_cadastrar)
                    .addComponent(jButton2_vizualizar)
                    .addComponent(jButton3_carregar)
                    .addComponent(jButton3_carregar1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1_cadastrar, jButton2_vizualizar, jButton3_carregar, jButton3_carregar1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1_femininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_femininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1_femininoActionPerformed

    private void jTextField3_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3_cargoActionPerformed

    private void jButton1_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_cadastrarActionPerformed

        String nome = "", cargo = "", setor = "", genero = "";
        int telefone = 0, matricula = 0;
        String dataAdmissao;

        //variável vai pegar o que foi digitado no campo de texto
        nome = jTextField1_nome.getText();
        cargo = jTextField3_cargo.getText();
        setor = jTextField4_setor.getText();
        dataAdmissao = txfData.getText();

        String turno;

        //variável vai pegar o que foi selecionado
        if (jRadioButton1_feminino.isSelected()) {
            genero = "feminino";
        } else if (jRadioButton2_masculino.isSelected()) {
            genero = "masculino";
        }

        if (!jTextField1_telefone.getText().equals("")) {

            telefone = Integer.valueOf(jTextField1_telefone.getText());
        }

        if (!jTextField5_matricula.getText().equals("")) {

            matricula = Integer.valueOf(jTextField5_matricula.getText());
        }

        //verificando se todos os campos foram preechidos
        if (!nome.equals("") && !cargo.equals("") && !setor.equals("") && !genero.equals("") && telefone != 0 && matricula != 0) {

            //verificadno qual tipo de funcionário foi selecionado, se for o Comum, ele entra no if
            if (jRadioButton1_Comum.isSelected()) {

                turno = "Comum";
                //instanciando a classe Comum e trazendo por parametro os atributos
                Comum c = new Comum(nome, cargo, setor, matricula, telefone, genero, dataAdmissao, turno);

                //adicionando na lista o funcionário que foi cadastrado
                lista_funcionarios.add(c);

                //caso contrário, foi selecionado a opção de plantonista
            } else if (jRadioButton2_Plantonista.isSelected()) {

                turno = "Plantonista";
                //instanciando a classe Plantonista e trazendo por parametro os atributos
                Plantonista p = new Plantonista(nome, cargo, setor, matricula, telefone, genero, dataAdmissao, 12, turno);

                //adicionando na lista o funcionário que foi cadastrado
                lista_funcionarios.add(p);
            }

            //caso todos os campos foram preenchidos, será mostrado a mensagem de que o funcionário foi cadastrado com sucesso
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);

            //limpanndo os campos
            jTextField1_nome.setText("");
            jTextField3_cargo.setText("");
            jTextField4_setor.setText("");
           jTextField1_telefone.setText("");
            jTextField5_matricula.setText("");
            txfData.setText("");

        } else {

            //caso exista algum campo sem ser preenchido, será msotrado a mensagem de que devem serem preenchidos
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton1_cadastrarActionPerformed

    private void jButton2_vizualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_vizualizarActionPerformed

        //verificando se a lista está vazia, caso não esteja, entrará no if
        if (lista_funcionarios.size() > 0) {

            //será chamado a tela de vizualizar funcionário que levará por parametro a lista de funcionários
            VisualizarFuncionario v = new VisualizarFuncionario(lista_funcionarios);
            v.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            v.setVisible(true);
            //deixando a tela visível

        } else {
            JOptionPane.showMessageDialog(null, "Não existe nenhum funcionário cadastrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2_vizualizarActionPerformed

    private void jRadioButton1_ComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_ComumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1_ComumActionPerformed

    private void jButton3_carregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_carregarActionPerformed

        try {

            /*Quando dizemos que um objeto é serializado, estamos afirmando que este objeto será transformado em bytes,
            e poderá ser armazenado em disco ou transmitido por um stream.
            O stream é um objeto de transmissão de dados, onde 
            um fluxo de dados serial é feito através de uma origem e de um destino
  
            O InputStream nos possibilita ler esse Stream em byte, um byte por vez
            criando uma instância de FileInputStream, passando como argumento a localização do Stream quegostaríamosde ler
             */
            //Gera o arquivo para armazenar o objeto
            FileInputStream arquivo = new FileInputStream("funcionarios.ser");

            //Classe responsavel por inserir os objetos
            ObjectInputStream in = new ObjectInputStream(arquivo);

            //O método read() do InputStream retorna um valor inteiro que contém obyte correspondente que foi lido
            lista_funcionarios = (ArrayList) in.readObject();
            in.close();
            arquivo.close();

            System.out.println("Funcionários carregados com sucesso!");

        } catch (IOException e) {

            System.out.println("Erro ao carregar os dados!");
            e.printStackTrace();

        } catch (ClassNotFoundException e2) {
            System.out.println("Erro ao carregar os dados!");
            e2.printStackTrace();
        }
    }//GEN-LAST:event_jButton3_carregarActionPerformed

    private void jTextField5_matriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5_matriculaActionPerformed


    }//GEN-LAST:event_jTextField5_matriculaActionPerformed

    private void jTextField5_matriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_matriculaKeyTyped

        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5_matriculaKeyTyped

    private void jRadioButton2_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2_masculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2_masculinoActionPerformed

    private void jButton3_carregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_carregar1ActionPerformed

        this.dispose();
        Menu menu = new Menu();
        menu.setVisible(true);


    }//GEN-LAST:event_jButton3_carregar1ActionPerformed

    private void txfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDataActionPerformed

    private void jTextField5_matriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5_matriculaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5_matriculaKeyPressed

    private void jTextField1_telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_telefoneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_cadastrar;
    private javax.swing.JButton jButton2_vizualizar;
    private javax.swing.JButton jButton3_carregar;
    private javax.swing.JButton jButton3_carregar1;
    private javax.swing.JLabel jLabel1_genero;
    private javax.swing.JLabel jLabel1_titulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_nome;
    private javax.swing.JLabel jLabel3_cargo;
    private javax.swing.JLabel jLabel3_dataDeAdmissao;
    private javax.swing.JLabel jLabel4_matricula;
    private javax.swing.JLabel jLabel5_setor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1_Comum;
    private javax.swing.JRadioButton jRadioButton1_feminino;
    private javax.swing.JRadioButton jRadioButton2_Plantonista;
    private javax.swing.JRadioButton jRadioButton2_masculino;
    private javax.swing.JTextField jTextField1_nome;
    private javax.swing.JTextField jTextField1_telefone;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3_cargo;
    private javax.swing.JTextField jTextField4_setor;
    private javax.swing.JTextField jTextField5_matricula;
    private javax.swing.JFormattedTextField txfData;
    // End of variables declaration//GEN-END:variables

}
