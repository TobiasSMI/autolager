package de.racinginternational.autolager.util;

public class ArrayUtil {
	
	public static String toString(Object[] array) {		
		String output = "{";
		
		for (Object obj : array) {
			output += obj.toString() + ", ";			
		}	
		
		output = output.trim();
		output = output.substring(0, output.length() - 1); // offset
		output += "}";
				
		return output;		
	}
}
