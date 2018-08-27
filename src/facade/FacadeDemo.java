package facade;

import java.util.Scanner;

public class FacadeDemo {

    public static void main(String[] args) {

        FacadeDemo facadeDemo = new FacadeDemo();

        facadeDemo.start();
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator areaCalculator = new AreaCalculator();

        int opt;
        do {
            options();
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    areaCalculator.calculateSquereArea();
                    break;
                case 2:
                    areaCalculator.calculateRectangleArea();
                    break;
                case 3:
                    areaCalculator.calculateCircleArea();
                    break;
                default:
                    break;
            }

        } while (opt != 0);
    }

    public static void options() {
        System.out.println("\nChoose one option: ");
        System.out.println("[1] Calculate squere area.");
        System.out.println("[2] Calculate rectangle area.");
        System.out.println("[3] Calculate circle area.");
        System.out.println("[0] Exit.");
    }
}
