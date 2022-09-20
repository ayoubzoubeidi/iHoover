package ayoub.test.model;

import ayoub.test.core.interfaces.Movable;

public class Aspirateur implements Movable {

    private Coordonnee coordonnee;
    private Orientation orientation;

    public Aspirateur(Coordonnee coordonnee, Orientation orientation) {
        this.coordonnee = coordonnee;
        this.orientation = orientation;
    }

    @Override
    public Coordonnee getCoordonnee() {
        return coordonnee;
    }

    @Override
    public Orientation getOrientation() {
        return orientation;
    }

    @Override
    public void pivot(CommandePivot commandePivot) {
        Pivot pivot = commandePivot.getPivot();
        int angle = orientation.getAngle();

        int resultAngle = switch (pivot) {
            case G -> angle - 90 % 360;
            case D -> angle + 90 % 360;
        };

        this.orientation = switch (resultAngle) {
            case 0, 360 -> Orientation.N;
            case 90 -> Orientation.E;
            case 180 -> Orientation.S;
            case 270 -> Orientation.W;
            default -> throw new IllegalStateException("Unexpected value: " + resultAngle);
        };
    }

    @Override
    public void advance(CommandeAvencement commandeAvencement) {
        switch (this.orientation) {
            case N:
                this.coordonnee.move(0, 1);
                break;
            case S:
                this.coordonnee.move(0, -1);
                break;
            case E:
                this.coordonnee.move(1, 0);
                break;
            case W:
                this.coordonnee.move(-1, 0);
                break;
        }
    }
}
