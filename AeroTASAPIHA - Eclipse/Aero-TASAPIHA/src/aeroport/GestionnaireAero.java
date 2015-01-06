package aeroport;

public class GestionnaireAero {
    
    private Aeroport aeroport;
    private Scanner sc;
    
    public Aeroport getAeroport() {      
        return this.aeroport;
    }

    public void setAeroport(Aeroport aeroport) {
        this.aeroport = aeroport;
    }

    public void modification_quais(Avion avion){
        int quai;
        System.out.println("A quel quai accéder?");
        System.out.println(aeroport.getQuais());
        quai = sc.nextInt();
        System.out.println(aeroport.getQuais()[quai]);

        try{
            if(avion == null){
                decollage();
            }
            else{
                atterrissage(avion);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());   
        }
    }
    
    public static void main(String[] args){
        
    }
}
