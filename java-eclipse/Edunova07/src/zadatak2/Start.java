package zadatak2;

public class Start {
	// Kreirajte paket zadatak2
	// Kreirajte model klasa koji opisuje svijet flore i faune
	// na minimalno 4 razine nasljeđivanja
	// na svakoj razini nasljeđivanja u klasi definirajte minimalno 2 svojstva
	// Instancijrajte svaku od kreiranih najnižih klasa
	// klase na višoj razini proglasite apstraktnima
	
	public Start() {

		Vrsta vrsta = new Vrsta();
		vrsta.setNazivVrste("Gavia arctica");
		vrsta.setNazivReda("Gaviiformes");
		vrsta.setNazivKoljena("Chordata");
		vrsta.setNazivCarstva("Animalia");

		Vrsta vrsta1 = new Vrsta();
		vrsta1.setNazivVrste("Lacerta viridis");
		vrsta1.setNazivReda("Squamata");
		vrsta1.setNazivKoljena("Chordata");
		vrsta1.setNazivCarstva("Animalia");
		
		Vrsta vrsta2 = new Vrsta();
		vrsta2.setNazivVrste("Eriophyllum");
		vrsta2.setNazivReda("Asterales");
		vrsta2.setNazivKoljena("Tracheophyta");
		vrsta2.setNazivCarstva("Plantae");
		
		Vrsta vrsta3 = new Vrsta();
		vrsta3.setNazivVrste("Achyrachaena mollis");
		vrsta3.setNazivReda("Asterales");
		vrsta3.setNazivKoljena("Tracheophyta");
		vrsta3.setNazivCarstva("Animalia");

		System.out.printf("Vrsta %s je iz obitelji %s, klase %s i carstva %s.", vrsta.getNazivVrste(),
				vrsta.getNazivReda(), vrsta.getNazivKoljena(), vrsta.getNazivCarstva());
		System.out.println();
		System.out.printf("Vrsta %s je iz obitelji %s, klase %s i carstva %s.", vrsta1.getNazivVrste(),
				vrsta1.getNazivReda(), vrsta1.getNazivKoljena(), vrsta1.getNazivCarstva());
		System.out.println();
		System.out.printf("Vrsta %s je iz obitelji %s, klase %s i carstva %s.", vrsta2.getNazivVrste(),
				vrsta2.getNazivReda(), vrsta2.getNazivKoljena(), vrsta2.getNazivCarstva());
		System.out.println();
		System.out.printf("Vrsta %s je iz obitelji %s, klase %s i carstva %s.", vrsta3.getNazivVrste(),
				vrsta3.getNazivReda(), vrsta3.getNazivKoljena(), vrsta3.getNazivCarstva());
	}

	public static void main(String[] args) {
		new Start();
	}
}