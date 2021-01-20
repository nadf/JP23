package edunova.zadaci;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Zadatak02 {
	
	// program unosi 2 broja od korisnika
	// program ispisuje razliku kao rezultat izvođenja
	// metode koja prima dva parametra i tipa je float
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi 2 broja;");
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		
		System.out.println(razlika(a,b));
	}
	public static float razlika(float a, float b) {
		
		return a - b;
	}	

}
