package observer.numsObserver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new Hex(subject);
        new Bin(subject);
        new Oct(subject);

        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the number: ");
       int num =  in.nextInt();
        subject.setNumber(num);
        subject.execute();
    }
}
