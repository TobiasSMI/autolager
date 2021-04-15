package de.racinginternational.autolager.auto;

import de.racinginternational.autolager.exception.ColorException;
import de.racinginternational.autolager.exception.PreisException;

public abstract class Auto {
	
	private int preis = 0;	
	
	private AutoType typ; //TODO Autotype und AutoColor ins AUto package	
	private AutoColor color;
	private AutoColor[] validColors;	

	public Auto(int preis, AutoColor color, AutoType typ, AutoColor[] validColors) throws Exception {	
		validatePrice(preis);		
		validateColor(color, validColors);
		
		this.preis = preis;
		this.color = color;			
		this.typ = typ;	
		this.validColors = validColors;
	}	
	
	private void validatePrice(int preis) throws PreisException {
		if (preis < 0 || preis > 1_000_000) {
			throw new PreisException(String.valueOf(preis));
		}			
	}
	
	private void validateColor(AutoColor color, AutoColor[] validColors) throws ColorException {
		boolean farbeGefunden = false;
		
		for (AutoColor entry : validColors) { 
			if (entry == color) {
				farbeGefunden = true;
			}  
		}
		
		if (!farbeGefunden) {
			throw new ColorException(validColors, color);
		}
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
