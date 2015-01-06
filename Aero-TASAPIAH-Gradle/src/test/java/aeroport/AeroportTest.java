package aeroport;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AeroportTest {

	@Test
	public void constructeurAeroport() {
		Aeroport aeroport = new Aeroport();
        assertEquals("Aéroport", aeroport.getNom());
        assertEquals("Paris", aeroport.getVille());
        assertEquals("France", aeroport.getPays());
        assertEquals(5, aeroport.getNombreQuais());
        assertEquals(10, aeroport.getNombreEmployes());
        
        for(int i=0; i<aeroport.getNombreEmployes(); i++){
        	 assertEquals(aeroport.getEmployes()[i].getNom(), "#"+i);
        	 assertEquals(aeroport.getEmployes()[i].getPrenom(), "Employé");
        	 assertEquals(aeroport.getEmployes()[i].getPoids(), 70);
    	}
    }
}
