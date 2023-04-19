package paket;

public class RadnikPrikaz {

	public static void main(String[] args) {
		
		Radnik r1 = new Radnik("Vlada", 50, 150000);
		Radnik r2 = new Radnik("Kaja", 33, 150000);
		
		System.out.println("Prihod firme: " + r1.getPrihod());
		System.out.println("Plata: "+r1.plata());
		System.out.println(r1.opis());
		
		System.out.println("Prihod firme: " + r2.getPrihod());
		System.out.println("Plata: "+r2.plata());
		System.out.println(r2.opis());
		
		

	}

}
