package com.zoo;

public class AnimalDansMauvaisSecteurException extends Exception {
	
String message;
	
	public AnimalDansMauvaisSecteurException(String m) {
		this.message = m;
	}

}
