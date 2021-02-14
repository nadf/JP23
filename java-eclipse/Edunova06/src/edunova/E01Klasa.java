package edunova;

// Klasa je opisnik objekta

public class E01Klasa {
	
	// OOP princip Učahurivanje / Encapsulation
	// klasa skriva svoja svojstva
	// svojstvo klase - varijabla na razini klase
	private int visina;
	
	// skriveno svojstvo klasa čini dostupnim putem javnih get/set metoda

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		// this je kljucna riječ kojom se obraćamo razini klase, ne metode
		this.visina = visina;
	}
	
}
