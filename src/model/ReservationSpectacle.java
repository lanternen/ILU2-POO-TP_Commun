package model;

public class ReservationSpectacle extends Reservation{
	
	private int numZone;
	private int numChaise;

	public ReservationSpectacle(int jour, int mois, int numZone, int numChaise) {
		// TODO Auto-generated constructor stub
		super(jour, mois);
		this.numZone = numZone;
		this.numChaise = numChaise;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Le " + super.toString()+"\nPlace "+this.numChaise + " dans la zone " + numZone;
	}

}
