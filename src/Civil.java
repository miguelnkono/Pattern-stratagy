import com.sdz.comportement.*;

public class Civil extends Personnage
{
    public Civil(){}

    public Civil(EspritCombatif esprit, Soin soin, Deplacement deplacement)
    {
        super(esprit, soin, deplacement);
    }
}