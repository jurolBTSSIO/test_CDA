package model;

public class Vendeur {
	private String nom;
	private int venteDuVendeur;

	/*
	 * 
	 */
	public Vendeur() {
	}

	/*
	 * 
	 */
	public Vendeur(String nom, int venteDuVendeur) {
		this.nom = nom;
		this.venteDuVendeur = venteDuVendeur;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the venteDuVendeur
	 */
	public int getVenteDuVendeur() {
		return venteDuVendeur;
	}

	/**
	 * @param venteDuVendeur the venteDuVendeur to set
	 */
	public void setVenteDuVendeur(int venteDuVendeur) {
		this.venteDuVendeur = venteDuVendeur;
	}

	@Override
	public String toString() {
		return "Vendeur [nom=" + nom + ", venteDuVendeur=" + venteDuVendeur + "]";
	}

}
