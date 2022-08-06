/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.systech.view;

import br.com.systech.bean.Cliente;
import br.com.systech.bean.Documento;
import br.com.systech.bean.FormaPagamento;
import br.com.systech.bean.Veiculo;
import br.com.systech.util.Biblioteca;
import static br.com.systech.util.Biblioteca.setAcessibilidade;
import static br.com.systech.util.Biblioteca.validaForm;
import br.com.systech.util.CustomDocument;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author SYSTECH
 */
public class VeiculoGUI extends javax.swing.JDialog {

    private VeiculoView veiculoView;
    private Veiculo veiculo;
    private Documento documento;

    public VeiculoGUI(java.awt.Frame parent, VeiculoView veiculoView, Veiculo veiculo, Documento documento, boolean modal) {
        super(parent, modal);
        this.veiculoView = veiculoView;
        this.veiculo = veiculo;
        this.documento = documento;
        initComponents();
        init();
        if (veiculo != null) {
            preecher_veiculo(veiculo);
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

        jpVeiculo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        anomod = new javax.swing.JTextField();
        cilindro = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        placa = new javax.swing.JTextField();
        cor = new javax.swing.JTextField();
        veiculo_tipo = new javax.swing.JTextField();
        chassis = new javax.swing.JTextField();
        combustivel = new javax.swing.JTextField();
        portas = new javax.swing.JFormattedTextField();
        km = new javax.swing.JFormattedTextField();
        jLabel32 = new javax.swing.JLabel();
        renavam = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        valor = new javax.swing.JFormattedTextField();
        confirmar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpVeiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Veiculo"));

        jLabel8.setText("Marca");

        jLabel9.setText("Ano/Mod");

        jLabel10.setText("Portas");

        jLabel11.setText("Modelo");

        jLabel12.setText("Placa");

        jLabel13.setText("Km");

        jLabel14.setText("Tipo");

        jLabel15.setText("Chassis");

        jLabel16.setText("Combustivel");

        jLabel17.setText("Cilindro");

        jLabel18.setText("Cor");

        portas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        km.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel32.setText("Renavam");

        jLabel1.setText("Valor");

        valor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout jpVeiculoLayout = new javax.swing.GroupLayout(jpVeiculo);
        jpVeiculo.setLayout(jpVeiculoLayout);
        jpVeiculoLayout.setHorizontalGroup(
            jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVeiculoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpVeiculoLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(renavam))
                    .addGroup(jpVeiculoLayout.createSequentialGroup()
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combustivel)
                            .addComponent(chassis)
                            .addComponent(veiculo_tipo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVeiculoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cilindro))
                            .addGroup(jpVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(portas))
                            .addGroup(jpVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anomod))
                            .addGroup(jpVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpVeiculoLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jpVeiculoLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cor))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpVeiculoLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(km, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(12, 12, 12))
        );

        jpVeiculoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel32, jLabel8, jLabel9});

        jpVeiculoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {anomod, cilindro, cor, km, marca, modelo, placa, portas});

        jpVeiculoLayout.setVerticalGroup(
            jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(anomod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(portas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(km, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(cilindro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veiculo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chassis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(renavam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpVeiculoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel32, jLabel8, jLabel9});

        jpVeiculoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {anomod, cilindro, cor, km, marca, modelo, placa, portas});

        confirmar.setText("Confirmar (F3)");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        fechar.setText("Fechar (Esc)");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(confirmar)
                        .addGap(18, 18, 18)
                        .addComponent(fechar)))
                .addGap(12, 12, 12))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {confirmar, fechar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar)
                    .addComponent(fechar))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {confirmar, fechar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        adicionar_alterar();
    }//GEN-LAST:event_confirmarActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        dispose();
    }//GEN-LAST:event_fecharActionPerformed

    private void init() {
        setAcessibilidade(this);
        setF3(this);
        insertUpperCase(Arrays.asList(jpVeiculo));
    }

    private void insertUpperCase(List<JPanel> list) {
        list.forEach((jPanel) -> {
            for (Component c : jPanel.getComponents()) {
                if (c instanceof JTextField) {
                    ((JTextField) c).setDocument(new CustomDocument());
                }
            }
        });

    }

    private void completaDados(Veiculo veiculo) {
        veiculo.setCodigo_documento(documento.getCodigo());
        veiculo.setMarca(marca.getText());
        veiculo.setModelo(modelo.getText());
        veiculo.setTipo(veiculo_tipo.getText());
        veiculo.setCor(cor.getText());
        veiculo.setPlaca(placa.getText());
        veiculo.setChassis(chassis.getText());
        veiculo.setKm(km.getText());
        veiculo.setCilindro(cilindro.getText());
        veiculo.setCombustivel(combustivel.getText());
        veiculo.setAnomod(anomod.getText());
        veiculo.setPortas(Integer.parseInt(portas.getText()));
        veiculo.setRenavan(renavam.getText());
        veiculo.setValor(Biblioteca.stringToBigDecimal(valor.getText()));
    }

    private void preecher_veiculo(Veiculo veiculo) {
        marca.setText(veiculo.getMarca());
        modelo.setText(veiculo.getModelo());
        veiculo_tipo.setText(veiculo.getTipo());
        cor.setText(veiculo.getCor());
        placa.setText(veiculo.getPlaca());
        chassis.setText(veiculo.getChassis());
        km.setText(veiculo.getKm());
        cilindro.setText(veiculo.getCilindro());
        combustivel.setText(veiculo.getCombustivel());
        anomod.setText(veiculo.getAnomod());
        portas.setText(String.valueOf(veiculo.getPortas()));
        renavam.setText(veiculo.getRenavan());
        valor.setText(Biblioteca.bigDecimalToString(veiculo.getValor()));
    }

    private void adicionar_alterar() {
        if (validaForm(Arrays.asList(jpVeiculo))) {
            JOptionPane.showMessageDialog(null, "Por favor preencha os campos em vermelho!", "Erro no formulário", JOptionPane.ERROR_MESSAGE);
        } else if (this.veiculo != null) {
            completaDados(this.veiculo);
            if (veiculoView.getVeiculoDAO().alterar(this.veiculo)) {
                JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");
                this.veiculoView.carregarTabelaFiltro(String.valueOf(veiculo.getCodigo_documento()));
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro Dados Divergentes", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            this.veiculo = new Veiculo();
            completaDados(this.veiculo);
            if (veiculoView.getVeiculoDAO().inserir(this.veiculo)) {
                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
                this.veiculoView.carregarTabelaFiltro(String.valueOf(veiculo.getCodigo_documento()));
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro Dados Divergentes", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void setF3(VeiculoGUI cfGUI) {
        JRootPane meurootpane = cfGUI.getRootPane();
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), "F3");
        meurootpane.getRootPane().getActionMap().put("F3", new AbstractAction("F3") {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionar_alterar();
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anomod;
    private javax.swing.JTextField chassis;
    private javax.swing.JTextField cilindro;
    private javax.swing.JTextField combustivel;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField cor;
    private javax.swing.JButton fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpVeiculo;
    private javax.swing.JFormattedTextField km;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField placa;
    private javax.swing.JFormattedTextField portas;
    private javax.swing.JTextField renavam;
    private javax.swing.JFormattedTextField valor;
    private javax.swing.JTextField veiculo_tipo;
    // End of variables declaration//GEN-END:variables
}
