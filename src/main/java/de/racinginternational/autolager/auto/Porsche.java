package de.racinginternational.autolager.auto;

public class Porsche {

	private int preis = 50000;
	private String color = "schwarz";	
	private String typ = "SUV";	

	public Porsche() {}

	public Porsche(int preis, String color, String typ) {		
		this.preis = preis;
		this.color = color;
		this.typ = typ;
	}

	public int getPreis() {
		return preis;
	}
	
	public void setPreis(int preis) {
		this.preis = preis;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getTyp() {
		return typ;
	}
	
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	public void fahren() {
		System.out.println("fahre schnell");
	}

}

