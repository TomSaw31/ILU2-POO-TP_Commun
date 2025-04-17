package model;


public class Chambre extends EntiteReservable<FormulaireHotel> {
	private int nbLitsSimples;
	private int nbLitsDoubles;

	protected Chambre(int id, int nbLitsSimples, int nbLitsDoubles) {
		super(id);
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
	}

	@Override
	public boolean compatible(FormulaireHotel formulaire) {
		return estLibre(formulaire) && formulaire.getNbLitsSimples() <= nbLitsSimples && formulaire.getNbLitsDoubles() <= nbLitsDoubles;
	}

	@Override
	public Reservation reserver(FormulaireHotel formulaire) {
		if (compatible(formulaire)) {
			return new ReservationHotel(formulaire.getJour(), formulaire.getMois(), getId(), formulaire.getNbLitsSimples(),
					formulaire.getNbLitsDoubles());
		} else {
			return null;
		}
	}

}