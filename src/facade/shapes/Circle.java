package facade.shapes;

import facade.Calculator;

import java.util.Scanner;

public class Circle implements Calculator {

    private static final double PI = 3.14;

    @Override
    public double calculate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = in.nextDouble();
        double result = calcArea(radius);
        return result;
    }

    public static double calcArea(double r) {
        return PI * (r * r);
    }
}
