package ayoub.test.core;

import ayoub.test.model.*;
import ayoub.test.core.interfaces.CommandesParser;

import java.util.ArrayList;
import java.util.List;

public class CommandesInputParser implements CommandesParser {

    public CommandesInputParser() {
    }

    @Override
    public List<Commande> readCommand(String userInstructions) {
        List<Commande> commandes = new ArrayList<>();
        for (char c : userInstructions.toCharArray()) {
            switch (c) {
                case 'A':
                    commandes.add(new CommandeAvencement(Avancement.A));
                    break;
                case 'D':
                    commandes.add(new CommandePivot(Pivot.D));
                    break;
                case 'G':
                    commandes.add(new CommandePivot(Pivot.G));
                    break;
                default:
                    throw new RuntimeException("Character error");
            }
        }
        return commandes;
    }
}
