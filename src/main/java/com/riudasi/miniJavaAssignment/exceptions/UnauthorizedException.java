package com.riudasi.miniJavaAssignment.exceptions;

public class UnauthorizedException extends RuntimeException {
	
	public UnauthorizedException(String string) {
		super(string);
	}

	private static final long serialVersionUID = 1L;
}
