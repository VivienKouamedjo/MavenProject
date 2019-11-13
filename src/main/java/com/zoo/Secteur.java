package com.zoo;

import java.util.List;

public class Secteur{
	String typeAnimauxDansSecteur;
	List<Animal> animauxDansSecteur;
	
	public Secteur(String TypAn) {
		this.typeAnimauxDansSecteur = TypAn;
	}
	
	public void ajouterAnimal(Animal a) {
		animauxDansSecteur.add(a);
	}
	
	public int getNombreAnimaux() {
		return (animauxDansSecteur.size()-1);
	}
	
	public String obtenirType() {
		return typeAnimauxDansSecteur;
	}
	
	
}
