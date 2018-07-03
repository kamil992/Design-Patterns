package observer.numsObserver;

public class Bin extends Observer {

    public Bin(Subject subject){
        this.subject = subject;
        subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("| Bin: " + Integer.toBinaryString(subject.getNumber()) + " | ");
    }
}
