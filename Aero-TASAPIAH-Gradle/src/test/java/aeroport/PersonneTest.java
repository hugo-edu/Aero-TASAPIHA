package aeroport;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonneTest {

	@Test
    public void constructeurPersonne() {
        Personne personne = new Personne("nom", "prenom", 70);
        assertEquals("nom", personne.getNom());
        assertEquals("prenom", personne.getPrenom());
        assertEquals(70, personne.getPoids());
    }
}
