package com.zoo;

import java.util.List;

public class Zoo {
	int visiteurs;
	List<Secteur> secteurAnimaux;
	
	public Zoo() {
		
	}
	
	public Zoo(int vi, List<Secteur> sectA) {
		this.visiteurs = vi;
		this.secteurAnimaux = sectA;
	}
	
	public void nouveauVisteur() throws LimiteVisteurException {
		visiteurs = visiteurs + 1;
		 if(visiteurs > this.getLimiteVisteur())
			 throw new LimiteVisteurException("Limite visiteur atteinte");
	}
	
	public int getLimiteVisteur() {
		int nbs = secteurAnimaux.size();
		int limVis = nbs*15;
		return limVis;
	}
	
	public void nouvelAnimal(Animal a) throws AnimalDansMauvaisSecteurException {
		for(Secteur s: secteurAnimaux) {
			if(s.typeAnimauxDansSecteur == a.getTypeAnimal()) {
				s.ajouterAnimal(a);
			}
			
			else {
				throw new AnimalDansMauvaisSecteurException("Animal Dans mauvais secteur");
			}
		}
	}
	
	public int nombreAnimaux() {
		int nbA = 0;
		for(Secteur s : secteurAnimaux){
			nbA = nbA + s.getNombreAnimaux();
		}
		return nbA;
	}
	
}
