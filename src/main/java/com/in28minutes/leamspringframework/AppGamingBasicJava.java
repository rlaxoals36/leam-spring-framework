package com.in28minutes.leamspringframework;

import com.in28minutes.leamspringframework.game.GameRunner;
import com.in28minutes.leamspringframework.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
