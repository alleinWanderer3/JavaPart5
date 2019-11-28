package Tree;

public class AppleTree extends DeciduousTree {
    @Override
    public String toString() {
        return "Яблоня";
    }

    @Override
    boolean hasFruits() {
        return true;
    }
}
