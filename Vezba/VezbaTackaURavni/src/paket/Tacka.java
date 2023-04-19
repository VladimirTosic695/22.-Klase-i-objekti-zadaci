package paket;

public class Tacka {
	
	private double x,y;
	
	Tacka(){
		
	}
	
	Tacka(double xx, double yy){
		x = xx;
		y = yy;
	}
	
	public double Rastojanje() {
		return Math.sqrt(x * x + y * y);
	}
	
	public double zadata(Tacka t) {
		return Math.sqrt(Math.pow(x - t.x, 2) + Math.pow(y - t.y, 2));
	}
	
	public String toString() {
		return "Rastojanje tacke od k. pocetka: " + Rastojanje();
	}
	
	public String dveTacke(Tacka t) {
		return "Rastojanje izmedju dve tacke: " + zadata(t);
	}

}
