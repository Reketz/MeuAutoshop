package br.com.systech.view;

import br.com.systech.bean.Cliente;
import br.com.systech.bean.Documento;
import br.com.systech.bean.Endereco;
import br.com.systech.bean.FormaPagamento;
import br.com.systech.bean.Veiculo;
import br.com.systech.dao.DocumentoDAO;
import br.com.systech.util.Biblioteca;
import static br.com.systech.util.Biblioteca.consultaCep;
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

public class DocumentoGUI extends javax.swing.JFrame {

    private final DocumentoView documentoView;
    private final DocumentoDAO documentoDAO;
    private Documento documento;

    public DocumentoGUI(DocumentoView documentoView, DocumentoDAO documentoDAO, Documento documento) {
        this.documentoView = documentoView;
        this.documentoDAO = documentoDAO;
        this.documento = documento;
        initComponents();
        init();
        if (documento != null) {
            preecher_documento(documento);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        confirmar = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        doc = new javax.swing.JFormattedTextField();
        rg = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        observacao = new javax.swing.JTextField();
        jpEndereco = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cep = new javax.swing.JFormattedTextField();
        pesquisarCep = new javax.swing.JButton();
        endereco = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
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
        jpFormaPagamento = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pagamento = new javax.swing.JTextField();
        pagamento_tipo = new javax.swing.JTextField();
        parcelas = new javax.swing.JFormattedTextField();
        primeira_parcela = new javax.swing.JFormattedTextField();
        vencimento = new com.toedter.calendar.JDateChooser();
        data = new com.toedter.calendar.JDateChooser();
        jpValores = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        valor_parcela = new javax.swing.JFormattedTextField();
        valor_financiado = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        valor_entrada = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        valor_total = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        comboCV = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        vendedor = new javax.swing.JTextField();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        confirmar.setText("Confirmar (F3)");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        fechar.setText("Fechar (Esc)");

        jpCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Cliente"));

        jLabel1.setText("Nome");

        jLabel2.setText("Documento");

        jLabel3.setText("RG");

        doc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel28.setText("Observação");

        jpEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel4.setText("CEP");

        jLabel7.setText("Cidade");

        jLabel6.setText("Bairro");

        jLabel5.setText("Endereco");

        try {
            cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        pesquisarCep.setText("OK");
        pesquisarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarCepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEnderecoLayout = new javax.swing.GroupLayout(jpEndereco);
        jpEndereco.setLayout(jpEnderecoLayout);
        jpEnderecoLayout.setHorizontalGroup(
            jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesquisarCep))
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(endereco))
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bairro))
                    .addGroup(jpEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cidade)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jpEnderecoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel4, jLabel5, jLabel6, jLabel7});

        jpEnderecoLayout.setVerticalGroup(
            jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesquisarCep))
                .addGap(10, 10, 10)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jpEnderecoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel4, jLabel5, jLabel6, jLabel7});

        jpEnderecoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bairro, cidade, endereco});

        javax.swing.GroupLayout jpClienteLayout = new javax.swing.GroupLayout(jpCliente);
        jpCliente.setLayout(jpClienteLayout);
        jpClienteLayout.setHorizontalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpClienteLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doc))
                            .addGroup(jpClienteLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(observacao))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpClienteLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(10, 10, 10)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpClienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {doc, rg});

        jpClienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel28, jLabel3});

        jpClienteLayout.setVerticalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(observacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jpEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {doc, rg});

        jpClienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel28, jLabel3});

        jTabbedPane1.addTab("Cliente", jpCliente);

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

        javax.swing.GroupLayout jpVeiculoLayout = new javax.swing.GroupLayout(jpVeiculo);
        jpVeiculo.setLayout(jpVeiculoLayout);
        jpVeiculoLayout.setHorizontalGroup(
            jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpVeiculoLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(renavam))
                    .addGroup(jpVeiculoLayout.createSequentialGroup()
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
                                    .addComponent(km, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpVeiculoLayout.createSequentialGroup()
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(veiculo_tipo)
                            .addComponent(combustivel)
                            .addComponent(chassis))))
                .addGap(78, 78, 78))
        );

        jpVeiculoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel8, jLabel9});

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
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpVeiculoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel8, jLabel9});

        jTabbedPane1.addTab("Veiculo", jpVeiculo);

        jpFormaPagamento.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma de Pagamento"));

        jLabel19.setText("Pagamento");

        jLabel20.setText("Tipo");

        jLabel21.setText("Parcelas");

        jLabel22.setText("Primeira Parcela");

        jLabel23.setText("Vencimento");

        jLabel24.setText("Data");

        parcelas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        primeira_parcela.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jpValores.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));

        jLabel29.setText("Varlor Parcela");

        valor_parcela.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        valor_financiado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        jLabel26.setText("Valor Entrada");

        valor_entrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        jLabel27.setText("Valor total");

        valor_total.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        jLabel25.setText("Varlor Financiado");

        javax.swing.GroupLayout jpValoresLayout = new javax.swing.GroupLayout(jpValores);
        jpValores.setLayout(jpValoresLayout);
        jpValoresLayout.setHorizontalGroup(
            jpValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jpValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpValoresLayout.createSequentialGroup()
                        .addComponent(valor_parcela, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor_financiado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpValoresLayout.createSequentialGroup()
                        .addComponent(valor_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor_total, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jpValoresLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel25, jLabel26, jLabel27});

        jpValoresLayout.setVerticalGroup(
            jpValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpValoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valor_financiado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(valor_parcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jpValoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(valor_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(valor_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jpValoresLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel25, jLabel26, jLabel27});

        jLabel30.setText("Documento");

        comboCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPRA", "VENDA" }));
        comboCV.setSelectedIndex(1);

        jLabel31.setText("Vendedor/Comprador");

        javax.swing.GroupLayout jpFormaPagamentoLayout = new javax.swing.GroupLayout(jpFormaPagamento);
        jpFormaPagamento.setLayout(jpFormaPagamentoLayout);
        jpFormaPagamentoLayout.setHorizontalGroup(
            jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFormaPagamentoLayout.createSequentialGroup()
                        .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpFormaPagamentoLayout.createSequentialGroup()
                        .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpFormaPagamentoLayout.createSequentialGroup()
                                .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpFormaPagamentoLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pagamento_tipo))
                                    .addGroup(jpFormaPagamentoLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpFormaPagamentoLayout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpFormaPagamentoLayout.createSequentialGroup()
                                        .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel21))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(parcelas, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                            .addComponent(primeira_parcela, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jpFormaPagamentoLayout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(13, 13, 13))))
        );

        jpFormaPagamentoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pagamento, pagamento_tipo, parcelas});

        jpFormaPagamentoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel19, jLabel20, jLabel21, jLabel22, jLabel23, jLabel24, jLabel30});

        jpFormaPagamentoLayout.setVerticalGroup(
            jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormaPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFormaPagamentoLayout.createSequentialGroup()
                        .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(pagamento_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpFormaPagamentoLayout.createSequentialGroup()
                        .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(parcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(primeira_parcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(vencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel24)
                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(comboCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jpFormaPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jpValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpFormaPagamentoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pagamento, pagamento_tipo, parcelas, primeira_parcela});

        jpFormaPagamentoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel19, jLabel20, jLabel21, jLabel22, jLabel23, jLabel24, jLabel30});

        jTabbedPane1.addTab("Pagamento", jpFormaPagamento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(confirmar)
                .addGap(18, 18, 18)
                .addComponent(fechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {confirmar, fechar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar)
                    .addComponent(fechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {confirmar, fechar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        adicionar_alterar();
    }//GEN-LAST:event_confirmarActionPerformed

    private void pesquisarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarCepActionPerformed
        Endereco consultaCep = consultaCep(cep.getText());
        this.endereco.setText(consultaCep.getLogradouro());
        this.bairro.setText(consultaCep.getBairro());
        this.cidade.setText(consultaCep.getLocalidade() + " - " + consultaCep.getUf());
    }//GEN-LAST:event_pesquisarCepActionPerformed

    private void init() {
        setAcessibilidade(this);
        setF3(this);
        insertUpperCase(Arrays.asList(jpCliente, jpVeiculo, jpFormaPagamento, jpEndereco));
        observacao.setText(" ");
    }

    private void insertUpperCase(List<JPanel> list){
        list.forEach((jPanel) -> {
            for (Component c : jPanel.getComponents()) {
                if (c instanceof JTextField) {
                    ((JTextField) c).setDocument(new CustomDocument());
                }
            }
        });
        
    }
    
    private void completaDados(Documento documento) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome.getText());
        cliente.setDocumento(doc.getText());
        cliente.setRg(rg.getText());
        cliente.setEndereco(endereco.getText());
        cliente.setBairro(bairro.getText());
        cliente.setCidade(cidade.getText());
        cliente.setCep(cep.getText());
        cliente.setObservacao(observacao.getText());

        Veiculo veiculo = new Veiculo();
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

        FormaPagamento formaPagamento = new FormaPagamento();
        formaPagamento.setPagamento(pagamento.getText());
        formaPagamento.setPagamentoTipo(pagamento_tipo.getText());
        formaPagamento.setParcelas(Integer.parseInt(parcelas.getText()));
        formaPagamento.setPrimeiraParcela(Integer.parseInt(primeira_parcela.getText()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        formaPagamento.setVencimento(sdf.format(vencimento.getDate()));
        formaPagamento.setData(sdf.format(data.getDate()));
        formaPagamento.setValorParcela(Biblioteca.stringToBigDecimal(valor_parcela.getText()));
        formaPagamento.setValorFinanciado(Biblioteca.stringToBigDecimal(valor_financiado.getText()));
        formaPagamento.setValorEntrada(Biblioteca.stringToBigDecimal(valor_entrada.getText()));
        formaPagamento.setValorTotal(Biblioteca.stringToBigDecimal(valor_total.getText()));

        documento.setCliente(cliente);
        documento.setVeiculo(veiculo);
        documento.setFormaPagamento(formaPagamento);
        documento.setTipo(comboCV.getSelectedIndex() == 0 ? "COMPRA" : "VENDA");
        documento.setVendedor(vendedor.getText());
    }

    private void preecher_documento(Documento documento) {
        try {
            nome.setText(documento.getCliente().getNome());
            doc.setText(documento.getCliente().getDocumento());
            rg.setText(documento.getCliente().getRg());
            endereco.setText(documento.getCliente().getEndereco());
            bairro.setText(documento.getCliente().getBairro());
            cidade.setText(documento.getCliente().getCidade());
            cep.setText(documento.getCliente().getCep());
            observacao.setText(documento.getCliente().getObservacao());

            marca.setText(documento.getVeiculo().getMarca());
            modelo.setText(documento.getVeiculo().getModelo());
            veiculo_tipo.setText(documento.getVeiculo().getTipo());
            cor.setText(documento.getVeiculo().getCor());
            placa.setText(documento.getVeiculo().getPlaca());
            chassis.setText(documento.getVeiculo().getChassis());
            km.setText(documento.getVeiculo().getKm());
            cilindro.setText(documento.getVeiculo().getCilindro());
            combustivel.setText(documento.getVeiculo().getCombustivel());
            anomod.setText(documento.getVeiculo().getAnomod());
            portas.setText(String.valueOf(documento.getVeiculo().getPortas()));
            renavam.setText(documento.getVeiculo().getRenavan());

            pagamento.setText(documento.getFormaPagamento().getPagamento());
            pagamento_tipo.setText(documento.getFormaPagamento().getPagamentoTipo());
            parcelas.setText(String.valueOf(documento.getFormaPagamento().getParcelas()));
            primeira_parcela.setText(String.valueOf(documento.getFormaPagamento().getPrimeiraParcela()));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            vencimento.setDate(sdf.parse(documento.getFormaPagamento().getVencimento()));
            data.setDate(sdf.parse(documento.getFormaPagamento().getData()));
            valor_parcela.setText(Biblioteca.bigDecimalToString(documento.getFormaPagamento().getValorParcela()));
            valor_financiado.setText(Biblioteca.bigDecimalToString(documento.getFormaPagamento().getValorFinanciado()));
            valor_entrada.setText(Biblioteca.bigDecimalToString(documento.getFormaPagamento().getValorEntrada()));
            valor_total.setText(Biblioteca.bigDecimalToString(documento.getFormaPagamento().getValorTotal()));
            comboCV.setSelectedIndex(documento.getTipo().equals("VENDA") ? 1 : 0);
            vendedor.setText(documento.getVendedor());
        } catch (ParseException ex) {
            Logger.getLogger(DocumentoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void adicionar_alterar() {
        if (validaForm(Arrays.asList(jpCliente, jpVeiculo, jpFormaPagamento, jpValores, jpEndereco))) {
            JOptionPane.showMessageDialog(null, "Por favor preencha os campos em vermelho!", "Erro no formulário", JOptionPane.ERROR_MESSAGE);
        } else if (this.documento != null) {
            completaDados(this.documento);
            if (this.documentoDAO.alterar(this.documento)) {
                JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!");
                this.documentoView.carregarTabela();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro Dados Divergentes", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            this.documento = new Documento();
            completaDados(this.documento);
            if (this.documentoDAO.inserir(this.documento)) {
                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
                this.documentoView.carregarTabela();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Erro Dados Divergentes", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void setF3(DocumentoGUI cfGUI) {
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
    private javax.swing.JTextField bairro;
    private javax.swing.JFormattedTextField cep;
    private javax.swing.JTextField chassis;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField cilindro;
    private javax.swing.JComboBox<String> comboCV;
    private javax.swing.JTextField combustivel;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField cor;
    private com.toedter.calendar.JDateChooser data;
    private javax.swing.JFormattedTextField doc;
    private javax.swing.JTextField endereco;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpEndereco;
    private javax.swing.JPanel jpFormaPagamento;
    private javax.swing.JPanel jpValores;
    private javax.swing.JPanel jpVeiculo;
    private javax.swing.JFormattedTextField km;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField observacao;
    private javax.swing.JTextField pagamento;
    private javax.swing.JTextField pagamento_tipo;
    private javax.swing.JFormattedTextField parcelas;
    private javax.swing.JButton pesquisarCep;
    private javax.swing.JTextField placa;
    private javax.swing.JFormattedTextField portas;
    private javax.swing.JFormattedTextField primeira_parcela;
    private javax.swing.JTextField renavam;
    private javax.swing.JFormattedTextField rg;
    private javax.swing.JFormattedTextField valor_entrada;
    private javax.swing.JFormattedTextField valor_financiado;
    private javax.swing.JFormattedTextField valor_parcela;
    private javax.swing.JFormattedTextField valor_total;
    private javax.swing.JTextField veiculo_tipo;
    private com.toedter.calendar.JDateChooser vencimento;
    private javax.swing.JTextField vendedor;
    // End of variables declaration//GEN-END:variables
}
