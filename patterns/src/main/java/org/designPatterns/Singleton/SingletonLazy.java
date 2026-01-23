package org.designPatterns.Singleton;

public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    private SingletonLazy(){};
    // to make it thread safe we have to wrap the logic in side synchronized block
    public static SingletonLazy getInstance(){
        if(singletonLazy == null){
            synchronized (SingletonLazy.class){
                    if(singletonLazy == null){
                        singletonLazy = new SingletonLazy();
                    }
                }
            }
        return singletonLazy;
    }
}
