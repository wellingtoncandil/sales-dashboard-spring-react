package com.wellington.wcvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wellington.wcvendas.dto.SaleDTO;
import com.wellington.wcvendas.entities.Sale;
import com.wellington.wcvendas.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	SaleRepository repository;
	
	public Page<SaleDTO> findAll(Pageable pageable){
		Page<Sale> list = repository.findAll(pageable);
		Page<SaleDTO> listDTO = list.map(x -> new SaleDTO(x));
		return listDTO;
	}
}
