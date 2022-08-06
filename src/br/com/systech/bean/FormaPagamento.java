package br.com.systech.bean;

import java.math.BigDecimal;

public class FormaPagamento {
    private String pagamento;
    private String pagamentoTipo;
    private int parcelas;
    private int primeiraParcela;
    
    private BigDecimal valorParcela;
    private BigDecimal valorEntrada;
    private BigDecimal valorFinanciado;
    private BigDecimal valorTotal;
    
    private String vencimento;
    private String data;

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getPagamentoTipo() {
        return pagamentoTipo;
    }

    public void setPagamentoTipo(String pagamentoTipo) {
        this.pagamentoTipo = pagamentoTipo;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public int getPrimeiraParcela() {
        return primeiraParcela;
    }

    public void setPrimeiraParcela(int primeiraParcela) {
        this.primeiraParcela = primeiraParcela;
    }

    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }

    public BigDecimal getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(BigDecimal valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public BigDecimal getValorFinanciado() {
        return valorFinanciado;
    }

    public void setValorFinanciado(BigDecimal valorFinanciado) {
        this.valorFinanciado = valorFinanciado;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
}
