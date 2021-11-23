package org.generation.italy.geometria;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int altezza;
		System.out.print("Altezza: ");
		altezza = scanner.nextInt();
		
		int base;
		System.out.print("Base: ");
		base = scanner.nextInt();
		
		Rettangolo r1 = new Rettangolo(altezza, base);
		r1.printRettangolo();
		
		scanner.close();
	}

}
