import com.sdz.comportement.*;

public class Chirugien extends Personnage{
    Chirugien()
    {
        this.soin = new Operation();
    }

    Chirugien(EspritCombatif esprit, Soin soin, Deplacement deplacement)
    {
        super(esprit, soin, deplacement);
    }
}
