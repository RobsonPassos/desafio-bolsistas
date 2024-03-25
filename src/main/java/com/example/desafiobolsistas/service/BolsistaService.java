package com.example.desafiobolsistas.service;


import com.example.desafiobolsistas.entity.Bolsista;
import com.example.desafiobolsistas.entity.DadosBancarios;
import com.example.desafiobolsistas.repository.BolsistaRepository;
import com.example.desafiobolsistas.repository.DadosBancariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BolsistaService {


    private final BolsistaRepository bolsistaRepository;
    private final DadosBancariosRepository dadosBancariosRepository;

    public BolsistaService(BolsistaRepository bolsistaRepository, DadosBancariosRepository dadosBancariosRepository) {
        this.bolsistaRepository = bolsistaRepository;
        this.dadosBancariosRepository = dadosBancariosRepository;
    }

    public Bolsista createBolsista(Bolsista bolsista) {
        return bolsistaRepository.save(bolsista);
    }
    public DadosBancarios createDadosBancarios(DadosBancarios dadosBancarios) {
        return dadosBancariosRepository.save(dadosBancarios);
    }

    public List<Bolsista> getAllBolsistas() {
        return bolsistaRepository.findAll();
    }

    public Bolsista getBolsistaById(Long id) {
        return (Bolsista) bolsistaRepository.findById(id).orElse(null);
    }

    public Bolsista updateBolsista(Long id, Bolsista bolsista) {
        bolsista.setId(id);
        return bolsistaRepository.save(bolsista);
    }

    public void deleteBolsista(Long id) {
        bolsistaRepository.deleteById(id);
    }
}
