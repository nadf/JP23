package edunova.zadaci;

public class Zadatak2 {
	
	// Ispisati sve parne brojeve od 10 do 50
	// koristeći do while

	public static void main(String[] args) {
		
		int i=10;
		System.out.println("Parni brojevi su: ");
		do {
		    i++;
		    if(i % 2==0) 
		        System.out.println(i);
		} while (i <= 50);
	}
}