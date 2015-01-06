package aeroport;

import static org.junit.Assert.*;

import org.junit.Test;

public class AvionTest {

	@Test
	
	public void constructeurAvion(){
		Avion avion = new Avion();
		
		assertEquals("Airbus",avion.getMarque());
		assertEquals("A380",avion.getModele());
		assertEquals(50,avion.getNombrePassagerMax());
		assertEquals(0,avion.getNombrePassager());
	}
}
