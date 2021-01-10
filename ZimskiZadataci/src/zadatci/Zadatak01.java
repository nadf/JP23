package zadatci;

import java.util.Scanner;

public class Zadatak01 {
	
	public static void main(String[] args) {
		// Kreirati program koji unosi 24 broja, ispisuje njihov zbroj, najmanji i
		// najveći uneseni broj
		
		java.util.Scanner ulaz = new java.util.Scanner(System.in);

		System.out.println("Unesi 24 broja: ");

		int x[] = new int[24];

		int zbroj = 0;

		for (int i = 0; i < x.length; i++) {
			x[i] = ulaz.nextInt();
			zbroj += x[i];
		}

		int max = x[0], min = x[0];

		for (int i = 0; i < x.length; i++) {
			if (max < x[i]) {
				max = x[i];
			}
			if (min > x[i]) {
				min = x[i];
			}
		}

		System.out.printf("Zbroj je %d\nNajveci je %d\nNajmanji je %d\n", zbroj, max, min);

	}

}
