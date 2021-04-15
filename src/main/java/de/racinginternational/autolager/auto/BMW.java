package de.racinginternational.autolager.auto;

import de.racinginternational.autolager.util.AutoType;
import de.racinginternational.autolager.util.Color;

public class BMW extends Auto {
	private static Color[] colorArray = new Color[] {Color.BLACK, Color.SILVER}; 

	public BMW(int preis, Color color, AutoType typ) throws Exception  {		
		super(preis, color, typ, colorArray);
	}

}
