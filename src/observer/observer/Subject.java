package observer.observer;


import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int dayOfWeek;

    List<Observer> observerList = new ArrayList<>();

    public void add(Observer observer){
        observerList.add(observer);
    }

    public void remove(Observer observer){
        observerList.remove(observer);
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
        this.execute();
    }

    public void execute(){
        for(Observer o : observerList){
            o.update();
        }
    }

}
