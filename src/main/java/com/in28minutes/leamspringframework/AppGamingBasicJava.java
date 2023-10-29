package com.in28minutes.leamspringframework;

import com.in28minutes.leamspringframework.game.GameRunner;
import com.in28minutes.leamspringframework.game.MarioGame;
import com.in28minutes.leamspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var game = new MarioGame();
        //var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
