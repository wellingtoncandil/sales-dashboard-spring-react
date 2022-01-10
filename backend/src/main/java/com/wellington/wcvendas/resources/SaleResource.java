package com.wellington.wcvendas.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellington.wcvendas.dto.SaleDTO;
import com.wellington.wcvendas.services.SaleService;
import com.wellington.wcvendas.services.SellerService;

@RestController
@RequestMapping("/sales")
public class SaleResource {

	@Autowired
	SaleService service;
	
	@Autowired
	SellerService sellerService;

	@GetMapping
	@Transactional(readOnly = true)
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		sellerService.findAll();
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}

}
