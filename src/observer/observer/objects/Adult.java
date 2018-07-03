package observer.observer.objects;


import observer.observer.Observer;
import observer.observer.Subject;


public class Adult extends Observer {

    public Adult(Subject subject){
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void update() {
        if(subject.getDayOfWeek()== 1)
            System.out.println("Adult says: I f****** hate mondays!. It's time to work :/");
        if(subject.getDayOfWeek()== 2)
            System.out.println("Adult says: Four days to weekend. It's time to work :(");
        if(subject.getDayOfWeek()== 3)
            System.out.println("Adult says: Three days to weekend. It's time to work :(");
        if(subject.getDayOfWeek()== 4)
            System.out.println("Adult says: Only two days to weekend %%. It's time to work :|");
        if(subject.getDayOfWeek()== 5)
            System.out.println("Adult says: I love firday!. It's time to work :)");
        if(subject.getDayOfWeek()== 6)
            System.out.println("Adult says: Free day! Let's go on party! :)");
        if(subject.getDayOfWeek()== 7)
            System.out.println("Adult says: Sunday. Hangover. I will never drink alcohol again :|");
    }
}
