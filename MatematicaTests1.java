import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MatematicaTests {
    Matematica mate;

    @Before
    public void setUp() {
        mate = new Matematica();
    }

    @Test
    public void testSumaCorectitudine() {
        int rezultat = mate.suma(3, 12);
        int rezultatAsteptat = 15;
        assertEquals(rezultatAsteptat, rezultat);
    }

    @Test
    public void testRaportCorect() {
        double rezultat = mate.raport(12, 3);
        double rezultatAsteptat = 4;
        assertEquals(rezultatAsteptat, rezultat, 0.1);
    }

    @Test
    public void testRaportExceptie() {
        try {
            mate.raport(34, 0);
            fail("Metoda nu arunca exceptie");
        } catch (IllegalArgumentException er) {

        }
    }
	
}