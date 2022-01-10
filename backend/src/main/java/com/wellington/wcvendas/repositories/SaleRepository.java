package com.wellington.wcvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellington.wcvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
