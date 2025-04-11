package model;

public class ReservationRestaurant extends Reservation {
	private int numService;
	private int numTable;

	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numTable = numTable;
		this.numService = numService;
	}

	@Override
	public String toString() {
		return String.format("Le %d/%d\nTable %d pour le %s service.", jour, mois, numTable,
				(numService == 1 ? "premier" : "deuxième"));
	}
}
