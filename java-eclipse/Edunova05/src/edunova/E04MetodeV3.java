package edunova;


public class E04MetodeV3 {
	
	/**
	 * 3. vrsta metode
	 * prima parametre - u zagradama odvojene zarezom prvo tip podatka pa naziv 
	 * vraća vrijednost onog tipa s kojim je definirana
	 * naziv je zbroji
	 * @param a prvi broj
	 * @param b drugi broj
	 * @return
	 */
	
	public static int zbroji(int a, int b) {
		int rez= a+b;
		return 0;
	}
	
	// ovo je češći slučaj
	public static long zbroji(long a, long b) {
		return a+b;
	}
	
	// ne moze
	//public static char zbroji(int a, int b) {
	//	return 0;
	//}
	
	//public static int char(int b) {
	//return "x";
	//}

}
