package de.racinginternational.autolager.service;

import java.util.ArrayList;

import de.racinginternational.autolager.auto.Auto;

public class LagerManager {
	private static int autoLagerNummer;
	ArrayList<Auto> autoListe = new ArrayList<Auto>();	

	public void add(Auto auto) {		
		autoListe.add(auto);
		LagerManager.increaseAutoLagerNummer();
	}
	
	public void remove (Auto auto) {
		autoListe.remove(autoLagerNummer-1);
		LagerManager.decreaseAutoLagerNummer();
	}
	
	public void testFahren() {
		for (Auto auto : autoListe) {
			auto.fahren();
		}		
	}

	public int getAutoLagerNummer() {
		return autoLagerNummer;
	}

	public static void increaseAutoLagerNummer() {
		autoLagerNummer++;
	}
	
	public static void decreaseAutoLagerNummer() {
		autoLagerNummer--;
	}
	
}
