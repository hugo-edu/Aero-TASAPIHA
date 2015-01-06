package aeroport;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class QuaiTest {

	@Test
    public void atterrissageQuai() {
		Avion avion = new Avion();
		Quai quai = new Quai();
		quai.atterrissage(avion);
        assertEquals(avion, quai.getAvion());
    }
	
	@Test
    public void decollageQuai() {
		Avion avion = new Avion();
		Quai quai = new Quai();
		quai.atterrissage(avion);
		quai.decollage();
        assertEquals(null, quai.getAvion());
    }
}
