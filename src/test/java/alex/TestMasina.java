package alex;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMasina {

    @Test
    public void testCalculeazaArieTotala() throws PreaMulteRoti {
        Masina masina = new Masina("cv");

        Roata r1 = new Roata(2);
        Roata r2 = new Roata(3);
        Roata r3 = new Roata(4);
        Roata r4 = new Roata(5);

        masina.adaugaRoata(r1);
        masina.adaugaRoata(r2);
        masina.adaugaRoata(r3);
        masina.adaugaRoata(r4);

        double expected = r1.calculeazaArie() + r2.calculeazaArie() + r3.calculeazaArie() + r4.calculeazaArie();
        assertEquals(expected, masina.calculeazaArieTotala(), 0.1);
    }

    @Test(expected = PreaMulteRoti.class)
    public void testAdaugaRoataException() throws PreaMulteRoti {
        Masina masina = new Masina("Ford");
        masina.adaugaRoata(new Roata(1));
        masina.adaugaRoata(new Roata(1));
        masina.adaugaRoata(new Roata(1));
        masina.adaugaRoata(new Roata(1));
        masina.adaugaRoata(new Roata(1));
    }
}
