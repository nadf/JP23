package edunova;

import javax.swing.JOptionPane;


public class E03MetodeV2 {
	
	/**
	 * 2. vrsta metoda
	 * prima parametre - u zagradama odvojene zarezom prvo tip podatka pa naziv 
	 * ne vraća vrijednost - void
	 * naziv je ispisi
	 * @param x prvi broj
	 * @param y drugi broj
	 */
	
	public static void ispisi(int x,int y) {
		
		System.out.println(x + " i " + y);
	}
	
	// method overloading
	public static void ispisi(char c) {
		System.out.println(c);
	}
	
	//public static void ispisi(char x) {
	//	System.out.println(x);
	// }
	//ne moze jer vec postoji potpis char
	
	public static void ispisi(char c, int i) {
		System.out.println(c);
	}
	
	public static void ispisi(int i,char c) {
		System.out.println(c);
	}
	
}
