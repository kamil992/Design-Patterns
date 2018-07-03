package observer.observer.objects;

import observer.observer.Observer;
import observer.observer.Subject;



public class Child extends Observer {


    public Child(Subject subject){
        this.subject = subject;
        subject.add(this);
    }


    @Override
    public void update() {
        if(subject.getDayOfWeek()== 1)
            System.out.println("Child says: Oh no it's monday. It's time to school :(");
        if(subject.getDayOfWeek()== 2)
            System.out.println("Child says: Four days to weekend. It's time to school :(");
        if(subject.getDayOfWeek()== 3)
            System.out.println("Child says: Three days to weekend. It's time to school :(");
        if(subject.getDayOfWeek()== 4)
            System.out.println("Child says: Only two days to weekend :D . It's time to school :|");
        if(subject.getDayOfWeek()== 5)
            System.out.println("Child says: I love firday!. It's time to school :)");
        if(subject.getDayOfWeek()== 6)
            System.out.println("Child says: Free day! :)");
        if(subject.getDayOfWeek()== 7)
            System.out.println("Child says: Sunday. Tommorrow is time to school :|");
    }
}
