package factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ActionFactory actionFactory = new ActionFactory();

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the action:");
        String action = in.nextLine();
        Action object = actionFactory.getAction(action);

        System.out.println("Enter number:");
        double num = in.nextDouble();
        System.out.println("Enter rank:");
        double rank = in.nextDouble();
        System.out.println(object.calculate(num, rank));

    }
}
