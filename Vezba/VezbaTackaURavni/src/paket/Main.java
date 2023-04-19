package paket;

public class Main {

	public static void main(String[] args) {
	
		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka(2, 2);
		Tacka t3 = new Tacka(5, 0);
				
		
		System.out.println(t1.zadata(t2));
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		
		System.out.println(t1.dveTacke(t2));
		System.out.println(t2.dveTacke(t3));
		System.out.println(t1.dveTacke(t3));
		
		
		
	}

}
