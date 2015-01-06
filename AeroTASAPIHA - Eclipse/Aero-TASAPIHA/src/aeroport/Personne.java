package aeroport;

public class Personne {
    
    private String nom;
    private String prenom;
    private int poids;

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

}
