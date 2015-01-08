package aeroport;

import java.util.Scanner;

public class GestionnaireAero {

    private Aeroport aeroport;
    private Scanner sc;

    public GestionnaireAero(Aeroport aeroport) {
        this.aeroport = aeroport;
        this.sc = new Scanner(System.in);
    }

    public Aeroport getAeroport() {
        return this.aeroport;
    }

    public void setAeroport(Aeroport aeroport) {
        this.aeroport = aeroport;
    }

    public void embarquement(Avion avion, Passager[] passagers) {
        for (Passager a : passagers) {
            avion.embarquer(a);
        }

    }

    public void etat_Avion(Quai quai, Avion avion) {
    	int reponse;
    	if(avion != null){
	        System.out.println("L'avion " + avion.getModele() + ": nombre de passagers " + avion.getNombrePassager());
	        for(Passager a:avion.getPassagers()){
	        	if(a != null){
	        		System.out.println("\n"+a.toString());
	        	}
	        }
	        
	        System.out.println("1: Faire decoller l'avion 2: Embarquer 3:Debarquer 4: Quitter");
	        reponse = sc.nextInt();
	        
	        switch(reponse){
	        	case 1: modification_quai(quai, null);
	        		break;
	        	case 2: 
	        		Passager[] p = new Passager[1];
	        		p[0] = new Passager("Jean","Hubert",50);
	        		embarquement(avion, p);
	        		break;
	        	case 3: debarquement(avion);
	        			break;
	        }
	        
    	}
    	else{
    		System.out.println("1: Stocker un avion 2: Quitter");
    		reponse = sc.nextInt();
    		
    		if(reponse == 1){
    			modification_quai(quai, new Avion());
    		}
    	}

    }

    public void debarquement(Avion avion) {
        System.out.print("Debarquement de l'avion ");
        avion.debarquer();
    }

    public void modification_quai(Quai quai, Avion avion) {
        if (avion == null) {
        	quai.decollage();
        } else {
        	quai.atterrissage(avion);
        }
    }

    public int menuAero() {
        System.out.println("Aeroport");
        System.out.println("1: Acceder aux quais 2: Quit");
        return sc.nextInt();
    }

    public void runTime() {
        int reponse = 0;
        do {
            reponse = menuAero();
            if (reponse == 1) {
  
            	Quai[] list = this.aeroport.getQuais();
            	do{
	            	for (int i = 0; i < this.aeroport.getNombreQuais(); i++) {
	                    System.out.println(i + ":\t" + list[i]);
	                }
	            	System.out.println("Indice du quai ?");
	            	reponse = sc.nextInt();
            	}while(reponse < 0 || reponse >= this.aeroport.getNombreQuais());
            	
            	this.etat_Avion(list[reponse], list[reponse].getAvion());
            }
        } while (reponse != 2);
        System.out.println("Quit");

    }

    public static void main(String[] args) {

        Aeroport port = new Aeroport();

        GestionnaireAero a = new GestionnaireAero(port);
        
        a.runTime();
    }

}
