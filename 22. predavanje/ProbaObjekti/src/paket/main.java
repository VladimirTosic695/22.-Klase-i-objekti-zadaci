package paket;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	
		
		Klasa k = new Klasa(20);
		
		metoda(k);
		
		

	}
	
	public static void metoda(Klasa a) {
		System.out.println("Povrsina je " + a.povrsina());
	}

}
