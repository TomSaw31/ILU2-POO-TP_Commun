package model;

public class Table extends EntiteReservable<FormulaireRestaurant> {

	protected Table(int id) {
		super(id);
	}

	@Override
	public boolean compatible(FormulaireRestaurant formulaire) {
		return estLibre(formulaire);
	}

	@Override
	public Reservation reserver(FormulaireRestaurant formulaire) {
		return null;
	}

}
