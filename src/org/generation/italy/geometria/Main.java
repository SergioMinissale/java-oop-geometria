package org.generation.italy.geometria;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int altezza = 0;
		int base = 0;
		
		while (altezza <= 0) {
			System.out.print("Altezza: ");
			altezza = scanner.nextInt();
			
			if (altezza <= 0)
				System.out.println("Valore non valido, inserire una altezza che sia > 0");
		}
		while (base <= 0) {
			System.out.print("Base: ");
			base = scanner.nextInt();
			
			if (base <= 0)
				System.out.println("Valore non valido, inserire una base che sia > 0");
		}

		Rettangolo r1 = new Rettangolo(altezza, base);
		r1.printRettangolo();

	
		scanner.close();
	}
}

