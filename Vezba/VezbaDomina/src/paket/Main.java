package paket;

public class Main {

	public static void main(String[] args) {
		
		Domina d1 = new Domina(3, 5);
		Domina d2 = new Domina(6 , 8);
		
		System.out.println(d1.okreni());
		System.out.println(d2.okreni());
		System.out.println(d2.ista(d1));
		
	}

}
