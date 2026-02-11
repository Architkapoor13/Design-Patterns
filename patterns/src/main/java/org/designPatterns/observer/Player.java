package org.designPatterns.observer;

public class Player implements Observer{
    private String name;

    public Player(String name){
        this.name = name;
    }

    @Override
    public void getNotified(String notification) {
        System.out.println(this.name + " : " + notification);
    }
}
