package com.leonardosb.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardosb.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
