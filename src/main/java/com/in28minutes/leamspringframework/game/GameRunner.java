package com.in28minutes.leamspringframework.game;

public class GameRunner {
    //MarioGame game;
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.rigth();
    }
}
