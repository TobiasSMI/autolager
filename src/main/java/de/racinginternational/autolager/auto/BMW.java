package de.racinginternational.autolager.auto;

public class BMW extends Auto {
	
	private static final AutoColor[] COLOR_ARRAY = new AutoColor[] {AutoColor.BLACK, AutoColor.SILVER}; 

	public BMW(int preis, AutoColor color, AutoType typ) throws Exception  {		
		super(preis, color, typ, COLOR_ARRAY);
	}

}
