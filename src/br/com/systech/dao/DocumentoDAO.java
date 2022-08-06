package br.com.systech.dao;

import br.com.systech.bean.Cliente;
import br.com.systech.bean.Documento;
import br.com.systech.bean.FormaPagamento;
import br.com.systech.bean.Veiculo;
import br.com.systech.config.ConexaoBanco;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DocumentoDAO {

    private Connection conexao;
    private PreparedStatement statment;

    public boolean inserir(Documento documento) {
        try {
            this.conexao = ConexaoBanco.conexao();
            String sql = "INSERT INTO DOCUMENTO "
                    + "(CLIENTE_NOME, CLIENTE_DOCUMENTO, CLIENTE_RG, CLIENTE_ENDERECO, "
                    + "CLIENTE_BAIRRO, CLIENTE_CIDADE, CLIENTE_CEP, VEICULO_MARCA, VEICULO_MODELO, "
                    + "VEICULO_TIPO, VEICULO_COR, VEICULO_PLACA, VEICULO_CHASSIS, VEICULO_KM, VEICULO_CILINDRO, "
                    + "VEICULO_COMBUSTIVEL, PAGAMENTO, PAGAMENTO_TIPO, PAGAMENTO_PARCELAS, PAGAMENTO_PRIMEIRA_PARCELA, "
                    + "PAGAMENTO_VENCIMENTO, PAGAMENTO_DATA, PAGAMENTO_VALOR_FINANCIADO, PAGAMENTO_VALOR_ENTRADA, PAGAMENTO_VALOR_TOTAL, "
                    + "DOCUMENTO_TIPO, DOCUMENTO_VENDEDOR, VEICULO_ANOMOD, VEICULO_PORTAS, PAGAMENTO_VALOR_PARCELA, CLIENTE_OBSERVACAO, VEICULO_RENAVAM) "
                    + "VALUES (?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?);";

            this.statment = conexao.prepareStatement(sql);
            this.statment.setString(1, documento.getCliente().getNome());
            this.statment.setString(2, documento.getCliente().getDocumento());
            this.statment.setString(3, documento.getCliente().getRg());
            this.statment.setString(4, documento.getCliente().getEndereco());
            this.statment.setString(5, documento.getCliente().getBairro());
            this.statment.setString(6, documento.getCliente().getCidade());
            this.statment.setString(7, documento.getCliente().getCep());
            this.statment.setString(8, documento.getVeiculo().getMarca());
            this.statment.setString(9, documento.getVeiculo().getModelo());
            this.statment.setString(10, documento.getVeiculo().getTipo());
            this.statment.setString(11, documento.getVeiculo().getCor());
            this.statment.setString(12, documento.getVeiculo().getPlaca());
            this.statment.setString(13, documento.getVeiculo().getChassis());
            this.statment.setString(14, documento.getVeiculo().getKm());
            this.statment.setString(15, documento.getVeiculo().getCilindro());
            this.statment.setString(16, documento.getVeiculo().getCombustivel());
            this.statment.setString(17, documento.getFormaPagamento().getPagamento());
            this.statment.setString(18, documento.getFormaPagamento().getPagamentoTipo());
            this.statment.setInt(19, documento.getFormaPagamento().getParcelas());
            this.statment.setInt(20, documento.getFormaPagamento().getPrimeiraParcela());
            this.statment.setString(21, documento.getFormaPagamento().getVencimento());
            this.statment.setString(22, documento.getFormaPagamento().getData());
            this.statment.setBigDecimal(23, documento.getFormaPagamento().getValorFinanciado());
            this.statment.setBigDecimal(24, documento.getFormaPagamento().getValorEntrada());
            this.statment.setBigDecimal(25, documento.getFormaPagamento().getValorTotal());
            this.statment.setString(26, documento.getTipo());
            this.statment.setString(27, documento.getVendedor());
            this.statment.setString(28, documento.getVeiculo().getAnomod());
            this.statment.setInt(29, documento.getVeiculo().getPortas());
            this.statment.setBigDecimal(30, documento.getFormaPagamento().getValorParcela());
            this.statment.setString(31, documento.getCliente().getObservacao());
            this.statment.setString(32, documento.getVeiculo().getRenavan());

            this.statment.executeUpdate();

            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro (1) ao Inserir:\n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                this.conexao.close();
                this.statment.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro (2) ao Inserir:\n" + ex);
            }

        }
        return false;
    }

    public boolean alterar(Documento documento) {
        try {
            this.conexao = ConexaoBanco.conexao();
            String sql = "UPDATE DOCUMENTO SET CLIENTE_NOME = ?, CLIENTE_DOCUMENTO = ?, CLIENTE_RG = ?, CLIENTE_ENDERECO = ?, CLIENTE_BAIRRO = ?, "
                    + "CLIENTE_CIDADE = ?, CLIENTE_CEP = ?, VEICULO_MARCA = ?, VEICULO_MODELO = ?, VEICULO_TIPO = ?, "
                    + "VEICULO_COR = ?, VEICULO_PLACA = ?, VEICULO_CHASSIS = ?, VEICULO_KM = ?, VEICULO_CILINDRO = ?, VEICULO_COMBUSTIVEL = ?, "
                    + "PAGAMENTO = ?, PAGAMENTO_TIPO = ?, PAGAMENTO_PARCELAS = ?, PAGAMENTO_PRIMEIRA_PARCELA = ?, PAGAMENTO_VENCIMENTO = ?, "
                    + "PAGAMENTO_DATA = ?, PAGAMENTO_VALOR_FINANCIADO = ?, PAGAMENTO_VALOR_ENTRADA = ?, PAGAMENTO_VALOR_TOTAL = ?, DOCUMENTO_TIPO = ?, "
                    + "DOCUMENTO_VENDEDOR = ?, VEICULO_ANOMOD = ?, VEICULO_PORTAS = ?, PAGAMENTO_VALOR_PARCELA = ?, CLIENTE_OBSERVACAO = ?, VEICULO_RENAVAM = ? WHERE (CODIGO = ?);";

            this.statment = conexao.prepareStatement(sql);
            this.statment.setString(1, documento.getCliente().getNome());
            this.statment.setString(2, documento.getCliente().getDocumento());
            this.statment.setString(3, documento.getCliente().getRg());
            this.statment.setString(4, documento.getCliente().getEndereco());
            this.statment.setString(5, documento.getCliente().getBairro());
            this.statment.setString(6, documento.getCliente().getCidade());
            this.statment.setString(7, documento.getCliente().getCep());
            this.statment.setString(8, documento.getVeiculo().getMarca());
            this.statment.setString(9, documento.getVeiculo().getModelo());
            this.statment.setString(10, documento.getVeiculo().getTipo());
            this.statment.setString(11, documento.getVeiculo().getCor());
            this.statment.setString(12, documento.getVeiculo().getPlaca());
            this.statment.setString(13, documento.getVeiculo().getChassis());
            this.statment.setString(14, documento.getVeiculo().getKm());
            this.statment.setString(15, documento.getVeiculo().getCilindro());
            this.statment.setString(16, documento.getVeiculo().getCombustivel());
            this.statment.setString(17, documento.getFormaPagamento().getPagamento());
            this.statment.setString(18, documento.getFormaPagamento().getPagamentoTipo());
            this.statment.setInt(19, documento.getFormaPagamento().getParcelas());
            this.statment.setInt(20, documento.getFormaPagamento().getPrimeiraParcela());
            this.statment.setString(21, documento.getFormaPagamento().getVencimento());
            this.statment.setString(22, documento.getFormaPagamento().getData());
            this.statment.setBigDecimal(23, documento.getFormaPagamento().getValorFinanciado());
            this.statment.setBigDecimal(24, documento.getFormaPagamento().getValorEntrada());
            this.statment.setBigDecimal(25, documento.getFormaPagamento().getValorTotal());
            this.statment.setString(26, documento.getTipo());
            this.statment.setString(27, documento.getVendedor());
            this.statment.setString(28, documento.getVeiculo().getAnomod());
            this.statment.setInt(29, documento.getVeiculo().getPortas());
            this.statment.setBigDecimal(30, documento.getFormaPagamento().getValorParcela());
            this.statment.setString(31, documento.getCliente().getObservacao());
            this.statment.setString(32, documento.getVeiculo().getRenavan());
            this.statment.setInt(33, documento.getCodigo());

            this.statment.executeUpdate();

            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro (1): " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                this.conexao.close();
                this.statment.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro (2): " + ex);
            }

        }
        return false;
    }

    public boolean excluir(String codigo) {
        try {
            this.conexao = ConexaoBanco.conexao();
            String sql = "DELETE FROM documento WHERE codigo = ?;";

            this.statment = conexao.prepareStatement(sql);
            this.statment.setString(1, codigo);
            this.statment.executeUpdate();

            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro (1): O registro já esta vinculado a um produto!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                this.conexao.close();
                this.statment.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro (2): " + ex);
            }
        }
        return false;
    }

    public List<Documento> listar() {

        List<Documento> lista = new ArrayList<>();
        try {
            conexao = ConexaoBanco.conexao();
            ResultSet rs;
            String sql = "select * from documento order by codigo;";
            this.statment = conexao.prepareStatement(sql);
            rs = this.statment.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("CLIENTE_NOME"));
                cliente.setDocumento(rs.getString("CLIENTE_DOCUMENTO"));
                cliente.setRg(rs.getString("CLIENTE_RG"));
                cliente.setEndereco(rs.getString("CLIENTE_ENDERECO"));
                cliente.setBairro(rs.getString("CLIENTE_BAIRRO"));
                cliente.setCidade(rs.getString("CLIENTE_CIDADE"));
                cliente.setCep(rs.getString("CLIENTE_CEP"));
                cliente.setObservacao(rs.getString("CLIENTE_OBSERVACAO"));

                Veiculo veiculo = new Veiculo();
                veiculo.setMarca(rs.getString("VEICULO_MARCA"));
                veiculo.setModelo(rs.getString("VEICULO_MODELO"));
                veiculo.setTipo(rs.getString("VEICULO_TIPO"));
                veiculo.setCor(rs.getString("VEICULO_COR"));
                veiculo.setPlaca(rs.getString("VEICULO_PLACA"));
                veiculo.setChassis(rs.getString("VEICULO_CHASSIS"));
                veiculo.setKm(rs.getString("VEICULO_KM"));
                veiculo.setCilindro(rs.getString("VEICULO_CILINDRO"));
                veiculo.setCombustivel(rs.getString("VEICULO_COMBUSTIVEL"));
                veiculo.setAnomod(rs.getString("VEICULO_ANOMOD"));
                veiculo.setPortas(rs.getInt("VEICULO_PORTAS"));
                veiculo.setRenavan(rs.getString("VEICULO_RENAVAM"));

                FormaPagamento formaPagamento = new FormaPagamento();
                formaPagamento.setPagamento(rs.getString("PAGAMENTO"));
                formaPagamento.setPagamentoTipo(rs.getString("PAGAMENTO_TIPO"));
                formaPagamento.setParcelas(rs.getInt("PAGAMENTO_PARCELAS"));
                formaPagamento.setPrimeiraParcela(rs.getInt("PAGAMENTO_PRIMEIRA_PARCELA"));
                formaPagamento.setVencimento(rs.getString("PAGAMENTO_VENCIMENTO"));
                formaPagamento.setData(rs.getString("PAGAMENTO_DATA"));
                formaPagamento.setValorFinanciado(rs.getBigDecimal("PAGAMENTO_VALOR_FINANCIADO"));
                formaPagamento.setValorEntrada(rs.getBigDecimal("PAGAMENTO_VALOR_ENTRADA"));
                formaPagamento.setValorTotal(rs.getBigDecimal("PAGAMENTO_VALOR_TOTAL"));
                formaPagamento.setValorParcela(rs.getBigDecimal("PAGAMENTO_VALOR_PARCELA"));                

                Documento doc = new Documento();
                doc.setCodigo(rs.getInt("CODIGO"));
                doc.setCliente(cliente);
                doc.setVeiculo(veiculo);
                doc.setFormaPagamento(formaPagamento);
                doc.setTipo(rs.getString("DOCUMENTO_TIPO"));
                doc.setVendedor(rs.getString("DOCUMENTO_VENDEDOR"));
                lista.add(doc);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro (1): " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                this.conexao.close();
                this.statment.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro (2): " + ex);
            }
        }

        return lista;
    }

    public Documento get(String codigo) {
        try {
            Documento doc = new Documento();

            this.conexao = ConexaoBanco.conexao();
            ResultSet rs;
            String sql = "SELECT * FROM documento WHERE codigo = ?";
            this.statment = conexao.prepareStatement(sql);

            this.statment.setString(1, codigo);

            rs = this.statment.executeQuery();
            if (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("CLIENTE_NOME"));
                cliente.setDocumento(rs.getString("CLIENTE_DOCUMENTO"));
                cliente.setRg(rs.getString("CLIENTE_RG"));
                cliente.setEndereco(rs.getString("CLIENTE_ENDERECO"));
                cliente.setBairro(rs.getString("CLIENTE_BAIRRO"));
                cliente.setCidade(rs.getString("CLIENTE_CIDADE"));
                cliente.setCep(rs.getString("CLIENTE_CEP"));
                cliente.setObservacao(rs.getString("CLIENTE_OBSERVACAO"));

                Veiculo veiculo = new Veiculo();
                veiculo.setMarca(rs.getString("VEICULO_MARCA"));
                veiculo.setModelo(rs.getString("VEICULO_MODELO"));
                veiculo.setTipo(rs.getString("VEICULO_TIPO"));
                veiculo.setCor(rs.getString("VEICULO_COR"));
                veiculo.setPlaca(rs.getString("VEICULO_PLACA"));
                veiculo.setChassis(rs.getString("VEICULO_CHASSIS"));
                veiculo.setKm(rs.getString("VEICULO_KM"));
                veiculo.setCilindro(rs.getString("VEICULO_CILINDRO"));
                veiculo.setCombustivel(rs.getString("VEICULO_COMBUSTIVEL"));
                veiculo.setAnomod(rs.getString("VEICULO_ANOMOD"));
                veiculo.setPortas(rs.getInt("VEICULO_PORTAS"));
                veiculo.setRenavan(rs.getString("VEICULO_RENAVAM"));

                FormaPagamento formaPagamento = new FormaPagamento();
                formaPagamento.setPagamento(rs.getString("PAGAMENTO"));
                formaPagamento.setPagamentoTipo(rs.getString("PAGAMENTO_TIPO"));
                formaPagamento.setParcelas(rs.getInt("PAGAMENTO_PARCELAS"));
                formaPagamento.setPrimeiraParcela(rs.getInt("PAGAMENTO_PRIMEIRA_PARCELA"));
                formaPagamento.setVencimento(rs.getString("PAGAMENTO_VENCIMENTO"));
                formaPagamento.setData(rs.getString("PAGAMENTO_DATA"));
                formaPagamento.setValorParcela(rs.getBigDecimal("PAGAMENTO_VALOR_PARCELA"));
                formaPagamento.setValorFinanciado(rs.getBigDecimal("PAGAMENTO_VALOR_FINANCIADO"));
                formaPagamento.setValorEntrada(rs.getBigDecimal("PAGAMENTO_VALOR_ENTRADA"));
                formaPagamento.setValorTotal(rs.getBigDecimal("PAGAMENTO_VALOR_TOTAL"));

                doc.setCodigo(rs.getInt("CODIGO"));
                doc.setCliente(cliente);
                doc.setVeiculo(veiculo);
                doc.setFormaPagamento(formaPagamento);
                doc.setTipo(rs.getString("DOCUMENTO_TIPO"));
                doc.setVendedor(rs.getString("DOCUMENTO_VENDEDOR"));
            }

            return doc;
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro (1): " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                this.conexao.close();
                this.statment.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro (2): " + ex);
            }
        }
        return null;
    }

    public List<Documento> listarFiltro(String seq, String data_inicio, String data_fim) {

        List<Documento> lista = new ArrayList<>();
        try {
            conexao = ConexaoBanco.conexao();
            ResultSet rs;
            String sql = "select * from documento WHERE PAGAMENTO_DATA BETWEEN (?) AND (?)";
            if (!seq.equals("")) {
                sql += " AND codigo = (?)";
            }
            sql += " ORDER BY CODIGO;";
            this.statment = conexao.prepareStatement(sql);
            this.statment.setString(1, data_inicio + " 00:00:00");
            this.statment.setString(2, data_fim + " 23:59:00");
            if (!seq.isEmpty()) {
                this.statment.setString(3, seq);
            }
            rs = this.statment.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("CLIENTE_NOME"));
                cliente.setDocumento(rs.getString("CLIENTE_DOCUMENTO"));
                cliente.setRg(rs.getString("CLIENTE_RG"));
                cliente.setEndereco(rs.getString("CLIENTE_ENDERECO"));
                cliente.setBairro(rs.getString("CLIENTE_BAIRRO"));
                cliente.setCidade(rs.getString("CLIENTE_CIDADE"));
                cliente.setCep(rs.getString("CLIENTE_CEP"));
                cliente.setObservacao(rs.getString("CLIENTE_OBSERVACAO"));

                Veiculo veiculo = new Veiculo();
                veiculo.setMarca(rs.getString("VEICULO_MARCA"));
                veiculo.setModelo(rs.getString("VEICULO_MODELO"));
                veiculo.setTipo(rs.getString("VEICULO_TIPO"));
                veiculo.setCor(rs.getString("VEICULO_COR"));
                veiculo.setPlaca(rs.getString("VEICULO_PLACA"));
                veiculo.setChassis(rs.getString("VEICULO_CHASSIS"));
                veiculo.setKm(rs.getString("VEICULO_KM"));
                veiculo.setCilindro(rs.getString("VEICULO_CILINDRO"));
                veiculo.setCombustivel(rs.getString("VEICULO_COMBUSTIVEL"));
                veiculo.setAnomod(rs.getString("VEICULO_ANOMOD"));
                veiculo.setPortas(rs.getInt("VEICULO_PORTAS"));
                veiculo.setRenavan(rs.getString("VEICULO_RENAVAM"));

                FormaPagamento formaPagamento = new FormaPagamento();
                formaPagamento.setPagamento(rs.getString("PAGAMENTO"));
                formaPagamento.setPagamentoTipo(rs.getString("PAGAMENTO_TIPO"));
                formaPagamento.setParcelas(rs.getInt("PAGAMENTO_PARCELAS"));
                formaPagamento.setPrimeiraParcela(rs.getInt("PAGAMENTO_PRIMEIRA_PARCELA"));
                formaPagamento.setVencimento(rs.getString("PAGAMENTO_VENCIMENTO"));
                formaPagamento.setData(rs.getString("PAGAMENTO_DATA"));
                formaPagamento.setValorParcela(rs.getBigDecimal("PAGAMENTO_VALOR_PARCELA"));
                formaPagamento.setValorFinanciado(rs.getBigDecimal("PAGAMENTO_VALOR_FINANCIADO"));
                formaPagamento.setValorEntrada(rs.getBigDecimal("PAGAMENTO_VALOR_ENTRADA"));
                formaPagamento.setValorTotal(rs.getBigDecimal("PAGAMENTO_VALOR_TOTAL"));

                Documento doc = new Documento();
                doc.setCodigo(rs.getInt("CODIGO"));
                doc.setCliente(cliente);
                doc.setVeiculo(veiculo);
                doc.setFormaPagamento(formaPagamento);
                doc.setTipo(rs.getString("DOCUMENTO_TIPO"));
                doc.setVendedor(rs.getString("DOCUMENTO_VENDEDOR"));
                lista.add(doc);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro (1): " + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                this.conexao.close();
                this.statment.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro (2): " + ex);
            }
        }
        return lista;
    }

    public boolean duplicarDocumento(String codigo) {
        try {
            this.conexao = ConexaoBanco.conexao();
            String sql = "INSERT INTO DOCUMENTO (CLIENTE_NOME, CLIENTE_DOCUMENTO, CLIENTE_RG, CLIENTE_ENDERECO, CLIENTE_BAIRRO, CLIENTE_CIDADE, CLIENTE_CEP, VEICULO_MARCA, VEICULO_MODELO, VEICULO_TIPO, VEICULO_COR, VEICULO_PLACA, VEICULO_CHASSIS, VEICULO_KM, VEICULO_CILINDRO, VEICULO_COMBUSTIVEL, PAGAMENTO, PAGAMENTO_TIPO, PAGAMENTO_PARCELAS, PAGAMENTO_PRIMEIRA_PARCELA, PAGAMENTO_VENCIMENTO, PAGAMENTO_DATA, PAGAMENTO_VALOR_FINANCIADO, PAGAMENTO_VALOR_ENTRADA, PAGAMENTO_VALOR_TOTAL, DOCUMENTO_TIPO, DOCUMENTO_VENDEDOR, VEICULO_ANOMOD, VEICULO_PORTAS, PAGAMENTO_VALOR_PARCELA, CLIENTE_OBSERVACAO, VEICULO_RENAVAM) "
                    + "SELECT CLIENTE_NOME, CLIENTE_DOCUMENTO, CLIENTE_RG, CLIENTE_ENDERECO, CLIENTE_BAIRRO, CLIENTE_CIDADE, CLIENTE_CEP, VEICULO_MARCA, VEICULO_MODELO, VEICULO_TIPO, VEICULO_COR, VEICULO_PLACA, VEICULO_CHASSIS, VEICULO_KM, VEICULO_CILINDRO, VEICULO_COMBUSTIVEL, PAGAMENTO, PAGAMENTO_TIPO, PAGAMENTO_PARCELAS, PAGAMENTO_PRIMEIRA_PARCELA, PAGAMENTO_VENCIMENTO, PAGAMENTO_DATA, PAGAMENTO_VALOR_FINANCIADO, PAGAMENTO_VALOR_ENTRADA, PAGAMENTO_VALOR_TOTAL, DOCUMENTO_TIPO, DOCUMENTO_VENDEDOR, VEICULO_ANOMOD, VEICULO_PORTAS, PAGAMENTO_VALOR_PARCELA, CLIENTE_OBSERVACAO, VEICULO_RENAVAM"
                    + " FROM DOCUMENTO WHERE CODIGO = ?";

            this.statment = conexao.prepareStatement(sql);
            this.statment.setString(1, codigo);
            this.statment.executeUpdate();

            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro (1) ao duplicar documento!", "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        } finally {
            try {
                this.conexao.close();
                this.statment.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro (2) ao duplicar documento!");
                System.out.println(ex);
            }

        }
        return false;
    }

    public String getUltimoCodigoDocumento() {
        String id = "";
        try {
            conexao = ConexaoBanco.conexao();
            ResultSet rs;
            String sql = "Select max(codigo) from documento;";
            this.statment = conexao.prepareStatement(sql);
            rs = this.statment.executeQuery();
            while (rs.next()) {
                id = rs.getString("max");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro (1) DOCUMENTO: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                this.conexao.close();
                this.statment.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro (2): " + ex.getMessage());
            }
        }
        return id;
    }
}
