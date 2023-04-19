package vlada;

public class plata {
	
	private String ime;
	private double prihod;
	private double procenat;
	
	
	plata(String i, double p, double pro){
		ime = i;
		prihod = p;
		procenat = pro;
	}
	
	public double getPrihod() {
		return prihod;
	}
	public String getIme() {
		return ime;
	}
	
	public double Plata() {
		return prihod / 100 * procenat;
	}
	
	public String Opis() {
		return ""+ ime +" ima platu ";
	}

}
