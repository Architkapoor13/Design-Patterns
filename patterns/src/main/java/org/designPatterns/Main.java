package org.designPatterns;

import org.designPatterns.Singleton.AccessSingleton;
import org.designPatterns.Singleton.SingletonEager;
import org.designPatterns.Singleton.SingletonLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(new AccessSingleton());
        Thread t2 = new Thread(new AccessSingleton());

        t1.start();
        t2.start();
    }
}