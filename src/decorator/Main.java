package decorator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main   {
    public static void main(String[] args) {



        Statusable employee = Employee.getStandardEmployee();
        employee.printStatus();

        System.out.println();

        Statusable manager = new Manager(employee);
        manager.printStatus();

        System.out.println();

        Statusable boss = new Boss(employee);
        boss.printStatus();
}
}
