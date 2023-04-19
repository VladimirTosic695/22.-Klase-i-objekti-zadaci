package paket;

public class Domina {
	private int a, b;

	Domina(int aa, int bb){
		a = aa;
		b = bb;
	}
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public boolean ista(Domina d) {
		return a == d.a && b == d.b || a == d.b && b == d.a;
	}
	
	public Domina okreni() {
		int p = a;
		a = b;
		b = p;
		return this;
	}

	public String toString() {
		return "(" + a + ", " + b + ")";
	}

}
