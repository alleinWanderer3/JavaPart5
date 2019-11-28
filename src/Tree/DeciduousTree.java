package Tree;

public abstract class DeciduousTree implements Tree{
    @Override
    public boolean hasLeaves() {
        return true;
    }
    abstract boolean hasFruits();

}
