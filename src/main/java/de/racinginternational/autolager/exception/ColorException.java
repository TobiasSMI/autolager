package de.racinginternational.autolager.exception;

import de.racinginternational.autolager.auto.AutoColor;
import de.racinginternational.autolager.util.ArrayUtil;

public class ColorException extends Exception {	
	
	public ColorException(AutoColor[] validColors, AutoColor checkedColor) {
		super(checkedColor + " ist keine gültige Farbe. Gültige Farben wären: " + ArrayUtil.toString(validColors));
		
	}
}
