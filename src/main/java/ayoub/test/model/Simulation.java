package ayoub.test.model;

import ayoub.test.core.interfaces.Guard;
import ayoub.test.core.interfaces.Movable;

import java.util.List;

public class Simulation {

    private Grille grille;
    private Movable aspirateur;
    private List<Commande> commandes;
    private Guard guard;

    public Simulation(Grille grille, Movable aspirateur, List<Commande> commandes, Guard guard) {
        this.grille = grille;
        this.aspirateur = aspirateur;
        this.commandes = commandes;
        this.guard = guard;
    }

    public void simulate() {
        for (Commande commande : commandes) {
            if (commande instanceof CommandeAvencement) {
                aspirateur.advance((CommandeAvencement) commande);
            } else
                aspirateur.pivot((CommandePivot) commande);

            if (!guard.isAccessible(grille, aspirateur.getCoordonnee())) {
                throw new RuntimeException("Commande inaccessible");
            }
        }
    }

    public String getPosition() {
        return aspirateur.getCoordonnee().toString() + " " + aspirateur.getOrientation();
    }
}
