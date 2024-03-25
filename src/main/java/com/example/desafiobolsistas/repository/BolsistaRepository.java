package com.example.desafiobolsistas.repository;

import com.example.desafiobolsistas.entity.Bolsista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BolsistaRepository extends JpaRepository<Bolsista, Long> {
    Optional<Object> findById(Long id);

    void deleteById(Long id);
}