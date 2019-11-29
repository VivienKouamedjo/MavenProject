package com.zoo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SecteurTest {

	@Test
	public void testCompare() {
		Secteur s1 = new Secteur("Chien");
		Secteur s2 = new Secteur("Chat");
		Chien c1 = new Chien("Louis", "Chien");
		Chien c2= new Chien("Jean", "Chien");
		Chat ha = new Chat("Lo", "Chat");
		s1.animauxDansSecteur.add(c1);
		s1.animauxDansSecteur.add(c2);
		s2.animauxDansSecteur.add(ha);
		int arg = s1.SectComparator.compare(s1, s2);
		if(arg>0) {
			System.out.println("Secteur chien plus grand");
		}
		else {
			fail("Failed comparaison");
		}	
	}

}
