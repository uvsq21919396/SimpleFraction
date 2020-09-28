
public class Fraction {
	private int numerateur;
	private int denominateur;
	
	public Fraction() {
		numerateur =0;
		denominateur =1;
	}
	
	public Fraction(int numerateur, int denumerateur) {
		this.numerateur = numerateur;
		this.denominateur=denumerateur;
	}

	public int getNumerateur() {
		return numerateur;
	}

	public void setNumerateur(int numerateur) {
		this.numerateur = numerateur;
	}

	public int getDenumerateur() {
		return denominateur;
	}

	public void setDenumerateur(int denumerateur) {
		this.denominateur = denumerateur;
	}
	
	@Override
	public String toString() {
		return "Fraction [numerateur=" + numerateur + ", denominateur=" + denominateur + "]";
	}
	
	public double valeurReelle() {
		return (double)this.numerateur / this.denominateur;
	}
	
	

}
