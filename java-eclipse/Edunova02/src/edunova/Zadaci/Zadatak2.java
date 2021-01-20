package edunova.Zadaci;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	public static void main(String[] args) {
		
		// Korisnik unosi cijeli broj
		// Ako je paran broj unesen ispiši Osijek
		// Ako je neparan broj unesen ispiši Zagreb
		
		String a = JOptionPane.showInputDialog ("Unesi broj");
		
		int a1 = Integer.parseInt(a);
		
		System.out.println(a1%2==0 ? "Osijek" : "Zagreb");
	}

}
