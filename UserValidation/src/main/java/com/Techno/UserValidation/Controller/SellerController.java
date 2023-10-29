package com.Techno.UserValidation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Techno.UserValidation.DTO.SellerRequest;
import com.Techno.UserValidation.Entity.Seller;
import com.Techno.UserValidation.Service.SellerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Seller")
public class SellerController {

	@Autowired
	SellerService sellerService;
	
	@PostMapping("/saveSeller")
	public ResponseEntity<Seller> saveSeller(@RequestBody @Valid SellerRequest sellerRequest){
		return new ResponseEntity<>(sellerService.saveSeller(sellerRequest),HttpStatus.CREATED);
	}
	
	@GetMapping("/findSeller")
	public ResponseEntity<List<Seller>> fetchSellers(){
		return ResponseEntity.ok(sellerService.getAllSellers());
	}

}
