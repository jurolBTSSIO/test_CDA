package model;

public class Smartphone {
	private String nom;
	private int prix;
	private int nombreDeVente;

	/*
	 * 
	 */
	public Smartphone() {
	}

	/*
	 * 
	 */
	public Smartphone(String nom, int prix, int nombreDevente) {
		this.nom = nom;
		this.prix = prix;
		this.nombreDeVente = nombreDevente;
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
	 * @return the prix
	 */
	public int getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(int prix) {
		this.prix = prix;
	}

	/**
	 * @return the nombreDeVente
	 */
	public int getNombreDeVente() {
		return nombreDeVente;
	}

	/**
	 * @param nombreDeVente the nombreDeVente to set
	 */
	public void setNombreDeVente(int nombreDeVente) {
		this.nombreDeVente = nombreDeVente;
	}

	@Override
	public String toString() {
		return "Smartphone [nom=" + nom + ", prix=" + prix + ", nombreDeVente=" + nombreDeVente + "]";
	}

}
