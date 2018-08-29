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
        System.out.println("Result:   a^2 = " + squere.calculate());
    }

    public void calculateRectangleArea() {
        System.out.println("Result:   a * b = " + rectangle.calculate());
    }

    public void calculateCircleArea() {
        System.out.println("Result:   pi * r^2 = " + circle.calculate());
    }
}
