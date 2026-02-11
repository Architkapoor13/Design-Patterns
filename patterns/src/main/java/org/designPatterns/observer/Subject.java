package org.designPatterns.observer;

import java.util.ArrayList;
import java.util.concurrent.Flow;

public interface Subject {

    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void notify(String notification);
}
