package com.Techno.UserValidation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Techno.UserValidation.DTO.SellerRequest;
import com.Techno.UserValidation.Entity.Seller;
import com.Techno.UserValidation.Repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	SellerRepository sellerRepository;
	
	public Seller saveSeller(SellerRequest sellerRequest) {
		Seller seller=Seller.
				build(101,sellerRequest.getName(),
						  sellerRequest.getCategory()
					 );
		return sellerRepository.save(seller);
				
	}
	
	public List<Seller> getAllSellers(){
		return sellerRepository.findAll();
	}

}
