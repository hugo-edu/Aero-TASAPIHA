package aeroport;

public class Quai implements GestionQuai {
    
    private Avion avion;

    public Quai(){
    	avion = new Avion();
    }
    
    public Avion getAvion() {
        return this.avion;
    }
    
    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    
    public void atterrissage(Avion avion){
    	if(this.avion == null){
    		this.avion = avion;
    	}
    }
    
    public void decollage(){
    	if(this.avion != null){
    		this.avion = null;
    	}
    }

}
