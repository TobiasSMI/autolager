package de.racinginternational.autolager.service;

import java.util.ArrayList;

import de.racinginternational.autolager.auto.Auto;
import de.racinginternational.autolager.auto.BMW;
import de.racinginternational.autolager.auto.Ferrari;
import de.racinginternational.autolager.auto.Porsche;
import de.racinginternational.autolager.auto.Volkswagen;

public class LagerManager {

	ArrayList<Auto> autoListe = new ArrayList<Auto>();	

	public void add(Auto auto) {		
		
	}
	
	public void testFahren() {
		for (Auto auto : autoListe) {
			auto.fahren();
		}
		
	}
	
}
