package de.racinginternational.autolager.service;

import java.util.ArrayList;

import de.racinginternational.autolager.auto.Auto;

public class LagerManager {
	private static int autoLagerNummer; //TODO static macht keinen Sinn
	ArrayList<Auto> autoListe = new ArrayList<Auto>();	

	public void add(Auto auto) {		
		autoListe.add(auto);
		LagerManager.increaseAutoLagerNummer();
	}
	
	public void remove (Auto auto) {
		
		autoListe.remove(autoLagerNummer-1);
		LagerManager.decreaseAutoLagerNummer();
		// prüfe ob autolagernummer mit index in autoListe übereinstimmt				
//		if (autoListe.get(autoLagerNummer-1).equals(autoListe.get(autoListe.indexOf(auto)))) {
//			
//			
//			System.out.println("Auto entfernt");
//		} else {
//			System.out.println("Auto nicht gefunden");
//		}
	}
	
	public void testFahren() {
		for (Auto auto : autoListe) {
			auto.fahren();
		}		
	}

	public int getAutoLagerNummer() {
		return autoLagerNummer;
	}
	
	// TODO public static macht hier keinen SInn
	public static void increaseAutoLagerNummer() {
		autoLagerNummer++;
	}
	
	public static void decreaseAutoLagerNummer() {
		autoLagerNummer--;
	}
	
}
