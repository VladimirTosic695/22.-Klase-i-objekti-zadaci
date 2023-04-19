package paket;

public class Radnik {
	
	private String ime;
	private double procenat, prihod;

	
	Radnik(String name, double pr, double prihod){
		ime = name;
		procenat = pr;
		this.prihod = prihod;
	}
	
	public double getPrihod() {
		return prihod;
	}
	
	public double plata() {
		return getPrihod() / 100 * procenat;
	}
	
	public String opis() {
		return "Radnik " +ime+ " ima platu " + plata() + " dinara.";
	}
	
}
