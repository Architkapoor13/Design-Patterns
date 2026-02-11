package org.designPatterns.observer;

public class ObserverMain {

    public static void main(String[] args) {
        Observer player1 = new Player("player1");
        Observer player2 = new Player("player2");
        Subject store = new PsStore();

        store.subscribe(player1);
        store.subscribe(player2);
        store.notify("spider-man 2 has arrived with ps subscription!");
    }

}
