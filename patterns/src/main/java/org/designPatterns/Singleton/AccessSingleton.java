package org.designPatterns.Singleton;

public class AccessSingleton implements Runnable{
    @Override
    public void run() {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy.hashCode());
    }
}
