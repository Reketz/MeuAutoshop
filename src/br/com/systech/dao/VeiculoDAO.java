package br.com.systech.dao;

import br.com.systech.bean.Veiculo;
import br.com.systech.config.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class VeiculoDAO {

    private Connection conexao;
    private PreparedStatement statment;

    public boolean inserir(Veiculo veiculo) {
        try {
            this.conexao = ConexaoBanco.conexao();
            String sql = "INSERT INTO VEICULO (CODIGO_DOCUMENTO, MARCA, MODELO, TIPO, COR, ANOMOD, PLACA, CHASSIS, PORTAS, KM, CILINDRO, COMBUSTIVEL, OBSERVACAO, RENAVAN, VALOR) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

            this.statment = conexao.prepareStatement(sql);

            this.statment.setInt(1, veiculo.getCodigo_documento());
            this.statment.setString(2, veiculo.getMarca());
            this.statment.setString(3, veiculo.getModelo());
            this.statment.setString(4, veiculo.getTipo());
            this.statment.setString(5, veiculo.getCor());
            this.statment.setString(6, veiculo.getAnomod());
            this.statment.setString(7, veiculo.getPlaca());
            this.statment.setString(8, veiculo.getChassis());
            this.statment.setInt(9, veiculo.getPortas());
            this.statment.setString(10, veiculo.getKm());
            this.statment.setString(11, veiculo.getCilindro());
            this.statment.setString(12, veiculo.getCombustivel());
            this.statment.setString(13, veiculo.getObservacao());
            this.statment.setString(14, veiculo.getRenavan());
            this.statment.setBigDecimal(15, veiculo.getValor());

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

    public boolean alterar(Veiculo veiculo) {
        try {
            this.conexao = ConexaoBanco.conexao();
            String sql = "UPDATE VEICULO SET CODIGO_DOCUMENTO = ?, MARCA = ?, MODELO = ?, TIPO = ?, COR = ?, ANOMOD = ?, PLACA = ?, CHASSIS = ?, PORTAS = ?, KM = ?, CILINDRO = ?, COMBUSTIVEL = ?, OBSERVACAO = ?, RENAVAN = ?, VALOR = ? WHERE (CODIGO = ?);";

            this.statment = conexao.prepareStatement(sql);

            this.statment.setInt(1, veiculo.getCodigo_documento());
            this.statment.setString(2, veiculo.getMarca());
            this.statment.setString(3, veiculo.getModelo());
            this.statment.setString(4, veiculo.getTipo());
            this.statment.setString(5, veiculo.getCor());
            this.statment.setString(6, veiculo.getAnomod());
            this.statment.setString(7, veiculo.getPlaca());
            this.statment.setString(8, veiculo.getChassis());
            this.statment.setInt(9, veiculo.getPortas());
            this.statment.setString(10, veiculo.getKm());
            this.statment.setString(11, veiculo.getCilindro());
            this.statment.setString(12, veiculo.getCombustivel());
            this.statment.setString(13, veiculo.getObservacao());
            this.statment.setString(14, veiculo.getRenavan());
            this.statment.setBigDecimal(15, veiculo.getValor());
            this.statment.setInt(16, veiculo.getCodigo());

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

    public boolean excluir(String codigo) {
        try {
            this.conexao = ConexaoBanco.conexao();
            String sql = "DELETE FROM veiculo WHERE codigo = ?;";

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

    public List<Veiculo> listar() {

        List<Veiculo> lista = new ArrayList<>();
        try {

            this.conexao = ConexaoBanco.conexao();
            ResultSet rs;
            String sql = "SELECT * FROM VEICULO";

            this.statment = conexao.prepareStatement(sql);

            rs = this.statment.executeQuery();
            while (rs.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setCodigo(rs.getInt("CODIGO"));
                veiculo.setCodigo_documento(rs.getInt("CODIGO_DOCUMENTO"));
                veiculo.setMarca(rs.getString("MARCA"));
                veiculo.setModelo(rs.getString("MODELO"));
                veiculo.setTipo(rs.getString("TIPO"));
                veiculo.setCor(rs.getString("COR"));
                veiculo.setAnomod(rs.getString("ANOMOD"));
                veiculo.setPlaca(rs.getString("PLACA"));
                veiculo.setChassis(rs.getString("CHASSIS"));
                veiculo.setPortas(rs.getInt("PORTAS"));
                veiculo.setKm(rs.getString("KM"));
                veiculo.setCilindro(rs.getString("CILINDRO"));
                veiculo.setCombustivel(rs.getString("COMBUSTIVEL"));
                veiculo.setObservacao(rs.getString("OBSERVACAO"));
                veiculo.setRenavan(rs.getString("RENAVAN"));
                veiculo.setValor(rs.getBigDecimal("VALOR"));
                lista.add(veiculo);
            }
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
        return lista;
    }

    public List<Veiculo> listarFiltro(String codigo_documento) {

        List<Veiculo> lista = new ArrayList<>();
        try {
            conexao = ConexaoBanco.conexao();
            ResultSet rs;
            String sql = "select * from veiculo WHERE codigo_documento = ? ORDER BY CODIGO;";
            this.statment = conexao.prepareStatement(sql);
            this.statment.setString(1, codigo_documento);
            rs = this.statment.executeQuery();

            while (rs.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setCodigo(rs.getInt("CODIGO"));
                veiculo.setCodigo_documento(rs.getInt("CODIGO_DOCUMENTO"));
                veiculo.setMarca(rs.getString("MARCA"));
                veiculo.setModelo(rs.getString("MODELO"));
                veiculo.setTipo(rs.getString("TIPO"));
                veiculo.setCor(rs.getString("COR"));
                veiculo.setAnomod(rs.getString("ANOMOD"));
                veiculo.setPlaca(rs.getString("PLACA"));
                veiculo.setChassis(rs.getString("CHASSIS"));
                veiculo.setPortas(rs.getInt("PORTAS"));
                veiculo.setKm(rs.getString("KM"));
                veiculo.setCilindro(rs.getString("CILINDRO"));
                veiculo.setCombustivel(rs.getString("COMBUSTIVEL"));
                veiculo.setObservacao(rs.getString("OBSERVACAO"));
                veiculo.setRenavan(rs.getString("RENAVAN"));
                veiculo.setValor(rs.getBigDecimal("VALOR"));
                lista.add(veiculo);
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

    public Veiculo get(String codigo) {
        try {
            Veiculo veiculo = new Veiculo();
            this.conexao = ConexaoBanco.conexao();
            ResultSet rs;
            String sql = "SELECT * FROM VEICULO WHERE CODIGO = ?";

            this.statment = conexao.prepareStatement(sql);

            this.statment.setString(1, codigo);
            rs = this.statment.executeQuery();
            if (rs.next()) {
                veiculo.setCodigo(rs.getInt("CODIGO"));
                veiculo.setCodigo_documento(rs.getInt("CODIGO_DOCUMENTO"));
                veiculo.setMarca(rs.getString("MARCA"));
                veiculo.setModelo(rs.getString("MODELO"));
                veiculo.setTipo(rs.getString("TIPO"));
                veiculo.setCor(rs.getString("COR"));
                veiculo.setAnomod(rs.getString("ANOMOD"));
                veiculo.setPlaca(rs.getString("PLACA"));
                veiculo.setChassis(rs.getString("CHASSIS"));
                veiculo.setPortas(rs.getInt("PORTAS"));
                veiculo.setKm(rs.getString("KM"));
                veiculo.setCilindro(rs.getString("CILINDRO"));
                veiculo.setCombustivel(rs.getString("COMBUSTIVEL"));
                veiculo.setObservacao(rs.getString("OBSERVACAO"));
                veiculo.setRenavan(rs.getString("RENAVAN"));
                veiculo.setValor(rs.getBigDecimal("VALOR"));

                return veiculo;
            }
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
        return null;
    }
    
    public boolean duplicarVeiculo(String codigo) {
        try {
            this.conexao = ConexaoBanco.conexao();
            String sql = "INSERT INTO VEICULO (CODIGO_DOCUMENTO, MARCA, MODELO, TIPO, COR, ANOMOD, PLACA, CHASSIS, PORTAS, KM, CILINDRO, COMBUSTIVEL, OBSERVACAO, RENAVAN, VALOR) "
                    + "SELECT CODIGO_DOCUMENTO, MARCA, MODELO, TIPO, COR, ANOMOD, PLACA, CHASSIS, PORTAS, KM, CILINDRO, COMBUSTIVEL, OBSERVACAO, RENAVAN, VALOR FROM VEICULO"
                    + " WHERE CODIGO = ?";

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
    
    public String getUltimoCodigoVeiculo() {
        String id = "";
        try {
            conexao = ConexaoBanco.conexao();
            ResultSet rs;
            String sql = "Select max(codigo) from veiculo;";
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
