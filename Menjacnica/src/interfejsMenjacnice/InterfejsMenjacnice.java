package interfejsMenjacnice;

import java.util.GregorianCalendar;

public interface InterfejsMenjacnice {
	public void dodavanjeKursa(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajni, double kupovni, double srednji);
	public void brisanjeKursa(String naziv, String skraceniNaziv, GregorianCalendar datum);
	public double[] nadjiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum);
}
