package vlada;

import java.text.DecimalFormat;

public class Prikaz {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###,####");
		
		Valjak v = new Valjak(3,5);

		System.out.println(v.opis());
		System.out.println(df.format(v.zapremina()));
	}

}
