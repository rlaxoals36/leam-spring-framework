package com.in28minutes.leamspringframework.game;

import com.in28minutes.leamspringframework.game.GameRunner;
import com.in28minutes.leamspringframework.game.MarioGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var game = new MarioGame();
        //var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
