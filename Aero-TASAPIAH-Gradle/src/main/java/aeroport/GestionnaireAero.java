package aeroport;

import java.util.Scanner;

public class GestionnaireAero {
    
    private Aeroport aeroport;
    private Scanner sc;
    
    public GestionnaireAero(){
    	this.aeroport = new Aeroport();
    	sc = new Scanner(System.in);
    }
    
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
        
        if(quai >= 0 && quai < aeroport.getNombreQuais()){
	        System.out.println(aeroport.getQuais()[quai]);
	
	        try{
	            if(avion == null){
	            	aeroport.getQuais()[quai].decollage();
	            }
	            else{
	            	aeroport.getQuais()[quai].atterrissage(avion);
	            }
	        }
	        catch(Exception e){
	            System.out.println(e.getMessage());   
	        }
        }
    }
}
