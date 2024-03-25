package com.example.desafiobolsistas.entity;

import com.example.desafiobolsistas.enums.TipoIdentificador;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bolsista")
public class Bolsista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dadosbancarios_id", nullable = false)
    private DadosBancarios dadosBancarios;






}
