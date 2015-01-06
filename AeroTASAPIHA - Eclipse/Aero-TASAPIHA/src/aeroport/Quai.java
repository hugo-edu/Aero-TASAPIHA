package aeroport;

public class Quai implements GestionQuai {
    
    private Avion avion;

    public Avion getAvion() {
        return this.avion;
    }
    
    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    
    public void atterrissage(Avion avion) {
    }
    
    public void decollage() {
    }

}
