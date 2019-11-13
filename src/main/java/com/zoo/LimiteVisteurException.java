package com.zoo;

public class LimiteVisteurException extends Exception {
	String message;
	
	public LimiteVisteurException(String m) {
		this.message = m;
	}
}
