package vlada;

public class Tacka {
	
	private double x;
	private double y;
	
	Tacka(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX () {
		return x;
	}
	public double getY () {
		return y;
	}
	
	public String ispisivanje() {
		return "Koordinate tacke: (" + x +","+ y + ")";
	}

}
