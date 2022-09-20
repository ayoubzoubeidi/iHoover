package ayoub.test.core.interfaces;

import ayoub.test.model.Coordonnee;
import ayoub.test.model.Orientation;
import ayoub.test.model.CommandeAvencement;
import ayoub.test.model.CommandePivot;

public interface Movable {
    Coordonnee getCoordonnee();
    Orientation getOrientation();
    void pivot(CommandePivot commandePivot);
    void advance(CommandeAvencement commandeAvencement);
}
