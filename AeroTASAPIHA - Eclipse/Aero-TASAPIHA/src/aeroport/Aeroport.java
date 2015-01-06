package aeroport;

public class Aeroport {
	
    private String nom;
    private String ville;
    private String pays;
    private int nombreQuai;
    private Quai[] quais;
    private Employe[] employes;

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
    
    public int getNombreQuai() {
        return this.nombreQuai;
    }
    
    public void setNombreQuai(int nombreQuai) {
        this.nombreQuai = nombreQuai;
    }

	public Employe[] getEmployes() {
		return employes;
	}

	public void setEmployes(Employe[] employes) {
		this.employes = employes;
	}

}
