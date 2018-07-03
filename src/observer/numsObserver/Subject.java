package observer.numsObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observerList = new ArrayList<>();
    private int number;

    public void add(Observer observer){
        observerList.add(observer);
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public void execute(){
        for(Observer o : observerList){
            o.update();
        }
    }
}
