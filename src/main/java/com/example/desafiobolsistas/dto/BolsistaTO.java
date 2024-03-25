package com.example.desafiobolsistas.dto;


import com.example.desafiobolsistas.entity.Bolsista;
import com.example.desafiobolsistas.entity.DadosBancarios;
import com.example.desafiobolsistas.enums.TipoIdentificador;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class BolsistaTO {

    public BolsistaTO() {
    }

    public BolsistaTO(Long id, String nome, TipoIdentificador tipoIdentificador,
                      String numeroIdentificador, Date dataCadastro, DadosBancariosTO dadosBancarios) {
        this.id = id;
        this.nome = nome;
        this.tipoIdentificador = tipoIdentificador;
        this.numeroIdentificador = numeroIdentificador;
        this.dataCadastro = dataCadastro;
        this.dadosBancarios = dadosBancarios;
    }

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private TipoIdentificador tipoIdentificador;

    @Getter
    @Setter
    private String numeroIdentificador;

    @Getter
    @Setter
    private Date dataCadastro;

    @Getter
    @Setter
    private DadosBancariosTO dadosBancarios;

    public Bolsista build(BolsistaTO bolsistaTO) {
        Bolsista bolsista = new Bolsista();
        bolsista.setId(bolsistaTO.getId());
        bolsista.setNome(bolsistaTO.getNome());
        bolsista.setTipoIdentificador(bolsistaTO.getTipoIdentificador());
        bolsista.setNumeroIdentificador(bolsistaTO.getNumeroIdentificador());
        bolsista.setDataCadastro(bolsistaTO.getDataCadastro());
        bolsista.setDadosBancarios(bolsistaTO.getDadosBancarios().build(bolsistaTO.getDadosBancarios()));
        return bolsista;
    }
}