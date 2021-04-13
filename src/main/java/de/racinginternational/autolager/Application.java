package de.racinginternational.autolager;

import de.racinginternational.autolager.auto.Auto;
import de.racinginternational.autolager.auto.BMW;
import de.racinginternational.autolager.auto.Ferrari;
import de.racinginternational.autolager.auto.Porsche;
import de.racinginternational.autolager.auto.Volkswagen;
import de.racinginternational.autolager.service.LagerManager;

public class Application {

	public static void main(String[] args) {

		Auto bmwHeinrichs = new BMW();
		Auto bmwIsik = new BMW();
		Auto bmwKurdas = new BMW();

		Auto ferrariHeinrichs = new Ferrari();
		Auto ferrariIsik = new Ferrari();
		Auto ferrariKurdas = new Ferrari();

		Auto porscheHeinrichs = new Porsche();
		Auto porscheIsik = new Porsche();
		Auto porscheKurdas = new Porsche();

		Auto vwHeinrichs = new Volkswagen();
		Auto vwIsik = new Volkswagen();
		Auto vwKurdas = new Volkswagen();
		
		LagerManager lagerManager = new LagerManager();
		
		// BMW
		lagerManager.add(bmwHeinrichs);
		lagerManager.add(bmwIsik);
		lagerManager.add(bmwKurdas);
		// Ferrari
		lagerManager.add(ferrariHeinrichs);
		lagerManager.add(ferrariIsik);
		lagerManager.add(ferrariKurdas);
		// Porsche
		lagerManager.add(porscheHeinrichs);
		lagerManager.add(porscheIsik);
		lagerManager.add(porscheKurdas);		
		// Volkswagen
		lagerManager.add(vwHeinrichs);
		lagerManager.add(vwIsik);
		lagerManager.add(vwKurdas);		
		
		System.out.println();
		
		System.out.println("*******");
		lagerManager.testFahren();		

	}

}
