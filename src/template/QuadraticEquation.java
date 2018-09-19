package template;

import java.util.Scanner;

public class QuadraticEquation extends Calculator {
    private Scanner sc = new Scanner(System.in);
    private double[] data = new double[3];

    @Override
    public double[] getData() {
        System.out.println("Quadratic equation:  delta = b^2 + 4ac\n" +
                "Enter a:");
        double a = sc.nextDouble();
        data[0] = a;

        System.out.println("Enter b:");
        double b = sc.nextDouble();
        data[1] = b;

        System.out.println("Enter c:");
        double c = sc.nextDouble();
        data[2] = c;

        return data;
    }

    @Override
    public void calculateData() {
        double x1 = 0;
        double x2 = 0;
        double x0 = 0;
        double[] results = new double[2];

        System.out.println("calculate data ...");

        double delta = (data[1] * data[1]) - 4 * data[0] * data[2];

        if(delta > 0){
            delta = Math.sqrt(delta);
            x1 = (-data[1] - delta) / (2 * data[0]);
            x2 = (-data[1] + delta) / (2 * data[0]);
            System.out.println("equation has two real roots : " + x1 + " and " + x2);
        }

        else if(delta == 0){
            x0 = -data[1] / (2 * data[0]);
            System.out.println("equation has one real root : " + x0);
        }

        else
            System.out.println("equation has not real roots.");

    }


}
