package com.Techno.UserValidation.DTO;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;

@AllArgsConstructor(staticName = "build")
public class UserRequest {
 
	@NotNull(message = "Username shouldn't be null")
	private String name;
	@Email(message = "Invalid email Id")
	private String email;
	@Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
	private String contact;
	@NotNull(message =" please enter gender")
	private String gender;
	@Min(18)
    @Max(60)
	private int age;
	@NotNull(message = "Nationality must be enter")
	private String nationality;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	
	
	
	
}
