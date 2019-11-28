package Tree;

public class Main {


    public static void main(String[] args) {
        Tree[] trees = new Tree[]{new AppleTree(), new BirchTree(), new ChristmasTree()};
        for (Tree result : trees) {
            System.out.println(result);
        }
    }
}
