package de.racinginternational.autolager.auto;

public class Volkswagen extends Auto {

	private static AutoColor[] colorArray = new AutoColor[] {AutoColor.GREEN, AutoColor.YELLOW};
	
	public Volkswagen(int preis, AutoColor color, AutoType typ) throws Exception {		
		super(preis, color, typ, colorArray);
	}

}
