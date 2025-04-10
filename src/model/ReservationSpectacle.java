package model;

public class ReservationSpectacle extends Reservation {
	private int numZone;
	private int numChaise;

	public ReservationSpectacle(int jour, int mois, int numChaise, int numZone) {
		super(jour, mois);
		this.numChaise = numChaise;
		this.numZone = numZone;
	}
}
