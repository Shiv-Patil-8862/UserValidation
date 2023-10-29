package com.Techno.UserValidation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Techno.UserValidation.DTO.UserRequest;
import com.Techno.UserValidation.Entity.User;
import com.Techno.UserValidation.Exception.UserNotFoundException;
import com.Techno.UserValidation.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	public UserRepository userRepository;

	
	public User saveUser(UserRequest userRequest) {
        User user = User.
        		 build(101,
                		 userRequest.getName(), 
                         userRequest.getGender(), 
                         userRequest.getEmail(), 
                         userRequest.getNationality(), 
                         userRequest.getContact(),
                         userRequest.getAge());
       
        
        return userRepository.save(user);
    }
	
	


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    public User getUser(int id) throws UserNotFoundException {
        User user= userRepository.findByid(id);
        if(user!=null){
            return user;
        }else{
            throw new UserNotFoundException("User not found with id : "+id);
        }
    }
}
