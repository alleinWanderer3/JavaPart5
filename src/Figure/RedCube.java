package Figure;

public class RedCube extends ColorFigure {
    @Override
    public void draw() {
        System.out.println("draw");
    }

    @Override
    public void paint() {
        System.out.println("paint");
    }
}
