package figuras;

public class Square extends Figure implements FigureWithSides {

    public Square() {
        super("Square");
    }

    public void draw() {
        System.out.println("Square, I've 4 equal sides.");
    }

    public int getSidesCount() {
        return 4;
    }
}
