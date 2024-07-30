import com.sdz.comportement.*;

public class Guerrier extends Personnage{
    public Guerrier()
    {
        this.espritCombatif = new CombatPistolet();
    }

    public Guerrier(EspritCombatif esprit, Soin soin, Deplacement deplacement)
    {
        super(esprit, soin, deplacement);
    }
}
