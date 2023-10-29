package com.Techno.UserValidation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Techno.UserValidation.Entity.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
