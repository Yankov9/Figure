import figuras.*;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        RegularPolygon regularPolygon = new RegularPolygon(5);
        Circle circle = new Circle();

        List<Figure> figuresList = new LinkedList<>();

        figuresList.add(square);
        figuresList.add(rectangle);
        figuresList.add(triangle);
        figuresList.add(regularPolygon);
        figuresList.add(circle);

        printItems2(figuresList);
    }


    public static void printItems(List items){

        for(Object item: items){

            if(item instanceof Square){
                ((Square)item).draw();
            } else if (item instanceof Rectangle){
                ((Rectangle)item).draw();
            } else if (item instanceof Triangle){
                ((Triangle)item).draw();
            } else if (item instanceof RegularPolygon){
                ((RegularPolygon)item).draw();
            } else if (item instanceof Circle){
                ((Circle)item).draw();
            }

        }

    }


    public static void printItems2(List<Figure> items){

        for(Figure item: items){

            System.out.println(item.getName() + ":");
            item.draw();
            System.out.println("   ");
        }

    }

}