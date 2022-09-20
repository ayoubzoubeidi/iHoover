package ayoub.test.core;

import ayoub.test.core.interfaces.UserInterface;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleUserInterface implements UserInterface {

    private Scanner in = new Scanner(System.in);

    @Override
    public UserInputData getUserInput() throws IOException {


        int dimensionGrilleX;
        int dimensionGrilleY;
        int positionInitialAspirateurX;
        int positionInitialAspirateurY;
        String orientationAspirateur;
        String instructions;

        System.out.println("Dimension de la grille: ");
        System.out.println("X: ");

        dimensionGrilleX = inputPositiveNumber();


        System.out.println("Y: ");
        dimensionGrilleY = inputPositiveNumber();


        System.out.println("Position initiale de l’aspirateur: ");
        System.out.println("X: ");

        positionInitialAspirateurX = inputPositiveNumber();
        System.out.println("Y: ");

        positionInitialAspirateurY = inputPositiveNumber();
        in.nextLine();

        System.out.println("orientation: ");
        orientationAspirateur = inputOrientation();

        System.out.println("Instruction: ");
        instructions = inputInstructions();

        return new UserInputData(dimensionGrilleX, dimensionGrilleY, positionInitialAspirateurX, positionInitialAspirateurY,
                orientationAspirateur, instructions);
    }

    private int inputPositiveNumber() {
        int inputNumber = in.nextInt();
        while (inputNumber < 1) {
            System.out.println("Entrez un nombre positif");
            inputNumber = in.nextInt();
        }
        return inputNumber;
    }

    private String inputOrientation() {
        System.out.println("Choisir N S W E");
        String inputOrientation = in.nextLine();
        while (!inputOrientation.equalsIgnoreCase("N") &&
                !inputOrientation.equalsIgnoreCase("S") &&
                !inputOrientation.equalsIgnoreCase("W") &&
                !inputOrientation.equalsIgnoreCase("E")) {
            System.out.println("Choisir N S W E");
            inputOrientation = in.nextLine();
        }
        return inputOrientation.toUpperCase();
    }

    private String inputInstructions() {
        System.out.println("Vous pouvez utilisez les lettres A D G");
        String instructions = in.nextLine();
        boolean validInstructions = instructions.matches("[ADGadg]+");

        while (!validInstructions) {
            System.out.println("Vous pouvez utilisez les lettres A D G");
            instructions = in.nextLine();
            validInstructions = instructions.matches("[ADGadg]+");
        }
        return instructions.toUpperCase();
    }
}
