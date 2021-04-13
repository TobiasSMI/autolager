package de.racinginternational.autolager.service;

import java.util.ArrayList;

import de.racinginternational.autolager.auto.Auto;
import de.racinginternational.autolager.auto.BMW;
import de.racinginternational.autolager.auto.Ferrari;
import de.racinginternational.autolager.auto.Porsche;
import de.racinginternational.autolager.auto.Volkswagen;

public class LagerManager {

	private ArrayList<BMW> bmwListe = new ArrayList<BMW>();
	private ArrayList<Ferrari> ferrariListe = new ArrayList<Ferrari>();
	private ArrayList<Porsche> porscheListe = new ArrayList<Porsche>();	
	private ArrayList<Volkswagen> volkswagenListe = new ArrayList<Volkswagen>();	

	public void add(BMW auto) {
		bmwListe.add(auto);
	}	
	
	public void add(Ferrari ferrari) {
		ferrariListe.add(ferrari);
	}	
	
	public void add(Porsche porsche) {		
		porscheListe.add(porsche);
	}
	
	public void add(Volkswagen volkswagen) {		
		volkswagenListe.add(volkswagen);
	}

	public void testFahren() {
		for (BMW bmw : bmwListe) {
			bmw.fahren();
		}

		for (Ferrari ferrari : ferrariListe) {
			ferrari.fahren();
		}

		for (Porsche porsche : porscheListe) {
			porsche.fahren();
		}

		for (Volkswagen volkswagen : volkswagenListe) {
			volkswagen.fahren();
		}
		
	}
	
}
