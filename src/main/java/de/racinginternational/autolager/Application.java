package de.racinginternational.autolager;

import de.racinginternational.autolager.auto.AutoColor;
import de.racinginternational.autolager.auto.AutoType;
import de.racinginternational.autolager.auto.BMW;
import de.racinginternational.autolager.service.LagerManager;

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

		BMW bmwSmialkowski = new BMW(10_000, AutoColor.SILVER, AutoType.CABRIO);
		BMW bmwTimo = new BMW(20_000, AutoColor.YELLOW, AutoType.CABRIO);
		LagerManager lagerManager = new LagerManager();		
		
		lagerManager.add(bmwSmialkowski);		
		System.out.println(bmwSmialkowski.getColor());
		lagerManager.testFahren();			
	}
}
