package zadaci;

public class Osoba {
	
	// OOP principom učahurivanja opišite osobu s 3 svojstva
	// sva tri su primitivnih tipova podataka
	
	private float visina;
	private float tezina;
	private int godine;

	public float getVisina() {
		return visina;
	}

	public void setVisina(float visina) {
		this.visina = visina;
	}
	

	public float getTezina() {
		return tezina;
	}

	public void setTezina(float tezina) {
		this.tezina = tezina;
	}
	

	public int getGodine() {
		return godine;
	}

	public void setGodine(int godine) {
		this.godine = godine;
	}
	
	
	
	public static void main(String[] args) {
		
		Osoba filip = new Osoba();
		
		filip.setVisina(181);
		filip.setTezina(78);
		filip.setGodine(20);
		
		
	}
	

}
