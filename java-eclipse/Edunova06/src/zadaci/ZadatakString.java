package zadaci;

import javax.swing.JOptionPane;

public class ZadatakString {
	
public static void main(String[] args) {
	
	// Korisnik unosi 5 naziva gradova u niz String-ova
	// ipišite sve nazive gradove jedne ispid drugog u nazad

	// primjer Osijek -> kejisO
		
		String gradovi[] = new String[5];
		
		for(int i = 0; i<gradovi.length;i++) {
			gradovi[i]= JOptionPane.showInputDialog("Grad "+ i);
		}
		
		for(String grad:gradovi) {
			System.out.println();
			System.out.println(grad);
			for(int i =grad.length()-1; i>=0;i--) {
				System.out.print(grad.charAt(i));
		}
			System.out.println();
		
		}
	}
}
