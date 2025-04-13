package model;

public class PlaceSpectacle extends EntiteReservable<FormulaireSpectacle> {

	protected PlaceSpectacle(int id) {
		super(id);
	}

	@Override
	public boolean compatible(FormulaireSpectacle formulaire) {
		return false;
	}

	@Override
	public Reservation reserver(FormulaireSpectacle formulaire) {
		return null;
	}

}
