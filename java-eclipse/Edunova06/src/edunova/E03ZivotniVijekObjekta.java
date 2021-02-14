package edunova;

public class E03ZivotniVijekObjekta {
	
	// 1 faza deklarirali, vrijednost je nulls
	private Osoba osoba;
	
	
	public E03ZivotniVijekObjekta() {
		System.out.println(osoba);
		// 2. faza konstruiranje
		// poziv konstruktora
		osoba = new Osoba(); // new je poziv konstruktora
		
		// 3. faza korištenje
		osoba.setIme("Pero");
		System.out.println(osoba.getIme());
		
		// 4. faza uništenje
		// mi ju ne radimo, radi ju GC(garbage collector)
	}
	public static void main(String[] args) {
		
		new E03ZivotniVijekObjekta();
		
	}
	
	private class Osoba{
		
		public Osoba(String ime) {
			super();
			this.ime = ime;
		}

		private String ime;
		// 2. faza konstruiranje - specifična metoda
		public Osoba() {
			// služi tome da prilikom kreiranja nove instance
			// programer ima priliku nešto odraditi
		}

		public String getIme() {
			return ime;
		}

		public void setIme(String ime) {
			this.ime = ime;
		}
	}

}
