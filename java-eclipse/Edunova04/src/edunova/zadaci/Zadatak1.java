package edunova.zadaci;

import java.util.Scanner;

public class Zadatak1 {
	
		// Program unosi brojeve sve dok ne dođe broj -1
		//Program ispisuje sumu svih unesenih brojeva
	
	public static void main(String[] args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unos brojeva");
		
		int suma;
		int i = 0;
		suma = 0;
		
		while (i != -1) {
			i = ulaz.nextInt();
			if(i != -1) {
				suma += i;
			}
		}
		System.out.println(suma);
	}
}
