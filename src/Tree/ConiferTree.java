package Tree;

public abstract class ConiferTree implements Tree {
    @Override
    public boolean hasLeaves() {
        return false;
    }
    abstract boolean isGrownInRussia();
}
