package aeroport;

public class Employe extends Personne {

	public Employe(String nom, String prenom, int poids) {
		super(nom, prenom, poids);
	}

	@Override
	public String toString() {
		return "Employe ["+super.toString()+"]";
	}
}
