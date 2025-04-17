package model;

public abstract class EntiteReservable <F extends Formulaire> {
	private int id;
	private CalendrierAnnuel calendrier;
	
	protected EntiteReservable(int id) {
		setId(id);
		calendrier = new CalendrierAnnuel();
	}
	
	public boolean estLibre(F formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
