package de.racinginternational.autolager.auto;

public class Porsche extends Auto {		

	private static AutoColor[] colorArray = new AutoColor[] {AutoColor.BLACK, AutoColor.SILVER, AutoColor.BLUE};
	
	public Porsche(int preis, AutoColor color, AutoType typ) throws Exception {		
		super(preis, color, typ, colorArray);
	}	
	
}

