package eu.mrndesign.matned.treasureHunter;

import eu.mrndesign.matned.treasureHunter.jFrame.Game;

public class Main {

    public static void main(String[] args) {

        Game matrix = new Game(20,20);
        matrix.getMyMaze().printMaze();
    }
}

