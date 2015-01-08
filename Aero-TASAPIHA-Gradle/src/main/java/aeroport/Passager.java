package aeroport;

public class Passager extends Personne {

	public Passager(String nom, String prenom, int poids) {
		super(nom, prenom, poids);
	}

	@Override
	public String toString() {
		return "Passager ["+super.toString()+"]";
	}
}
