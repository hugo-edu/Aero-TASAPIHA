package aeroport;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PassagerTest {

	@Test
    public void constructeurPassager() {
        Passager passager = new Passager("nom", "prenom", 70);
        assertEquals("nom", passager.getNom());
        assertEquals("prenom", passager.getPrenom());
        assertEquals(70, passager.getPoids());
    }
}
