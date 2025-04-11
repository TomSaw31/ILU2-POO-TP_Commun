package model;

public class ReservationHotel extends Reservation {
	private int numChambre;
	private int nbLitsSimples;
	private int nbLitsDoubles;

	public ReservationHotel(int jour, int mois, int numChambre, int nbLitsSimples, int nbLitsDoubles) {
		super(jour, mois);
		this.numChambre = numChambre;
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jour + "/" + mois + " : chambre n°" + numChambre);
		if(nbLitsSimples > 0) {
			chaine.append(" avec " + nbLitsSimples);
			if(nbLitsSimples > 1) {
				chaine.append(" lits simples");
			} else {
				chaine.append(" lit simple");
			}
		}
		if(nbLitsDoubles > 0) {
			if(nbLitsSimples > 0) {
				chaine.append(" et " + nbLitsDoubles);
			} else if(nbLitsSimples == 0) {
				chaine.append(" avec " + nbLitsDoubles);
			}
			if(nbLitsDoubles > 1) {
				chaine.append(" lits doubles");
			} else {
				chaine.append(" lit double");
			}
		}
		chaine.append(".");
		return chaine.toString();
	}
}
