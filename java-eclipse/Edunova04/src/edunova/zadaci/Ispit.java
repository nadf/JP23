package edunova.zadaci;

import javax.swing.JOptionPane;

public class Ispit {
	//unesi 2 cijela broja i ispisi njihov zbroj
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		
		System.out.println(a+b);
	}
}
