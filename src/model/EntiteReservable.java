package model;

public class EntiteReservable {
	
	private CalendrierAnnuel calendrier;
	private int identification;

	public EntiteReservable(CalendrierAnnuel calendrier, int identification) {
		// TODO Auto-generated constructor stub
		this.calendrier = calendrier;
		this.identification = identification;
	}

	
	
	
	public int getIdentification() {
		return identification;
	}

	public void setIdentification(int identification) {
		this.identification = identification;
	}

}
