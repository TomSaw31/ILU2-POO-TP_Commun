package model;

public abstract class EntiteReservable <U extends Formulaire> {
	private int id;
	private CalendrierAnnuel calendrier;
	
	protected EntiteReservable(int id) {
		this.id = id;
		calendrier = new CalendrierAnnuel();
	}
	
	public boolean estLibre(U formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract boolean compatible(U formulaire);
	
	public abstract Reservation reserver(U formulaire);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
