import com.sdz.comportement.*;

public class Medecin extends Personnage{
    public Medecin()
    {
        this.soin = new PremierSoin();
    }

    public Medecin(EspritCombatif esprit, Soin soin, Deplacement deplacement)
    {
        super(esprit, soin, deplacement);
    }
}
