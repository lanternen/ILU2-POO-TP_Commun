package model;

public class ReservationRestaurant extends Reservation {

	private int numService;
	private int numTableReservee;
	private CalendrierAnnuel calendrier;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTableReservee) {
		// TODO Auto-generated constructor stub
		super(jour, mois);
		this.numService = numService;
		this.numTableReservee = numTableReservee;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String service;
		if (this.numService == 1) {
			service = "premier";
		}
		else {
			service = "deuxième";
		}
		return "Le " + super.toString()+"\nTable "+this.numTableReservee + " pour le " + service + " service.";
	}

}
