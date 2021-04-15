package de.racinginternational.autolager;

import de.racinginternational.autolager.auto.Auto;
import de.racinginternational.autolager.auto.BMW;
import de.racinginternational.autolager.auto.Ferrari;
import de.racinginternational.autolager.auto.Porsche;
import de.racinginternational.autolager.auto.Volkswagen;
import de.racinginternational.autolager.service.LagerManager;
import de.racinginternational.autolager.util.AutoType;
import de.racinginternational.autolager.util.Color;

public class Application {

	public static void main(String[] args) throws Exception {
		Application run = new Application();		
		System.out.println("Programm Start");
		
		try {
			run.mainApplication();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Programm beendet");
		}
		
	}
	public void mainApplication() throws Exception {
//		Auto bmwHeinrichs = new BMW(30_000, Color.GREEN, AutoType.KOMBI);
//		Auto ferrariHeinrichs = new Ferrari(600_000, Color.BLACK, AutoType.CABRIO);
//		Auto porscheHeinrichs = new Porsche(100_000, Color.SILVER, AutoType.SUV);
//		Auto vwHeinrichs = new Volkswagen(20_000, Color.SILVER, AutoType.KOMPAKTWAGEN);
//		
//		Auto bmwKurdas = new BMW(40_000, Color.GREEN, AutoType.KOMBI);
//		Auto ferrariKurdas = new Ferrari(500_000, Color.BLACK, AutoType.CABRIO);
//		Auto porscheKurdas = new Porsche(50_000, Color.SILVER, AutoType.SUV);
//		Auto vwKurdas = new Volkswagen(20_000, Color.SILVER, AutoType.KOMPAKTWAGEN);
//
//		Auto bmwIsik = new BMW(100_000, Color.GREEN, AutoType.KOMBI);
//		Auto ferrariIsik = new Ferrari(700_000, Color.BLACK, AutoType.CABRIO);
//		Auto porscheIsik = new Porsche(90_000, Color.SILVER, AutoType.SUV);
//		Auto vwIsik = new Volkswagen(20_000, Color.SILVER, AutoType.KOMPAKTWAGEN);
//		
		BMW bmwSmialkowski = new BMW(10_000, Color.SILVER, AutoType.CABRIO);
//		
		BMW bmwTimo = new BMW(20_000, Color.YELLOW, AutoType.CABRIO);
		LagerManager lagerManager = new LagerManager();						
//		
//		lagerManager.add(bmwHeinrichs);
//		lagerManager.add(ferrariHeinrichs);
//		lagerManager.add(porscheHeinrichs);
//		lagerManager.add(vwHeinrichs);
//		lagerManager.add(bmwKurdas);
//		lagerManager.add(ferrariKurdas);
//		lagerManager.add(porscheKurdas);
//		lagerManager.add(vwKurdas);
//		lagerManager.add(bmwIsik);
//		lagerManager.add(ferrariIsik);
//		lagerManager.add(porscheIsik);
//		lagerManager.add(vwIsik);
		lagerManager.add(bmwSmialkowski);
		
		System.out.println(bmwSmialkowski.getColor());
		lagerManager.testFahren();	
		
		// Wie viele Autos sind im Lager?
//		System.out.println("Es sind " + lagerManager.getAutoLagerNummer() + " Autos im Lager.");
//		
//		// Entferne Ferrari Kurdas
//		lagerManager.remove(ferrariKurdas);		
//		
//		// Wie viele Autos sind im Lager?
//		System.out.println("Es sind " + lagerManager.getAutoLagerNummer() + " Autos im Lager.");			
	}

}
