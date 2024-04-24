package model;

public class FormulaireHotel extends Formulaire {
	
	private int nbLitSimple;
	private int nbLitDouble;
	private int entite;

	public FormulaireHotel(int jour,int mois, int nbLitSimple, int nbLitDouble) {
		// TODO Auto-generated constructor stub
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
	}

	
	
	public int getNbLitSimple() {
		return nbLitSimple;
	}

	public int getNbLitDouble() {
		return nbLitDouble;
	}

	public int getIdentificationEntite() {
		return entite;
	}

	public void setIdentificationEntite(int entite) {
		this.entite = entite;
	}

	
}
