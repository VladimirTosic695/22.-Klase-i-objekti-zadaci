package paket;

public class Osoba {
	
	public String ime, adresa, datum;
	
	Osoba(){}
	
	Osoba(String i, String a, String d){
		ime = i;
		adresa = a;
		datum = d;
	}
	
	public String ispisi() {
		return "Ime: " + ime + "\nAdresa: " + adresa + "\nDatum rodjenja: "+ datum;
	}
}
