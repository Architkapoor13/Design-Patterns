package org.designPatterns.observer;

import java.util.ArrayList;

public class PsStore implements Subject{
    ArrayList<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notify(String notification) {
        for(Observer observer : subscribers){
            observer.getNotified(notification);
        }
    }
}
