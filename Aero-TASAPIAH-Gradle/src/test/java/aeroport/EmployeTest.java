package aeroport;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeTest {

	@Test
    public void constructeurEmploye() {
        Employe employe = new Employe("nom", "prenom", 70);
        assertEquals("nom", employe.getNom());
        assertEquals("prenom", employe.getPrenom());
        assertEquals(70, employe.getPoids());
    }
}
