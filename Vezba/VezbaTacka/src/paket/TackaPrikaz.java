package paket;

public class TackaPrikaz {

	public static void main(String[] args) {
		
		Tacka t = new Tacka(3, 4);
		Tacka t1 = new Tacka(5, 6);
		
		
		System.out.println("X = " + t.getX());
		System.out.println("Y = " + t.getY());
		
		System.out.println(t.toString());
		
	}

}
