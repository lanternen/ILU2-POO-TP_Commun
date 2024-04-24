package model;

public class FormulaireRestaurant extends Formulaire {
	
	private int numConvives;
	private int numService;
	private int entite;

	public FormulaireRestaurant(int jour,int mois, int numConvives, int numService) {
		// TODO Auto-generated constructor stub
		super(jour, mois);
		this.numConvives = numConvives;
		this.numService = numService;
	}

	public int getNombrePersonnes() {
		return numConvives;
	}

	public int getNumService() {
		return numService;
	}

	public int getIdentificationEntite() {
		return entite;
	}

	public void setIdentificationEntite(int entite) {
		this.entite = entite;
	}


	
}
