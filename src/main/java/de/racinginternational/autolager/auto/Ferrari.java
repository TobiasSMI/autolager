package de.racinginternational.autolager.auto;

public class Ferrari extends Auto {	

	private static final AutoColor[] COLOR_ARRAY = new AutoColor[] {AutoColor.RED};

	
	public Ferrari(int preis, AutoColor color, AutoType typ) throws Exception {		
		super(preis, color, typ, COLOR_ARRAY);
	}
}
