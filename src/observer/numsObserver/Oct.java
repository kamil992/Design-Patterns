package observer.numsObserver;

public class Oct extends  Observer {
    public Oct(Subject subject){
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("| Oct: " + Integer.toOctalString(subject.getNumber()) + " | ");
    }
}
