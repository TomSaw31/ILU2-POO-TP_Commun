package model;

public class PlaceSpectacle extends EntiteReservable<FormulaireSpectacle> {
	private int numZone;
	protected PlaceSpectacle(int id, int numZone) {
		super(id);
		this.numZone = numZone;
	}

	@Override
	public boolean compatible(FormulaireSpectacle formulaire) {
		return estLibre(formulaire) && formulaire.getNumZone() == numZone;
	}

	@Override
	public Reservation reserver(FormulaireSpectacle formulaire) {
		if (compatible(formulaire)) {
			return new ReservationSpectacle(formulaire.getJour(), formulaire.getMois(), getId(), formulaire.getNumZone());
		} else {
			return null;
		}
	}
}
