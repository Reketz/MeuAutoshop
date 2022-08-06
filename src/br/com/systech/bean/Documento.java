package br.com.systech.bean;

import java.util.List;

public class Documento {
    private int codigo;
    private Empresa empresa;
    private Cliente cliente;
    private Veiculo veiculo;
    private List<Veiculo> veiculos_recebidos;
    private FormaPagamento formaPagamento;
    private String tipo;
    private String vendedor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public List<Veiculo> getVeiculos_recebidos() {
        return veiculos_recebidos;
    }

    public void setVeiculos_recebidos(List<Veiculo> veiculos_recebidos) {
        this.veiculos_recebidos = veiculos_recebidos;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    
}
