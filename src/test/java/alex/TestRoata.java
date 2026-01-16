package alex;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestRoata {

    @Test
    public void testCalculeazaArie() {
        Roata roata = new Roata(3);
        double expected = 3.14 * 3;
        assertEquals(expected, roata.calculeazaArie(), 0.01);
    }
}
