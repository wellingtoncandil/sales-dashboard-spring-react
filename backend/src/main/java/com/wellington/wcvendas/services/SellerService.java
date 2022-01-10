package com.wellington.wcvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellington.wcvendas.dto.SellerDTO;
import com.wellington.wcvendas.entities.Seller;
import com.wellington.wcvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		List<Seller> list = repository.findAll();
		List<SellerDTO> listDTO = list.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
		return listDTO;
	}
}
