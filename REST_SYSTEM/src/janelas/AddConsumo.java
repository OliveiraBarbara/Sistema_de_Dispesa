/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author barbara
 */
public class AddConsumo extends javax.swing.JFrame {

    String[][] itens;
    JTable tabelaConsumo;
    JLabel tValorTotal;

    public AddConsumo(JTable tabelaConsumo, JLabel tValorTotal) {
        lerDados();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        tValor.setEnabled(false);
        this.tabelaConsumo = tabelaConsumo; //passo por parametro o a tabela de Consumo para conseguir transferir as informações dos itens consumidos
        this.tValorTotal = tValorTotal; //passo por parametro o Valor Total para conseguir atribuir o valor da venda
    }

    public void lerDados() {
        try {
            BufferedReader arq = new BufferedReader(new FileReader("itens.csv")); //mostro o endereço que está o itens gravados
            arq.readLine(); //leio as linhas
            ArrayList<String> linhas = new ArrayList<>(); //crio um ArrayList de Strings para gravar as informações das linhas
            String linha = "";
            while ((linha = arq.readLine()) != null) {
                linhas.add(linha); //atribuo as informações de cada linha do arquivo no ArrayList
            }
            Collections.sort(linhas); //ordeno as informações do ArrayList
            itens = new String[linhas.size()][2];
            for (int i = 0; i < linhas.size(); i++) {
                itens[i] = linhas.get(i).split(";"); //coloco em cada posição do vector de String os itens das linhas
            }
            arq.close(); //fecho o arquivo
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao Ler Arquivo!");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lValor = new javax.swing.JLabel();
        lQtd = new javax.swing.JLabel();
        tQtd = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lAreaConsumo = new javax.swing.JList<>();
        tValor = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        bInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADICIONAR CONSUMO");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PROCURAR PRODUTO"));

        lNome.setText("NOME:");

        tNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tNomeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("SELECIONAR PRODUTO E DEFINIR QUANTIDADE"));

        lValor.setText("VALOR UNITÁRIO:");

        lQtd.setText("QUANTIDADE:");

        tQtd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tQtd.setText("1");

        DefaultListModel modelo = new DefaultListModel();
        lAreaConsumo.setModel(modelo);
        lAreaConsumo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lAreaConsumo);

        tValor.setText("R$ 0,00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tValor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lQtd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValor)
                    .addComponent(tValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lQtd)
                    .addComponent(tQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bCancelar.setText("CANCELAR");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bInserir.setText("INSERIR");
        bInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bInserir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose(); //quando clicar na opção cancelar, fecho a página
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInserirActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabelaConsumo.getModel(); //crio um novo mmodelo de tabela
        Object[] linha = new Object[4]; //crio um vector de objetos com 4 posições
        linha[0] = lAreaConsumo.getSelectedValue(); //seto que na primeira coluna conterá a informação do item
        linha[1] = tQtd.getText(); //seto que na segunda coluna conterá a quantidade dos itens
        linha[2] = tValor.getText(); //seto na terceira coluna o valor unitário do item
        linha[3] = (Double.parseDouble(tValor.getText()) * Double.parseDouble(tQtd.getText())); //seto na quarta coluna o valor final do item após multiplicar a quantidade por valor unitário 
        modelo.addRow(linha); //adiciono as informações da linha no modelo criado
        tabelaConsumo.setModel(modelo); //seto o modelo na tabela de Consumo
        double total = 0; //inicializo o valor do total com 0
        total = total + (Double.parseDouble(tValor.getText()) * Double.parseDouble(tQtd.getText())); //faço a conta da quantidade de itens por valor unitário
        tValorTotal.setText(String.valueOf(total)); //seto a informação do valor total na primeira página
        int op = JOptionPane.showConfirmDialog(null, "Deseja Adicionar mais Itens à Mesa?", "Mesa", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.NO_OPTION == op) {
            this.dispose(); //verifico se a pessoa deseja add mais itens na mesa, se não eu fecho a tela
        } else {
            tNome.setText(""); //se sim eu passo o focu para o local de pesquisar o nome do item e zero o mesmo
            tNome.requestFocus();
        }
    }//GEN-LAST:event_bInserirActionPerformed

    private void tNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tNomeKeyReleased
        DefaultListModel<String> modelo = new DefaultListModel<>(); //crio um novo modelo de lista
        String nome = tNome.getText().toLowerCase().trim(); //atribuo a variável nome, o nome do item procurado
        for (int i = 0; i < itens.length; i++) {
            if (itens[i][0].toLowerCase().contains(nome)) { //verifico se no vector de itens contem esse nome
                String nomeItem = itens[i][0]; //se for igual eu passo o nome do Item para a lista
                modelo.addElement(nomeItem);
                tValor.setText(itens[i][1]); //coloco o valor do mesmo item na informação de valor unitário
            }
        }
        lAreaConsumo.setModel(modelo); //por fim seto o modelo da Lista
    }//GEN-LAST:event_tNomeKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bInserir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lAreaConsumo;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lQtd;
    private javax.swing.JLabel lValor;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tQtd;
    private javax.swing.JLabel tValor;
    // End of variables declaration//GEN-END:variables
}
