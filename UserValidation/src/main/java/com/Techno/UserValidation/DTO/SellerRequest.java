package com.Techno.UserValidation.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;

@AllArgsConstructor(staticName = "build")
public class SellerRequest {

	@NotNull(message="Username shouldn't be null")
	private String name;
	@NotNull(message="Catogory shouldn't be null")
	private String category;
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
	
	
	
}
