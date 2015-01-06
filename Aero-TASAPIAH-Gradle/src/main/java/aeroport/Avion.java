package aeroport;

import java.util.Arrays;

public class Avion implements GestionAvion {
    
    private Aeroport destination;
    private String marque;
    private String modele;
    private int nombrePassagerMax;
    private int nombrePassager;
    private Passager[] passagers;
    
    public Avion(){
    	this.destination = new Aeroport();
    	this.marque = "Airbus";
    	this.modele = "A380";
    	this.nombrePassagerMax = 50;
    	this.nombrePassager = 0;
    	this.passagers = new Passager[nombrePassagerMax];
    }
    
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
		if(nombrePassager < nombrePassagerMax){
			passagers[nombrePassager] = passager;
			nombrePassager++;
		}
    }

    public void debarquer() {
    	while(nombrePassager > 0){
    		passagers[nombrePassager] = null;
    		nombrePassager--;
    	}
    	passagers[0] = null;
    }

	public int getNombrePassager() {
		return nombrePassager;
	}

	public void setNombrePassager(int nombrePassager) {
		this.nombrePassager = nombrePassager;
	}

	@Override
	public String toString() {
		return "Avion [\n destination=" + destination.getNom() + ", \n marque=" + marque
				+ ", \n modele=" + modele + ", \n nombrePassagerMax="
				+ nombrePassagerMax + ", \n nombrePassager=" + nombrePassager
				+ ", \n passagers=" + Arrays.toString(passagers) + "]";
	}

}
