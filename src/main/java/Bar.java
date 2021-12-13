import java.util.ArrayList;
import java.util.List;

public  abstract class Bar {
    boolean happy;
    List<BarObserver> observers;
    public Bar(){
        happy = false;
        observers = new ArrayList<>();
    }
    public boolean isHappyHour(){
        return happy;
    }
    public void startHappyHour(){
        happy = true;
        notifyObservers();
    }
    public void endHappyHour(){
        happy = false;
        notifyObservers();
    }
    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()){
                observer.happyHourStarted(this);
            }
            else{
                observer.happyHourEnded(this);
            }
    }
}
