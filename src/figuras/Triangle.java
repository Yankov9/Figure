package figuras;

public class Triangle extends Figure implements FigureWithSides {
    public Triangle() {
        super("Triangle");
    }

    public void draw() {
        System.out.println("Triangle, I've 3 sides. ");
    }

    public int getSidesCount() {
        return 3;
    }
}
