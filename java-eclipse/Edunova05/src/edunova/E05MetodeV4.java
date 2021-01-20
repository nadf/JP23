package edunova;

public class E05MetodeV4 {
	
	/**
	 *4. vrsta metode
	 * ne prima parametre - u zagradama je prazno
	 * vraća vrijednost onog tipa s kojim je definirana
	 * naziv je slucajniBroj
	 * @return slucajni broj izmedu 0 i 99
	 */
	
	public static int slucajniBroj() {
		return (int) (Math.random()*100);
	}

}
