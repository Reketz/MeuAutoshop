package br.com.systech.bean;

import java.math.BigDecimal;

public class Veiculo {
    
    private int codigo;
    private int codigo_documento;
    private String marca;
    private String modelo;
    private String tipo;
    private String cor;
    private String anomod;
    private String placa;
    private String chassis;
    private int portas;
    private String km;
    private String cilindro;
    private String combustivel;
    private String observacao;
    private String renavan;
    private BigDecimal valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_documento() {
        return codigo_documento;
    }

    public void setCodigo_documento(int codigo_documento) {
        this.codigo_documento = codigo_documento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAnomod() {
        return anomod;
    }

    public void setAnomod(String anomod) {
        this.anomod = anomod;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getCilindro() {
        return cilindro;
    }

    public void setCilindro(String cilindro) {
        this.cilindro = cilindro;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
