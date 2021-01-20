package edunova.Zadaci;

import javax.swing.JOptionPane;

public class Zadatak3 {
	
	// korisnik unosi 2 broja.
	// ukoliko je produkt ta dva broja paran broj
	// ispisuje razliku unesenih brojeva
	// inače ispisuje cijeli dio kvocjenta prvog i drugog broja
	
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog ("Unesi broj");
		String b = JOptionPane.showInputDialog ("Unesi broj");
		
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		
		if((i*j)%2==0) {
			System.out.println(i-j);
		}else {
			System.out.println((int)(i/j));
		}
	}

}
