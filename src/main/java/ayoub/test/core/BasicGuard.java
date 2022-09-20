package ayoub.test.core;

import ayoub.test.model.Coordonnee;
import ayoub.test.model.Grille;
import ayoub.test.core.interfaces.Guard;

public class BasicGuard implements Guard {
    @Override
    public boolean isAccessible(Grille grille, Coordonnee coordonnee) {
        return grille.getDimensionX() >= coordonnee.getX() && grille.getDimensionY() >= coordonnee.getY();
    }
}
