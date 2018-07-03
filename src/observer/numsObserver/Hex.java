package observer.numsObserver;

public class Hex extends Observer{

    public Hex(Subject subject){
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("| Hex: " + Integer.toHexString(subject.getNumber()) + " | ");
    }
}
