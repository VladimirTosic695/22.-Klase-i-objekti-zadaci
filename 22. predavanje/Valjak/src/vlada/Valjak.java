package vlada;

public class Valjak {
	
	private double poluprecnik;
	private double visina;
	
	Valjak(double p,double v){
		poluprecnik = p;
		visina = v;
	}
	
	public double GetVisina() {
		return visina;
	}
	public double GetPoluprecnik() {
		return poluprecnik;
	}
	
	public double zapremina() {
		return 3.14 * poluprecnik * poluprecnik * visina;
	}
	public String opis() {
		return "Valjak poluprecnika ["+poluprecnik + "] i visine ["+visina+"] ima zapreminu: ";
	}

}
