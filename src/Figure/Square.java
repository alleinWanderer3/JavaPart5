package Figure;

public class Square extends FlatFigure{
    @Override
    public void flatten() {
        System.out.println("flatten");
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("draw");
    }
}
