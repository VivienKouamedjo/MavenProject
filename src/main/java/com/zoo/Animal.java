package com.zoo;

public class Animal {
	private String nomAnimal;
	private String typeAnimal;
	
	public Animal(String na, String ta) {
		this.nomAnimal = na;
		this.typeAnimal = ta;
	}
	
	public String getNomAnimal() {
		return nomAnimal;
	}

	public String getTypeAnimal() {
		return typeAnimal;
	}
	
}
