package ayoub.test.core.interfaces;

import ayoub.test.model.Commande;

import java.util.List;

public interface CommandesParser {
    List<Commande> readCommand(String userInstructions);
}
