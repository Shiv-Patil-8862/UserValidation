package com.Techno.UserValidation.Advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Techno.UserValidation.Exception.SellerNotFoundException;

@RestControllerAdvice
public class SellerApplicationExceptionHandler {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleSellerException(MethodArgumentNotValidException ex){
		Map<String, String> errormap=new HashMap<>();
		ex.getBindingResult().getFieldErrors().forEach(error -> {
			errormap.put(error.getField(), error.getDefaultMessage());
		});
		return errormap;
	}
	
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(SellerNotFoundException.class)
	public Map<String, String> handleSellerNotFoundException(SellerNotFoundException ex){
		Map<String, String> errormap=new HashMap<>();
		errormap.put("Errormessage", ex.getMessage());
		return errormap;
	}
}
