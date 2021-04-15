package de.racinginternational.autolager.exception;

import de.racinginternational.autolager.util.Color;

public class ColorException extends Exception {		
	public ColorException(Color[] validColors, Color checkedColor) {
		super(checkedColor + " ist nicht in " + validColors + " enthalten.");
		
	}
}
