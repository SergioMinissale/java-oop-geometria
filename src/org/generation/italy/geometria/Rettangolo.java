package org.generation.italy.geometria;

public class Rettangolo {
	
	// Attributi
	int altezza;
	int base;
	
	// Costruttori
	Rettangolo(int altezza, int base) {
		this.altezza = altezza;
		this.base = base;
	}
	
	// Metodo perimetro
	int calcolaPerimetro() {
		int calcolaPerimetro = (base + altezza) * 2;
		return calcolaPerimetro;
	}
	//metodo area
	int calcolaArea() {
		int calcolaArea = base * altezza;
		return calcolaArea;
	}
	//metodo void
	void printRettangolo() {
		System.out.println("Altezza: " + this.altezza + "\nBase: " + this.base);
	} 

}
