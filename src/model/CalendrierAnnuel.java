package model;

public class CalendrierAnnuel {
	private Mois[] calendrier;
	
	public CalendrierAnnuel() {
		
		calendrier[0] = new Mois("Janvier", 31);
		calendrier[1] = new Mois("Février", 28);
		calendrier[2] = new Mois("Mars", 31);
		calendrier[3] = new Mois("Avril", 30);
		calendrier[4] = new Mois("Mai", 31);
		calendrier[5] = new Mois("Juin", 30);
		calendrier[6] = new Mois("Juillet", 31);
		calendrier[7] = new Mois("Aout", 31);
		calendrier[8] = new Mois("Septembre", 30);
		calendrier[9] = new Mois("Octobre", 31);
		calendrier[10] = new Mois("Novembre", 30);
		calendrier[11] = new Mois("Décembre", 31);
	}

	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois].estLibre(jour);
	}
	
	public boolean reserver(int jour, int mois) {
		try {
			calendrier[mois].reserver(jour);
			return true;
		} catch (Throwable throwable) {
			return false;
		}
	}
	
	
	////////////////////////////////////////////////////////////////////////////////
	//////// --------------------- classe interne mois --------------------////////
	//////////////////////////////////////////////////////////////////////////////
	
	public class Mois {
		
		String nom;
		boolean jours[];
		
		private Mois (String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];	// énorme doute ici
												//non c'est bon, mais pas besoin de faire une boucle pour mettre false
												//maintenant, en java, c'est mis par défaut à false
		}
		
		private boolean estLibre(int jour) {
			return !(jours[jour]);		//court, élégant
		}
		
		private void reserver(int jour) {
			
			if (estLibre(jour))		//si true, ça veut dire qu'il y a déjà une réservation
			{
				throw new IllegalStateException ("déjà réservé");
			} else {
				jours[jour] = true;
			}
	
		}
			
	}
	
	
	
	
	
}
