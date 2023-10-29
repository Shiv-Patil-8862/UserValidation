package com.Techno.UserValidation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class Seller {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public static Seller build(long i, String name, String category) {
		
	   Seller seller=new Seller();
	   seller.id=i;
	   seller.name=name;
	   seller.category=category;
	   
	   return seller;
	}

}


