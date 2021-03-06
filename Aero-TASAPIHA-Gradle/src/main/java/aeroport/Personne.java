package aeroport;

public class Personne {
    
    private String nom;
    private String prenom;
    private int poids;
    
    public Personne(String nom, String prenom, int poids){
    	this.nom = nom;
    	this.prenom = prenom;
    	this.poids = poids;
    }

    public String getNom() {   
        return this.nom;
    }
    
    public void setNom(String nom) {  
        this.nom = nom;
    }
    
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public int getPoids() {
        return this.poids;
    }
    
    public void setPoids(int poids) {
        this.poids = poids;
    }

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", poids="
				+ poids + "]";
	}

}
