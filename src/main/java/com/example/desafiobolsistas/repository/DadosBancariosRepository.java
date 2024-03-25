package com.example.desafiobolsistas.repository;

import com.example.desafiobolsistas.entity.DadosBancarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadosBancariosRepository extends JpaRepository<DadosBancarios, Long> {
}
