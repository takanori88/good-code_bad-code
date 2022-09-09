package others.observer;

import java.util.Iterator;
import java.util.Vector;

public abstract class NumberGenerator {
    private final Vector<Observer> observers = new Vector<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    abstract int getNumber();

    abstract void execute();


}
