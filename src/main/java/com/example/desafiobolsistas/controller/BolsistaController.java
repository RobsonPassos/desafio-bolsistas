package com.example.desafiobolsistas.controller;

import com.example.desafiobolsistas.dto.BolsistaTO;
import com.example.desafiobolsistas.dto.DadosBancariosTO;
import com.example.desafiobolsistas.entity.Bolsista;
import com.example.desafiobolsistas.entity.DadosBancarios;
import com.example.desafiobolsistas.service.BolsistaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bolsistas")
public class BolsistaController {


    private BolsistaService bolsistaService;

    @Autowired
    public BolsistaController(BolsistaService bolsistaService) {
        this.bolsistaService = bolsistaService;
    }

    @PostMapping
    public ResponseEntity<?> createBolsista(@RequestBody BolsistaTO bolsistaTO) {
//        DadosBancariosTO dadosBancariosTO = bolsistaTO.getDadosBancarios();
//        if (dadosBancariosTO != null) {
//            // Salve os dados bancários separadamente
//            DadosBancarios dadosBancarios = bolsistaService.createDadosBancarios(dadosBancariosTO.build(dadosBancariosTO));
//            dadosBancariosTO.setId(dadosBancarios.getId());
//            bolsistaTO.setDadosBancarios(dadosBancariosTO);
//        }

        // Salve o bolsista
        Bolsista savedBolsista = bolsistaService.createBolsista(bolsistaTO.build(bolsistaTO));
        return new ResponseEntity<>(savedBolsista, HttpStatus.CREATED);
    }




    @GetMapping
    public List<Bolsista> getAllBolsistas() {
        return bolsistaService.getAllBolsistas();
    }

    @GetMapping("/{id}")
    public Bolsista getBolsistaById(@PathVariable Long id) {
        return bolsistaService.getBolsistaById(id);
    }

    @PutMapping("/{id}")
    public Bolsista updateBolsista(@PathVariable Long id, @RequestBody Bolsista bolsista) {
        return bolsistaService.updateBolsista(id, bolsista);
    }

    @DeleteMapping("/{id}")
    public void deleteBolsista(@PathVariable Long id) {
        bolsistaService.deleteBolsista(id);
    }
}