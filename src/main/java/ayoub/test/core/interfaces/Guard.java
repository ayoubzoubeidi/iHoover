package ayoub.test.core.interfaces;

import ayoub.test.model.Coordonnee;
import ayoub.test.model.Grille;

public interface Guard {
    boolean isAccessible(Grille grille, Coordonnee coordonnee);
}
