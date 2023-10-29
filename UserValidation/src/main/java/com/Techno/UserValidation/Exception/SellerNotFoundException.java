package com.Techno.UserValidation.Exception;

public class SellerNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public SellerNotFoundException() {
		super();
	}

	public SellerNotFoundException(String message, Throwable cause, boolean enableSuppression,boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SellerNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public SellerNotFoundException(String message) {
		super(message);
	}

	public SellerNotFoundException(Throwable cause) {
		super(cause);
	}
}
