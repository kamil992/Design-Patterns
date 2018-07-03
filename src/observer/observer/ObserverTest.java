package observer.observer;

import observer.observer.objects.Adult;
import observer.observer.objects.Child;

import java.util.Scanner;

public class ObserverTest {
    public static void main(String[] args) {

        Subject subject = new Subject();

        Child child = new Child(subject);
        Adult adult = new Adult(subject);
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the day of the week. Like 1, 2, 3, 4, ...");
        int day = in.nextInt();
        subject.setDayOfWeek(day);
    }
}
