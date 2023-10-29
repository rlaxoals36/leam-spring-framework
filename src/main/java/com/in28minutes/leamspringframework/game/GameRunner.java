package com.in28minutes.leamspringframework.game;

public class GameRunner {
    //MarioGame game;
    SuperContraGame game;
    public GameRunner(SuperContraGame game) {
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
