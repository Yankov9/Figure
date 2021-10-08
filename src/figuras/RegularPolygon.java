package figuras;

public class RegularPolygon extends Figure implements FigureWithSides {
    private int sides;

    public RegularPolygon(int sides) {
        super("Regular Polygon");

        this.sides = sides;
    }

    public void draw() {
        System.out.println("Regular Polygon, I've " + sides + " equal sides.");
    }

    public int getSidesCount() {
        return sides;
    }
}