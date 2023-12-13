import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MatematicaTests2 {
    Matematica mate;	
	
    @Test(expected = IllegalArgumentException.class)
    public void testRaportExceptieJUnit4() {
        mate.raport(45, 0);
    }

    @Test
    public void testRaportVirgulaMobila() {
        double rezultat = mate.raport(15, 4);
        double rezultatAsteptat = 3.75;
        assertEquals(rezultatAsteptat, rezultat, 0.1);
    }

    @Test
    public void testEsteParCorect() {
        assertTrue(mate.estePar(8));
        assertFalse(mate.estePar(9));
        assertFalse(mate.estePar(-9));
    }
	
}
