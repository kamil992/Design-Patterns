package facade;


import facade.shapes.Circle;
import facade.shapes.Rectangle;
import facade.shapes.Squere;

public class AreaCalculator {
    private Squere squere;
    private Rectangle rectangle;
    private Circle circle;

    public AreaCalculator() {
        squere = new Squere();
        rectangle = new Rectangle();
        circle = new Circle();
    }

    public void calculateSquereArea() {
        System.out.println("Result = " + squere.calculate());
    }

    public void calculateRectangleArea() {
        System.out.println("Result = " + rectangle.calculate());
    }

    public void calculateCircleArea() {
        System.out.println("Result = " + circle.calculate());
    }
}
