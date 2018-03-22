package menjacnice;

import java.util.GregorianCalendar;

import interfejsMenjacnice.InterfejsMenjacnice;
import valute.Valuta;

public class Menjacnica implements InterfejsMenjacnice {
	
	
	
	@Override
	public void dodavanjeKursa(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajni,
			double kupovni, double srednji) {
		Valuta v = new Valuta(naziv, skraceniNaziv, datum, prodajni, kupovni, srednji);
	}

	@Override
	public void brisanjeKursa(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		
	}

	@Override
	public double[] nadjiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		
		return null;
	}

}
