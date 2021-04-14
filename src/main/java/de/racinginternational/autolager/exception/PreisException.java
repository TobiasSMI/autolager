package de.racinginternational.autolager.exception;

public class PreisException extends Exception{
	
	public PreisException(String fehlermeldung) {
		super("Preis von " + fehlermeldung + " ist nicht plausibel.");
	}	
}
