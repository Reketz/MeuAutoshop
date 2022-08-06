/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.systech.view;

import br.com.systech.bean.Documento;
import br.com.systech.bean.Veiculo;
import br.com.systech.dao.VeiculoDAO;
import br.com.systech.tm.VeiculoTableModel;
import static br.com.systech.util.Biblioteca.setAcessibilidade;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VeiculoView extends javax.swing.JDialog {

    private Documento documento;
    private VeiculoTableModel vtm;
    private VeiculoDAO veiculoDAO;

    public VeiculoView(java.awt.Frame parent, Documento documento, boolean modal) {
        super(parent, modal);
        this.documento = documento;
        this.veiculoDAO = new VeiculoDAO();
        this.vtm = new VeiculoTableModel();
        initComponents();
        setAcessibilidade(this);
        carregarTabelaFiltro(String.valueOf(documento.getCodigo()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        novo = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        duplicar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        novo.setText("Novo");
        novo.setMaximumSize(new java.awt.Dimension(110, 23));
        novo.setMinimumSize(new java.awt.Dimension(110, 23));
        novo.setPreferredSize(new java.awt.Dimension(110, 23));
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        fechar.setText("Fechar (Esc)");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        duplicar.setText("Duplicar");
        duplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(duplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {alterar, duplicar, excluir, fechar, novo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterar)
                    .addComponent(excluir)
                    .addComponent(fechar)
                    .addComponent(duplicar))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {alterar, duplicar, excluir, fechar, novo});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (evt.getClickCount() == 2) {
            alterar();
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        novo();
    }//GEN-LAST:event_novoActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        alterar();
    }//GEN-LAST:event_alterarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        excluir();
    }//GEN-LAST:event_excluirActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharActionPerformed

    private void duplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duplicarActionPerformed
        duplicar();
    }//GEN-LAST:event_duplicarActionPerformed

    private void alterar() {
        if (this.tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um documento!");
        } else {
            String id = this.tabela.getModel().getValueAt((this.tabela.convertRowIndexToModel(tabela.getSelectedRow())), 0).toString();
            Veiculo veiculo = this.veiculoDAO.get(id);
            new VeiculoGUI(null, this, veiculo, documento, true).setVisible(true);
        }
    }

    private void duplicar() {
        if (this.tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um documento!");
        } else {
            String id = this.tabela.getModel().getValueAt((this.tabela.convertRowIndexToModel(tabela.getSelectedRow())), 0).toString();
            if (this.veiculoDAO.duplicarVeiculo(id)) {
                JOptionPane.showMessageDialog(null, "Documento duplicado com sucesso!");
                Veiculo veiculo = this.veiculoDAO.get(this.veiculoDAO.getUltimoCodigoVeiculo());
                new VeiculoGUI(null, this, veiculo, documento, true).setVisible(true);
            }
        }
    }

    private void novo() {
        new VeiculoGUI(null, this, null, documento, true).setVisible(true);
    }

    private void excluir() {
        if (this.tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um documento!");
        } else {
            String id = this.tabela.getModel().getValueAt((this.tabela.convertRowIndexToModel(tabela.getSelectedRow())), 0).toString();
            if (veiculoDAO.excluir(id)) {
                JOptionPane.showMessageDialog(this, "Documento excluido com sucesso!");
                carregarTabelaFiltro(String.valueOf(documento.getCodigo()));
            }
        }
    }

    public void carregarTabelaFiltro(String seq) {
//        this.vtm.addList(new ArrayList<>());
        this.vtm.addList(this.veiculoDAO.listarFiltro(seq));
        this.tabela.setModel(this.vtm);
    }

    public VeiculoDAO getVeiculoDAO() {
        return veiculoDAO;
    }

    public void setVeiculoDAO(VeiculoDAO veiculoDAO) {
        this.veiculoDAO = veiculoDAO;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JButton duplicar;
    private javax.swing.JButton excluir;
    private javax.swing.JButton fechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novo;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
