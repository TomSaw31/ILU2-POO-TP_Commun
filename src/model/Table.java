package model;

public class Table extends EntiteReservable<FormulaireRestaurant> {
	private final int nbChaises;

	protected Table(int id, int nbChaises) {
		super(id);
		this.nbChaises = nbChaises;
	}

	@Override
	public boolean compatible(FormulaireRestaurant formulaire) {
		return estLibre(formulaire) && nbChaises >= formulaire.getNombrePersonnes();
	}

	@Override
	public Reservation reserver(FormulaireRestaurant formulaire) {
		if (compatible(formulaire)) {
			return new ReservationRestaurant(formulaire.getJour(), formulaire.getMois(), formulaire.getNumService(), getId());
		} else {
			return null;
		}
	}

	public int getNbChaises() {
		return this.nbChaises;
	}

}
