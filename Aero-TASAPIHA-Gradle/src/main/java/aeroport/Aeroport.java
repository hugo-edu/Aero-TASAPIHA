package aeroport;

import java.util.Arrays;

public class Aeroport {
	
    private String nom;
    private String ville;
    private String pays;
    private int nombreQuais;
    private int nombreEmployes;
    private Quai[] quais;
    private Employe[] employes;

    public Aeroport(){
    	this.nom = "Aeroport";
    	this.ville = "Paris";
    	this.pays = "France";
    	this.nombreQuais = 5;
    	this.nombreEmployes = 10;
    	this.quais = new Quai[nombreQuais];
    	this.employes = new Employe[nombreEmployes];
    	
    	for(int i=0; i<nombreQuais; i++){
    		quais[i] = new Quai();
    	}
    	
    	for(int i=0; i<nombreEmployes; i++){
    		employes[i] = new Employe("#"+i, "Employe", 70);
    	}
    }
    
    public Quai[] getQuais() {
        return this.quais;
    }
    
    public void setQuais(Quai[] quais) {
        this.quais = quais;
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
    
    public String getPays() {
        return this.pays;
    }
    
    public void setPays(String pays) {
        this.pays = pays;
    }
    
    public int getNombreQuais() {
        return this.nombreQuais;
    }
    
    public void setNombreQuais(int nombreQuais) {
        this.nombreQuais = nombreQuais;
    }

	public Employe[] getEmployes() {
		return employes;
	}

	public void setEmployes(Employe[] employes) {
		this.employes = employes;
	}

	public int getNombreEmployes() {
		return nombreEmployes;
	}

	public void setNombreEmployes(int nombreEmployes) {
		this.nombreEmployes = nombreEmployes;
	}

	@Override
	public String toString() {
		return "Aeroport [nom=" + nom + ", ville=" + ville + ", pays=" + pays
				+ ", nombreQuais=" + nombreQuais + ", nombreEmployes="
				+ nombreEmployes + ", quais=" + Arrays.toString(quais)
				+ ", employes=" + Arrays.toString(employes) + "]";
	}

}
