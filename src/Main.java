
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(4,5);
		Fraction f2 = new Fraction(3,2);
		assert (f1.toString() != null);
		System.out.println(f1);
		
		System.out.println(f2.toString());
		System.out.println("Valeur reelle de F2 ="+f2.valeurReelle());
	}

}
