package com.wellington.wcvendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wellington.wcvendas.dto.SaleDTO;
import com.wellington.wcvendas.dto.SaleSuccessDTO;
import com.wellington.wcvendas.dto.SaleSumDTO;
import com.wellington.wcvendas.services.SaleService;
import com.wellington.wcvendas.services.SellerService;

@RestController
@RequestMapping("/sales")
public class SaleResource {

	@Autowired
	SaleService service;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}

	@GetMapping("/sum-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGrupedBySeller() {
		List<SaleSumDTO> list = service.amountGroupedBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGrupedBySeller() {
		List<SaleSuccessDTO> list = service.successGroupedBySeller();
		return ResponseEntity.ok(list);
	}
}
