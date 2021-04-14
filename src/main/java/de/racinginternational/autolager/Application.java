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
			// TODO: handle exception
		} finally {
			System.out.println("Programm beendet");
		}
		
	}
	public void mainApplication() throws Exception {
		Auto bmwHeinrichs = new BMW(30_000, Color.GREEN, AutoType.KOMBI);
		Auto ferrariKurdas = new Ferrari(500_000, Color.BLACK, AutoType.CABRIO);
		Auto porscheKurdas = new Porsche(50_000, Color.SILVER, AutoType.SUV);
		Auto vwKurdas = new Volkswagen(20_000, Color.SILVER, AutoType.KOMPAKTWAGEN);
		
		LagerManager lagerManager = new LagerManager();						
		
		lagerManager.add(bmwHeinrichs);
		lagerManager.add(ferrariKurdas);
		lagerManager.add(porscheKurdas);
		lagerManager.add(vwKurdas); 		
		
		lagerManager.testFahren();	
		
		// Wie viele Autos sind im Lager?
		System.out.println(lagerManager.getAutoLagerNummer());
		
		// Entferne Ferrari Kurdas
		lagerManager.remove(ferrariKurdas);
		
		// Wie viele Autos sind im Lager?
		System.out.println(lagerManager.getAutoLagerNummer());			
	}

}
