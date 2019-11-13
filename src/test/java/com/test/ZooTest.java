package com.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.zoo.Chien;
import com.zoo.Secteur;
import com.zoo.Zoo;

public class ZooTest {

	@Test
	public void test() {
		Secteur s1 = new Secteur("Chat");
		Secteur s2 = new Secteur("Chien");
		
		List<Secteur> AnList = new ArrayList<Secteur>();
		AnList.add(s1);
		AnList.add(s2);
		
		Chien chien  = new Chien("dagobert", "Chien");
		
		try {
			Zoo z1 = new Zoo(40,AnList);
			z1.nouvelAnimal(chien);
			z1.nouveauVisteur();
			fail("exception non lancée");
		} catch (Exception e) {
			
		}
		
	}

}
