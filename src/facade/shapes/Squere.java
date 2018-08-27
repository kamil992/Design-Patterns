package facade.shapes;

import facade.Calculator;

import java.util.Scanner;

public class Squere implements Calculator {

    @Override
    public double calculate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of one side of the squere");
        double side = in.nextDouble();
        double result = calcArea(side);
        return result;
    }

    public static double calcArea(double a) {
        return a * a;
    }

}
