package Figure;

public abstract class FlatFigure extends Figure{
    public abstract void flatten();

    @Override
    public void draw() {
        System.out.println("draw");
    }
}
