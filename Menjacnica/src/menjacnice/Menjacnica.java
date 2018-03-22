package menjacnice;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import interfejsMenjacnice.InterfejsMenjacnice;
import valute.Valuta;

public class Menjacnica implements InterfejsMenjacnice {
	

	ArrayList<Valuta> v = new ArrayList<Valuta>();
	
	
	@Override
	public void dodavanjeKursa(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajni,
			double kupovni, double srednji) {


		Valuta valuta = new Valuta();
		valuta.setNaziv(naziv);
		valuta.setSkraceniNaziv(skraceniNaziv);
		valuta.setDatum(datum);
		valuta.setProdajni(prodajni);
		valuta.setKupovni(kupovni);
		valuta.setSrednji(srednji);
		
		v.add(valuta);

	}

	@Override
	public void brisanjeKursa(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		
		
		Valuta valuta = new Valuta();
		
		valuta.setNaziv(naziv);
		valuta.setSkraceniNaziv(skraceniNaziv);
		valuta.setDatum(datum);
		for(int i = 0; i < v.size(); i++) { 
			if(v.get(i).equals(valuta)) {
				v.remove(v.get(i));
			}
		}
	}

	@Override
	public double[] nadjiKurs(String naziv, String skraceniNaziv, GregorianCalendar datum) {
		Valuta valuta = new Valuta();
		double[] niz = new double[3];
		int j = 0;
		
		valuta.setNaziv(naziv);
		valuta.setSkraceniNaziv(skraceniNaziv);
		valuta.setDatum(datum);
		
		for(int i = 0; i < v.size(); i++) { 
			if(v.get(i).equals(valuta)) {
				niz[j++] = v.get(i).getKupovni();
				niz[j++] = v.get(i).getProdajni();
				niz[j] = v.get(i).getSrednji();
			}
		}
		return niz;
	}

}
