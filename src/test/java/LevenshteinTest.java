import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.utils.*;

public class LevenshteinTest {
    @Test
    public void testLevenshteinWithZero() {
    	CharSequence lhs1 = "";
        CharSequence rhs1 = "";
        int actualDistance1 = StringUtils.levenshteinDistance(lhs1, rhs1);
        assertEquals(0, actualDistance1);

    }
    @Test
    public void testLevenshteinWithOne() {
    	CharSequence lhs1 = "bonjour";
        CharSequence rhs1 = "bonjou";
        int actualDistance1 = StringUtils.levenshteinDistance(lhs1, rhs1);
        assertEquals(1, actualDistance1);

    }
    @Test
    public void testLevenshteinWithTwo() {
    	CharSequence lhs1 = "bonjour";
        CharSequence rhs1 = "bonsoir";
        int actualDistance1 = StringUtils.levenshteinDistance(lhs1, rhs1);
        assertEquals(2, actualDistance1);

    }
}
