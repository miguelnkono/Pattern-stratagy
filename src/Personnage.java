import com.sdz.comportement.*;

public abstract class Personnage {

    // Nos instances de comportement.
    protected EspritCombatif espritCombatif = new Pacifiste();
    protected Soin soin = new AucunSoin();
    protected Deplacement deplacement = new Marcher();

    // Contructeur par defaut.
    public Personnage(){}

    // Constructeur avec parametres.
    public Personnage(EspritCombatif espritCombatif, Soin soin, Deplacement deplacement)
    {
        this.espritCombatif = espritCombatif;
        this.soin = soin;
        this.deplacement = deplacement;
    }

    // Methode de deplacement de personnage.
    public void seDeplacer()
    {
        // On utilise les objets de deplacement de facon polymorphe.
        deplacement.deplace();
    }

    // Methode que les comabttants utilisent.
    public void combattre()
    {
        espritCombatif.combat();
    }

    public void soigner()
    {
        soin.soigner();
    }

    // Redefinir le comportement au combat.
    public void setEspritCombatif(EspritCombatif espritCombatif) {
        this.espritCombatif = espritCombatif;
    }

    // Redefinir le compertement de Soin.
    public void setSoin(Soin soin) {
        this.soin = soin;
    }

    // Redefinir le comportement de deplacement.
    public void setDeplacement(Deplacement deplacement) {
        this.deplacement = deplacement;
    }
}
