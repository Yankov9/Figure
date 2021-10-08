package figuras;

public class Rectangle extends Figure implements FigureWithSides {
    public Rectangle() {
        super("Rectangle");
    }

    public void draw() {
        System.out.println("Rectangle, I've 4 sides. ");
    }

    public int getSidesCount() {
        return 4;
    }
}
