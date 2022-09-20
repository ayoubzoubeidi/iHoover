package ayoub.test.model;

public class Grille {

    private final Integer dimensionX;
    private final Integer dimensionY;

    public Grille(Integer dimensionX, Integer dimensionY) {
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
    }

    public Integer getDimensionX() {
        return dimensionX;
    }

    public Integer getDimensionY() {
        return dimensionY;
    }
}
