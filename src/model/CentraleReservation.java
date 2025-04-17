package model;

public class CentraleReservation<F extends Formulaire, R extends Reservation> {
	private EntiteReservable<F>[] entites;
	private int nbEntites;

	public CentraleReservation(EntiteReservable<F>[] entities, int nbEntites) {
		this.entites = entities;
		this.nbEntites = nbEntites;
	}

	public int ajouterEntite(EntiteReservable<F> entite) {
		if (this.nbEntites >= this.entites.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		int id = nbEntites + 1;
		entite.setId(id);
		entites[nbEntites++] = entite;
		return id;
	}

	public int[] donnerPossibilites(F formulaire) {
		int[] res = new int[nbEntites];
		EntiteReservable<F> entite;
		for (int i = 0; i < nbEntites; i++) {
			entite = entites[i];
			if (entite.compatible(formulaire)) {
				res[i] = entite.getId();
			} else {
				res[i] = 0;
			}
		}
		return res;
	}

	public Reservation reserver(int id, F formulaire) {
		int entiteId = id - 1;
		if (entiteId < 0 || entiteId >= nbEntites) {
			throw new ArrayIndexOutOfBoundsException();
		}
		EntiteReservable<F> entite = entites[entiteId];
		formulaire.setIdentificationEntite(entite.getId());
		return entite.reserver(formulaire);
	}
}
