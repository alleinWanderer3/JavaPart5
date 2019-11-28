package Tree;

public class ChristmasTree extends ConiferTree {
    @Override
    public String toString() {
        return "Елка";

    }

    @Override
    boolean isGrownInRussia() {
        return true;
    }
}
