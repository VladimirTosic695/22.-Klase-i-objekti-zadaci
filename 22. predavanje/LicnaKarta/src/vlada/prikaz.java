package vlada;

import java.util.Scanner;

public class prikaz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite ime");
		String name = sc.nextLine();
		System.out.println("Unesite adresu stanovanja");
		String adress = sc.nextLine();
		System.out.println("Unesite datum rodjenja");
		String date = sc.nextLine();
		
		Licna l1 = new Licna(name,adress,date);
		
		System.out.println(l1.ispis());
		
		sc.close();
	}

}
