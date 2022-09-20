package ayoub.test.core;

public class UserInputData {

    private int dimensionGrilleX;
    private int dimensionGrilleY;

    private int positionInitialAspirateurX;
    private int positionInitialAspirateurY;
    private String orientationAspirateur;
    private String instructions;

    public UserInputData(int dimensionGrilleX, int dimensionGrilleY, int positionInitialAspirateurX, int positionInitialAspirateurY, String orientationAspirateur, String instructions) {
        this.dimensionGrilleX = dimensionGrilleX;
        this.dimensionGrilleY = dimensionGrilleY;
        this.positionInitialAspirateurX = positionInitialAspirateurX;
        this.positionInitialAspirateurY = positionInitialAspirateurY;
        this.orientationAspirateur = orientationAspirateur;
        this.instructions = instructions;
    }

    public int getDimensionGrilleX() {
        return dimensionGrilleX;
    }

    public int getDimensionGrilleY() {
        return dimensionGrilleY;
    }

    public int getPositionInitialAspirateurX() {
        return positionInitialAspirateurX;
    }

    public int getPositionInitialAspirateurY() {
        return positionInitialAspirateurY;
    }

    public String getOrientationAspirateur() {
        return orientationAspirateur;
    }

    public String getInstructions() {
        return instructions;
    }
}
