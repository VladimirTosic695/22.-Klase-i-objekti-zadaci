package paket;

public class main {

	public static void main(String[] args) {
		
		ApsVred a1 = new ApsVred();
		

		a1.setBroj(10);
		System.out.println("Apsolutna vrednost unetog broja "+ a1.getBroj() + " je " + a1.apsolutna());
		a1.setBroj(0);
		System.out.println("Apsolutna vrednost unetog broja "+ a1.getBroj() + " je " + a1.apsolutna());
		a1.setBroj(-5);
		System.out.println("Apsolutna vrednost unetog broja "+ a1.getBroj() + " je " + a1.apsolutna());
		
	}

}
