package ayoub.test.model;

public class CommandePivot extends Commande {

    private final Pivot pivot;

    public CommandePivot(Pivot pivot) {
        this.pivot = pivot;
    }

    public Pivot getPivot() {
        return pivot;
    }
}
