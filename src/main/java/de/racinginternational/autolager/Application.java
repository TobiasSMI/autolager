package de.racinginternational.autolager;

import de.racinginternational.autolager.auto.BMW;
import de.racinginternational.autolager.auto.Ferrari;
import de.racinginternational.autolager.auto.Porsche;
import de.racinginternational.autolager.auto.Volkswagen;
import de.racinginternational.autolager.service.LagerManager;

public class Application {

	public static void main(String[] args) {

		BMW bmwHeinrichs = new BMW();
		BMW bmwIsik = new BMW();
		BMW bmwKurdas = new BMW();

		Ferrari ferrariHeinrichs = new Ferrari();
		Ferrari ferrariIsik = new Ferrari();
		Ferrari ferrariKurdas = new Ferrari();

		Porsche porscheHeinrichs = new Porsche();
		Porsche porscheIsik = new Porsche();
		Porsche porscheKurdas = new Porsche();

		Volkswagen vwHeinrichs = new Volkswagen();
		Volkswagen vwIsik = new Volkswagen();
		Volkswagen vwKurdas = new Volkswagen();
		
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
		
		lagerManager.testFahren();		

	}

}
