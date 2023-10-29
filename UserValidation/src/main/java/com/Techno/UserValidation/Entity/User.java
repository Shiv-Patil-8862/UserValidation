package com.Techno.UserValidation.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;



@Entity
@AllArgsConstructor(staticName = "build")
public class User {

	@Id
	private int id;
	private String name;
	private String contact;
	private String email;
	private int age;
	private String gender;
	private String nationality;
	
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    
    public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
    public void setEmail(String email) {
		this.email = email;
	}
    public int getAge() {
		return age;
	}
    public void setAge(int age) {
		this.age = age;
	}
    public String getGender() {
		return gender;
	}
    public void setGender(String gender) {
		this.gender = gender;
	}
    public String getNationality() {
		return nationality;
	}
    public void setNationality(String nationality) {
		this.nationality = nationality;
	}
    
    
    
    
    
    
    
    public static User build(
            int id, String name, String gender, String email, String nationality, String contact, int age) {
        User user = new User();
        user.id = id;
        user.name = name;
        user.gender = gender;
        user.email = email;
        user.nationality = nationality;
        user.contact = contact;
        user.age = age;
        return user;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
