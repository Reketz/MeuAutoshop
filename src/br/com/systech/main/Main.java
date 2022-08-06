package br.com.systech.main;

import br.com.systech.bean.Cliente;
import br.com.systech.bean.Documento;
import br.com.systech.bean.FormaPagamento;
import br.com.systech.bean.Veiculo;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
//        Empresa empresa = new Empresa();
//        empresa.setNome_fantasia("");

        Cliente cliente = new Cliente();
        cliente.setNome("GUILHERME LUCIA DA SILVA");
        cliente.setDocumento("91115060406");
        cliente.setRg("1120431");
        cliente.setEndereco("EDUARDO ALVES");
        cliente.setBairro("ESPERANÇA");
        cliente.setCidade("CAJAZEIRAS");
        cliente.setCep("58900000");

        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("FIAT");
        veiculo.setModelo("PALIO FIRE ECO");
        veiculo.setTipo("AUTOMOVEL");
        veiculo.setCor("PRATA");
        veiculo.setPlaca("");
        veiculo.setChassis("123321123321");
        veiculo.setKm("0");
        veiculo.setCilindro("1.0");
        veiculo.setCombustivel("FLEX");

        FormaPagamento formaPagamento = new FormaPagamento();
        formaPagamento.setPagamento("FINANCEIRO ESPECIE");
        formaPagamento.setPagamentoTipo("SANTANDER");
        formaPagamento.setParcelas(48);
        formaPagamento.setPrimeiraParcela(1);
        formaPagamento.setVencimento("2024-05-29 14:51:00");
        formaPagamento.setData("2020-06-19 14:51:00");
        formaPagamento.setValorFinanciado(new BigDecimal("11900"));
        formaPagamento.setValorEntrada(new BigDecimal("8000"));
        formaPagamento.setValorTotal(new BigDecimal("19900"));

        Documento doc = new Documento();
        doc.setCodigo(1);
        doc.setCliente(cliente);
        doc.setVeiculo(veiculo);
        doc.setFormaPagamento(formaPagamento);
        doc.setTipo("VENDA");
        doc.setVendedor("NALDO");

    }

}
