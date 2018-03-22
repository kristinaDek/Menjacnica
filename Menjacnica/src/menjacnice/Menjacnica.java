package menjacnice;

import java.util.GregorianCalendar;

import interfejsMenjacnice.InterfejsMenjacnice;

public class Menjacnica implements InterfejsMenjacnice {

	@Override
	public void dodavanjeKursa(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajni,
			double kupovni, double srednji) {
		

	}

	@Override
	public void brisanjeKursa(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		
	}

	@Override
	public double[] nadjiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		
		return null;
	}

}
