package com.in28minutes.leamspringframework;

import com.in28minutes.leamspringframework.game.GameRunner;
import com.in28minutes.leamspringframework.game.GamingConsole;
import com.in28minutes.leamspringframework.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole gamingConsole(){
        var game = new MarioGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
