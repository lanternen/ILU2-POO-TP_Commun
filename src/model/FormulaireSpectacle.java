package model;

public class FormulaireSpectacle extends Formulaire {
	
	private int numZone;
	private int entite;

	public FormulaireSpectacle(int jour, int mois, int numZone) {
		// TODO Auto-generated constructor stub
		super(jour, mois);
		this.numZone = numZone;
	}

	public int getNumZone() {
		return numZone;
	}	
	
	
	public int getIdentificationEntite() {
		return entite;
	}

	public void setIdentificationEntite(int entite) {
		this.entite = entite;
	}

}
