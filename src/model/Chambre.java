package model;

public class Chambre extends EntiteReservable<FormulaireHotel> {

	protected Chambre(int id) {
		super(id);
	}

	@Override
	public boolean compatible(FormulaireHotel formulaire) {
		return false;
	}

	@Override
	public Reservation reserver(FormulaireHotel formulaire) {
		return null;
	}

}
