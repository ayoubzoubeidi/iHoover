package ayoub.test;

import ayoub.test.core.BasicGuard;
import ayoub.test.core.CommandesInputParser;
import ayoub.test.core.UserInputData;
import ayoub.test.core.interfaces.CommandesParser;
import ayoub.test.core.interfaces.Guard;
import ayoub.test.core.interfaces.Movable;
import ayoub.test.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AspirateurTest {

    private final String ASPIRATEUR_HAPPY_PATH = "x=5 y=6 N";
    private UserInputData USER_INPUT_DATA;

    @BeforeEach
    public void setUp() {
        USER_INPUT_DATA = new UserInputData(10, 10, 5, 5,
                "N", "DADADADAA");
    }

    @Test
    public void testAspirateurSimulation() throws IOException {

        CommandesParser commandesParser = new CommandesInputParser();

        Grille grille = new Grille(USER_INPUT_DATA.getDimensionGrilleX(), USER_INPUT_DATA.getDimensionGrilleY());

        Movable aspirateur = new Aspirateur(
                new Coordonnee(USER_INPUT_DATA.getPositionInitialAspirateurX(), USER_INPUT_DATA.getPositionInitialAspirateurY()),
                Orientation.valueOf(USER_INPUT_DATA.getOrientationAspirateur().toUpperCase()));

        Guard guard = new BasicGuard();
        List<Commande> commandes = commandesParser.readCommand(USER_INPUT_DATA.getInstructions());

        Simulation simulation = new Simulation(grille, aspirateur, commandes, guard);

        simulation.simulate();

       assertEquals(ASPIRATEUR_HAPPY_PATH, simulation.getPosition());

    }

}
