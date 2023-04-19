package vlada;

public class Licna {
	
	private String ime;
	private String adresa;
	private String datum;
	
	Licna(String n, String a, String d){
		ime = n;
		adresa = a;
		datum = d;
	}
	public String getIme() {
		return ime;
	}
	public String getAdresa() {
		return adresa;
	}
	public String getDatum() {
		return datum;
	}
	
	public String ispis() {
		return "\nVase ime: "+ ime +"\nVasa adresa: "+ adresa +"\nDatum rodjenja: "+datum+"";
	}

}
