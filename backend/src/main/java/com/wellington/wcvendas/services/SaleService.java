package com.wellington.wcvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wellington.wcvendas.dto.SaleDTO;
import com.wellington.wcvendas.dto.SaleSuccessDTO;
import com.wellington.wcvendas.dto.SaleSumDTO;
import com.wellington.wcvendas.entities.Sale;
import com.wellington.wcvendas.repositories.SaleRepository;
import com.wellington.wcvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	SaleRepository repository;
	
	@Autowired
	SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> list = repository.findAll(pageable);
		Page<SaleDTO> listDTO = list.map(x -> new SaleDTO(x));
		return listDTO;
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return repository.successGroupedBySeller();
	}
}
