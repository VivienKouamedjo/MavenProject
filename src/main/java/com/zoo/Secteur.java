package com.zoo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Secteur {
	String typeAnimauxDansSecteur;
	List<Animal> animauxDansSecteur = new ArrayList<Animal>();
	
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

	Comparator<Secteur> SectComparator = new Comparator<Secteur>() {
		
		public int compare(Secteur o1, Secteur o2) {
			// TODO Auto-generated method stub
			return o1.getNombreAnimaux() - o2.getNombreAnimaux();
		}
	};
	
	

	
	
	
	
}
