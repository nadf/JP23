package edunova.primjer2;

import java.util.Date;

public class Racun extends Dokument {
	
	private Date datum;
	private Kupac kupac;

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Kupac getKupac() {
		return kupac;
	}

	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}

}
