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
	
	
	
	
	
	
	// Metodi
	int calcolaArea() {
		int calcolaArea = base * altezza;
		return calcolaArea;
	}
	
	int calcolaPerimetro() {
		int calcolaPerimetro = (base + altezza) * 2;
		return calcolaPerimetro;
	}

}
