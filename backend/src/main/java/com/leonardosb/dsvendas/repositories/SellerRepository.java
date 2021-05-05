package com.leonardosb.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardosb.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
