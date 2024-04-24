package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12];
	
	public CalendrierAnnuel() {
		
		this.calendrier[0] = new Mois("Janvier", 31);
		this.calendrier[1] = new Mois("Fevrier", 28);
		this.calendrier[2] = new Mois("Mars", 31);
		this.calendrier[3] = new Mois("Avril", 30);
		this.calendrier[4] = new Mois("Mai", 31);
		this.calendrier[5] = new Mois("Juin", 30);
		this.calendrier[6] = new Mois("Juillet", 31);
		this.calendrier[7] = new Mois("Aout", 31);
		this.calendrier[8] = new Mois("Septembre", 30);
		this.calendrier[9] = new Mois("Octobre", 31);
		this.calendrier[10] = new Mois("Novembre", 30);
		this.calendrier[11] = new Mois("Decembre", 31);
	}

	
	public boolean estLibre(int jour, int mois) {
		return !calendrier[mois-1].estLibre(jour-1);		// - 1 pour pas avoir out of bound
	}													//return true si mois libre
	
	public boolean reserver(int jour, int mois) {
		try {
			calendrier[mois-1].reserver(jour-1);			// - 1 pour pas avoir out of bound
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	////////////////////////////////////////////////////////////////////////////////
	//////// --------------------- classe interne mois --------------------////////
	//////////////////////////////////////////////////////////////////////////////
	
	public class Mois {
		
		String nom;
		boolean jours[];
		
		private Mois (String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];	// pas besoin de faire une boucle pour mettre false
												//maintenant, en java, c'est mis par defaut a false										
		}
		
		private boolean estLibre(int jour) {
			return jours[jour];				//renvoie false si libre, true si deja occupé
		}
		
		private void reserver(int jour) throws IllegalStateException {
										// - 1 pour pas avoir out of bound
			if (estLibre(jour))		//si true, ca veut dire qu'il y a deja une reservation
			{
				throw new IllegalStateException ("deja reserve");
			} else {
				jours[jour] = true;
			}
	
		}
			
	}
	
	
	
	
	
}
