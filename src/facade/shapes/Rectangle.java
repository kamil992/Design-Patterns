package facade.shapes;

import facade.Calculator;

import java.util.Scanner;

public class Rectangle implements Calculator {
    @Override
    public double calculate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of first side of the rectangle");
        double first = in.nextDouble();
        System.out.println("Enter length of second side of the rectangle");
        double second = in.nextDouble();

        double result = calcArea(first, second);
        return result;
    }

    public static double calcArea(double a, double b) {
        return a * b;
    }
}
