import com.sdz.comportement.*;

public class Sniper  extends Personnage{
    Sniper()
    {
        this.espritCombatif = new CombatPistolet();
    }

    Sniper(EspritCombatif esprit, Soin soin, Deplacement deplacement)
    {
        super(esprit, soin, deplacement);
    }
}
