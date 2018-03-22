package valute;

import java.util.GregorianCalendar;

public class Valuta {
	
	private String naziv;
	private String skraceniNaziv;
	private GregorianCalendar datum;
	private double prodajni;
	private double kupovni;
	private double srednji;
	
	public Valuta(String naziv, String skraceniNaziv, GregorianCalendar datum, double prodajni, double kupovni, double srednji) {
		
		this.setNaziv(naziv);
		this.setSkraceniNaziv(skraceniNaziv);
		this.setDatum(datum);
		this.setProdajni(prodajni);
		this.setKupovni(kupovni);
		this.setSrednji(srednji);
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null || naziv.isEmpty()) {
			throw new RuntimeException("Unet neodgovarajuci String.");
		}
		this.naziv = naziv;
	}
	
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv == null || skraceniNaziv.isEmpty()) {
			throw new RuntimeException("Unet neodgovarajuci String.");
		}
		this.skraceniNaziv = skraceniNaziv;
	}
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum == null) {
			throw new RuntimeException("Unet neodgovarajuci datum.");
		}
		this.datum = datum;
	}
	
	public double getProdajni() {
		return prodajni;
	}
	public void setProdajni(double prodajni) {
		if(prodajni <= 0) {
			throw new RuntimeException("Uneta neodgovarajuca vrednost.");
		}
		this.prodajni = prodajni;
	}
	
	public double getKupovni() {
		return kupovni;
	}
	public void setKupovni(double kupovni) {
		if(kupovni <= 0) {
			throw new RuntimeException("Uneta neodgovarajuca vrednost.");
		}
		this.kupovni = kupovni;
	}
	
	public double getSrednji() {
		return srednji;
	}
	public void setSrednji(double srednji) {
		if(srednji <= 0) {
			throw new RuntimeException("Uneta neodgovarajuca vrednost.");
		}
		this.srednji = srednji;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}
	
	
}
