package figuras;

public abstract class Figure {
    private String name;

    Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void draw();
}
