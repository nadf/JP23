package zadatak2;

public abstract class Carstvo {

	private String nazivCarstva;
	private Koljeno koljeno;

	public String getNazivCarstva() {
		return nazivCarstva;
	}

	public void setNazivCarstva(String nazivCarstva) {
		this.nazivCarstva = nazivCarstva;
	}

	public Koljeno getKoljeno() {
		return koljeno;
	}

	public void setKlasa(Koljeno koljeno) {
		this.koljeno = koljeno;
	}
}