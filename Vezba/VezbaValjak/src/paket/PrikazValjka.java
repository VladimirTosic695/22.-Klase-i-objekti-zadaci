package paket;

import java.text.DecimalFormat;

public class PrikazValjka {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.###");
		Valjak v1 = new Valjak(3, 5);
		
		System.out.println(v1.getR());
		System.out.println(v1.getH());
		System.out.println(v1.zapremina());
		System.out.println(v1.povrsina());
		System.out.println(v1.opis(v1));
		
		System.out.println("za [r,h] = " + v1.drugiOpis() + "\tV = " + df.format(v1.zapremina()));

	}

}
