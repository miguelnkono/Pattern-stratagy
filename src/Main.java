public class Main {
    public static void main(String[] args) {
        Personnage[] tPers = {
                new Guerrier(),
                new Chirugien(),
                new Civil(),
                new Sniper(),
                new Medecin()
        };

        for (int i = 0; i < tPers.length; i ++)
        {
            System.out.println("\nInstance de " + tPers[i].getClass().getName());
            System.out.println("**********************************************");
            tPers[i].combattre();
            tPers[i].seDeplacer();
            tPers[i].soigner();
        }
    }
}