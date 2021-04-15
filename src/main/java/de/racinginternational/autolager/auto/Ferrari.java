package de.racinginternational.autolager.auto;

public class Ferrari extends Auto {	

	private static AutoColor[] colorArray = new AutoColor[] {AutoColor.RED};

	
	public Ferrari(int preis, AutoColor color, AutoType typ) throws Exception {		
		super(preis, color, typ, colorArray);
	}
}
