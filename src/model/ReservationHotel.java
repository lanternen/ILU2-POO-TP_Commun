package model;

public class ReservationHotel extends Reservation {
	
	private int nbLitSimple;
	private int nbLitDouble;
	private int numChambre;

	public ReservationHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numChambre) {
		// TODO Auto-generated constructor stub
		super(jour, mois);
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.numChambre = numChambre;
	}

	@Override
	public String toString() {
		return "Le " + super.toString()+"\nChambre "+this.numChambre + " avec " + nbLitSimple + " lits simples et " + nbLitDouble + " lits doubles.";
	}
	
}
