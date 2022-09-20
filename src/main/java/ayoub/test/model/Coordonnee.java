package ayoub.test.model;

// On pourrai utiliser la class Point de java.awt

public class Coordonnee {

    private int x;
    private int y;

    public Coordonnee(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "x=" + this.x + " y=" + this.y;
    }
}
