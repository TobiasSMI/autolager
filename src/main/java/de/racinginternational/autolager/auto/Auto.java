package de.racinginternational.autolager.auto;

import de.racinginternational.autolager.util.AutoType;
import de.racinginternational.autolager.util.Color;

public abstract class Auto {
	protected int preis = 0;
		
	protected AutoType typ;
	
	protected Color color;

	public Auto(int preis, Color color, AutoType typ) throws Exception {		
		if (!(preis < 0 || preis > 1_000_000)) {
			this.preis = preis;
		} else {
			throw new Exception(); //näher ausführen
		}
		this.color = color;
		this.typ = typ;		
	}	
	
	public int getPreis() {
		return preis;
	}
	
	public void setPreis(int preis) {
		this.preis = preis;
	}
	
	public Enum<Color> getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public AutoType getTyp() {
		return typ;
	}
	
	public void setTyp(AutoType typ) {
		this.typ = typ;
	}
	
	public void fahren() {
		System.out.println("Fahre Auto ...");
	}
}
