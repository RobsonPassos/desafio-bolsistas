package com.example.desafiobolsistas.dto;

import com.example.desafiobolsistas.entity.Bolsista;
import com.example.desafiobolsistas.entity.DadosBancarios;
import lombok.Getter;
import lombok.Setter;

public class DadosBancariosTO {

    public DadosBancariosTO() {
    }

    public DadosBancariosTO(Long id, String nome, String agencia,
                            String conta) {
        this.id = id;
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
    }

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private String agencia;

    @Getter
    @Setter
    private String conta;


    public DadosBancarios build(DadosBancariosTO dadosBancariosTO) {
        DadosBancarios dadosBancarios = new DadosBancarios();
        dadosBancarios.setId(dadosBancariosTO.getId());
        dadosBancarios.setNome(dadosBancariosTO.getNome());
        dadosBancarios.setAgencia(dadosBancariosTO.getAgencia());
        dadosBancarios.setConta(dadosBancariosTO.getConta());
        return dadosBancarios;
    }
}