package alex;

import java.util.ArrayList;
import java.util.List;

public class Masina {
    private String marca;
    private List<Roata> roti;

    public Masina(String m)
    {
        marca = m;
        roti = new ArrayList<Roata>();
    }

    public void adaugaRoata(Roata r) throws PreaMulteRoti
    {
        if (roti.size() >= 4)
        {
            throw new PreaMulteRoti();
        }
        else
        {
            roti.add(r);
        }
    }

    public double calculeazaArieTotala()
    {
        double suma = 0;
        for (Roata r: this.roti)
        {
            suma += r.calculeazaArie();
        }

        return suma;
    }

}
