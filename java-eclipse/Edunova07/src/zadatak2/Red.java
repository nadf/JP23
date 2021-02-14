package zadatak2;

public abstract class Red extends Koljeno {
	
	private String nazivReda;
	private Vrsta vrsta;

	public String getNazivReda() {
		return nazivReda;
	}

	public void setNazivReda(String nazivReda) {
		this.nazivReda = nazivReda;
	}

	public Vrsta getVrsta() {
		return vrsta;
	}

	public void setVrsta(Vrsta vrsta) {
		this.vrsta = vrsta;
	}
}