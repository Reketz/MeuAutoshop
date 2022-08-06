/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.systech.view;

import br.com.systech.bean.Documento;
import br.com.systech.config.ConexaoBanco;
import br.com.systech.dao.DocumentoDAO;
import br.com.systech.tm.DocumentoTableModel;
import br.com.systech.util.Biblioteca;
import static br.com.systech.util.Biblioteca.getComputerIdentifier;
import static br.com.systech.util.Biblioteca.setAcessibilidade;
import static br.com.systech.util.Biblioteca.verificavencimento;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Properties;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author SYSTECH
 */
public class DocumentoView extends javax.swing.JFrame {

    private DocumentoDAO documentoDAO;
    private DocumentoTableModel dtm;
    private SimpleDateFormat sdf;

    public DocumentoView() {
        documentoDAO = new DocumentoDAO();
        dtm = new DocumentoTableModel();
        sdf = new SimpleDateFormat("yyyy-MM-dd");
        initComponents();
        init();
        setResources();
        setAcessibilidade(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoPesquisa = new javax.swing.JTextField();
        pesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        datainicial = new com.toedter.calendar.JDateChooser();
        datafinal = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        novo = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        duplicar = new javax.swing.JButton();
        veiculos_recebidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("pesquisa"));

        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyPressed(evt);
            }
        });

        pesquisar.setText("Pesquisar");
        pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Periodo"));

        jLabel1.setText("De");

        jLabel2.setText("Ate");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datainicial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(datafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(datainicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        fechar.setText("Fechar (Esc)");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        imprimir.setText("Imprimir");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        duplicar.setText("Duplicar");
        duplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duplicarActionPerformed(evt);
            }
        });

        veiculos_recebidos.setText("Veiculos Recebidos");
        veiculos_recebidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculos_recebidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(duplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(veiculos_recebidos)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(excluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {alterar, duplicar, excluir, fechar, imprimir, novo, veiculos_recebidos});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterar)
                    .addComponent(excluir)
                    .addComponent(fechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imprimir)
                    .addComponent(duplicar)
                    .addComponent(veiculos_recebidos))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {alterar, duplicar, excluir, fechar, imprimir, novo, veiculos_recebidos});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.carregarTabelaFiltro(campoPesquisa.getText());
        }
    }//GEN-LAST:event_campoPesquisaKeyPressed

    private void pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarActionPerformed
        this.carregarTabelaFiltro(campoPesquisa.getText());
    }//GEN-LAST:event_pesquisarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        if (evt.getClickCount() == 2) {
            alterar();
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        novo();
    }//GEN-LAST:event_novoActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        excluir();
    }//GEN-LAST:event_excluirActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        alterar();
    }//GEN-LAST:event_alterarActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        imprimir();
    }//GEN-LAST:event_imprimirActionPerformed

    private void duplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duplicarActionPerformed
        duplicar();
    }//GEN-LAST:event_duplicarActionPerformed

    private void veiculos_recebidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculos_recebidosActionPerformed
        veiculos();
    }//GEN-LAST:event_veiculos_recebidosActionPerformed

    private void init() {
//        if (!valide()) {
//            JOptionPane.showMessageDialog(null, "Licença não encontrada!");
//            dispose();
//        } else {
            setVisible(true);
//        }
    }

    private boolean valide() {
        File file = new File(System.getProperty("user.dir") + "/conf/licence.properties");
        String key;
        String rae;
        String rdme;
        if (file.exists()) {
            Properties props = new Properties();
            FileInputStream input = null;

            try {
                input = new FileInputStream(file);
                props.load(input);
                key = props.getProperty("register.primary.key");
                rae = Biblioteca.decode(props.getProperty("register.rae"));
                rdme = Biblioteca.decode(props.getProperty("register.rdme"));
                Calendar atual = Calendar.getInstance();

                Calendar c = Calendar.getInstance();
                c.set(Integer.parseInt(rae),
                        Integer.parseInt(rdme.substring(2, 4)) - 1,
                        Integer.parseInt(rdme.substring(0, 2)));
                if (!key.equals(Biblioteca.encode(Biblioteca.encode(getComputerIdentifier())))) {
                    JOptionPane.showMessageDialog(null, "Licença indisponível para outro computador!\nPor favor contatar o suporte do sistema!!!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    return false;
                }
                boolean verificavencimento = verificavencimento(atual.getTime(), c.getTime());
                if (!verificavencimento) {
                    JOptionPane.showMessageDialog(null, "O registro expirou! Por favor contatar o suporte do sistema!!!", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                    initPainelLicenca();
                }
                return verificavencimento;

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Arquivo de registro não encontrado!\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Não conseguiu ler o arquivo!\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    input.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Não foi possivel fechar o arquivo!\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            initPainelLicenca();
        }
        return false;
    }

    private void initPainelLicenca() {
        int resposta = JOptionPane.showConfirmDialog(null, "Licença não encontrada! Deseja gerar uma licença agora?");
        if (resposta == JOptionPane.YES_OPTION) {
            new PainelLicenca().setVisible(true);
        }
    }

    private void setResources() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, c.getActualMinimum(Calendar.DAY_OF_MONTH));
        this.datainicial.setDate(c.getTime());
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        this.datafinal.setDate(c.getTime());
        carregarTabela();
    }

    private void imprimir() {
        if (this.tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um documento!");
        } else {
            String id = this.tabela.getModel().getValueAt((this.tabela.convertRowIndexToModel(tabela.getSelectedRow())), 0).toString();
            HashMap params = new HashMap<>();
            params.put("CODIGO", Integer.parseInt(id));
            params.put("IMAGEM", System.getProperty("user.dir") + "\\conf\\logo.png");
            String src = System.getProperty("user.dir") + "\\conf\\documento.jasper";

            JasperPrint jp = null;
            try {
                jp = JasperFillManager.fillReport(src, params, ConexaoBanco.conexao());
            } catch (ClassNotFoundException | SQLException | JRException ex) {
                System.out.println("Erro catastrofico!" + ex);
            }
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setExtendedState(MAXIMIZED_BOTH);
            jv.setVisible(true);
        }
    }

    private void alterar() {
        if (this.tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um documento!");
        } else {
            String id = this.tabela.getModel().getValueAt((this.tabela.convertRowIndexToModel(tabela.getSelectedRow())), 0).toString();
            Documento documento = this.documentoDAO.get(id);
            new DocumentoGUI(this, documentoDAO, documento).setVisible(true);
        }
    }

    private void duplicar() {
        if (this.tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um documento!");
        } else {
            String id = this.tabela.getModel().getValueAt((this.tabela.convertRowIndexToModel(tabela.getSelectedRow())), 0).toString();
            if (this.documentoDAO.duplicarDocumento(id)) {
                JOptionPane.showMessageDialog(null, "Documento duplicado com sucesso!");
                Documento documento = this.documentoDAO.get(this.documentoDAO.getUltimoCodigoDocumento());
                new DocumentoGUI(this, documentoDAO, documento).setVisible(true);
            }
        }
    }
    
    private void veiculos() {
        if (this.tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um documento!");
        } else {
            String id = this.tabela.getModel().getValueAt((this.tabela.convertRowIndexToModel(tabela.getSelectedRow())), 0).toString();
            Documento documento = this.documentoDAO.get(id);
            new VeiculoView(this, documento, true).setVisible(true);
        }
    }

    private void novo() {
        new DocumentoGUI(this, documentoDAO, null).setVisible(true);
    }

    private void excluir() {
        if (this.tabela.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um documento!");
        } else {
            String id = this.tabela.getModel().getValueAt((this.tabela.convertRowIndexToModel(tabela.getSelectedRow())), 0).toString();
            if (documentoDAO.excluir(id)) {
                JOptionPane.showMessageDialog(this, "Documento excluido com sucesso!");
                carregarTabela();
            }
        }
    }

    private void carregarTabelaFiltro(String seq) {
        this.dtm.addList(this.documentoDAO.listarFiltro(seq, sdf.format(this.datainicial.getDate()), sdf.format(this.datafinal.getDate())));
        this.tabela.setModel(this.dtm);
    }

    public void carregarTabela() {
        this.dtm.addList(this.documentoDAO.listar());
        this.tabela.setModel(this.dtm);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            DocumentoView documentoView = new DocumentoView();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    private javax.swing.JTextField campoPesquisa;
    private com.toedter.calendar.JDateChooser datafinal;
    private com.toedter.calendar.JDateChooser datainicial;
    private javax.swing.JButton duplicar;
    private javax.swing.JButton excluir;
    private javax.swing.JButton fechar;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novo;
    private javax.swing.JButton pesquisar;
    private javax.swing.JTable tabela;
    private javax.swing.JButton veiculos_recebidos;
    // End of variables declaration//GEN-END:variables
}
