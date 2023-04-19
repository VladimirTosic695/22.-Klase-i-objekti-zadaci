package paket;

import java.util.Scanner;

public class OsobaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Osoba o = new Osoba();
		
		System.out.println("Unesite ime");
		o.ime = sc.nextLine();
		
		System.out.println("Unesite adresu");
		o.adresa = sc.nextLine();
		
		System.out.println("Unesite datum rodjenja");
		o.datum = sc.nextLine();
		
		System.out.println(o.ispisi());
		
		Osoba o1 = new Osoba("Vladimir", "Sremska", "11.09.1993.");
		
		System.out.println(o1.ispisi());

	}

}
