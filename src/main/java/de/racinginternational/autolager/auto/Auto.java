package de.racinginternational.autolager.auto;

import de.racinginternational.autolager.exception.ColorException;
import de.racinginternational.autolager.exception.PreisException;

public abstract class Auto {
	
	private int preis = 0;	
	
	private AutoType typ; //TODO Autotype und AutoColor ins AUto package	
	private AutoColor color;
	private AutoColor[] validColors;	

	public Auto(int preis, AutoColor color, AutoType typ, AutoColor[] validColors) throws Exception {		
		// TODO in Methode auslagern
		if (!(preis < 0 || preis > 1_000_000)) {
			this.preis = preis;
		} else {
			throw new PreisException(String.valueOf(preis)); //TODO näher ausführen
		}
		
		this.setValidColors(validColors); 
				
		// TODO in Methode auslagern
		for (AutoColor entry : validColors) { // ValidColors = {}  color = blau
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
	
	public AutoColor getColor() {
		return color;
	}
	
	public void setColor(AutoColor color) {
		this.color = color;
	}
	
	public AutoType getTyp() {
		return typ;
	}
	
	public void setTyp(AutoType typ) {
		this.typ = typ;
	}	
	
	public AutoColor[] getValidColors() {
		return validColors;
	}

	public void setValidColors(AutoColor[] validColors) {
		this.validColors = validColors;
	}

	public void fahren() {
		System.out.println("Fahre Auto ...");
	}	

}
