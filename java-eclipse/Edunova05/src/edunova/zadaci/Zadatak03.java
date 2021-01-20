package edunova.zadaci;

import java.util.Scanner;

public class Zadatak03 {
	
	// kreirajte metodu naziva ucitajBroj tipa int
	// koja od korisnika beskonačno traži
	// unos sve dok korisnik ne unese broj veći od 0
	// kada se to dogodi metoda tako unesenu vrijednost
	// vrati onome koji ju je pozvao
	
	public static void main(String[] args) {
		System.out.println(ucitajBroj());
	}
		
	
	public static int ucitajBroj() {
		
		Scanner in = new Scanner(System.in);
		
		int x =0;
		
		for(;;) {
			System.out.println("Unesi broj: ");
			x = in.nextInt();
			if(x > 0) break;
		}
		
		return x;
	}
}