package paket;

public class Valjak {
	
	private double radius, visina;
	
	Valjak(double r, double h){
		radius = r;
		visina = h;
	}
	
	public double getR() {
		return radius;
	}
	public double getH() {
		return visina;
	}
	
	public double zapremina() {
		return 3.14 * radius * radius * visina;
	}
	
	public double povrsina() {
		return 2 * radius * 3.14 * (radius + visina);
	}
	
	public String opis(Valjak ob) {
		return "R = " + radius + "\nH = "+visina+"\nZapremina: "+ob.zapremina()+"\nPovrsina: "+ob.povrsina();
	}
	
	public String drugiOpis() {
		return "[" + radius + "," + visina + "]";
	}

}
