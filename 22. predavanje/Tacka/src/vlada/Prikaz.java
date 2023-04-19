package vlada;

import java.util.Scanner;

public class Prikaz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite x");
		double x = sc.nextDouble();
		System.out.println("Unesite y");
		double y = sc.nextDouble();
		
		Tacka ob = new Tacka(x,y);
		
		System.out.println(""+ob.ispisivanje());
		
		Tacka t1 = new Tacka(2,5);
		Tacka t2 = new Tacka(3,6);
		
		System.out.println(t1.getX());
		System.out.println(t1.getY());
		System.out.println(t1.ispisivanje());
		
		System.out.println(t2.getX());
		System.out.println(t2.getY());
		System.out.println(t2.ispisivanje());
		
		sc.close();

	}

}
