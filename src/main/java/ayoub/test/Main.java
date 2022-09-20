package ayoub.test;

import ayoub.test.core.BasicGuard;
import ayoub.test.core.CommandesInputParser;
import ayoub.test.core.ConsoleUserInterface;
import ayoub.test.core.UserInputData;
import ayoub.test.core.interfaces.CommandesParser;
import ayoub.test.core.interfaces.Guard;
import ayoub.test.core.interfaces.Movable;
import ayoub.test.core.interfaces.UserInterface;
import ayoub.test.model.*;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        UserInterface userInterface = new ConsoleUserInterface();
        UserInputData userInputData = userInterface.getUserInput();
        CommandesParser commandesParser = new CommandesInputParser();

        Grille grille = new Grille(userInputData.getDimensionGrilleX(), userInputData.getDimensionGrilleY());

        Movable aspirateur = new Aspirateur(
                new Coordonnee(userInputData.getPositionInitialAspirateurX(), userInputData.getPositionInitialAspirateurY()),
                Orientation.valueOf(userInputData.getOrientationAspirateur().toUpperCase()));

        Guard guard = new BasicGuard();
        List<Commande> commandes = commandesParser.readCommand(userInputData.getInstructions());

        Simulation simulation = new Simulation(grille, aspirateur, commandes, guard);

        simulation.simulate();

        System.err.println(simulation.getPosition());
    }
}
