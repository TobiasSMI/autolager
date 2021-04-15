package de.racinginternational.autolager.auto;

import de.racinginternational.autolager.exception.ColorException;
import de.racinginternational.autolager.exception.PreisException;
import de.racinginternational.autolager.util.AutoType;
import de.racinginternational.autolager.util.Color;

public abstract class Auto {
	private int preis = 0;
	
	private  Color[] validColors;
	
	private AutoType typ; //TODO Autotype und AutoColor ins AUto package
	
	private Color color;

	public Auto(int preis, Color color, AutoType typ, Color[] validColors) throws Exception {		
		// TODO in Methode auslagern
		if (!(preis < 0 || preis > 1_000_000)) {
			this.preis = preis;
		} else {
			throw new PreisException(String.valueOf(preis)); //TODO näher ausführen
		}
		
		this.validColors = validColors; 
				
		// TODO in Methode auslagern
		for (Color entry : validColors) { // ValidColors = {}  color = blau
			if (entry == color) {	// nimm den gültigen Farbwert | 			
				this.color = color;
			}  
		}
		
		if (this.color == null) {
			throw new ColorException(validColors, color);
		}
		
		this.typ = typ;	
	}	
	
	public int getPreis() {
		return preis;
	}
	
	public void setPreis(int preis) {
		this.preis = preis;
	}
	
	public Color getColor() {
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
