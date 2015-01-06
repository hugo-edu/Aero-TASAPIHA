package aeroport;

public class Avion implements GestionAvion {
    
    private Aeroport destination;
    private String marque;
    private String modele;
    private int nombrePassagerMax;
    private Passager[] passagers;
    
    public Aeroport getDestination() {
        return this.destination;
    }
    
    public void setDestination(Aeroport destination) {
        this.destination = destination;
    }
    
    public String getMarque() {
        return this.marque;
    }
    
    public void setMarque(String marque) {
        this.marque = marque;
    }
    
    public String getModele() {
        return this.modele;
    }
    
    public void setModele(String modele) {
        this.modele = modele;
    }
    
    public int getNombrePassagerMax() {
		return nombrePassagerMax;
	}

	public void setNombrePassagerMax(int nombrePassagerMax) {
		this.nombrePassagerMax = nombrePassagerMax;
	}
	
	public Passager[] getPassagers() {
        return this.passagers;
    }
    
    public void setPassagers(Passager[] passagers) {
        this.passagers = passagers;
    }

	public void embarquer(Passager passager) {
    }

    public void debarquer() {
    }

}
