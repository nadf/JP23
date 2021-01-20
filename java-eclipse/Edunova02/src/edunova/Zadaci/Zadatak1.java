package edunova.Zadaci;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	public static void main(String[] args) {
		//korisnik unosi 3 cijela broja 
		//program ispisuje najveci
		
		String a= JOptionPane.showInputDialog("Unesi broj");
		String b= JOptionPane.showInputDialog("Unesi broj");
		String c= JOptionPane.showInputDialog("Unesi broj");
		
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		int k = Integer.parseInt(c);
		
		if(i>=j & i>=k) {
			System.out.println(i);
		}
		if(j>=i & j>=k) {
			System.out.println(j);
		}
		if(k>=j & k>=i) {
			System.out.println(k);
		}
	}
		
}
