package org.designPatterns.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new AccessSingleton());
        Thread t2 = new Thread(new AccessSingleton());

        t1.start();
        t2.start();
    }
}
