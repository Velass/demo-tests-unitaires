
import org.junit.Test;
import static org.junit.Assert.*;

import fr.diginamic.enumerations.Saison;


public class SaisonTest {

    @Test
    public void testValueOfLibelleHiver() {
        Saison hiver = Saison.valueOfLibelle("Hiver");
        assertEquals(Saison.HIVER, hiver);

    }
    
    @Test
    public void testValueOfLibelleEte() {
        Saison ete = Saison.valueOfLibelle("Eté");
        assertEquals(Saison.ETE, ete);

    }
    
    @Test
    public void testValueOfLibelleInconnue() {
    	Saison inconnue = Saison.valueOfLibelle("Inconnue");
        assertNull(inconnue);

    }
}