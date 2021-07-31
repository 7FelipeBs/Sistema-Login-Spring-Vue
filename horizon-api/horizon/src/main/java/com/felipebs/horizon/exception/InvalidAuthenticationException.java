package com.felipebs.horizon.exception;

import org.springframework.security.core.AuthenticationException;

public class InvalidAuthenticationException extends AuthenticationException{

	private static final long serialVersionUID = 20210730L;
	
	public InvalidAuthenticationException(String exception) {
		super(exception);
	}

}
