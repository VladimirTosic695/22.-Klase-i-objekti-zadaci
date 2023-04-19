package vlada;

import java.util.Scanner;

public class prikaz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		plata p1 = new plata("MIlan",150000,10);
		
		System.out.println(p1.Opis());
		System.out.println(p1.Plata());
		
	}

}
