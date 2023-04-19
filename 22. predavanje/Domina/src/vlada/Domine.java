package vlada;

public class Domine {
	
	private int a;
	private int b;
	
	Domine(int prva, int druga){
		a = prva;
		b = druga;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public Domine Okreni() {
		int p = a;
		a = b;
		b = p;
		return this;
	}
	public boolean ista(Domine d) {
		return a == d.a && b == d.b || b == d.a && a == d.b;
	}
	
	public String Opis() {
		return "(" + a + ", " + b + ")";
	}

}
